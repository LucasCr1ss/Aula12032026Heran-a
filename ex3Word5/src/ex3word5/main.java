/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex3word5;

/**
 *
 * @author CAROL
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        produto p1 = new produto("Controle de PS4", 150.00);
        p1.Comprar();
        
        desconto d1 = new desconto("Controle de PS4", 150.00);
        d1.Comprar();
    }
    
}
