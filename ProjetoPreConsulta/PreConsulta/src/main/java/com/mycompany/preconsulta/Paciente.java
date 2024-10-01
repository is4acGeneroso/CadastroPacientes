/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.preconsulta;

import java.time.LocalDate;
import java.util.Random;

/**
 *
 * @author isaac
 */
public class Paciente {
    private int id;
    private String nome;
    private int idade;
    private String genero;
    private LocalDate dataCadastro;

    public int getId() {
        return id;
    }
    public void setId() {
        Random random = new Random();
        String numeroSorteado = "";
        
        for(int i = 0; i < 3; i++) {
            numeroSorteado += Integer.toString(random.nextInt(10));
        }
        
        int numeroId = Integer.parseInt(numeroSorteado);
        
        this.id = numeroId;
    }

    public LocalDate getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro() {
        LocalDate dataLocal = LocalDate.now();
        this.dataCadastro = dataLocal;
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getGenero() {
        return genero;
    }
    public void setGenero(int genero) {
        switch(genero) {
            case 1: 
                this.genero = "MASCULINO";
            break;
            
            case 2: 
                this.genero = "FEMININO";
            break;
        } 
    }

    @Override
    public String toString() {
        return "Paciente{" + "id=" + id + ", data=" + dataCadastro + ", nome=" + nome + ", idade=" + idade + ", genero=" + genero  + '}';
    }
    
}
