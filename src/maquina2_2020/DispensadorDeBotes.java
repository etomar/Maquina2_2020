/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maquina2_2020;

/**
 *
 * @author Alexandra Mº Bosca y Alejandro Donet
 */
public class DispensadorDeBotes {
    
    private int botes; 
    boolean existenBotes = false;

    public DispensadorDeBotes(int bote){
        iniciarDispensadorDeBotes(bote);
    }    
 
    
    public void iniciarDispensadorDeBotes (int i){
        botes = i;
    }
    
    public boolean pulsarBoton (){
        
        if(botes>0){
            existenBotes= true;
        botes--;
        }
        
        else
            existenBotes= false;
        return existenBotes;
    }
    
    
    public int botesDisponibles (){
        return botes;
    }
}
