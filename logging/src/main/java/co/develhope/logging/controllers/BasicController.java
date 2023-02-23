package co.develhope.logging.controllers;

import co.develhope.logging.services.BasicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("logging")
public class BasicController{

    @Autowired
    private BasicService basicService;

    @GetMapping("/")
    public String welcome(){
        return basicService.welcome();
    }

    @GetMapping("/exp")
    public String exponent(){
        return basicService.exponent();
    }

    @GetMapping("/get-errors")
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public void getErrors(){
        basicService.getErrors();
    }
}
