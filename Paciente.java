
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
     * @description recibe los atributos de cada paciente, los pasa a atributos locales
     */
    
    public Paciente(String nombre, String sintoma, String codigo){
        this.nombre=nombre;
        this.sintoma=sintoma;
        this.codigo=codigo;
    }
    
    /**
     * @description devuelve el valor de prioridad de cada paciente
     * @param Paciente p
     * @return int
     */
    @Override
    public int compareTo(Paciente p){
        Paciente enfermo = (Paciente)p;
        return codigo.compareTo(enfermo.getCodigo());
    }
    /**
     * @description devuelve el codigo de urgencia de cada paciente
     * @return String
     */
    public String getCodigo(){
        return codigo;
    }
    
    /**
     * @description devuelve el los atributos de cada paciente concatenados
     * @return String
     */
    public String toString(){
        return (nombre+", "+sintoma+", "+codigo);
    }
}
