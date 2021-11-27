package bg.softuni.computershop.service.impl;

import bg.softuni.computershop.models.entity.VideoCardEntity;
import bg.softuni.computershop.repository.VideoCardRepository;
import bg.softuni.computershop.service.VideoCardService;
import org.springframework.stereotype.Service;

@Service
public class VideoCardServiceImpl implements VideoCardService {

    private final VideoCardRepository videoCardRepository;

    public VideoCardServiceImpl(VideoCardRepository videoCardRepository) {
        this.videoCardRepository = videoCardRepository;
    }

    @Override
    public void saveVideoCard(VideoCardEntity videoCard) {
        videoCardRepository.save(videoCard);
    }
}
