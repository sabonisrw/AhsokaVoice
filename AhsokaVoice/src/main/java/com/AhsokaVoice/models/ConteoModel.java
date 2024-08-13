package com.AhsokaVoice.models;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="ConteoLikes")
public class ConteoModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique=true, nullable=false)

	private Long id;
    private Integer conteo;
    private Long idLogro;
    private Long idUser;
    @JsonFormat(pattern="yyyy-MM-dd")
    private Date fecha;
    
    
	public Integer getConteo() {
		return conteo;
	}
	public void setConteo(Integer conteo) {
		this.conteo = conteo;
	}
	public Long getIdLogro() {
		return idLogro;
	}
	public void setIdLogro(Long idLogro) {
		this.idLogro = idLogro;
	}
	public Long getIdUser() {
		return idUser;
	}
	public void setIdUser(Long idUser) {
		this.idUser = idUser;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	} 
}
