package ru.vnaumov.access;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="rootxml")
public class SimpleObject {

    @XmlElement(name="elemxml")
    private String somestring = "";

    public SimpleObject(String somestring) {
        this.somestring = somestring;
    }
}
