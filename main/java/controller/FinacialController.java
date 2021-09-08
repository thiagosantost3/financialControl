package controller;

import br.com.financialcontrol.business.Movimentacao;
import br.com.financialcontrol.service.ControleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/financial-control/controlefinaceiro")

public class FinacialController {
    @Autowired
    private ControleService controleService;

   @PostMapping("criar/controlefinaceiro")
   public Movimentacao criarControleFinanceiro(@RequestBody Movimentacao movimento){

        return controleService.criarControleFinanceiro(movimento);
    }

    @GetMapping("/{controleId}")
    public  List<Movimentacao> obtercontroleId(@PathVariable Long id){
        return controleService.obtercontroleId(id);
    }

    @DeleteMapping("/{controleId}")
    public String deletarControle(@PathVariable Long id){
       controleService.deletarControle(id);
        return ("Controle excluido com sucesso!!");
    }

    //put alterar
    @PutMapping("/{controleId}")
    public String alterarControle(@PathVariable Long id, @RequestBody Movimentacao movimento){
        controleService.alterarControle(id,movimento);
        return ("Alteração realizad com sucesso");
    }

    @GetMapping
    public List<Movimentacao> listarControle() {
        return controleService.listarControle();
    }
}

