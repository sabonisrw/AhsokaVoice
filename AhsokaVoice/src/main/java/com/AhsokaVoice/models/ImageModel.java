package com.AhsokaVoice.models;

import jakarta.persistence.*;

@Entity
@Table(name = "images")

public class ImageModel {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;

@Column(name = "nombre")
    private  String nombre;

    @Column(name = "tipo")
    private  String tipo;

@Lob
    private byte[] datos;

//constructor vacio
    public ImageModel() {
    }
 // Constructores
    public ImageModel(Long id,
                      String nombre,
                      String tipo,
                      byte[] datos) {
        this.id = id;
        this.nombre = nombre;
        this.tipo = tipo;
        this.datos = datos;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public byte[] getDatos() {
        return datos;
    }

    public void setDatos(byte[] datos) {
        this.datos = datos;
    }
}
