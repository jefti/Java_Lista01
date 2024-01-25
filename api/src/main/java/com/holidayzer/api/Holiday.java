package com.holidayzer.api;

public class Holiday {
    private String nome;
    private String data;

    Holiday(String nome, String data){
        this.nome = nome;
        this.data = data;
    }

    public String getName(){
        return this.nome;
    }

    public String getData(){
        return this.data;
    }

    public void setName(String nome){
        this.nome = nome;
    }

    public void setData(String data){
        this.data = data;
    }
}

