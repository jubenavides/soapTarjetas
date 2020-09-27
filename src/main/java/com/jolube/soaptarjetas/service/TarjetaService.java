/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jolube.soaptarjetas.service;

import com.jolube.soaptarjetas.facade.TarjetaFacade;
import com.jolube.soaptarjetas.model.Tarjeta;
import java.math.BigInteger;
import javax.ejb.EJB;

/**
 *
 * @author jolub
 */
public class TarjetaService {

    @EJB
    TarjetaFacade tf;

    public Boolean pagarTarjeta(String tipoIdentificacion, String identificacion, String numeroTarjeta, BigInteger monto) {
        Tarjeta tarjeta = tf.find(numeroTarjeta);
        if (tarjeta.getCodCliente().getTipoIdentificacion().compareToIgnoreCase(tipoIdentificacion) == 0
                && tarjeta.getCodCliente().getIdentificacion().compareToIgnoreCase(identificacion) == 0) {
            tarjeta.setSaldo(tarjeta.getSaldo().subtract(monto));
            tf.edit(tarjeta);
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }
}
