package br.com.dio.desafio.dominio;

public abstract class Conteudo { // class abstract n pode ser instanciada
    
// protect : Filhas dessa class poderão acessa-la
// static : Podera ser acessado fora dessa class
// final : Transforma em constante
    protected static final double XP_PADRAO = 10d;

    private String titulo;
    private String descricao;

    // abstract para classes filhas herdarem
    public abstract double calcularXp();

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

}
