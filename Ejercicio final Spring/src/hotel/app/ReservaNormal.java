package hotel.app;

import org.springframework.stereotype.Component;

@Component("reservaNormal")
public class ReservaNormal implements Reserva {
    @Override
    public void realizarReserva() {
        System.out.println("Realizando reserva normal");
    }
}

