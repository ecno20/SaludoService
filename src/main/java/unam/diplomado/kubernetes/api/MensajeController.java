package unam.diplomado.kubernetes.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

public class MensajeController {
    private final MensajeService mensajeService;
    @Autowired
    public MensajeController(MensajeService mensajeService) {
        this.mensajeService = mensajeService;
    }
    @GetMapping("/mensaje")
    public String obtenerMensaje() {
        return mensajeService.obtenerMensaje();
    }


}
