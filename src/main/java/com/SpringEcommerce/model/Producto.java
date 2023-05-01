package com.SpringEcommerce.model;

public class Producto {
private int id;
private String nombre;
private String desripcion;
private String imagen;
private double precio;
private int cantidad;
public Producto() {
	
}
public Producto(int id, String nombre, String desripcion, String imagen, double precio, int cantidad) {
	super();
	this.id = id;
	this.nombre = nombre;
	this.desripcion = desripcion;
	this.imagen = imagen;
	this.precio = precio;
	this.cantidad = cantidad;
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
@Override
public String toString() {
	return "Producto [id=" + id + ", nombre=" + nombre + ", desripcion=" + desripcion + ", imagen=" + imagen
			+ ", precio=" + precio + ", cantidad=" + cantidad + "]";
}


}
