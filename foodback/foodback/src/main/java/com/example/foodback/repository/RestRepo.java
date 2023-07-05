package com.example.foodback.repository;

import com.example.foodback.model.Rest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RestRepo extends JpaRepository<Rest,Long> {

    List<Rest> findAll();


}
