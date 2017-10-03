package com.example.alanvictorg.seminario.models;

import java.util.List;

/**
 * Created by Alan Victor G on 26/09/2017.
 */

public class Turma {
    private int id;
    private int curso_id;
    private int professor_id;
    private String codigo;
    private String turno;
    private String credito;
    private String hr_aula;
    private String ano;
    private String created__at;
    private String updated_at;


    public Turma(int id, int curso_id, int professor_id, String codigo, String turno, String credito, String hr_aula, String ano, String created__at, String updated_at) {
        this.id = id;
        this.curso_id = curso_id;
        this.professor_id = professor_id;
        this.codigo = codigo;
        this.turno = turno;
        this.credito = credito;
        this.hr_aula = hr_aula;
        this.ano = ano;
        this.created__at = created__at;
        this.updated_at = updated_at;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCurso_id() {
        return curso_id;
    }

    public void setCurso_id(int curso_id) {
        this.curso_id = curso_id;
    }

    public int getProfessor_id() {
        return professor_id;
    }

    public void setProfessor_id(int professor_id) {
        this.professor_id = professor_id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public String getCredito() {
        return credito;
    }

    public void setCredito(String credito) {
        this.credito = credito;
    }

    public String getHr_aula() {
        return hr_aula;
    }

    public void setHr_aula(String hr_aula) {
        this.hr_aula = hr_aula;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getCreated__at() {
        return created__at;
    }

    public void setCreated__at(String created__at) {
        this.created__at = created__at;
    }

    public String getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(String updated_at) {
        this.updated_at = updated_at;
    }
}
