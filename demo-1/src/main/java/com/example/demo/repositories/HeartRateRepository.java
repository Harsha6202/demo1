// src/main/java/com/example/demo/repositories/HeartRateRepository.java

package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.models.HeartRate;

@Repository
public interface HeartRateRepository extends JpaRepository<HeartRate, Long> {

}