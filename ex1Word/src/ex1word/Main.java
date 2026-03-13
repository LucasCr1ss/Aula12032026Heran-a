/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex1word;

/**
 *
 * @author Admin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Veiculo v1 = new Veiculo("Mitsubishi", "Lancer", "2012");
        v1.info();
        
        Carro c1 = new Carro("Ford", "Mustang GT", "2024/2025", "Flex" );
        c1.info();
        
        carroEletrico cl1 = new carroEletrico("BYD", "Yuan Plus", "2023", "60,5 kWh");
        cl1.info();
        
        
    }
    
}
