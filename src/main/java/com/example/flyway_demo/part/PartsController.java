package com.example.flyway_demo.part;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/part")
public class PartsController {

    private final PartsService partsService;

    @Autowired
    public PartsController(PartsService partsService){
        this.partsService = partsService;
    }

    @GetMapping
    public List<Part> getParts(){
        return partsService.getParts();
    }

    @GetMapping("/{id}")
    public Part getPartById(@PathVariable Long id){
        return partsService.getPartById(id);
    }

    @PostMapping
    public Part createPart(@RequestBody Part part){
        return partsService.createPart(part);
    }

    @DeleteMapping
    public void deletePartById(Long id) {
        partsService.deletePartById(id);
    }

    @PutMapping()
    public Part updatePart(@RequestBody Part part){
        return partsService.updatePart(part);
    }
}
