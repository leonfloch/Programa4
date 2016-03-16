package edu.uniandes.ecos.regresion.test;

import edu.uniandes.ecos.tamRelativo.mundo.Archivo;
import edu.uniandes.ecos.tamRelativo.mundo.TablaResultado;
import edu.uniandes.ecos.tamRelativo.mundo.TamRelativo;
import java.util.LinkedList;
import junit.framework.TestCase;
import org.junit.*;



/**
 * Se definen los casos de prueba
 * @author Leonardo Valbuena Calderon
 * @date 14/03/2016
 */
public class TamRelativoTest extends TestCase {
    
    /**
     * 
     */
    private static final String TABLA1_CLASS_LOC = "data/table1-ClassLOC.txt";
    
    /**
     * 
     */
    private static final String TABLA1_NUMBER_METHODS = "data/table1-NumMethods.txt";
    
    /**
     * 
     */
    private static final String TABLA_2 = "data/table2.txt";
    
    /**
     * Clase donde se gestionan los calculos
     */
    TamRelativo tamRelativo = new TamRelativo();
    
    
    /**
     * Tamano relativo para la tabla 1
     */
    @Test
    //@METODO
    public void test1() {
        LinkedList lOCMethod = tamRelativo.calcularLOCMethod(
                Archivo.obtenerDatos(TABLA1_CLASS_LOC), 
                Archivo.obtenerDatos(TABLA1_NUMBER_METHODS));
                
        TablaResultado resultado = tamRelativo.calcularTamanoRelativo(lOCMethod);
        assertEquals(resultado.getVs(), 4.3953);
        assertEquals(resultado.getL(), 31.8811);
        assertEquals(resultado.getM(), 16.4696);
        assertEquals(resultado.getS(), 8.5081);
        assertEquals(resultado.getVl(), 61.7137);
        
    }
    
    
}
