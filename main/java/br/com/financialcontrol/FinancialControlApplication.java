package br.com.financialcontrol;

import br.com.financialcontrol.business.Movimentacao;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FinancialControlApplication {

	public static void main(String[] args) {
		SpringApplication.run(FinancialControlApplication.class, args);
	}
	Movimentacao movimentacao = new Movimentacao();

	public void setMovimentacao(Movimentacao movimentacao) {
		this.movimentacao = movimentacao;
		movimentacao.setId(1l);
		movimentacao.setValor(1000);
		movimentacao.setObservacao("salario");
		movimentacao.setTipoDeMovimento("entrada");
	}
}
