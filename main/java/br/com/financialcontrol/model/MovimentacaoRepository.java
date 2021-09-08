package br.com.financialcontrol.model;

import br.com.financialcontrol.business.Movimentacao;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MovimentacaoRepository {

    boolean salvarMovimentacao(Movimentacao movimentacao);

    boolean deletarMovimentacao(Long id);

    List<Movimentacao> buscarMovimentacao();

    boolean alterarMovimentacao(Movimentacao movimentacao);
}
