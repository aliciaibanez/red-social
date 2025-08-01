import java.time.LocalDateTime;
import java.util.ArrayList;

import com.eclipse.practicas.redsocial.Entrada;

import java.time.Duration;
/**
 * Write a description of class EntradaFoto here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EntradaFoto extends Entrada
{
    
    private String urlImagen;
    private String titulo;
    
    /**
     * Constructor for objects of class EntradaFoto
     */
    public EntradaFoto(String autor, String url, String titulo)
    {
    	super(autor);
        this.urlImagen = url;
        this.titulo = titulo;
    }
       

    

    public String getUrlImagen() {
        return urlImagen;
    }

    public String getTituloImagen() {
        return titulo;
    }

   

    public String toString() {
    	
    	
        
        String cantidadComentariosString = "";
        int numeroComentarios = 0;
        Duration publicadoHace = Duration.between(getMomentoPublicacion(), LocalDateTime.now());
        long seconds = publicadoHace.toSeconds();
        long minutes = publicadoHace.toMinutes();
        long hours = publicadoHace.toHours();
        long days = publicadoHace.toDays();
        String caracteristicasTemporales = "Publicado hace 10 segundos";
        String comentarioFotoAMostrar = "";

        
        if (getComentarios().size() != 0) {
            numeroComentarios = getComentarios().size();
            cantidadComentariosString = "Cantidad de comentarios: " + numeroComentarios;
            int i = 0;
            while (i < getComentarios().size()) {
            comentarioFotoAMostrar += getComentarios().get(i).toString() + "\n";
            i++;
            }
        } else {
            cantidadComentariosString = "No hay comentarios";
        }
        
        return  "Usuario: " + getUsuario() + "\n" +
        "Imagen: " + urlImagen + "\n" +
        "Título: " + titulo + "\n" +
        caracteristicasTemporales + "\n" +
        cantidadComentariosString + "\n" +
        comentarioFotoAMostrar + "\n" +
        "Cantidad de me gusta: " + getCantidadMeGusta() + "\n";

    }
}

