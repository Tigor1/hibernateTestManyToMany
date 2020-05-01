package ru.hot.pussy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.hot.pussy.DTO.PussyDTO;
import ru.hot.pussy.entity.Pussy;
import ru.hot.pussy.service.PussyService;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

//localhost:8080/pussy
@RestController
@RequestMapping(value = "/pussy", produces = APPLICATION_JSON_VALUE)
public class PussyController {

    private final PussyService service;

    @Autowired
    public PussyController(PussyService service) {
        this.service = service;
    }

    @GetMapping()
    public ResponseEntity<List<Pussy>> getPussy(){
        List<Pussy> pussies = service.getAll();
        return ResponseEntity.ok(pussies);
    }
}
