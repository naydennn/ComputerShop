package bg.softuni.computershop.service.impl;

import bg.softuni.computershop.models.entity.PictureEntity;
import bg.softuni.computershop.models.service.PictureServiceModel;
import bg.softuni.computershop.repository.PictureRepository;
import bg.softuni.computershop.service.PictureService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class PictureServiceImpl implements PictureService {

    private final ModelMapper modelMapper;
    private final PictureRepository pictureRepository;

    public PictureServiceImpl(ModelMapper modelMapper, PictureRepository pictureRepository) {
        this.modelMapper = modelMapper;
        this.pictureRepository = pictureRepository;
    }

    @Override
    public void addPicture(PictureServiceModel picture) {

        PictureEntity pictureEntity = modelMapper.map(picture, PictureEntity.class);

        pictureRepository.save(pictureEntity);

    }

    @Override
    public void deletePicture(String publicId) {
        pictureRepository.deleteAllByPublicId(publicId);
    }
}
