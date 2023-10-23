package com.example.flyway_demo.part;

import com.example.flyway_demo.customer.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PartsService {

    private final PartsRepository partsRepository;

    @Autowired
    public PartsService(PartsRepository partsRepository){
        this.partsRepository = partsRepository;
    }

    public List<Part> getParts(){
        return partsRepository.findAll();
    }

    public Part getPartById(Long id){
        return partsRepository.findById(id).orElse(null);
    }

    public Part createPart(Part part){
        return partsRepository.save(part);
    }

    public void deletePartById(Long id){
        partsRepository.deleteById(id);
    }

    public Part updatePart(Part part){
        return partsRepository.save(part);
    }
}
