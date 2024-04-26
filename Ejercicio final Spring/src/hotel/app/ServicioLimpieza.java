package hotel.app;

import org.springframework.stereotype.Component;

@Component
public class ServicioLimpieza {

    public void limpiar() {
        System.out.println("Realizando limpieza de habitaciones");
    }
}
