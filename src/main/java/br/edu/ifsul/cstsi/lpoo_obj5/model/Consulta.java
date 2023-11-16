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

    // Construtores

    public Consulta() {
    }

    public Consulta(Long id, Calendar data, String nomePcnte, String nomeDents) {
        this.id = id;
        this.data = data;
        this.nomePcnte = nomePcnte;
        this.nomeDents = nomeDents;
    }

    public Consulta(Long id, Calendar data, String nomePcnte, String nomeDents, Paciente paciente, Secretaria secretaria, Agenda agenda) {
        this.id = id;
        this.data = data;
        this.nomePcnte = nomePcnte;
        this.nomeDents = nomeDents;
        this.paciente = paciente;
        this.secretaria = secretaria;
        this.agenda = agenda;
    }
    //Getters and Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Calendar getData() {
        return data;
    }

    public void setData(Calendar data) {
        this.data = data;
    }

    public String getNomePcnte() {
        return nomePcnte;
    }

    public void setNomePcnte(String nomePcnte) {
        this.nomePcnte = nomePcnte;
    }

    public String getNomeDents() {
        return nomeDents;
    }

    public void setNomeDents(String nomeDents) {
        this.nomeDents = nomeDents;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Secretaria getSecretaria() {
        return secretaria;
    }

    public void setSecretaria(Secretaria secretaria) {
        this.secretaria = secretaria;
    }

    public Agenda getAgenda() {
        return agenda;
    }

    public void setAgenda(Agenda agenda) {
        this.agenda = agenda;
    }

    //ToString

    @Override
    public String toString() {
        return "Consulta{" +
                "id=" + id +
                ", data=" + data +
                ", nomePcnte='" + nomePcnte + '\'' +
                ", nomeDents='" + nomeDents + '\'' +
                ", paciente=" + paciente +
                ", secretaria=" + secretaria +
                ", agenda=" + agenda +
                '}';
    }
}
