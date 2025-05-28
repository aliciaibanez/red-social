import java.util.ArrayList;
/**
 * Write a description of class Muro here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Muro
{
    // instance variables - replace the example below with your own
    private ArrayList <EntradaTexto> entradaTexto;
    private ArrayList <EntradaFoto> entradaFoto;

    /**
     * Constructor for objects of class Muro
     */
    public Muro()
    {
        this.entradaTexto = new ArrayList<>();
        this.entradaFoto = new ArrayList<>();
    }

    public void addEntradaTexto(EntradaTexto entradaTexto) {
        this.entradaTexto.add(entradaTexto);
    }

    public void addEntradaFoto(EntradaFoto entradaFoto) {
        this.entradaFoto.add(entradaFoto);
    }

    public String toString() {
        int i = 0;
        String entradasTextoAMostrar = "";
        String entradasFotoAMostrar = "";
        while (i < entradaTexto.size()) {
            entradasTextoAMostrar += entradaTexto.get(i).toString() + "\n";
            i++;
        }
        
        int i2 = 0;
        while (i2 < entradaFoto.size()) {
            entradasFotoAMostrar += entradaFoto.get(i2).toString() + "\n";
            i2++;
        }
        
        return entradasTextoAMostrar + entradasFotoAMostrar + "\n";  
    }

    public void imprimirMuro() {
        System.out.println(toString());
    }
}
