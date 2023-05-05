package com.SpringEcommerce.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SpringEcommerce.Dao.Producto_Dao;
import com.SpringEcommerce.model.Producto;
@Service
public class Producto_Service_Implen implements Producto_Service{
	@Autowired
	private Producto_Dao producto_dao;
	
	@Override
	public Producto save(Producto producto) {
		
		
		// TODO Auto-generated method stub
		return producto_dao.save(producto);
	}

	@Override
	public Optional<Producto> get(Integer id) {
		// TODO Auto-generated method stub
		return producto_dao.findById(id);
	}

	@Override
	public void update(Producto producto) {
		// TODO Auto-generated method stub
		producto_dao.save(producto);
		
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		producto_dao.deleteById(id);;
		
	}

	@Override
	public List<Producto> finAll() {
		// TODO Auto-generated method stub
		return producto_dao.findAll();
	}

	
}
