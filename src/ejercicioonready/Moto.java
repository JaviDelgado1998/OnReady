
package ejercicioonready;

public class Moto extends Vehiculo
{
    private int cilindrada;

    public Moto() {
    }

    public Moto(int cilindrada, String marca, String modelo, float precio) {
        super(marca, modelo, precio);
        this.cilindrada = cilindrada;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }
    @Override
    public String toString()
    {
        String padre = super.toString();
        int index = padre.lastIndexOf("P");
        StringBuilder buffer = new StringBuilder(padre);
        buffer.insert(index, String.format("Cilindrada: %dcc // ", cilindrada));
        return buffer.toString();        
    }

    
}
