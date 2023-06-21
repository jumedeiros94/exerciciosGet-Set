package Biblioteca;

public class Livros {

    String nomeDoLivro;
    String generoDoLivro;
    String autor;
    int isbn;

    public Livros(String nomeDoLivro, String generoDoLivro, String autor, int isbn) {
        this.nomeDoLivro = nomeDoLivro;
        this.generoDoLivro = generoDoLivro;
        this.autor = autor;
        this.isbn = isbn;
    }


    public void registrar1(){
        System.out.println("O livro foi registrado com o ISBN.");
    }

    public void registrar2(){
        System.out.println("O livro foi registrado com o ISBN e o nome.");
    }

    public void registrar3(){
        System.out.println("O livro foi registrado com o ISBN, o nome e gênero.");
    }

    public void registrar4(){
        System.out.println("O livro foi registrado com todas as informações");
    }

    public String getNomeDoLivro() {
        return nomeDoLivro;
    }

    public void setNomeDoLivro(String nomeDoLivro) {
        this.nomeDoLivro = nomeDoLivro;
    }

    public String getGeneroDoLivro() {
        return generoDoLivro;
    }

    public void setGeneroDoLivro(String generoDoLivro) {
        this.generoDoLivro = generoDoLivro;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }
}
