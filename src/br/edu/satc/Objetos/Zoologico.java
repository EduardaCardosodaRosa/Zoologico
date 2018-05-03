/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.satc.Objetos;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author SATC
 */
public class Zoologico  {
    
    private int id;
    private ArrayList<Animal> animais = new ArrayList<>();

    public Zoologico() {
        this.id = 0;
    }

    
    

    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Animal> getAnimais() {
        return animais;
    }

    public void setAnimais(ArrayList<Animal> animais) {
        this.animais = animais;
    }

    @Override
    public String toString() {
        String listadeAnimais= "";
        for (Animal animal : animais) {
            listadeAnimais+= animal.getDescricao();
            
        }
        return "Zoologico{" + "id=" + id + ", animais=" + animais + '}';
    }
}
    

    
  