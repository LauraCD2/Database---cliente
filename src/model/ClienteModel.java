package model;

import java.sql.Date;

public class ClienteModel {
    private String tag;
    private String nombre;
    private String email;
    private long celular;
    private String clave;
    private Date fechaNto;
    
    /**
     * Constructor without paramenters
     */
    public ClienteModel(){};
    
    /**
     * Constructor for internal management of our table ClienteModel
     * 
     * @param tag
     * @param nombre
     * @param email
     * @param celular
     * @param clave
     * @param fechaNto 
     */
    public ClienteModel(String tag, String nombre, String email, long celular, String clave, Date fechaNto) {
        this.tag      = tag;
        this.nombre   = nombre;
        this.email    = email;
        this.celular  = celular;
        this.clave    = clave;
        this.fechaNto = fechaNto;
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
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
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
    public long getCelular() {
        return celular;
    }

    /**
     * @param celular the celular to set
     */
    public void setCelular(long celular) {
        this.celular = celular;
    }

    /**
     * @return the clave
     */
    public String getClave() {
        return clave;
    }

    /**
     * @param clave the clave to set
     */
    public void setClave(String clave) {
        this.clave = clave;
    }

    /**
     * @return the fechaNto
     */
    public Date getFechaNto() {
        return fechaNto;
    }

    /**
     * @param fechaNto the fechaNto to set
     */
    public void setFechaNto(Date fechaNto) {
        this.fechaNto = fechaNto;
    }
    
    public Object[] toArray(){
        Object[] data = {tag, nombre, email, celular, fechaNto, clave};
        return data;
    }
}
