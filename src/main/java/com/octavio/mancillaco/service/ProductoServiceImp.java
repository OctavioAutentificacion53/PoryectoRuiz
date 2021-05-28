package com.octavio.mancillaco.service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.octavio.mancillaco.model.Producto;

@Service
public class ProductoServiceImp implements IntProductoService {

	private List<Producto> lista;
	
	public ProductoServiceImp() {
		lista = new LinkedList<Producto>();
		DateTimeFormatter formato = 
				DateTimeFormatter.ofPattern("dd-MM-yyyy");
		//Crear objetos producto
		Producto p1 = new Producto();
		p1.setId(1);
		p1.setNombre("Procesador");
		p1.setDescripcion("Procesadoir core i7");
		p1.setExistencias(5);
		p1.setPrecio(5000.0);
		//p1.setFechaProduccion(LocalDate.now());
		p1.setFechaProduccion(LocalDate.parse("18-09-2017", formato));
		p1.setImagen("procesador.png");
		
		Producto p2 = new Producto();
		p2.setId(2);
		p2.setNombre("Mouse Logitech");
		p2.setDescripcion("Mouse Logitech g203");
		p2.setExistencias(29);
		p2.setPrecio(500.0);
		p2.setFechaProduccion(LocalDate.parse("18-09-2019", formato));
		p2.setImagen("mouse.png");
		
		Producto p3 = new Producto();
		p3.setId(3);
		p3.setNombre("Placa madre");
		p3.setDescripcion("Placa madre Aourus");
		p3.setExistencias(10);
		p3.setPrecio(2500.0);
		p3.setFechaProduccion(LocalDate.parse("18-09-2019", formato));
		p3.setImagen("placa.png");
		
		Producto p4 = new Producto();
		p4.setId(4);
		p4.setNombre("Audifonos");
		p4.setDescripcion("Audifonos Logitech G733");
		p4.setExistencias(10);
		p4.setPrecio(2500.0);
		p4.setFechaProduccion(LocalDate.parse("18-09-2019", formato));
		p4.setImagen("audifonos.png");
		
		Producto p5 = new Producto();
		p5.setId(5);
		p5.setNombre("Soporte");
		p5.setDescripcion("Soporte Audifonos RGB");
		p5.setExistencias(10);
		p5.setPrecio(2500.0);
		p5.setFechaProduccion(LocalDate.parse("18-09-2019", formato));
		p5.setImagen("soporte.png");
		
		Producto p6 = new Producto();
		p6.setId(5);
		p6.setNombre("Mousepad");
		p6.setDescripcion("Alfombrilla para mouse XXl");
		p6.setExistencias(10);
		p6.setPrecio(2500.0);
		p6.setFechaProduccion(LocalDate.parse("18-09-2017", formato));
		p6.setImagen("mousepad.png");
		
		
		lista.add(p1);
		lista.add(p2);
		lista.add(p3);
		lista.add(p4);
		lista.add(p5);
		lista.add(p6);
		
		
	}
	@Override
	public List<Producto> obtenerTodos() {
		// TODO Auto-generated method stub
		return lista;
	}

	@Override
	public void guardar(Producto producto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminar(Integer idProducto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Producto buscarPorId(Integer idProducto) {
		// TODO Auto-generated method stub
		return null;
	}

}
