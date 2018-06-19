package com.example.demo.controller;

import com.example.demo.dao.CategoryDao;
import com.example.demo.model.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController()
@RequestMapping("category")
public class CategoryController {

    @Autowired
    private CategoryDao categoryDao;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Category getCategory(@PathVariable String id) {
        return categoryDao.findOne(id);
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public void addCategory(@RequestBody Category category) {
        categoryDao.save(category);
    }

}
