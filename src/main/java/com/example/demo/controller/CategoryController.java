package com.example.demo.controller;

import com.example.demo.model.Category;
import org.springframework.web.bind.annotation.*;

@RestController()
@RequestMapping("content")
public class CategoryController {

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Category getCategory(@PathVariable int id) {
        return null;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.POST)
    public void addCategory(@PathVariable int id, @RequestBody Category category) {
        return;
    }

}
