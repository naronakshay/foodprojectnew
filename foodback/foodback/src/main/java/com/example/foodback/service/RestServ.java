package com.example.foodback.service;

import com.example.foodback.model.Rest;
import com.example.foodback.repository.RestRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RestServ  {

    @Autowired
    private RestRepo restRepo;


    public List<Rest> getAll(){
        return  restRepo.findAll();

    }

    public Rest saveRestaurant(Rest rest) {
        return restRepo.save(rest);
    }


    public Rest getRestaurantById(Long id) {
        Optional<Rest> optionalRestaurant = restRepo.findById(id);
        return optionalRestaurant.orElse(null);
    }
}
