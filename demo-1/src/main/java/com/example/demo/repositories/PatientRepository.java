// src/main/java/com/example/demo/repositories/PatientRepository.java

package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.models.Patient;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Long> {

}