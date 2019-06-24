package com.google.maps.android.utils.demo.model;

import java.sql.Date;

public class OrdemServico {
    private int id;
    private String descricao;
    private String local;
    private String datainicio;
    private String datafim;
    private String status;

    public OrdemServico(int id, String descricao, String local, String datainicio, String datafim, String status) {
        this.id = id;
        this.descricao = descricao;
        this.local = local;
        this.datainicio = datainicio;
        this.datafim = datafim;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getDatainicio() {
        return datainicio;
    }

    public void setDatainicio(String datainicio) {
        this.datainicio = datainicio;
    }

    public String getDatafim() {
        return datafim;
    }

    public void setDatafim(String datafim) {
        this.datafim = datafim;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
