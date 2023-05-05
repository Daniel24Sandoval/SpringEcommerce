package com.SpringEcommerce.Service;

import java.util.List;
import java.util.Optional;

import com.SpringEcommerce.model.Producto;

public interface Producto_Service {
public Producto save(Producto producto) ;
public Optional<Producto> get(Integer id);
public void update(Producto producto);
public void delete (Integer id);
///FUNCIONALIDAD DE MOSTRAR PRODUCTO
public List<Producto> finAll();

}

