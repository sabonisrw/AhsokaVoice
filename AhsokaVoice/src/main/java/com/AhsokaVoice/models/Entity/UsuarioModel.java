package com.AhsokaVoice.models.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity

@Table(name = "usuario" )
public class UsuarioModel implements Serializable {

    @Id
    @Column(name = "id_usuario")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idUsuario;
    @Column(name = "nombre")
    private  String nombre;
    @Column(name = "apellido")
    private  String apellido;
    @Column(name = "correo")
    private String correo;
    @Column(name = "fechaRegistro")
    private Date fechaRegistro;
    @Column(name = "contrasenia")
    private String contrasenia;
}
