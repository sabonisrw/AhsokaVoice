package com.AhsokaVoice.models;

import jakarta.persistence.*;

@Entity
@Table(name = "images")

public class ImageModel {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;

@Column(nullable = false)
    private  String nombre;

@Column(nullable = false)
    private  String tipo;

@Lob
@Column(nullable = false)
    private byte[] imagen;

//constructor vacio
    public ImageModel() {
    }
 // Constructores


    public ImageModel(Long id,
                      String nombre,
                      String tipo,
                      byte[] imagen) {
        this.id = id;
        this.nombre = nombre;
        this.tipo = tipo;
        this.imagen = imagen;
    }
//constructor sin ID
    public ImageModel(String nombre,
                      String tipo,
                      byte[] imagen) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.imagen = imagen;
    }

    //getter and setter

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

    public byte[] getImagen() {
        return imagen;
    }

    public void setImagen(byte[] imagen) {
        this.imagen = imagen;
    }
}
