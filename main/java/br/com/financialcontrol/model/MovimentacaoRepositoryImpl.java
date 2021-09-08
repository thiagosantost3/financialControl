package br.com.financialcontrol.model;

import br.com.financialcontrol.business.Movimentacao;

import java.util.ArrayList;
import java.util.List;

public class MovimentacaoRepositoryImpl implements MovimentacaoRepository {

   List<Movimentacao> listaMovimentacao = new ArrayList<Movimentacao>();
    @Override
    public boolean salvarMovimentacao(Movimentacao movimentacao) {
        try {
            listaMovimentacao.add(movimentacao);
        } catch (Exception e){
            //TODO:FAZER
            return false;
        }
        return true;
    }

    @Override
    public boolean deletarMovimentacao(Long id) {
       for (Movimentacao movimentacao : listaMovimentacao){
           if(movimentacao.getId() == id){
               listaMovimentacao.remove(movimentacao);

           }
       }
          //TODO:FAZER
            return false;

    }

    @Override
    public List<Movimentacao> buscarMovimentacao() {
        return listaMovimentacao;
    }

    @Override
    public boolean alterarMovimentacao(Movimentacao movimentacao) {
        for (Movimentacao movimentacao1 : listaMovimentacao){
            if(movimentacao1.getId() == movimentacao.getId()){
                listaMovimentacao.remove(movimentacao1);
                listaMovimentacao.add(movimentacao);

            }
        }

        return false;
    }
}
