/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.preconsulta;

/**
 *
 * @author isaac
 */
public interface MetodosClassificacao {
    public abstract void classificaPressao(int sistole, int diastole);
    public abstract void classificaGlicemia(int mgDl);
    public abstract void classificaImc(float peso, float altura);
}
