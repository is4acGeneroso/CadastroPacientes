/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.preconsulta;

import java.util.Scanner;

/**
 *
 * @author isaac
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Paciente[] paciente = new Paciente[1];
        String nome = "";
        int idade = 0, genero = 0;
        float peso = 0f, altura = 0f;
        
        ClassificacaoParametros[] clParametros = new ClassificacaoParametros[paciente.length];
        int sistole = 0, diastole = 0;
        int glicemia = 0;
        
        for(int i = 0; i < paciente.length; i++) {
            System.out.format("PACIENTE: %d\n", i+1);
            
            System.out.print("DIGITE O NOME DO PACIENTE: ");
            nome = scanner.next();
            
            System.out.print("DIGITE A IDADE: ");
            idade = scanner.nextInt();
            
            System.out.print("[1] MASCULINO\n[2] FEMININO\nDIGITE SEU GENERO: ");
            genero = scanner.nextInt();
            
            System.out.print("DIGITE O PESO: kg");
            peso = scanner.nextFloat();
            
            System.out.print("DIGITE A ALTURA: ");
            altura = scanner.nextFloat();
            
            System.out.println("");
            
            paciente[i] = new Paciente();
            paciente[i].setId();
            paciente[i].setDataCadastro();
            paciente[i].setNome(nome);
            paciente[i].setIdade(idade);
            paciente[i].setGenero(genero);
        }
        
        for(int i = 0; i < paciente.length; i++) {
            System.out.println("");
            System.out.format("PACIENTE: %d\n", i+1);
            
            System.out.println("PRESSAO ARTERIAL");
            System.out.print("SISTOLE: ");
            sistole = scanner.nextInt();
            System.out.print("DIASTOLE: ");
            diastole = scanner.nextInt();
                
            System.out.println("");
            
            System.out.println("GLICEMIA");
            System.out.print("VALOR: mgDl");
            glicemia = scanner.nextInt();
            
            System.out.println("");
            
            clParametros[i] = new ClassificacaoParametros();
            clParametros[i].classificaPressao(sistole, diastole);
            clParametros[i].classificaGlicemia(glicemia);
            clParametros[i].classificaImc(peso, altura);
        }
        
        for(int i = 0; i < paciente.length; i++) {
            System.out.println(paciente[i].toString());
            System.out.println(clParametros[i].toString());
            System.out.println("");
        }
    }
}
