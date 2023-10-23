package com.example.flyway_demo.part;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PartsRepository extends JpaRepository<Part, Long> {
}
