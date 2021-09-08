package br.com.financialcontrol.service;


import br.com.financialcontrol.business.Movimentacao;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ControleService {
    List<Movimentacao> objeto = new ArrayList<>();

    public Movimentacao criarControleFinanceiro(Movimentacao movimento) {
        objeto.add(movimento);
        return objeto.get(0);
    }

    public List<Movimentacao> listarControle() {
        return objeto;
    }

    public List<Movimentacao> obtercontroleId(Long id) {
        for (Movimentacao controle : objeto) {
            if (controle.getId().equals(id))
                return (List<Movimentacao>) objeto.get(id.compareTo(id));
        }
        return null;
    }

    public void deletarControle(Long id) {
        for (Movimentacao controle : objeto) {
            if (controle.getId().equals(id))
                objeto.remove(controle);
            break;
        }
    }

    public void alterarControle(Long id, Movimentacao controle) {
        for (Movimentacao c : objeto) {
            if (controle.getId().equals(c.getId()))
                deletarControle(controle.getId());
            criarControleFinanceiro(controle);
        }
    }
}
