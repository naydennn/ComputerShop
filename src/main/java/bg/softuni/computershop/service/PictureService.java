package bg.softuni.computershop.service;

import bg.softuni.computershop.models.service.PictureServiceModel;

public interface PictureService {

    void addPicture(PictureServiceModel picture);

    void deletePicture(String publicId);

}
