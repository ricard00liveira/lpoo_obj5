package br.edu.ifsul.cstsi.lpoo_obj5.model;
import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "secretarias")
public class Secretaria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private Integer rg;
    @OneToMany(mappedBy = "secretaria")
    private List<Consulta> consultas;

    // Construtores
    public Secretaria() {
    }

    public Secretaria(Long id, String nome, Integer rg) {
        this.id = id;
        this.nome = nome;
        this.rg = rg;
    }

    public Secretaria(Long id, String nome, Integer rg, List<Consulta> consultas) {
        this.id = id;
        this.nome = nome;
        this.rg = rg;
        this.consultas = consultas;
    }
    //Getters and Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getRg() {
        return rg;
    }

    public void setRg(Integer rg) {
        this.rg = rg;
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
        return "Secretaria{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", rg=" + rg +
                ", consultas=" + consultas +
                '}';
    }
}
