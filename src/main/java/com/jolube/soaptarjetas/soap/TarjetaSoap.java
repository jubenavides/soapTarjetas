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

/**
 *
 * @author jolub
 */
@WebService(serviceName = "TarjetaSoap")
public class TarjetaSoap {

    @Inject
    TarjetaService service;

    /**
     * Web service operation
     */
    @WebMethod(operationName = "pagoTarjeta")
    public Boolean pagoTarjeta(@WebParam(name = "identificationType") String tipoIdentificacion,
            @WebParam(name = "identification") String identificacion,
            @WebParam(name = "cardNumber") String numeroTarjeta, @WebParam(name = "amount") String monto) {
        return service.pagarTarjeta(tipoIdentificacion, identificacion, numeroTarjeta, new BigInteger(monto));
    }
}
