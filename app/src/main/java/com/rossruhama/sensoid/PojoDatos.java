package com.rossruhama.sensoid;

public class PojoDatos {

    private String nombreCompleto;
    private String contrasenia;
    private String email;
    private String descripcion;

    public PojoDatos(String nombreCompleto, String contrasenia, String email, String descripcion) {
        this.nombreCompleto = nombreCompleto;
        this.contrasenia = contrasenia;
        this.email = email;
        this.descripcion = descripcion;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
