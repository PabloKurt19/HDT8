/* 	Universidad del Valle de Guatemala
 *  Algoritmos y Estructura de Datos
 *  	Pedro Antonio Garcia Morales 15409
 *  	Pablo Alejandro Ortiz Barillas 15533
 *  	Hoja de Trabajo 8. 
 *  
 *  Metodos obtenidos del libro de texto del curso: Java Structures. Capitulo 13 Priority Queues. 
*/

public interface PriorityQueue<E extends Comparable<E>> {

    /**
     *
     * @return El primer elemento de la lista
     */
    public E getFirst();
	// pre: !isEmpty()
	// post: returns the minimum value in priority queue
	
    /**
     *
     * @ Remueve el elemento 
     */
    public E remove();
	// pre: !isEmpty()
	// post: returns and removes minimum value from queue
	
    /**
     *
     * @param value
     * Agrega un elemento a la lista
     */
    public void add(E value);
	// pre: value is non-null comparable
	// post: value is added to priority queue
	
    /**
     *
     * @return Si la lista esta vacia o no
     */
    public boolean isEmpty();
	// post: returns true iff no elements are in queue
	
    /**
     *
     * @return Tamano de la lista
     */
    public int size();
	// post: returns number of elements within queue
	
    /**
     *
     *@return 
     */
    public void clear();
	// post: removes all elements from queue
}