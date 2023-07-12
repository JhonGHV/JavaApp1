package org.example.modelos;

public class Reserva {

    private Integer id;
    private Integer idusuario;
    private Integer idoferta;
    private Double costototal;
    private Double fechareserva;

    public Reserva() {
    }

    public Reserva(Integer id, Integer idusuario, Integer idoferta, Double costototal, Double fechareserva) {
        this.id = id;
        this.idusuario = idusuario;
        this.idoferta = idoferta;
        this.costototal = costototal;
        this.fechareserva = fechareserva;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(Integer idusuario) {
        this.idusuario = idusuario;
    }

    public Integer getIdoferta() {
        return idoferta;
    }

    public void setIdoferta(Integer idoferta) {
        this.idoferta = idoferta;
    }

    public Double getCostototal() {
        return costototal;
    }

    public void setCostototal(Double costototal) {
        this.costototal = costototal;
    }

    public Double getFechareserva() {
        return fechareserva;
    }

    public void setFechareserva(Double fechareserva) {
        this.fechareserva = fechareserva;
    }
}
