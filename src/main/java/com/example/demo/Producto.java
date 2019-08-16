package com.example.demo;

public class Producto 
{
	String Id;
	int Cantidad;
	String Nombre;
	
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	public int getCantidad() {
		return Cantidad;
	}
	public void setCantidad(int cantidad) {
		Cantidad = cantidad;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	
	public Producto(String Id, String Nombre, int Cantidad) {
	        this.Id = Id;
	        this.Nombre = Nombre;
	        this.Cantidad = Cantidad;
	 }
	
	public Producto()
	{
		
	}
	    
}
