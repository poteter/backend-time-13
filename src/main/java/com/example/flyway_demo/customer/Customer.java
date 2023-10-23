package com.example.flyway_demo.customer;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
public class Customer {

    @Id
    @GeneratedValue(generator = "customer_seq_gen", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "customer_seq_gen", sequenceName = "customer_seq", allocationSize = 1)
    private Long customerId;

    private String customerName;

    public Customer(String customerName){
        this.customerName = customerName;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
}
