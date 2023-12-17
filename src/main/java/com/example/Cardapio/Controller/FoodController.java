package com.example.Cardapio.Controller;

import com.example.Cardapio.food.food;
import com.example.Cardapio.food.foodRepository;
import com.example.Cardapio.food.foodRequestDTO;
import com.example.Cardapio.food.foodResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.lang.model.util.Elements;
import java.util.List;

@RestController
@RequestMapping("food")
public class FoodController {

    @Autowired
    private foodRepository repository;
    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping
    public void saveFood(@RequestBody foodRequestDTO data){
        food foodData = new food(data);
        repository.save(foodData);
        return;
    }
    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping
    public List<foodResponseDTO> getAll(){


        List<foodResponseDTO> foodList = repository.findAll().stream().map(foodResponseDTO::new).toList();
        return foodList;

    }
}
