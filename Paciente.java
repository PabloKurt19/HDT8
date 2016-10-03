
/**
 * @author Pablo Ortiz
 * @author Pedro García
 * @version 01.10.16
 */
public class Paciente implements Comparable<Paciente>{ 
	/**
     * atributos String codigo,nombre,sintoma
     */
    protected String codigo,nombre,sintoma;

    /**
     * Constructor
     */
    
    public Paciente(String nombre, String sintoma, String codigo){
        this.nombre=nombre;
        this.sintoma=sintoma;
        this.codigo=codigo;
    }
    @Override
    public int compareTo(Paciente p){
        Paciente enfermo = (Paciente)p;
        return codigo.compareTo(enfermo.getCodigo());
    }
    
    public String getCodigo(){
        return codigo;
    }
    
    public String toString(){
        return (nombre+", "+sintoma+", "+codigo);
    }
}
