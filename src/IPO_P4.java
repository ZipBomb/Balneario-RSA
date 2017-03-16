/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.io.IOException;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author Pablo Rey
 */
public class IPO_P4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Tentamos cargar o estilo 'Nimbus' se está instalado na máquina. 
        // Se non o está, utilizamos o que vén por defecto (co método 
        // getCrossPlatformLookAndFeelClassName()).
        try {
            for (LookAndFeelInfo estilo : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(estilo.getName())) {
                    UIManager.setLookAndFeel(estilo.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | UnsupportedLookAndFeelException e) {
            System.out.println(e.getMessage());
            try {
                UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
            } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | UnsupportedLookAndFeelException ex) {
                System.out.println(ex.getMessage());
            }
        }        
        
        // Cargamos no entorno gráfico as fontes gardadas en formato .ttf no directorio "/fonts"
        try {
            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
            Font fuente1 = Font.createFont(Font.TRUETYPE_FONT, IPO_P4.class.getResourceAsStream("/fonts/timeburnernormal.ttf"));
            Font fuente2 = Font.createFont(Font.TRUETYPE_FONT, IPO_P4.class.getResourceAsStream("/fonts/timeburnerbold.ttf"));            
            ge.registerFont(fuente1);
            ge.registerFont(fuente2);
        } catch (IOException|FontFormatException e) {
            System.out.println(e.getMessage());
        }        
        
        // Creamos os participantes e unha instancia da clase DatosReserva que se irá
        // pasando entre as clases coa información dos usuarios que están facendo uso
        // da máquina e das actividades nas que participan
        Participante p1 = new Participante("22332233D", "Bárbara Pelayo Aguirre");
        Participante p2 = new Participante("32524624P", "Álvaro Gutiérrez Rodarte");
        
        DatosReserva d = new DatosReserva();
        d.engadirUsuario(p1);
        d.engadirUsuario(p2);        
        
        // Creamos a ventá e cargamos o primeiro panel
        Ventana v = new Ventana();
        PanelInactive pi = new PanelInactive(d);
        pi.setV(v);
        v.setContentPane(pi);
        v.setVisible(true);        
    }
    
}
