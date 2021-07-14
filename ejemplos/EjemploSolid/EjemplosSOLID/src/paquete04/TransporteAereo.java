/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete04;

/**
 *
 * @author jonathanerazoborrero
 */
public class TransporteAereo extends Transporte{
    
    private String avion;
    
    public void establecerTranvia(String n){   
        avion = n;
    }
    
    @Override
    public void establecerTarifa() {
        tarifa = 100;
    }
    
    public String obtenerTranvia(){
    return avion;
    }
    
}
