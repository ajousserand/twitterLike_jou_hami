package com.exam.twitter.dtos;


import com.exam.twitter.models.Category;

public record MessageDTO(String id, String content, Category category) {

}
