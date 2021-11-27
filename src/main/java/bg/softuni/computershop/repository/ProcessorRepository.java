package bg.softuni.computershop.repository;

import bg.softuni.computershop.models.entity.ProcessorEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProcessorRepository extends JpaRepository<ProcessorEntity, Long> {
}
