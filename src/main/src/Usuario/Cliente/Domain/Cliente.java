package Usuario.Cliente.Domain;


import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@AllArgsConstructor
@Getter
@Setter
@RequiredArgsConstructor
@Entity(name = "clientes")
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column
    private String dni;
    @Column
    private String nombre;
    @Column
    private String apellidos;
    @Column
    private String direccion;
    @Column
    private int telefono;

    //Variable emf que se encarga de organizar las relaciones
    private static EntityManagerFactory emf;
    //Relacion de 1 a muchos de clientes a Reserva
    @OneToMany(mappedBy = "clientes", cascade = CascadeType.PERSIST)
    //Sacamos la lista del ToString de aqui
    private List<Reserva> reservasList = new ArrayList<>();

}
