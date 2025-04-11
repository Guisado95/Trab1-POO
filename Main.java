public class Main {
    public static void main (String [] args){
        Livro livro1 = new Livro("Senhor dos Anéis - A Sociedade do Anel", "J.R.R. Tolkien");
        Livro livro2 = new Livro("Senhor dos Anéis - As Duas Torres", "J.R.R. Tolkien");
        Livro livro3 = new Livro("Senhor dos Anéis - O Retorno do Rei", "J.R.R. Tolkien");
        Livro livro4 = new Livro("O Príncipe", "Maquiável");
        Livro livro5 = new Livro("A Arte da Guerra", "Sun Tzu");

        Biblioteca biblioteca1 = new Biblioteca();

        biblioteca1.AdicionarLivro(livro1);
        biblioteca1.AdicionarLivro(livro2);
        biblioteca1.AdicionarLivro(livro3);
        biblioteca1.AdicionarLivro(livro4);
        biblioteca1.AdicionarLivro(livro5);
        biblioteca1.ListarLivros();

        biblioteca1.EmprestarLivro("Senhor dos Anéis - A Sociedade do Anel");
        biblioteca1.EmprestarLivro("Senhor dos Anéis - A Sociedade do Anel");
        biblioteca1.DevolverLivro("Senhor dos Anéis - A Sociedade do Anel");
        biblioteca1.EmprestarLivro("O Príncipe");
        biblioteca1.EmprestarLivro("A Arte da Guerra");

        biblioteca1.ListarLivros();
    }
}
