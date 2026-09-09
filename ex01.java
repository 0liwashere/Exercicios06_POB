public class Main {
    public static void main(String[] args) {
        Livro livro1 = new Livro();
        livro1.titulo = "O Senhor dos Anéis";
        livro1.autor = "J.R.R. Tolkien";
        livro1.numeroPaginas = 1178;

        Livro livro2 = new Livro();
        livro2.titulo = "1984";
        livro2.autor = "George Orwell";
        livro2.numeroPaginas = 328;

        livro1.exibirInformacoes();
        System.out.println();
        livro2.exibirInformacoes();
    }
}
