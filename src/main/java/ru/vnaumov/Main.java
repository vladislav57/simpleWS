package ru.vnaumov;

import ru.vnaumov.stub.ParameterGenerator;

import javax.xml.ws.Endpoint;

public class Main {

    public static void main(String[] args) {
        Endpoint.publish("http://localhost:9000/testservice", new ParameterGenerator());
    }
}
