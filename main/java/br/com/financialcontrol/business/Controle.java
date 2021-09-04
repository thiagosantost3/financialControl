package br.com.financialcontrol.business;

public class Controle {
    private Long id;
    private String nome;
    private Double valorEntrada;
    private Double valorSaida;

    public Controle() {
    }

    public Controle(Long id, String nome, Double valorEntrada, Double valorSaida) {
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

    public Double getValorEntrada() {
        return valorEntrada;
    }

    public void setValorEntrada(Double valorEntrada) {
        this.valorEntrada = valorEntrada;
    }

    public Double getValorSaida() {
        return valorSaida;
    }

    public void setValorSaida(Double valorSaida) {
        this.valorSaida = valorSaida;
    }
}
