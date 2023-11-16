package br.edu.ifsul.cstsi.lpoo_obj5.model;

import java.util.Calendar;
import jakarta.persistence.*;
@Entity(name = "agenda")
@Table(name = "agendas")
public class Agenda {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    public Calendar data;
    public String nomePcnt;
}
