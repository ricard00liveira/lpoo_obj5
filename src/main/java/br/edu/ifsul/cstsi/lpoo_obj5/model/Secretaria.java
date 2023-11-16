package br.edu.ifsul.cstsi.lpoo_obj5.model;
import jakarta.persistence.*;
import java.util.List;

@Entity(name = "secretaria")
@Table(name = "secretarias")
public class Secretaria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private Integer rg;
    @OneToMany(mappedBy = "secretaria")
    private List<Consulta> consultasMarcadas;
}
