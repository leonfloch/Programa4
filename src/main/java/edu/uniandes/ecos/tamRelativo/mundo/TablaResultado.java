package edu.uniandes.ecos.tamRelativo.mundo;

/**
 * Representa la tabla de los resultados
 * @author Leonardo Valbuena Calderon
 * @date 14/03/2016
 */
public class TablaResultado {
    /**
     * nombre de los resultados 
     */    
    private String nombre;
    
    /**
     * rango muy pequeno
     */
    private double vs;
    
    /**
     * rango pequeno
     */
    private double s;
    
    /**
     * rango medio
     */
    private double m;
    
    /**
     * rango grande
     */
    private double l;
    
    /**
     * rango muy grande
     */
    private double vl;

    /**
     * Constructor
     */
    //@METODO
    public TablaResultado() {
        
    }

    /**
     * 
     * @return 
     */
    //@METODO
    public double getVs() {
        return vs;
    }

    /**
     * 
     * @param vs 
     */
    //@METODO
    public void setVs(double vs) {
        this.vs = vs;
    }

    /**
     * 
     * @return 
     */
    //@METODO
    public double getS() {
        return s;
    }

    /**
     * 
     * @param s 
     */
    //@METODO
    public void setS(double s) {
        this.s = s;
    }

    /**
     * 
     * @return 
     */
    //@METODO
    public double getM() {
        return m;
    }

    /**
     * 
     * @param m 
     */
    //@METODO
    public void setM(double m) {
        this.m = m;
    }

    /**
     * 
     * @return 
     */
    //@METODO
    public double getL() {
        return l;
    }

    /**
     * 
     * @param l 
     */
    //@METODO
    public void setL(double l) {
        this.l = l;
    }

    /**
     * 
     * @return 
     */
    //@METODO
    public double getVl() {
        return vl;
    }

    /**
     * 
     * @param vl 
     */
    //@METODO
    public void setVl(double vl) {
        this.vl = vl;
    }

    /**
     * 
     * @return 
     */
    //@METODO
    public String getNombre() {
        return nombre;
    }

    /**
     * 
     * @param nombre 
     */
    //@METODO
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    
    
    
    
}
