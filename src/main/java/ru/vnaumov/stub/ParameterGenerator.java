package ru.vnaumov.stub;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import java.util.ArrayList;
import java.util.List;

@WebService
public class ParameterGenerator {

    @WebMethod
    public Parameters generate(@WebParam(name="parameters") Parameters input) {
        Parameters response = new Parameters();
        List<Parameter> list = new ArrayList<Parameter>();
        response.setList(list);
        for(Parameter p:input.getList()) {
            response.getList().add(p);
        }
        for(int i=0; i<1000; i++) {
            Parameter p = new Parameter();
            p.setName("param" + i);
            p.setValue("" + i);
            response.getList().add(p);
        }
        return response;
    }
}
