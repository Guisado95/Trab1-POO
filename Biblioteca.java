import java.util.ArrayList;
import java.util.List;

class Biblioteca {
    List<Livro> livros;
    // construtor
    public Biblioteca() {
        this.livros = new ArrayList<>();
    }

    public void AdicionarLivro(Livro livro) {
        this.livros.add(livro);
    }

    public void EmprestarLivro(String titulo) {
        for (Livro livro : livros) {
            if (livro.getTitulo().equals(titulo)) {
                if (livro.getDisponivel()) {
                    System.out.println("Você alugou " + livro);
                    livro.setDisponivel(false);
                } else {
                    System.out.println("Livro em questão está indisponível.");
                }
            }
        }
    }

    public void DevolverLivro(String titulo) {
        for (Livro livro : livros) {
            if (livro.getTitulo().equals(titulo)) {
                if (livro.getDisponivel() == false) {
                    livro.setDisponivel(true);
                    System.out.println("Você devolveu " + livro);
                } else { 

                }
            }
        }
    }

    public void ListarLivros(){
        for (Livro livro : livros) {
            System.out.println("Lista de livros - " + livro);
        }
    }
}
