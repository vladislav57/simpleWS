package ru.vnaumov.stub;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name="params")
@XmlAccessorType(XmlAccessType.FIELD)
public class Parameters {

    @XmlElement(name="parameter")
    private List<Parameter> list;

    public List<Parameter> getList() {
        return list;
    }

    public void setList(List<Parameter> list) {
        this.list = list;
    }
}
