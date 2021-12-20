package bg.softuni.computershop.web;

import bg.softuni.computershop.models.entity.UserEntity;
import bg.softuni.computershop.models.entity.UserRoleEntity;
import bg.softuni.computershop.models.enums.UserRoleEnum;
import bg.softuni.computershop.repository.UserRepository;
import bg.softuni.computershop.repository.UserRoleRepository;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.security.test.context.support.WithUserDetails;
import org.springframework.test.web.servlet.MockMvc;


import javax.annotation.PostConstruct;
import java.util.Set;

import static org.hamcrest.Matchers.hasSize;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class UserRestControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private UserRoleRepository userRoleRepository;

    @Autowired
    private UserRepository userRepository;

    private UserEntity testUser;


    @PostConstruct
    void setUp() {
        UserRoleEntity adminRole = new UserRoleEntity().setRole(UserRoleEnum.ADMIN);
        UserRoleEntity userRole = new UserRoleEntity().setRole(UserRoleEnum.USER);

        userRoleRepository.save(userRole);
        userRoleRepository.save(adminRole);

        testUser = new UserEntity();

        testUser.setEmail("naiden@naiden.bg");
        testUser.setFirstName("naiden");
        testUser.setLastName("naidenov");
        testUser.setPassword("password");
        testUser.setUsername("Naiden99");
        testUser.setRoles(Set.of(adminRole, userRole));

        userRepository.save(testUser);
    }

    @AfterEach
    public void tearDown() {
        userRepository.deleteAll();
        userRoleRepository.deleteAll();
    }

    @Test
    @WithUserDetails(value = "Naiden99")
    void testGetUsers() throws Exception {
        initUsers();

        mockMvc.perform(get("/users-info"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$", hasSize(2)));
    }

    private void initUsers() {
        UserEntity user1 = new UserEntity();
        user1.setEmail("test@test.bg");
        user1.setFirstName("test");
        user1.setLastName("test");
        user1.setPassword("password");
        user1.setUsername("test");

        userRepository.save(user1);
    }

}