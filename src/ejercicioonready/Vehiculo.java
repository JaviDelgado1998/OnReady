
package ejercicioonready;

public abstract class Vehiculo implements IComparable
{
    protected String marca,modelo;
    protected float precio;

    public Vehiculo() {
    }

    public Vehiculo(String marca, String modelo, float precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
    public String Imprimir()
    {
        return (marca + " " + modelo);
    }
    @Override
    public String toString()
    {
        String p = String.format("%.2f",precio);
        return String.format("Marca: %s // Modelo: %s // Precio: $%s",marca,modelo,p);
    }
    @Override
    public Boolean sosMayor(IComparable v)
    {
        return this.precio > ((Vehiculo)v).precio;
    }
    @Override
    public Boolean sosMenor(IComparable v)
    {
        return this.precio < ((Vehiculo)v).precio;
    }
    @Override
    public Boolean sosIgual(IComparable v)
    {
        return this.precio == ((Vehiculo)v).precio;
    }
    
}
