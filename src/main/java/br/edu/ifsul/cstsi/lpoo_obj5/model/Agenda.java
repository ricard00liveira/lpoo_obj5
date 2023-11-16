package br.edu.ifsul.cstsi.lpoo_obj5.model;

import java.util.Calendar;
import jakarta.persistence.*;
@Entity(name = "agenda")
@Table(name = "agenda")
public class Agenda {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    public Calendar data;
    public String nomePcnt;

    // Construtores

    public Agenda() {
    }

    public Agenda(Long id, Calendar data, String nomePcnt) {
        this.id = id;
        this.data = data;
        this.nomePcnt = nomePcnt;
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

    public String getNomePcnt() {
        return nomePcnt;
    }

    public void setNomePcnt(String nomePcnt) {
        this.nomePcnt = nomePcnt;
    }

    //ToString

    @Override
    public String toString() {
        return "Agenda{" +
                "id=" + id +
                ", data=" + data +
                ", nomePcnt='" + nomePcnt + '\'' +
                '}';
    }
}
