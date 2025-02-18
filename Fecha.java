
/**
 *  Modela una fecha
 *  
 *  @author - Aritz P�rez de Ciriza Morillo
 */
public class Fecha
{
    private int dia;
    private int mes;
    private int a�o;

    /**
     * constructor  
     */
    public Fecha(int dia, int mes, int a�o)
    {
        this.dia = dia;
        this.mes = mes;
        this.a�o = a�o;

    }   
    
    /**
     * accesor para  el d�a   
     */
    public int getDia()
    {
        return dia;
    }

    /**
     * accesor para  el mes 
     */
    public int getMes()
    {
        return mes;
    }

    /**
     * accesor para  el a�o  
     */
    public int getA�o()
    {
        return a�o;
    }

    /**
     * mutador para el dia
     */
    public void setDia(int dia)
    {
        this.dia = dia;
    }

    /**
     * mutador para el mes
     */
    public void setMes(int mes)
    {
        this.mes = mes;
    }

    /**
     * mutador para el a�o
     */
    public void seta�o(int a�o)
    {
        this.a�o = a�o;
    }


    /**
     * Devuelve una copia exacta al objeto actual
     */
    public Fecha obtenerCopia() {
         return new Fecha(this.dia,this.mes,this.a�o);

    }

    /**
     * 
     */
    public String toString() {
        return this.dia + "/"  + this.mes+ "/" + this.a�o;

    }

    

}
