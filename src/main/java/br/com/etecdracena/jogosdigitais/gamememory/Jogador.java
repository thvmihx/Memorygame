/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.etecdracena.jogosdigitais.gamememory;

/**
 *
 * @author 23011
 */
public class Jogador {
    String nome;
    Integer pontos;
    
    public Jogador(String nomeJogador) {
        nome = nomeJogador.equals("") ? "Jogador": nomeJogador;
        pontos = 0;    
    }
    
    public String pegaNome(){
        return nome;
    }
    
    public Integer obterPontos(){
        return pontos;
    }
    
    public void incrementarPontos(){
        pontos += 5;
    }
    
    public void decrementarPontos(){
        pontos--;
    }
    
}
