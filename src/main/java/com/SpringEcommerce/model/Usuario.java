package com.SpringEcommerce.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="Usuarios")
public class Usuario {
	@Id
	//para auto incrementar el id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
private String nombre;
private String userme;
private String email;
private String direccion;
private String tipo;
private String password;
private String telefono;

@OneToMany(mappedBy = "usuario")
private List<Producto> productos;
@OneToMany(mappedBy = "usuario")
private List<orden> ordenes;
public Usuario() {
	
}


public Usuario(int id, String nombre, String userme, String email, String direccion, String tipo, String password,
		String telefono, List<Producto> productos) {
	super();
	this.id = id;
	this.nombre = nombre;
	this.userme = userme;
	this.email = email;
	this.direccion = direccion;
	this.tipo = tipo;
	this.password = password;
	this.telefono = telefono;
	
	
	
	this.productos = productos;
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

public List<Producto> getProductos() {
	return productos;
}

public void setProductos(List<Producto> productos) {
	this.productos = productos;
}

@Override
public String toString() {
	return "Usuario [id=" + id + ", nombre=" + nombre + ", userme=" + userme + ", email=" + email + ", direccion="
			+ direccion + ", tipo=" + tipo + ", password=" + password + ", telefono=" + telefono + ", productos="
			+ productos + "]";
}

}

