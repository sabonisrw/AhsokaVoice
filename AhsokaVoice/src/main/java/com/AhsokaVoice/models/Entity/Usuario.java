package com.AhsokaVoice.models.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;
//PARA LLAMAR GETTER AND SETTER
@Data
//CONSTRUCTORES ARMADOS
@AllArgsConstructor
//CONSTRUCTOR VACIO
@NoArgsConstructor
// LLAMAR METODO STRING?
@ToString
@Entity

@Table(name = "Cliente")
public class Usuario implements Serializable {

    //identificar primarykey
    @Id
    //nombre de la columna
    @Column(name = "id_cliente")
    //para generar un id automatico
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Integer idCliente;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "apellido")
    private String apellido;
    @Column(name = "correo")
    private  String correo;
    @Column(name = "fechaRegistro")
    private Date fechaRegistro;
    @Column(name = "constrasenia")
    private String contrasenia;
}
