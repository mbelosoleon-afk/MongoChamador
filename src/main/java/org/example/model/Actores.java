package org.example.model;

import java.util.List;

public class Actores {

    private Long id;

    private String nome;
    private String apelidos;
    private String nacionalidade;
    private List<Pelicula> idPelicula;

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

    public String getApelidos() {
        return apelidos;
    }

    public void setApelidos(String apelidos) {
        this.apelidos = apelidos;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public List<Pelicula> getIdPelicula() {
        return idPelicula;
    }

    public void setIdPelicula(List<Pelicula> idPelicula) {
        this.idPelicula = idPelicula;
    }
}
