/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jolube.soaptarjetas.soap;

import com.jolube.soaptarjetas.service.TarjetaService;
import java.math.BigInteger;
import javax.inject.Inject;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.xml.ws.RequestWrapper;

/**
 *
 * @author jolub
 */
@WebService(serviceName = "TarjetaSoap" , targetNamespace = "http://soap.soaptarjetas.jolube.com/")
public class TarjetaSoap {

    @Inject
    TarjetaService service;

    /**
     * Web service operation
     */
    @WebMethod(operationName = "pagoTarjeta")
    public Boolean pagoTarjeta(@WebParam(name = "identificationType" , targetNamespace = "http://soap.soaptarjetas.jolube.com/") String tipoIdentificacion,
            @WebParam(name = "identification", targetNamespace = "http://soap.soaptarjetas.jolube.com/") String identificacion,
            @WebParam(name = "cardNumber", targetNamespace = "http://soap.soaptarjetas.jolube.com/") String numeroTarjeta, @WebParam(name = "amount", targetNamespace = "http://soap.soaptarjetas.jolube.com/") String monto) {
        System.out.println("Entra metodo soap,: " + numeroTarjeta);
        return service.pagarTarjeta(tipoIdentificacion, identificacion, numeroTarjeta, new BigInteger(monto));
    }
}
