
package ru.vnaumov.stub.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "generate", namespace = "http://stub.vnaumov.ru/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "generate", namespace = "http://stub.vnaumov.ru/")
public class Generate {

    @XmlElement(name = "parameters", namespace = "")
    private ru.vnaumov.stub.Parameters parameters;

    /**
     * 
     * @return
     *     returns Parameters
     */
    public ru.vnaumov.stub.Parameters getParameters() {
        return this.parameters;
    }

    /**
     * 
     * @param parameters
     *     the value for the parameters property
     */
    public void setParameters(ru.vnaumov.stub.Parameters parameters) {
        this.parameters = parameters;
    }

}
