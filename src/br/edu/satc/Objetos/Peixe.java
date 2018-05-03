/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.satc.Objetos;

/**
 *
 * @author SATC
 */
public class Peixe extends Animal {
    
    private String tipo;

    public Peixe(String tipo, Grupo grupo, String descricao, char status) {
        super(grupo, descricao, status);
        this.tipo = tipo;
    }

  
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return super.toString() + "\n"+"Peixe{" + "tipo=" + tipo + '}';
    }
    
    
    
}
