package hotel.app;

import org.springframework.stereotype.Component;

@Component("reservaVIP")
public class ReservaVIP implements Reserva {
    @Override
    public void realizarReserva() {
        System.out.println("Realizando reserva VIP");
    }
}

