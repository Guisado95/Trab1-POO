import java.util.ArrayList;
import java.util.List;

class Biblioteca {
    List<Livro> livros;

    public Biblioteca() {
        this.livros = new ArrayList<>();
    }

    public void AdicionarLivro(Livro livro) {
        this.livros.add(livro);
    }

    public void EmprestarLivro(String titulo) {
        for (Livro livro : livros) {
            if (titulo == livro.getTitulo()) {
                if (livro.getDisponivel()) {
                    System.out.println("Livro disponível.");
                    livro.setDisponivel(false);
                } else {
                    System.out.println("Livro indisponível.");
                }
            }
        }
    }

    public void DevolverLivro(String titulo) {
        for (Livro livro : livros) {
            if (titulo == livro.getTitulo()) {
                if (livro.getDisponivel()) {
                    livro.setDisponivel(true);
                    System.out.println("Livro devolvido.");
                }
            }
        }
    }

    public void ListarLivros(){
        for (Livro livro : livros) {
            System.out.println("Lista: " + livro);
        }
    }

}
