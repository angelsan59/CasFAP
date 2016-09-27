/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package san.com;
import fenetres.frmPaiment;
import java.io.IOException;
/**
 *
 * @author sociepka
 */
public class application {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{
        // TODO code application logic here
         /**
         * Chargement de la     fenetre principale
         */
        frmPaiment fp = new frmPaiment (new javax.swing.JFrame(), true);
        fp.setVisible(true);
    }
    
}
