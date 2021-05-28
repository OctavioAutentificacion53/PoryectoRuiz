package com.octavio.mancillaco.service;

import java.util.List;

import com.octavio.mancillaco.model.Producto;

public interface IntProductoService {
	//Logica de negocio 
	
	public List<Producto> obtenerTodos();
	public void guardar(Producto producto);
	public void eliminar(Integer idProducto);
	public Producto buscarPorId(Integer idProducto);

}
