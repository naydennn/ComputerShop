package bg.softuni.computershop.service.impl;

import bg.softuni.computershop.models.entity.UserEntity;
import bg.softuni.computershop.models.entity.UserRoleEntity;
import bg.softuni.computershop.models.enums.UserRoleEnum;
import bg.softuni.computershop.repository.UserRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

@ExtendWith(MockitoExtension.class)
public class ComputerShopUserServiceTest {

    private UserEntity testUser;

    private ComputerShopUserServiceImpl serviceToTest;

    private UserRoleEntity adminRole, userRole;
    @Mock
    private UserRepository mockUserRepository;

    @BeforeEach
    void setUp() {

        //Arrange
        serviceToTest = new ComputerShopUserServiceImpl(mockUserRepository);

        testUser = new UserEntity();

        adminRole = new UserRoleEntity();
        adminRole.setRole(UserRoleEnum.ADMIN);
        userRole = new UserRoleEntity();
        userRole.setRole(UserRoleEnum.USER);

        testUser.setUsername("test").
                setEmail("test@test.bg")
                .setRoles(Set.of(adminRole, userRole))
                .setPassword("topSecret");
    }

    @Test
    void testUserNotFound() {
        Assertions.assertThrows(
                UsernameNotFoundException.class,
                () -> serviceToTest.loadUserByUsername("invalid_user")
        );

    }

    @Test
    void testUserFound() {

        //arrange
        Mockito.when(mockUserRepository.findByUsername(testUser.getUsername()))
                .thenReturn(Optional.of(testUser));
        //act
        UserDetails userDetails = serviceToTest.loadUserByUsername(testUser.getUsername());

        //assert
        Assertions.assertEquals(userDetails.getUsername(), testUser.getUsername());
        String actualRoles = userDetails.getAuthorities().stream().map(GrantedAuthority::getAuthority)
                .collect(Collectors.joining(", "));

        String expectedRoles = "ROLE_ADMIN, ROLE_USER";

        Assertions.assertEquals(expectedRoles, actualRoles);
    }
}
