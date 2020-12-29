

package ejercicioonready;

import java.util.Comparator;


public class IVehiculoComparer implements Comparator<IComparable>
{

    @Override
    public int compare(IComparable o1, IComparable o2) 
    {
	if(o1.sosIgual(o2))
            return 0;
	else
            if(o1.sosMenor(o2))
		return 1;
            else
		return -1;
    }

}
