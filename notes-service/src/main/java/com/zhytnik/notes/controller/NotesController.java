package com.zhytnik.notes.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

/**
 * @author Alexey Zhytnik
 * @since 17.08.2016
 */
@RestController
public class NotesController {

    @RequestMapping(method = GET, path = "/time")
    public Date time() {
        return new Date();
    }
}
