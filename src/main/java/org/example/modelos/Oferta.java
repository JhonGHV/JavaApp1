package org.example.modelos;

import java.util.Date;

public class Oferta {
    private Integer id;
    private String titulo;
    private String descripcion;
    private Date fechainicio;
    private Date fechafin;
    private Double costopersona;
    private Integer idlocal;

    public Oferta() {
    }

    public Oferta(Integer id, String titulo, String descripcion, Date fechainicio, Date fechafin, Double costopersona, Integer idlocal) {
        this.id = id;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.fechainicio = fechainicio;
        this.fechafin = fechafin;
        this.costopersona = costopersona;
        this.idlocal = idlocal;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFechainicio() {
        return fechainicio;
    }

    public void setFechainicio(Date fechainicio) {
        this.fechainicio = fechainicio;
    }

    public Date getFechafin() {
        return fechafin;
    }

    public void setFechafin(Date fechafin) {
        this.fechafin = fechafin;
    }

    public Double getCostopersona() {
        return costopersona;
    }

    public void setCostopersona(Double costopersona) {
        this.costopersona = costopersona;
    }

    public Integer getIdlocal() {
        return idlocal;
    }

    public void setIdlocal(Integer idlocal) {
        this.idlocal = idlocal;
    }
}
