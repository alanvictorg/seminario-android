package com.example.alanvictorg.seminario.models;

import com.google.gson.annotations.SerializedName;

import java.util.List;
import java.util.Objects;

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
    @SerializedName("0")
    private String n1;
    @SerializedName("1")
    private String n2;
    @SerializedName("2")
    private String n3;
    @SerializedName("3")
    private String media;

    public Turma(int id, int curso_id, int professor_id, String codigo, String turno, String credito, String hr_aula, String ano, String created__at, String updated_at, String n1, String n2, String n3, String media) {
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
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
        this.media = media;
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

    public String getN1() {
        if(n1 == null){
            n1 = "-";
        }
        if(Objects.equals(n1, "10.00")){
            n1 = "10.0";
        }
        return n1;
    }

    public void setN1(String n1) {
        this.n1 = n1;
    }

    public String getN2() {
        if(n2 == null){
            n2 = "-";
        }
        if(Objects.equals(n2, "10.00")){
            n2 = "10.0";
        }
        return n2;
    }

    public void setN2(String n2) {
        this.n2 = n2;
    }

    public String getN3() {
        if(n3 == null){
            n3 = "-";
        }
        if(Objects.equals(n3, "10.00")){
            n3 = "10.0";
        }
        return n3;
    }

    public void setN3(String n3) {
        this.n3 = n3;
    }

    public String getMedia() {
        if(media == null){
            media = "-";
        }
        if(Objects.equals(media, "10.00")){
            media = "10.0";
        }
        return media;
    }

    public void setMedia(String media) {
        this.media = media;
    }
}
