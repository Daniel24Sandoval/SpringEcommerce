package com.SpringEcommerce.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SpringEcommerce.model.Producto;
@Repository
public interface Producto_Dao extends JpaRepository<Producto, Integer>{

	
	
}
