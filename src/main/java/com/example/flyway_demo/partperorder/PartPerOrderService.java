package com.example.flyway_demo.partperorder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PartPerOrderService {

    private final PartPerOrderRepository partPerOrderRepository;

    @Autowired
    public PartPerOrderService( PartPerOrderRepository partPerOrderRepository){
        this.partPerOrderRepository = partPerOrderRepository;
    }

    public PartPerOrder getPartPerOrderById(Long id){
        return partPerOrderRepository.findById(id).orElse(null);
    }
}
