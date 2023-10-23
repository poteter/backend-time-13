package com.example.flyway_demo.partperorder;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PartPerOrderRepository extends JpaRepository<PartPerOrder, Long> {
}
