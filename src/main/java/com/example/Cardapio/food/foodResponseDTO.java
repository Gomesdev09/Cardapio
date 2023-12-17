package com.example.Cardapio.food;

public record foodResponseDTO(Long id, String title, String image, Integer price){
    public foodResponseDTO(food Food){
        this (Food.getId(), Food.getTitle(), Food.getImage(), Food.getPrice());
    }


}
