/*
 * O — Open/closed principle (Principio abierto/cerrado)
 */
package paquete04;

import java.util.ArrayList;

/**
 *
 * @author reroes
 */
public class Principal {
    public static void main(String[] args) {
        
        TransporteBus bus = new TransporteBus();
        bus.establecerCooperativaBus("24 Mayo");
        bus.establecerTarifa();
        
        TransporteTaxi taxi = new TransporteTaxi();
        taxi.establecerCooperativaTaxi("Yahuarcuna");
        taxi.establecerTarifa();
        
        TransporteTranvia t3 = new TransporteTranvia();
        t3.establecerTranvia("Loja trans");
        t3.establecerTarifa();
        
        TransporteAereo aereo = new TransporteAereo();
        aereo.establecerTranvia("Avianca");
        aereo.establecerTarifa();
        
        TransporteMaritimo mar = new TransporteMaritimo();
        mar.establecerTranvia("Titanic");
        mar.establecerTarifa();
        
        ArrayList<Transporte> lista = new ArrayList<>();
        lista.add(bus);
        lista.add(taxi);
        lista.add(t3);
        lista.add(aereo);
        lista.add(mar);
        
        TiposTransporte tipos = new TiposTransporte();
        tipos.obtenerPromedioTarifas();
        tipos.establecerTransportes(lista);
        tipos.establecerPromedioTarifas();
        
        System.out.printf("Promedio de Tarifas: %.2f", 
                tipos.obtenerPromedioTarifas());
        
    }
}