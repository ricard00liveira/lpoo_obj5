package br.edu.ifsul.cstsi.lpoo_obj5.model;

import jakarta.persistence.*;
import java.util.List;


@Entity(name = "paciente")
@Table(name = "pacientes")
public class Paciente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    public String nomePcnte;
    private Integer senha;
    private String usuario;
    @OneToMany(mappedBy = "paciente")
    private List<Consulta> consultas;

    // Construtores
    public Paciente() {
    }

    public Paciente(Long id, String nomePcnte, Integer senha, String usuario) {
        this.id = id;
        this.nomePcnte = nomePcnte;
        this.senha = senha;
        this.usuario = usuario;
    }

    public Paciente(Long id, String nomePcnte, Integer senha, String usuario, List<Consulta> consultas) {
        this.id = id;
        this.nomePcnte = nomePcnte;
        this.senha = senha;
        this.usuario = usuario;
        this.consultas = consultas;
    }
    //Getters and Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomePcnte() {
        return nomePcnte;
    }

    public void setNomePcnte(String nomePcnte) {
        this.nomePcnte = nomePcnte;
    }

    public Integer getSenha() {
        return senha;
    }

    public void setSenha(Integer senha) {
        this.senha = senha;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public List<Consulta> getConsultas() {
        return consultas;
    }

    public void setConsultas(List<Consulta> consultas) {
        this.consultas = consultas;
    }

    //ToString

    @Override
    public String toString() {
        return "Paciente{" +
                "id=" + id +
                ", nomePcnte='" + nomePcnte + '\'' +
                ", senha=" + senha +
                ", usuario='" + usuario + '\'' +
                ", consultas=" + consultas +
                '}';
    }
}
