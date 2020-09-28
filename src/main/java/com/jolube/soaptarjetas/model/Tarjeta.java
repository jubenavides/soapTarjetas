/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jolube.soaptarjetas.model;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author jolub
 */
@Entity
@Table(name = "tarjeta", schema = "public")
public class Tarjeta implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 16)
    @Column(name = "numero")
    private String numero;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "nombre")
    private String nombre;
    @Basic(optional = false)
    @NotNull
    @Column(name = "tipo")
    private Character tipo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "expedicion")
    @Temporal(TemporalType.DATE)
    private Date expedicion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "expiracion")
    @Temporal(TemporalType.DATE)
    private Date expiracion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 3)
    @Column(name = "cvv")
    private String cvv;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cupo_maximo")
    private BigInteger cupoMaximo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "saldo")
    private BigInteger saldo;
    @JoinColumn(name = "cod_cliente", referencedColumnName = "cod_cliente")
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Cliente codCliente;

    public Tarjeta() {
    }

    public Tarjeta(String numero) {
        this.numero = numero;
    }

    public Tarjeta(String numero, String nombre, Character tipo, Date expedicion, Date expiracion, String cvv, BigInteger cupoMaximo, BigInteger saldo) {
        this.numero = numero;
        this.nombre = nombre;
        this.tipo = tipo;
        this.expedicion = expedicion;
        this.expiracion = expiracion;
        this.cvv = cvv;
        this.cupoMaximo = cupoMaximo;
        this.saldo = saldo;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Character getTipo() {
        return tipo;
    }

    public void setTipo(Character tipo) {
        this.tipo = tipo;
    }

    public Date getExpedicion() {
        return expedicion;
    }

    public void setExpedicion(Date expedicion) {
        this.expedicion = expedicion;
    }

    public Date getExpiracion() {
        return expiracion;
    }

    public void setExpiracion(Date expiracion) {
        this.expiracion = expiracion;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    public BigInteger getCupoMaximo() {
        return cupoMaximo;
    }

    public void setCupoMaximo(BigInteger cupoMaximo) {
        this.cupoMaximo = cupoMaximo;
    }

    public BigInteger getSaldo() {
        return saldo;
    }

    public void setSaldo(BigInteger saldo) {
        this.saldo = saldo;
    }

    public Cliente getCodCliente() {
        return codCliente;
    }

    public void setCodCliente(Cliente codCliente) {
        this.codCliente = codCliente;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (numero != null ? numero.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tarjeta)) {
            return false;
        }
        Tarjeta other = (Tarjeta) object;
        if ((this.numero == null && other.numero != null) || (this.numero != null && !this.numero.equals(other.numero))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.jolube.soaptarjetas.model.Tarjeta[ numero=" + numero + " ]";
    }
    
}
