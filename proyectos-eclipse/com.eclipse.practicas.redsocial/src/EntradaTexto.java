import java.time.LocalDateTime;
import java.util.ArrayList;

import com.eclipse.practicas.redsocial.Entrada;

import java.time.Duration;
/**
 * Write a description of class EntradaTexto here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EntradaTexto extends Entrada
{
    
    private String mensaje;
   

    /**
     * Constructor for objects of class EntradaTexto
     */
    public EntradaTexto (String autor, String texto)
    {
    super(autor);
        this.mensaje = texto;
       
    }

  
    public String getMensaje() {
        return mensaje;
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
        String comentarioTextoAMostrar = "";
        String comentarioFotoMostrar = "";


        if (getComentarios().size() != 0) {
            numeroComentarios = getComentarios().size();
            cantidadComentariosString = "Cantidad de comentarios: " + numeroComentarios;
            int i = 0;
            while (i < getComentarios().size()) {
            comentarioTextoAMostrar += getComentarios().get(i).toString() + "\n";
            i++;
            }
        } else {
            cantidadComentariosString = "No hay comentarios";
        }
        return  "Usuario: " + getUsuario() + "\n" + "Mensaje: " + mensaje + "\n" + caracteristicasTemporales + "\n" + cantidadComentariosString + "\n" + comentarioTextoAMostrar + "\n" + "Cantidad de me gusta: " + getCantidadMeGusta() + "\n";
    }
}
