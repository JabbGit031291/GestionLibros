package libros;

public class Libros {


    String titulo;
    String autor;
    int page;
    int yearPublicacion;

    public Libros(String titulo, String autor, int page, int yearPublicacion) {

        this.titulo = titulo;
        this.autor = autor;
        this.page = page;
        this.yearPublicacion = yearPublicacion;
    }

    public void mostrarDatosLibros(){
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Paginas: " + page);
        System.out.println("Año de publicación: " + yearPublicacion);

    }


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getAñoPublicacion() {
        return yearPublicacion;
    }

    public void setAñoPublicacion(int añoPublicacion) {
        this.yearPublicacion = añoPublicacion;
    }
}






