package com.example.flyway_demo.partperorder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/partperorder")
public class PartPerOrderController {

    private final PartPerOrderService partPerOrderService;

    @Autowired
    public PartPerOrderController(PartPerOrderService partPerOrderService){
        this.partPerOrderService = partPerOrderService;
    }

    @GetMapping("/{id}")
    public PartPerOrder getPartPerOrderById(@PathVariable Long id){
        return partPerOrderService.getPartPerOrderById(id);
    }
}
