package br.com.financialcontrol.business;

public interface Movimento {
    Long id = Long.valueOf(0);
     String observacao="";
     double valor=0;
     String tipoDeMovimento="";

     void movimento(Movimentacao movimentacao);

}
