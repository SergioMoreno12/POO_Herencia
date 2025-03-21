public class LibroImpreso extends Libro{
    private String peso;

    public LibroImpreso(String titulo, String autor, double precio, String peso) {
        super(titulo, autor, precio);
        this.peso = peso;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "LibroImpreso{" +
                ", titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", precio=" + precio +
                "peso='" + peso + '\'' +
                '}';
    }

    @Override
    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println("Peso: " + peso);
    }
}
