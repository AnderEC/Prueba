package com.example.demo;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Prueba 
{
	Producto P = new Producto(), Q[];
	
	@GetMapping("/UsuarioLogin")
	public Producto IngresoUsuario()
	{
		P.setId("1");
		P.setNombre("Pan");
		P.setCantidad(2);
		
		System.out.println("Ingresar Usuario:     ");
		System.out.println("Id:       " + P.getId());
		System.out.println("Nombre:   " + P.getNombre());
		System.out.println("Cantidad: " + P.getCantidad());
		
		return P;
	}
	
	@PostMapping(value= "/UsuarioPost")
	public Producto Muestra()
	{
		P.getId();
		P.getNombre();
		P.getCantidad();
		
		System.out.println("------------------------- Ingresado Completamente  -------------------------------------");
		
		return P;
	}
	
	@PutMapping(value = "/UsuarioPut/{id}")
	public Producto Actualiza(String id)
	{
		P.setId(id);
		System.out.println("Modificar Usuario    " + P.getId());
		
		return P;
	}
	
	@DeleteMapping(value = "/UsuarioBorrado/{id}")
	public Producto Elimina(String id)
	{
		
		if(id == P.getId())
		{
			P.setId(null);
			P.setCantidad(0);
			P.setNombre(null);
		}
		
		System.out.println("Usuario Eliminado:     ");
		System.out.println("Id:       " + P.getId());
		System.out.println("Nombre:   " + P.getNombre());
		System.out.println("Cantidad: " + P.getCantidad());
		
		return P;
	}
	
	@GetMapping("/ArregloUsuarioGet")
	public Producto[] IngresarUsuarios()
	{
		Q = new Producto[3];
		Q[0] = new Producto("2", "Torta", 3);
        Q[1] = new Producto("3", "Alfajor", 6);
        Q[2] = new Producto("4", "Rosca", 5);
		
		for(int i=0; i<3; i++)
		{
			System.out.println(Q[i].getId());
			System.out.println(Q[i].getNombre());
			System.out.println(Q[i].getCantidad());
		}
		
		return Q;
	}
	
	@GetMapping("/UsuarioGetParametros/{id}")
	public Producto IngresarUsuariosParametros(String id)
	{
		if(id == P.getId())
			return P;
		
		else 
			return null;
	}
	
	@GetMapping("/IngresoGetQuery?cantidad=2")
	public Producto MostrarUnUsuario(int cantidad)
	{
		P = new Producto();
		if(cantidad == P.getCantidad())
		{
			P.getId();
			P.getNombre();
		}
		
		return P;
	}
}
