package com.tix.modelo.entidades;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * Entity implementation class for Entity: Modalidad
 *
 */
@Entity
@Table(name = "MODALIDADES")
@NamedQuery(name = "Modalidad.findAll", query = "SELECT m FROM Modalidad m")
public class Modalidad implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name = "SEQ_ID_MOD")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_ID_MOD")
	@Column(name = "ID_MODALIDAD")
	private long idModalidad;

	@Column(nullable = false)
	private int estado;

	@Column(nullable = false, length = 50, unique = true)
	private String nombre;

	@OneToMany(mappedBy = "modalidad")
	private List<Evento> eventos;

	public long getIdModalidad() {
		return idModalidad;
	}

	public void setIdModalidad(long idModalidad) {
		this.idModalidad = idModalidad;
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
