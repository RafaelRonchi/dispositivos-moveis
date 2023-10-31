package com.example.sqlitecadastro.Model;

public class Nota {
    private Integer IdNota;
    private String Titulo;
    private String Txt;

    public Nota() {
    }

    public Integer getIdNota() {
        return IdNota;
    }

    public String getTitulo() {
        return Titulo;
    }

    public String getTxt() {
        return Txt;
    }

    public void setIdNota(Integer idNota) {
        IdNota = idNota;
    }

    public void setTitulo(String titular) {
        Titulo = titular;
    }

    public void setTxt(String txt) {
        Txt = txt;
    }
}
