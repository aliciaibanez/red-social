

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

/**
 * The test class MuroTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class MuroTest
{
    private Muro muro1;
    private EntradaTexto entradaT1;
    private EntradaFoto entradaF1;
    private EntradaTexto entradaT2;
    private EntradaTexto entradaT3;
    private EntradaFoto entradaF2;
    private EntradaFoto entradaF3;

    /**
     * Default constructor for test class MuroTest
     */
    public MuroTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Test
    public void test01()
    {
        muro1 = new Muro();
        entradaT1 = new EntradaTexto("Alicia", "Primer post");
        muro1.addEntradaTexto(entradaT1);
        entradaT1.addComentario("Qué tal");
        entradaF1 = new EntradaFoto("Alicia", "url1", "Mi perro");
        muro1.addEntradaFoto(entradaF1);
        entradaT2 = new EntradaTexto("Alicia", "Mi casa");
        entradaT3 = new EntradaTexto("Alicia", "Mi coche");
        entradaF2 = new EntradaFoto("Alicia", "url2", "Vacaciones");
        entradaF3 = new EntradaFoto("Alicia", "url3", "Vuelta a la rutina");
        entradaT3.addComentario("Qué bonito");
        entradaT3.addComentario("Me encanta");
        entradaF3.addComentario("Es genial");
        entradaF3.addComentario("Qué tal");
        muro1.addEntradaFoto(entradaF3);
        muro1.addEntradaTexto(entradaT3);
        muro1.addEntradaFoto(entradaF2);
        muro1.addEntradaTexto(entradaT2);
        
        System.out.println(muro1);
        String esperado = "Usuario: Alicia\n"
        		+ "Mensaje: Primer post\n"
        		+ "Publicado hace 10 segundos\n"
        		+ "Cantidad de comentarios: 1\n"
        		+ "Qué tal\n"
        		+ "\n"
        		+ "Cantidad de me gusta: 0\n"
        		+ "\n"
        		+ "Usuario: Alicia\n"
        		+ "Mensaje: Mi coche\n"
        		+ "Publicado hace 10 segundos\n"
        		+ "Cantidad de comentarios: 2\n"
        		+ "Qué bonito\n"
        		+ "Me encanta\n"
        		+ "\n"
        		+ "Cantidad de me gusta: 0\n"
        		+ "\n"
        		+ "Usuario: Alicia\n"
        		+ "Mensaje: Mi casa\n"
        		+ "Publicado hace 10 segundos\n"
        		+ "No hay comentarios\n"
        		+ "\n"
        		+ "Cantidad de me gusta: 0\n"
        		+ "\n"
        		+ "Usuario: Alicia\n"
        		+ "Imagen: url1\n"
        		+ "Título: Mi perro\n"
        		+ "Publicado hace 10 segundos\n"
        		+ "No hay comentarios\n"
        		+ "\n"
        		+ "Cantidad de me gusta: 0\n"
        		+ "\n"
        		+ "Usuario: Alicia\n"
        		+ "Imagen: url3\n"
        		+ "Título: Vuelta a la rutina\n"
        		+ "Publicado hace 10 segundos\n"
        		+ "Cantidad de comentarios: 2\n"
        		+ "Es genial\n"
        		+ "Qué tal\n"
        		+ "\n"
        		+ "Cantidad de me gusta: 0\n"
        		+ "\n"
        		+ "Usuario: Alicia\n"
        		+ "Imagen: url2\n"
        		+ "Título: Vacaciones\n"
        		+ "Publicado hace 10 segundos\n"
        		+ "No hay comentarios\n"
        		+ "\n"
        		+ "Cantidad de me gusta: 0\n\n\n";
        assertEquals(esperado, muro1.toString());
    }

}
