
package ejercicioonready;

import java.util.List;

public class EjercicioOnready 
{
    public static void main(String[] args) 
    {
        Lista vehiculos = cargaVehiculos();
        vehiculos.ordenar();
        List<IComparable> vAux = vehiculos.getDatos();
        for(IComparable v: vAux)
        {
            System.out.println(v);
        }
        System.out.println("=============================");
        Vehiculo caro = (Vehiculo)vAux.get(0);
        Vehiculo barato = (Vehiculo)vAux.get(vAux.size()-1);
        Vehiculo contiene = (Vehiculo)vehiculos.contiene("Y");
        System.out.println("Vehículo más caro: " + caro.Imprimir());
        System.out.println("Vehículo más barato: " + barato.Imprimir());
        System.out.println("Vehículo que contiene en el modelo la letra ‘Y’: " + contiene.Imprimir());
        System.out.println("=============================");
        for(IComparable v: vAux)
        {
            System.out.println(((Vehiculo)v).getMarca() + " " + ((Vehiculo)v).getModelo());
        }
    }
    public static Lista cargaVehiculos()
    {
        Lista vehiculos = new Lista();
        vehiculos.agregar(new Auto(4,"Peugeot","206",200000F));
        vehiculos.agregar(new Moto(125,"Honda","Titan",60000F));
        vehiculos.agregar(new Auto(5,"Peugeot","208",250000F));
        vehiculos.agregar(new Moto(160,"Yamaha","YBR",80500F));
        return vehiculos;
    }
}
