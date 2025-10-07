package com.example.projetoescola;

public class Alunos {

    String Nome;
    String Curso;

    public Alunos(String name, String course){
        this.Nome = name;
        this.Curso = course;
    }

    public String getNome(){
        return Nome;
    }

    public String getCurso(){
        return Curso;
    }



}
