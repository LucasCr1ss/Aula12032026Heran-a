/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex3word;

/**
 *
 * @author CAROL
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        funcionario f1 = new funcionario("lucas", "20007");
        f1.info();
        
        assistenteAdministrativo adm1 = new assistenteAdministrativo("Joao", "30009", "Assistente Adiministrativo");
        adm1.info();
        
        Técnico t1 = new Técnico("Cleber", "40006", "Técnico");
        t1.info();
    }
    
}
