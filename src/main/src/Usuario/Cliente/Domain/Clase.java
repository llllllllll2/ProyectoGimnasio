package Usuario.Cliente.Domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Getter
@Setter
@RequiredArgsConstructor
@AllArgsConstructor
@Entity(name = "clase")
public class Clase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_clase", nullable = false)
    private Long id_clase;

    @Column
    private String ubicacion;
    @Column
    private String nombre;
    @Column
    private int capacidad;
    @Column
    private String monitor;
    @Column
    private String descripcion;
    //Relacion de 1 a muchos de Clase-Reserva
    @OneToMany(mappedBy = "codReserva", cascade = CascadeType.PERSIST)
    private List<Reserva> reservaList = new ArrayList<>();
}
