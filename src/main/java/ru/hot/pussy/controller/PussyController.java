package ru.hot.pussy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.hot.pussy.DTO.PussyDTO;
import ru.hot.pussy.entity.Dick;
import ru.hot.pussy.entity.Pussy;
import ru.hot.pussy.service.PussyService;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping(value = "/pussy", produces = MediaType.APPLICATION_JSON_VALUE)
public class PussyController {

    private final PussyService service;

    @Autowired
    public PussyController(PussyService service) {
        this.service = service;
    }

    @GetMapping()
    public ResponseEntity<List<PussyDTO>> getPussy() {
        List<PussyDTO> pussies = new PussyDTO().mappingPussyToPussyDTO(service.getAll());
        return ResponseEntity.ok(pussies);
    }
}
