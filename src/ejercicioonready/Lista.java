
package ejercicioonready;

import java.util.ArrayList;
import java.util.List;

public class Lista implements IColeccionable
{
    private List<IComparable> datos;

    public Lista() {
        datos = new ArrayList<>();
    }

    public List<IComparable> getDatos() {
        return datos;
    }

    public void setDatos(List<IComparable> datos) {
        this.datos = datos;
    }
    

    @Override
    public IComparable maximo() 
    {
        if(this.cuantos()>0)
        {
            IComparable maximo = datos.get(0);
            for(IComparable c: datos)
            {
                if(c.sosMayor(maximo))
                {
                    maximo = c;
                }
            }
            return maximo;  
        }
        return null;
    }

    @Override
    public IComparable minimo() 
    {
        if(this.cuantos()>0)
        {
            IComparable minimo = datos.get(0);
            for(IComparable c: datos)
            {
                if(c.sosMenor(minimo))
                {
                    minimo = c;
                }
            }
            return minimo;  
        }
        return null;        
    }

    @Override
    public IComparable contiene(String letra) 
    {
        for(IComparable c: datos)
        {
            if(((Vehiculo)c).modelo.contains(letra))
            {
                return c;
            }
        }
        return null;
    }

    @Override
    public void agregar(IComparable c) 
    {
        datos.add(c);
    }

    @Override
    public int cuantos() 
    {
        return datos.size();
    }
    @Override
    public void ordenar()
    {
        datos.sort(new IVehiculoComparer());
    }
    
 
}
