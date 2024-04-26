package hotel.app;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("hotel.app")
@PropertySource("classpath:datosHotel.propiedades")
public class HotelConfig {

    @Value("${hotel.nombre}")
    private String nombreHotel;

    @Value("${hotel.direccion}")
    private String direccionHotel;

    @Value("${hotel.telefono}")
    private String telefonoHotel;
    

    @Bean
    public Cliente cliente() {
        return new Cliente();
    }

    @Bean
    public ServicioLimpieza servicioLimpieza() {
        return new ServicioLimpieza();
    }

    @Bean
    public ServicioReserva servicioReserva() {
        return new ServicioReserva(cliente());
    }

    public String getNombreHotel() {
        return nombreHotel;
    }

    public String getDireccionHotel() {
        return direccionHotel;
    }

    public String getTelefonoHotel() {
        return telefonoHotel;
    }
}
