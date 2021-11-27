package bg.softuni.computershop.repository;

import bg.softuni.computershop.models.entity.VideoCardEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VideoCardRepository extends JpaRepository<VideoCardEntity, Long> {
}
