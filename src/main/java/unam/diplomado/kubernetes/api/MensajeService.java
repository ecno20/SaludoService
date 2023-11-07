package unam.diplomado.kubernetes.api;

import java.time.LocalDateTime;

import org.springframework.stereotype.Service;

@Service
public class MensajeService {
	 public String obtenerMensaje() {
	        // Aquí mensaje, se implemente la lógica para obtener el mensaje
	        //return "Hola, este es un mensaje desde mi microservicio REST.";
		 LocalDateTime ahora = LocalDateTime.now();
		    int hora = ahora.getHour();

		    if (hora < 12) {
		        return "¡Buenos días! Este es un mensaje para confirmar, el servicio ha sido completado.";
		    } else if (hora < 18) {
		        return "¡Buenas tardes! Este es un mensaje para confirmar, el servicio ha sido completado.";
		    } else {
		        return "¡Buenas noches! Este es un mensaje para confirmar, el servicio ha sido completado.";
		    }
	    }

}
