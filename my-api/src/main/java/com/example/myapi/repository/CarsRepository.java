package com.example.myapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.myapi.model.cars;

@Repository
public interface CarsRepository extends JpaRepository<cars, Long>{

}
