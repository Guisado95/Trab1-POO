class Livro {
    private String titulo;
    private String autor;
    private boolean disponivel;
    //construtor
    public Livro (String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.disponivel = true;
    }

    public String toString(){
        return titulo + " | " + autor + (disponivel ? " | Disponível" : " | Indisponível");
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo (String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public boolean getDisponivel (){
        return disponivel;
    }

    public void setDisponivel (boolean disponivel) {
            this.disponivel = disponivel;
    }
}
