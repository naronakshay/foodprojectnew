package com.example.foodback.controller;


import com.example.foodback.model.Rest;
import com.example.foodback.service.RestServ;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.core.io.ClassPathResource;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api")
public class RestController {

    @Autowired
    private RestServ restServ;



    @GetMapping("/getRest/{id}")
    public ResponseEntity<Rest> getRestaurantById(@PathVariable("id") Long id) {
        Rest restaurant = restServ.getRestaurantById(id);
        if (restaurant != null) {
            return ResponseEntity.ok(restaurant);
        } else {
            return ResponseEntity.notFound().build();
        }
    }


    @GetMapping("/get")
    public ResponseEntity<List<Rest>> getAllRestaurants() {
        List<Rest> restaurants = restServ.getAll();
        if (restaurants.isEmpty()) {
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.ok(restaurants);
        }
    }







    @PutMapping("/add")
    public ResponseEntity<Rest> insertRestaurant(@RequestBody Rest rest) {
        Rest insertedRestaurant = restServ.saveRestaurant(rest);
        return ResponseEntity.ok(insertedRestaurant);
    }



}
