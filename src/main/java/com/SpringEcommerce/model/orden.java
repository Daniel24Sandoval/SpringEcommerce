package com.SpringEcommerce.model;


import java.sql.Date;

public class orden {
private int id;
private String numero;
private Date fechaCreacion;
private Date fechaRecibida;

public orden() {
	
}

public orden(int id, String numero, Date fechaCreacion, Date fechaRecibida) {
	super();
	this.id = id;
	this.numero = numero;
	this.fechaCreacion = fechaCreacion;
	this.fechaRecibida = fechaRecibida;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getNumero() {
	return numero;
}

public void setNumero(String numero) {
	this.numero = numero;
}

public Date getFechaCreacion() {
	return fechaCreacion;
}

public void setFechaCreacion(Date fechaCreacion) {
	this.fechaCreacion = fechaCreacion;
}

public Date getFechaRecibida() {
	return fechaRecibida;
}

public void setFechaRecibida(Date fechaRecibida) {
	this.fechaRecibida = fechaRecibida;
}

@Override
public String toString() {
	return "orden [id=" + id + ", numero=" + numero + ", fechaCreacion=" + fechaCreacion + ", fechaRecibida="
			+ fechaRecibida + "]";
}

}
