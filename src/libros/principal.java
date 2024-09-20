package libros;

public class principal {

    public static void main(String[] args) {

        Libros libroUno = new Libros("El Principito","Antoine de Saint-Exupéry",96,1943);
        Libros libroDos = new Libros("Cien años de soledad","Gabriel García Márquez",417,1967);

        System.out.println("Datos del libro 1: ");
        libroUno.mostrarDatosLibros();

        System.out.println("Datos del libro 2: ");
        libroDos.mostrarDatosLibros();

        libroUno.setPage(100);

        System.out.println("Datos libro 1 modificado : ");
        libroUno.mostrarDatosLibros();

    }
}
