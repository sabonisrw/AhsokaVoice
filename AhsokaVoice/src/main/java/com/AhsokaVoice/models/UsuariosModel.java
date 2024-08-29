package com.AhsokaVoice.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;


@Getter
@Setter
@Entity
@Table(name = "Usuarios")
public class UsuariosModel {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long usuarioId;

    @Column(name="nombre")
    private  String nombre;

    @Column(name="fechaNacimiento")
    private Date fechaNacimiento;

    @Column(name="email")
    private String email;

    @Column(name="contraseña")
    private String contraseña;

//constructor vacio
    public UsuariosModel() {
    }
//constructor armado
    public UsuariosModel(Long usuarioId,
                         String nombre,
                         Date fechaNacimiento,
                         String email,
                         String contraseña) {
        this.usuarioId = usuarioId;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.email = email;
        this.contraseña = contraseña;
    }
//getter y setter sin ID

    public Long getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(Long usuarioId) {
        this.usuarioId = usuarioId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
}
