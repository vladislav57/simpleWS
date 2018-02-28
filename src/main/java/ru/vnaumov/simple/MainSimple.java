package ru.vnaumov.simple;

import javax.xml.ws.Endpoint;

public class MainSimple {
    public static void main(String[] args) {
        Endpoint.publish("http://localhost:9001/simple", new OneParam());
    }
}
