package bg.softuni.computershop.repository;

import bg.softuni.computershop.models.entity.ComputerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ComputerRepository extends JpaRepository<ComputerEntity, Long> {

}
