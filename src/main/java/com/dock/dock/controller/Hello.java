/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dock.dock.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Arowolo Ibrahim K
 */
@RestController
public class Hello {
    
    @GetMapping("/Hello")
    public String Hello(){
        return "Hello YouTube";
    }
    
    @GetMapping("/Hi")
    public String Hi(){
        return "Hello Kayman";
    }
    
    @GetMapping("/Hu")
    public String Hu(){
        return "Hello Kayman and Wifey";
    }
    

}
