package br.com.financialcontrol.business;

public class Movimento {
    private Long id;
    private String observacao;
    private double valor;
    private String tipoDeMovimento;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String getObservacao) {
        this.getObservacao = getObservacao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
