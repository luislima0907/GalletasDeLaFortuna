package gt.edu.miumg.luis.GalletasDeLaFortuna.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import gt.edu.miumg.luis.GalletasDeLaFortuna.Service.FortunaService;

@Controller
public class FortunaController {

    @Autowired
    private FortunaService fortunaService;

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/obtenerFortuna")
    @ResponseBody
    public String obtenerFortuna() {
        return fortunaService.obtenerMensajeAleatorio();
    }
}

