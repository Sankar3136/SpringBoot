package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.medicineEntity;

public interface  medicineRepo extends JpaRepository<medicineEntity, Integer> {

}
