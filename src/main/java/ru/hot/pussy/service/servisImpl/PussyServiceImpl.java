package ru.hot.pussy.service.servisImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.hot.pussy.DTO.PussyDTO;
import ru.hot.pussy.entity.Pussy;
import ru.hot.pussy.repository.PussyRepository;
import ru.hot.pussy.service.PussyService;

import java.util.List;

@Service
public class PussyServiceImpl implements PussyService {

    private final PussyRepository repository;

    @Autowired
    public PussyServiceImpl(PussyRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Pussy> getAll() {
        List<Pussy> pussies = repository.findAll();
        return pussies;
    }
}
