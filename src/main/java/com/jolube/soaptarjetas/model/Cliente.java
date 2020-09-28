/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jolube.soaptarjetas.model;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author jolub
 */
@Entity
@Table(name = "cliente", schema = "public")
public class Cliente implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "cod_cliente")
    private BigDecimal codCliente;
    @Size(max = 200)
    @Column(name = "tipo_identificacion")
    private String tipoIdentificacion;
    @Size(max = 200)
    @Column(name = "identificacion")
    private String identificacion;
    @Size(max = 200)
    @Column(name = "nombre1")
    private String nombre1;
    @Size(max = 200)
    @Column(name = "nombre2")
    private String nombre2;
    @Size(max = 200)
    @Column(name = "apellido1")
    private String apellido1;
    @Size(max = 200)
    @Column(name = "apellido2")
    private String apellido2;
    @Size(max = 200)
    @Column(name = "direccion")
    private String direccion;
    @Size(max = 10)
    @Column(name = "telefono")
    private String telefono;
    @Size(max = 200)
    @Column(name = "correo")
    private String correo;

    public Cliente() {
    }

    public Cliente(BigDecimal codCliente) {
        this.codCliente = codCliente;
    }

    public BigDecimal getCodCliente() {
        return codCliente;
    }

    public void setCodCliente(BigDecimal codCliente) {
        this.codCliente = codCliente;
    }

    public String getTipoIdentificacion() {
        return tipoIdentificacion;
    }

    public void setTipoIdentificacion(String tipoIdentificacion) {
        this.tipoIdentificacion = tipoIdentificacion;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombre1() {
        return nombre1;
    }

    public void setNombre1(String nombre1) {
        this.nombre1 = nombre1;
    }

    public String getNombre2() {
        return nombre2;
    }

    public void setNombre2(String nombre2) {
        this.nombre2 = nombre2;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codCliente != null ? codCliente.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cliente)) {
            return false;
        }
        Cliente other = (Cliente) object;
        if ((this.codCliente == null && other.codCliente != null) || (this.codCliente != null && !this.codCliente.equals(other.codCliente))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.jolube.soaptarjetas.model.Cliente[ codCliente=" + codCliente + " ]";
    }
    
}
