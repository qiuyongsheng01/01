
package wb02;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "UserServiceImpl", targetNamespace = "http://wb02/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface UserServiceImpl {


    /**
     * 
     * @param arg0
     * @return
     *     returns wb02.User
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "sayHello", targetNamespace = "http://wb02/", className = "wb02.SayHello")
    @ResponseWrapper(localName = "sayHelloResponse", targetNamespace = "http://wb02/", className = "wb02.SayHelloResponse")
    @Action(input = "http://wb02/UserServiceImpl/sayHelloRequest", output = "http://wb02/UserServiceImpl/sayHelloResponse")
    public User sayHello(
        @WebParam(name = "arg0", targetNamespace = "")
        User arg0);

}
