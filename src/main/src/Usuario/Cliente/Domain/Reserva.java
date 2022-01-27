package Usuario.Cliente.Domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Time;
import java.util.Date;

@AllArgsConstructor
@Getter
@Setter
@RequiredArgsConstructor
@Entity(name = "reserva")
public class Reserva {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codReserva", nullable = false)
    private Long id;
    @Column
    private Date fecha;
    @Column
    private Time hora;

    //Variable emf que se encarga de organizar las relaciones
    private static EntityManagerFactory emf;
    //Relacion de Muchas reservas a un cliente
    @ManyToOne(fetch = FetchType.LAZY)
    //Llamada para finalizar la relacion Cliente-Reserva
    private Cliente clientes;
    //Relacion de muchos a 1 de Reserva-Clase
    @ManyToOne(fetch = FetchType.LAZY)
    private Clase clase;



}
