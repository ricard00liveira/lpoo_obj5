package br.edu.ifsul.cstsi.lpoo_obj5.model;

import java.util.Calendar;
import jakarta.persistence.*;
@Entity(name = "consulta")
@Table(name = "consultas")
public class Consulta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    public Calendar data;
    public String nomePcnte;
    public String nomeDents;
    @ManyToOne
    private Paciente paciente;
    @ManyToOne
    private Secretaria secretaria;
    @OneToOne
    private Agenda agenda;

}
