class Livro {
    private String titulo;
    private String autor;
    private boolean disponivel;


    //construtor
    public Livro (String titulo, String autor, boolean) {
        this.titulo = titulo;
        this.autor = autor;
        this.disponivel = true;
    }

    public String getTitulo() {
        return titulo;
    }

    public String setTitulo (String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String setAutor(String autor) {
        this.autor = autor;
    }

    public boolean getDisponivel (){
        return = disponivel;
    }

    public boolean setDisponivel (boolean disponivel) {
            this.disponivel = disponivel;
    }
}
