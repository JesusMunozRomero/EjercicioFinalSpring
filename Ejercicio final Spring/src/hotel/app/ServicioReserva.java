package hotel.app;

import java.time.LocalDate;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class ServicioReserva {

    private final Cliente cliente;

    @Autowired
    public ServicioReserva(Cliente cliente) {
        this.cliente = cliente;
    }

    @Autowired
    @Qualifier("reservaVIP") // Cambiable a reservaNormal
    private Reserva reserva;

    public void realizarReserva(Habitacion habitacion, LocalDate fechaInicio, LocalDate fechaFin) {
        reserva.realizarReserva();
    }
    
    @PostConstruct
    public void inicializar() {
        System.out.println("Inicializando ServicioReserva");
    }

    @PreDestroy
    public void destruir() {
        System.out.println("Finalizando ServicioReserva");
    }
    
}

