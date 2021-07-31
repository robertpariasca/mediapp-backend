package com.mitocode.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.ForeignKey;

import io.swagger.v3.oas.annotations.media.Schema;


@Schema(description = "Signos Model")
@Entity
public class Signos {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idSignos;
	
	@ManyToOne
	@JoinColumn(name = "id_paciente", nullable = false, foreignKey = @ForeignKey(name = "FK_signos_paciente"))
	private Paciente paciente;
	
	@Column(name = "fecha", nullable = false)
	private LocalDateTime fecha;
	
	@Column(name = "Temperatura", length = 2, nullable = false)
	private String Temperatura;
	
	@Column(name = "Pulso", length = 3, nullable = false)
	private String Pulso;
	
	@Column(name = "RitmoRespiratorio", length = 3, nullable = false)
	private String RitmoRespiratorio;

	public Integer getIdSignos() {
		return idSignos;
	}

	public void setIdSignos(Integer idSignos) {
		this.idSignos = idSignos;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public LocalDateTime getFecha() {
		return fecha;
	}

	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}

	public String getTemperatura() {
		return Temperatura;
	}

	public void setTemperatura(String temperatura) {
		Temperatura = temperatura;
	}

	public String getPulso() {
		return Pulso;
	}

	public void setPulso(String pulso) {
		Pulso = pulso;
	}

	public String getRitmoRespiratorio() {
		return RitmoRespiratorio;
	}

	public void setRitmoRespiratorio(String ritmoRespiratorio) {
		RitmoRespiratorio = ritmoRespiratorio;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idSignos == null) ? 0 : idSignos.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Signos other = (Signos) obj;
		if (idSignos == null) {
			if (other.idSignos != null)
				return false;
		} else if (!idSignos.equals(other.idSignos))
			return false;
		return true;
	}
	
	
}
