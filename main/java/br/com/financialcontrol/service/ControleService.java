package br.com.financialcontrol.service;

import br.com.financialcontrol.business.Controle;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ControleService {
    List<Controle> objeto = new ArrayList<>();

    public Controle criarControleFinanceiro(Controle controle) {
        objeto.add(controle);
        return objeto.get(0);
    }

    public List<Controle> listarControle() {
        return objeto;
    }

    public List<Controle> obtercontroleId(Long id) {
        for (Controle controle : objeto) {
            if (controle.getId().equals(id))
                return (List<Controle>) objeto.get(id.compareTo(id));
        }
        return null;
    }

    public void deletarControle(Long id) {
        for (Controle controle : objeto) {
            if (controle.getId().equals(id))
                objeto.remove(controle);
            break;
        }
    }

    public void alterarControle(Long id, Controle controle) {
        for (Controle c : objeto) {
            if (controle.getId().equals(c.getId()))
                deletarControle(controle.getId());
            criarControleFinanceiro(controle);
        }
    }
}
