package gt.edu.miumg.luis.GalletasDeLaFortuna.Service;

import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Random;
import java.util.ArrayList;

@Service
public class FortunaService {
    private final List<String> mensajes;
    private final Random random;

    public FortunaService() {
        this.mensajes = new ArrayList<>();
        this.random = new Random();
        
        mensajes.add("La suerte favorece a los valientes");
        mensajes.add("El éxito llegará cuando menos lo esperes");
        mensajes.add("Una sonrisa vale más que mil palabras");
        mensajes.add("Tu creatividad te llevará lejos");
        mensajes.add("Grandes cambios se aproximan en tu vida");
        mensajes.add("La perseverancia es la clave del éxito");
        mensajes.add("Un viaje inesperado te traerá fortuna");
        mensajes.add("Hoy es tu día de suerte");
        mensajes.add("Una amistad valiosa está por llegar");
        mensajes.add("Confía en tu intuición");
    }

    public String obtenerMensajeAleatorio() {
        int indice = random.nextInt(mensajes.size());
        return mensajes.get(indice);
    }
}
