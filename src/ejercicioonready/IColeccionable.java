
package ejercicioonready;

public interface IColeccionable 
{
    public IComparable maximo();
    public IComparable minimo();
    public IComparable contiene(String letra);
    public void agregar(IComparable c);
    public int cuantos();
    public void ordenar();
}
