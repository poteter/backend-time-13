package com.example.flyway_demo.partperorder;

import jakarta.persistence.*;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
public class PartPerOrder {
    @Id
    @GeneratedValue(generator = "partperoerder_seq_gen", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "partperoerder_seq_gen", sequenceName = "partperoerder_seq", allocationSize = 1)
    private Long partPerOrderId;

    private Long order_id;

    private Long part_id;

    private Long quantity;

    public PartPerOrder(Long order_id, Long part_id, Long quantity) {
        this.order_id = order_id;
        this.part_id = part_id;
        this.quantity = quantity;
    }

    public Long getOrder_id() {
        return order_id;
    }

    public void setOrder_id(Long order_id) {
        this.order_id = order_id;
    }

    public Long getPart_id() {
        return part_id;
    }

    public void setPart_id(Long part_id) {
        this.part_id = part_id;
    }

    public Long getQuantity() {
        return quantity;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }
}
