package com.example.demo.controller;

import com.example.demo.dao.ContentDao;
import com.example.demo.model.Content;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController()
@RequestMapping("content")
public class ContentController {

    @Autowired
    private ContentDao contentDao;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Content getContent(@PathVariable String id) {
        return contentDao.findOne(id);
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public void addContent(@RequestBody Content content) {
        contentDao.save(content);
    }

}
