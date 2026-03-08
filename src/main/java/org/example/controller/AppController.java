package org.example.controller;


import org.example.service.FindService;

public class AppController {

    FindService evenService;

    public boolean find(){
        return evenService.find(5);
    }
}
