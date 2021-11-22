package bg.softuni.computershop.repository;

import bg.softuni.computershop.models.entity.UserRoleEntity;
import bg.softuni.computershop.models.enums.UserRoleEnum;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRoleRepository extends JpaRepository<UserRoleEntity, Long> {

    UserRoleEntity findByRole(UserRoleEnum role);
}
