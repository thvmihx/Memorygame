/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.etecdracena.jogosdigitais.gamememory;

import javax.swing.Icon;
import javax.swing.JButton;

/**
 *
 * @author 23011
 */

public class jogoBotao extends JButton{
    
    private Icon imagemPadrao;
    private Icon imagemBotao;
    
    public jogoBotao (Icon imagemPadrao, Icon imagemBotao){
        this.imagemPadrao = imagemPadrao;
        this.imagemBotao = imagemBotao;
        setImagemPadrao();
    }
   
    public void setImagemPadrao(){
        this.setIcon(imagemPadrao);
    }
    
    public void setImagemBotao(){
        this.setIcon(imagemBotao);
    }
    public Icon getImagemBotao(){
        return this.imagemBotao;
    }
}
