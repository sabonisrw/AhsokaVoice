package com.AhsokaVoice.models;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="conteo_likes")
public class ConteoModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique=true, nullable=false)
	private Long id;
    private Integer conteo;
	@JsonFormat(pattern="yyyy-MM-dd")
    private Date fecha;
    @ManyToOne
    @JoinColumn(name="id_logro", referencedColumnName = "id", nullable=false)
    private LogroModel logro;
    /*@ManyToOne
    @JoinColumn(name="id_user")
    private LogroModel id_user;
    */    
    
	public Integer getConteo() {
		return conteo;
	}
	public void setConteo(Integer conteo) {
		this.conteo = conteo;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	} 
    public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public LogroModel getLogro() {
		return logro;
	}
	public void setId_logro(LogroModel id_logro) {
		this.logro = id_logro;
	}
}
