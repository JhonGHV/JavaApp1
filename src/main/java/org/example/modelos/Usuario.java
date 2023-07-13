package org.example.modelos;

import org.example.validacion.UsuarioValidacion;

public class Usuario {

    //ATTRIBUTES = VARIABLES = DATES

    //METHODS = FUNCTIONS = ACTIONS



    //ORDINARY METHODS

    private Integer id;
    private String nombres;
    private String documento ;
    private  Integer ubicacion ;
    private  String correoElectronico;

    private UsuarioValidacion Validacion = new UsuarioValidacion();

    //SPECIAL METHODS

    public Usuario() { //Constructor vacio
    }

    public Usuario(Integer id, String nombres, String documento, Integer ubicacion, String correoElectronico) {
        this.id = id;
        this.nombres = nombres;
        this.documento = documento;
        this.ubicacion = ubicacion;
        this.correoElectronico = correoElectronico;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        try {
            this.Validacion.ValidarNombre(nombres);
            this.nombres = nombres;
        } catch (Exception error){
            System.out.print(error.getMessage());
        }

    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public Integer getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(Integer ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }
}