package br.com.financialcontrol.business;

public class Controle {
    private Long id;
    private String nome;
    private Long valorEntrada;
    private Long valorSaida;

    public Controle() {
    }

    public Controle(Long id, String nome, Long valorEntrada, Long valorSaida) {
        super();
        this.id = id;
        this.nome = nome;
        this.valorEntrada = valorEntrada;
        this.valorSaida = valorSaida;

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getValorEntrada() {
        return valorEntrada;
    }

    public void setValorEntrada(Long valorEntrada) {
        this.valorEntrada = valorEntrada;
    }

    public Long getValorSaida() {
        return valorSaida;
    }

    public void setValorSaida(Long valorSaida) {
        this.valorSaida = valorSaida;
    }
}
