package bg.softuni.computershop.service.impl;

import bg.softuni.computershop.models.entity.ProcessorEntity;
import bg.softuni.computershop.repository.ProcessorRepository;
import bg.softuni.computershop.service.ProcessorService;
import org.springframework.stereotype.Service;

@Service
public class ProcessorServiceImpl implements ProcessorService {

    private final ProcessorRepository processorRepository;

    public ProcessorServiceImpl(ProcessorRepository processorRepository) {
        this.processorRepository = processorRepository;
    }

    @Override
    public void saveProcessor(ProcessorEntity processor) {
        processorRepository.save(processor);
    }
}
