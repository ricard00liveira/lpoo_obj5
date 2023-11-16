package br.edu.ifsul.cstsi.lpoo_obj5.model;

import jakarta.persistence.*;


@Entity(name = "paciente")
@Table(name = "pacientes")
public class Paciente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    public String nomePcnte;
    private Integer senha;
    private String usuario;

    public Paciente() {
    }

}
