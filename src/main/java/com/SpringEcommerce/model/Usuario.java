package com.SpringEcommerce.model;

public class Usuario {
private int id;
private String nombre;
private String userme;
private String email;
private String direccion;
private String tipo;
private String password;
private String telefono;


public Usuario() {
	
}

public Usuario(int id, String nombre, String userme, String email, String direccion, String tipo, String password,
		String telefono) {
	super();
	this.id = id;
	this.nombre = nombre;
	this.userme = userme;
	this.email = email;
	this.direccion = direccion;
	this.tipo = tipo;
	this.password = password;
	this.telefono = telefono;
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
public String getUserme() {
	return userme;
}
public void setUserme(String userme) {
	this.userme = userme;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getDireccion() {
	return direccion;
}
public void setDireccion(String direccion) {
	this.direccion = direccion;
}
public String getTipo() {
	return tipo;
}
public void setTipo(String tipo) {
	this.tipo = tipo;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getTelefono() {
	return telefono;
}
public void setTelefono(String telefono) {
	this.telefono = telefono;
}

}

