package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Name;

public interface NameRepository extends JpaRepository<Name, Long> {
}
