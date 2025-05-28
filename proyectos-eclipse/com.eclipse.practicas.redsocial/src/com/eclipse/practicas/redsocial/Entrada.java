package com.eclipse.practicas.redsocial;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
public class Entrada {
	
	public String usuario;
	public LocalDateTime momentoPublicacion;
	public int cantidadMeGusta;
	public ArrayList <String> comentarios;
	


public Entrada (String autor) {
	this.usuario = autor;
 
    this.momentoPublicacion = LocalDateTime.now();
    this.cantidadMeGusta = 0;
    this.comentarios = new ArrayList<>();
	
}

public void meGusta() {
    cantidadMeGusta++;
}

public void addComentario(String text) {
    comentarios.add(text);
}

public LocalDateTime getMomentoPublicacion() {
    return momentoPublicacion;
}
public String toString() {
    
    return "";

}
}

