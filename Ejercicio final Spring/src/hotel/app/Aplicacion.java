package hotel.app;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Aplicacion {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext contexto = new AnnotationConfigApplicationContext(HotelConfig.class);

        // Obtener los beans necesarios del contexto
        ServicioReserva servicioReserva = contexto.getBean(ServicioReserva.class);
        ServicioLimpieza servicioLimpieza = contexto.getBean(ServicioLimpieza.class);

        // Crear datos necesarios para la reserva
        Habitacion habitacion = new Habitacion();
        LocalDate fechaInicio = LocalDate.now();
        LocalDate fechaFin = LocalDate.now().plusDays(3);

        // Realizar una reserva utilizando el servicio de reserva
        servicioReserva.realizarReserva(habitacion, fechaInicio, fechaFin);
       

        // Llamar al servicio de limpieza para limpiar las habitaciones
        servicioLimpieza.limpiar();
        
        HotelConfig hotelConfig = contexto.getBean(HotelConfig.class);
        System.out.println("\nNombre del hotel: " + hotelConfig.getNombreHotel());
        System.out.println("Dirección del hotel: " + hotelConfig.getDireccionHotel());
        System.out.println("Teléfono del hotel: " + hotelConfig.getTelefonoHotel()+"\n");
        
     
        
        contexto.close();
    }
	
}
