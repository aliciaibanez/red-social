package com.eclipse.practicas.redsocial;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
public class Entrada {
	
	private String usuario;
	private LocalDateTime momentoPublicacion;
	private int cantidadMeGusta;
	private ArrayList <String> comentarios;
	


public Entrada (String autor) {
	this.usuario = autor;
 
    this.momentoPublicacion = LocalDateTime.now();
    this.cantidadMeGusta = 0;
    this.comentarios = new ArrayList<>();
	
}



public String getUsuario() {
	return usuario;
}
public void meGusta() {
    cantidadMeGusta++;
}

public int getCantidadMeGusta() {
	return cantidadMeGusta;
}

public ArrayList<String> getComentarios() {
	return comentarios;
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

