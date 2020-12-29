
package ejercicioonready;

public class Auto extends Vehiculo
{
    private int puertas;

    public Auto() {
    }

    public Auto(int puertas, String marca, String modelo, float precio) {
        super(marca, modelo, precio);
        this.puertas = puertas;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }
    @Override
    public String toString()
    {
        String padre = super.toString();
        int index = padre.lastIndexOf("P");
        StringBuilder buffer = new StringBuilder(padre);
        buffer.insert(index, String.format("Puertas: %d // ", puertas));
        return buffer.toString();
    }
}
