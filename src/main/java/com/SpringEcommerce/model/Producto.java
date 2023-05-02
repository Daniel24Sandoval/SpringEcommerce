package com.SpringEcommerce.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table (name = "productos")
public class Producto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
private String nombre;
private String desripcion;
private String imagen;
private double precio;
private int cantidad;

//esta tabla la vamos a relacionar con la tabla o modelo USUARIO
	@ManyToOne
	private Usuario usuario;
public Producto() {
	
}

public Producto(int id, String nombre, String desripcion, String imagen, double precio, int cantidad, Usuario usuario) {
	super();
	this.id = id;
	this.nombre = nombre;
	this.desripcion = desripcion;
	this.imagen = imagen;
	this.precio = precio;
	this.cantidad = cantidad;
	
	this.usuario = usuario;
}

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public String getDesripcion() {
	return desripcion;
}
public void setDesripcion(String desripcion) {
	this.desripcion = desripcion;
}
public String getImagen() {
	return imagen;
}
public void setImagen(String imagen) {
	this.imagen = imagen;
}
public double getPrecio() {
	return precio;
}
public void setPrecio(double precio) {
	this.precio = precio;
}
public int getCantidad() {
	return cantidad;
}
public void setCantidad(int cantidad) {
	this.cantidad = cantidad;
}



public Usuario getUsuario() {
	return usuario;
}
public void setUsuario(Usuario usuario) {
	this.usuario = usuario;
}
@Override
public String toString() {
	return "Producto [id=" + id + ", nombre=" + nombre + ", desripcion=" + desripcion + ", imagen=" + imagen
			+ ", precio=" + precio + ", cantidad=" + cantidad + "]";
}


}
