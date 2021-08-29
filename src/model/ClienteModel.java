/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author LAURA CAMILA
 */
import java.sql.Date;

public class ClienteModel {
    private String tag;
    private String nombre;
    private String email;
    private long   celular;
    private char   clave;
    private Date   fecha_nto;
    
    /**
     * Builder for table internal management
     * @param tag
     * @param nombre
     * @param email
     * @param celular
     * @param clave
     * @param fecha_nto 
     */
    public ClienteModel(String tag, String nombre, 
                        String email, int celular, 
                        char clave, String fecha_nto){
        this.tag       = tag;
        this.nombre    = nombre;
        this.email     = email;
        this.celular   = celular;
        this.clave     = clave;
        this.fecha_nto = fecha_nto;
    }

    /**
     * @return the tag
     */
    public String getTag() {
        return tag;
    }

    /**
     * @param tag the tag to set
     */
    public void setTag(String tag) {
        this.tag = tag;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the celular
     */
    public int getCelular() {
        return celular;
    }

    /**
     * @param celular the celular to set
     */
    public void setCelular(int celular) {
        this.celular = celular;
    }

    /**
     * @return the clave
     */
    public char getClave() {
        return clave;
    }

    /**
     * @param clave the clave to set
     */
    public void setClave(char clave) {
        this.clave = clave;
    }

    /**
     * @return the fecha_nto
     */
    public String getFecha_nto() {
        return fecha_nto;
    }
}
