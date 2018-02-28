package ru.vnaumov.simple;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class OneParam {

    @WebMethod
    public String hello(String name) {
        return "Hello, " + name;
    }
}
