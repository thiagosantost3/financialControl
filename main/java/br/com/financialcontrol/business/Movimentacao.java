package br.com.financialcontrol.business;

public class Movimentacao {
    private Long id;
    private String observacao;
    private double valor;
    private String tipoDeMovimento;


    public Movimentacao() {
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }


    public String getTipoDeMovimento() {
        return tipoDeMovimento;
    }

    public void setTipoDeMovimento(String tipoDeMovimento) {
        this.tipoDeMovimento = tipoDeMovimento;
    }
}
