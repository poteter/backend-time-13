package com.example.flyway_demo.order;


import jakarta.persistence.*;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
public class Order {

    @Id
    @GeneratedValue(generator = "order_seq_gen", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "order_seq_gen", sequenceName = "order_seq", allocationSize = 1)
    private Long OrderId;

    private Long OrderCustomerId;

    private Long PartPerOrderId;

    public Order(Long orderCustomerId, Long partPerOrderId) {
        OrderCustomerId = orderCustomerId;
        PartPerOrderId = partPerOrderId;
    }

    public Long getOrderCustomerId() {
        return OrderCustomerId;
    }

    public void setOrderCustomerId(Long orderCustomerId) {
        OrderCustomerId = orderCustomerId;
    }

    public Long getPartPerOrderId() {
        return PartPerOrderId;
    }

    public void setPartPerOrderId(Long partPerOrderId) {
        PartPerOrderId = partPerOrderId;
    }
}
