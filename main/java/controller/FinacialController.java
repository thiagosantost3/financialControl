package controller;

import br.com.financialcontrol.business.Controle;
import br.com.financialcontrol.service.ControleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/financial-control/controlefinaceiro")

public class FinacialController {
    @Autowired
    private ControleService controleService;

   @PostMapping("criar/controlefinaceiro")
   public Controle criarControleFinanceiro(@RequestBody Controle controle){

        return controleService.criarControleFinanceiro(controle);
    }

    @GetMapping("/{controleId}")
    public  List<Controle> obtercontroleId(@PathVariable Long id){
        return controleService.obtercontroleId(id);
    }

    @DeleteMapping("/{controleId}")
    public String deletarControle(@PathVariable Long id){
       controleService.deletarControle(id);
        return ("Controle excluido com sucesso!!");
    }

    //put alterar
    @PutMapping("/{controleId}")
    public String alterarControle(@PathVariable Long id, @RequestBody Controle controle){
        controleService.alterarControle(id,controle);
        return ("Alteração realizad com sucesso");
    }

    @GetMapping
    public List<Controle> listarControle() {
        return controleService.listarControle();
    }
}

