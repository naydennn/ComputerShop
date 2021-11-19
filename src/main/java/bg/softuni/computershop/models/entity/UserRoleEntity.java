package bg.softuni.computershop.models.entity;

import bg.softuni.computershop.models.enums.UserRoleEnum;

import javax.persistence.*;

@Entity
@Table(name = "roles")
public class UserRoleEntity extends BaseEntity {

    private UserRoleEnum role;

    public UserRoleEntity() {
    }

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    public UserRoleEnum getRole() {
        return role;
    }

    public UserRoleEntity setRole(UserRoleEnum role) {
        this.role = role;
        return this;
    }
}
