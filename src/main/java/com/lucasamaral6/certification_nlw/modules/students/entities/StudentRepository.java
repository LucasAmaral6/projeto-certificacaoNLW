package com.lucasamaral6.certification_nlw.modules.students.entities;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<StudentEntity,UUID> {

    public Optional<StudentEntity> findByEmail(String email);
    
}
