package com.example.demo.controller;

import com.example.demo.model.Content;
import org.springframework.web.bind.annotation.*;

@RestController()
@RequestMapping("content")
public class ContentController {

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Content getContent(@PathVariable int id) {
        return null;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.POST)
    public void addContent(@PathVariable int id, @RequestBody Content content) {
        return;
    }

}
