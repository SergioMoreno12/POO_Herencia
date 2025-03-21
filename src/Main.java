import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int op;
        boolean estado = true;

        List<Libro> lslibro= new ArrayList<>();

        do{
            System.out.println("""
                ------------------------------------------------
                |-----------------Librería---------------------|
                |-------------------Menu-----------------------|
                | 1 | Crear un libro digital                   |
                | 2 | Crear un libro impreso                   |
                | 3 | Buscar libros                            |
                | 4 | Mostrar libros                           |
                | 5 | Salir                                    |
                ------------------------------------------------
                """);
            op= teclado.nextInt();
            teclado.nextLine();
            switch (op){
                case 1-> {

                    System.out.println("----------Crear un libro digital----------");
                    System.out.println("Ingrese el titulo: ");
                    String titulo = teclado.nextLine();
                    System.out.println("Ingrse el nombre del autor: ");
                    String autor = teclado.nextLine();
                    System.out.println("Ingrese el precio: ");
                    double precio = teclado.nextDouble();
                    teclado.nextLine();
                    System.out.println("Ingrse el tamaño del archivo: ");
                    String tamanoArchivo = teclado.nextLine();
                    lslibro.add(new LibroDigital(titulo, autor, precio, tamanoArchivo));

                }
                case 2-> {

                    System.out.println("----------Crear un libro impreso----------");
                    System.out.println("Ingrese el titulo: ");
                    String titulo = teclado.nextLine();
                    System.out.println("Ingrse el nombre del autor: ");
                    String autor = teclado.nextLine();
                    System.out.println("Ingrese el precio: ");
                    double precio = teclado.nextDouble();
                    teclado.nextLine();
                    System.out.println("Ingrse el peso: ");
                    String peso = teclado.nextLine();
                    lslibro.add(new LibroImpreso(titulo, autor, precio, peso));

                }
                case 3-> {

                    System.out.println("--------------------Buscar libros--------------------");
                    System.out.println("Ingrese el titulo del libro: ");
                    String tituloBuscado = teclado.nextLine();
                    boolean encontrado = false;

                    for (Libro libro : lslibro) {
                        if (libro.getTitulo().equalsIgnoreCase(tituloBuscado)) {
                            libro.mostrarInfo();
                            encontrado = true;
                        }
                    }

                    if (!encontrado) {
                        System.out.println("Libro no encontrado");
                    }

                }
                case 4-> {

                    System.out.println("--------------------Mostrar libros--------------------");
                    if (lslibro.isEmpty()){
                        System.out.println("No hay libros");
                    }else {
                        System.out.println("Número total de libros: " + lslibro.size());
                        int contador = 1;
                        for (Libro libro : lslibro) {
                            System.out.println("Libro " + contador);
                            libro.mostrarInfo();
                            System.out.println("------------------------------------");
                            contador++;
                        }
                    }
                }
                case 5-> {

                    System.out.println("Saliendo...");
                    estado = false;

                }
                default -> System.out.println("Opción no válida");
            }
        }while (estado);
    }
}