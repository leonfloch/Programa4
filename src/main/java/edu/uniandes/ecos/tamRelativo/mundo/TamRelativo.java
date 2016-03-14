package edu.uniandes.ecos.tamRelativo.mundo;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * Calse principal donde se coordinan los calculos y se envian 
 * a la interfaz
 * @author Leonardo Valbuena Calderon
 * @date 14/03/2016
 */
public class TamRelativo {
    
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
     * Constructor
     */
    //@METODO
    public TamRelativo() {
        
    }
    
    /**
     * Se toma informacion de los archivos donde se realizan los calculos
     * para hallar el tamaño relativo
     * @return tabla de resultado
     */
    //@METODO
    public LinkedList iniciarCalculos() {
        LinkedList<TablaResultado> resultados = new LinkedList<TablaResultado>();
        
        //calculo tabla 1
        LinkedList lOCMethod = calcularLOCMethod(Archivo.obtenerDatos(TABLA1_CLASS_LOC), 
                Archivo.obtenerDatos(TABLA1_NUMBER_METHODS));        
        resultados.add(calcularTamanoRelativo(lOCMethod));
        
        //calculo tabla 2
        resultados.add(calcularTamanoRelativo(Archivo.obtenerDatos(TABLA_2)));
                
        return resultados;
    }
    
    /**
     * 
     * @param classLOC
     * @param numberofMethods
     * @return 
     */
    //@METODO
    public LinkedList calcularLOCMethod(LinkedList classLOC, LinkedList numberofMethods) {
        LinkedList resultado = new LinkedList();        
        Iterator iteradorClass = classLOC.iterator();
        int cont = 0;
        while(iteradorClass.hasNext()) {
            double valor = ((double)iteradorClass.next() / (double)numberofMethods.get(cont));
            resultado.add(valor);
            cont++;
        }
        return resultado;
    }
    
    
    /**
     * lista de datos a los cuales se les realiza los calculos
     * @param lOCMethod lista de datos
     * @return resultado
     */
    //@METODO
    public TablaResultado calcularTamanoRelativo(LinkedList lOCMethod) {
        TablaResultado tablaResultado = new TablaResultado();
        
        //calcular promedio        
        LinkedList logNatural = Cal.calcularLogNatural(lOCMethod);
        double avg = Cal.calcularMedia(logNatural);
                
        //calcular varianza
        double var = Cal.calcularVarianza(avg, logNatural);
        double raizVar = Math.sqrt(var);
                
        tablaResultado.setVs(Cal.redondeo(Math.exp((avg - (2 * raizVar))), 4));
        tablaResultado.setS(Cal.redondeo(Math.exp((avg - raizVar)), 4));
        tablaResultado.setM(Cal.redondeo(avg, 4));
        tablaResultado.setL(Cal.redondeo(Math.exp(avg + raizVar), 4));
        tablaResultado.setVl(Cal.redondeo(Math.exp((avg + (2 * raizVar))), 4));
        
        return tablaResultado;
    }
    
}
