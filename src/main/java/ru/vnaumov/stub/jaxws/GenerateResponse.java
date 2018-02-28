
package ru.vnaumov.stub.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "generateResponse", namespace = "http://stub.vnaumov.ru/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "generateResponse", namespace = "http://stub.vnaumov.ru/")
public class GenerateResponse {

    @XmlElement(name = "return", namespace = "")
    private ru.vnaumov.stub.Parameters _return;

    /**
     * 
     * @return
     *     returns Parameters
     */
    public ru.vnaumov.stub.Parameters getReturn() {
        return this._return;
    }

    /**
     * 
     * @param _return
     *     the value for the _return property
     */
    public void setReturn(ru.vnaumov.stub.Parameters _return) {
        this._return = _return;
    }

}
