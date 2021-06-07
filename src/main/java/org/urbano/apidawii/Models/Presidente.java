package org.urbano.apidawii.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_presidente")
public class Presidente {
    @Id
    @Column(name = "id_pre")
    private Integer id;

    @Column(name = "dni_pre")
    private String dni;

    @Column(name = "nom_pre")
    private String nombres;

    @Column(name = "apepat_pre")
    private String apePaterno;

    @Column(name = "apemat_pre")
    private String apeMaterno;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApePaterno() {
        return apePaterno;
    }

    public void setApePaterno(String apePaterno) {
        this.apePaterno = apePaterno;
    }

    public String getApeMaterno() {
        return apeMaterno;
    }

    public void setApeMaterno(String apeMaterno) {
        this.apeMaterno = apeMaterno;
    }
}