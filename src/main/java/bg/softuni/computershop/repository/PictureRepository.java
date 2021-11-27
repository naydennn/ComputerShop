package bg.softuni.computershop.repository;

import bg.softuni.computershop.models.entity.PictureEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PictureRepository extends JpaRepository<PictureEntity, Long> {
    void deleteAllByPublicId(String publicId);
}
