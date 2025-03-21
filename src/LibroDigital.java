public class LibroDigital extends Libro{
    private String tamanoArchivo;

    public LibroDigital(String titulo, String autor, double precio, String tamanoArchivo) {
        super(titulo, autor, precio);
        this.tamanoArchivo = tamanoArchivo;
    }

    public String getTamanoArchivo() {
        return tamanoArchivo;
    }

    public void setTamanoArchivo(String tamanoArchivo) {
        this.tamanoArchivo = tamanoArchivo;
    }

    @Override
    public String toString() {
        return "LibroDigital{" +
                ", titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", precio=" + precio +
                "tamanoArchivo='" + tamanoArchivo + '\'' +
                '}';
    }

    @Override
    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println("Tamaño del Archivo: " + tamanoArchivo);
    }
}
