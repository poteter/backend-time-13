package com.example.flyway_demo.part;

import jakarta.persistence.*;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
public class Part {

    @Id
    @GeneratedValue(generator = "part_seq_gen", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "part_seq_gen", sequenceName = "part_seq", allocationSize = 1)
    private Long partId;

    private String partName;

    public Part(String partName){
        this.partName = partName;
    }

    public Long getPartId() {
        return partId;
    }

    public void setPartId(Long partId) {
        this.partId = partId;
    }

    public String getPartName() {
        return partName;
    }

    public void setPartName(String partName) {
        this.partName = partName;
    }
}
