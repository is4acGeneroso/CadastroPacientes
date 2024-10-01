/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.preconsulta;

import java.time.LocalDate;


/**
 *
 * @author isaac
 */
public class ClassificacaoParametros implements MetodosClassificacao {
    private String pressao;
    private String glicemia;
    private String imc;

    @Override
    public void classificaPressao(int sistole, int diastole) {
        if(sistole < 110 || diastole < 60) {
            this.setPressao("HIPOTENSO");
        } else if(sistole >= 140 || diastole >= 90) {
            this.setPressao("HIPERTENSO");
        } else {
            this.setPressao("NORMOTENSO");
        }
    } 

    @Override
    public void classificaGlicemia(int mgDl) {
        if(mgDl < 100) {
            this.setGlicemia("NORMOGLICEMIA");
        } else if(mgDl < 126) {
            this.setGlicemia("PRE-DIABETES");
        } else {
            this.setGlicemia("DIABETE ESTABELECIDA");
        }
    }

    @Override
    public void classificaImc(float peso, float altura) {
        float imc = peso / (float)Math.pow(altura , 2);
        
        if(imc < 18.5) {
            this.setImc("ABAIXO DO PESO");
        } else if(imc < 25) {
            this.setImc("PESO NORMAL");
        } else if(imc < 30) {
            this.setImc("SOBREPESO");
        } else if(imc < 35) {
            this.setImc("OBESIDADE GRAU 1");
        } else if(imc < 39) {
            this.setImc("OBESIDADE GRAU 2");
        } else {
            this.setImc("OBESIDADE GRAU 3");
        }
    }

    public String getPressao() {
        return pressao;
    }

    public void setPressao(String pressao) {
        this.pressao = pressao;
    }

    public String getGlicemia() {
        return glicemia;
    }

    public void setGlicemia(String glicemia) {
        this.glicemia = glicemia;
    }

    public String getImc() {
        return imc;
    }

    public void setImc(String imc) {
        this.imc = imc;
    }

    @Override
    public String toString() {
        return "ClassificacaoParametros{" + "pressao=" + pressao + ", glicemia=" + glicemia + ", imc=" + imc + '}';
    }

}
