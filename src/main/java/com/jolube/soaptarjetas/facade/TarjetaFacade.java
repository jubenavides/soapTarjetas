/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jolube.soaptarjetas.facade;

import com.jolube.soaptarjetas.model.Tarjeta;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author jolub
 */
@Stateless
public class TarjetaFacade extends AbstractFacade<Tarjeta> {

    @PersistenceContext(unitName = "punit")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TarjetaFacade() {
        super(Tarjeta.class);
    }
    
}
