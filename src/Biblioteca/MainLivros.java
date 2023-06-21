package Biblioteca;

public class MainLivros {
    public static void main(String[] args) {

        Livros livro1 = new Livros("Harry Potter e a Pedra Filosofal", "Fantasia", "J.K Rowling", 0001);
        livro1.registrar1();
        System.out.println("Registro do ISBN " + livro1.getIsbn());
        System.out.println("-------------------------------------------------------------------------------------------------");


        Livros livro2 = new Livros("Harry Potter e a Camêra Secreta", "Fantasia", "J.K Rowling", 0002);
        livro2.registrar2();
        System.out.println("Registro do ISBN " + livro2.getIsbn() + " e o nome " + livro2.getNomeDoLivro());
        System.out.println("-------------------------------------------------------------------------------------------------");

        Livros livro3 = new Livros("Harry Potter e o Prizioneiro de Azkaban", "Fantasia", "J.K Rowling", 0003);
        livro3.registrar3();
        System.out.println("Registro do ISBN " + livro3.getIsbn() + " e o nome " + livro3.getNomeDoLivro() + " e o gênero " + livro3.getGeneroDoLivro());
        System.out.println("-------------------------------------------------------------------------------------------------");

        Livros livro4 = new Livros("Harry Potter e o Calice de Fogo", "Fantasia", "J.K Rowling", 0004);
        livro4.registrar4();
        System.out.println("Registro do ISBN " + livro4.getIsbn() + " e o nome " + livro4.getNomeDoLivro() + " e o gênero " + livro4.getGeneroDoLivro() + "e a autora " + livro4.getAutor());
    }

}
