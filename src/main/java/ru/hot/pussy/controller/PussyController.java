package ru.hot.pussy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.hot.pussy.entity.Pussy;
import ru.hot.pussy.service.PussyService;

import java.util.List;

//localhost:8080/pussy
@RestController
@RequestMapping(value = "/pussy", produces = MediaType.TEXT_PLAIN_VALUE)
public class PussyController {

    private final PussyService service;


    /**
     * @param service
     * @RequestMapping(value = "/{id}", produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE  })
     * public CommentDTO getComment(@PathVariable(value = "id") String commentId) throws IOException {
     * return service.get(commentId);
     * }@RequestMapping(value = "/{id}", produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE  })
     * public CommentDTO getComment(@PathVariable(value = "id") String commentId) throws IOException {
     * return service.get(commentId);
     * }
     */

    @Autowired
    public PussyController(PussyService service) {
        this.service = service;
    }

    @GetMapping()
    public ResponseEntity<List<Pussy>> getPussy() {
        List<Pussy> pussies = service.getAll();
        System.out.println(pussies.toString());
        return ResponseEntity.ok(pussies);
    }
}
