/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testHerança;

/**
 *
 * @author Admin
 */
public class Herança {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Pessoa p1 = new Pessoa("Heitor", "455.666.098-05", "(11)3333333333", "18/09/2007");
        p1.info();
                
                
        Estudante e1 = new Estudante("Heitor", "455.666.098-05", "(11)3333333333", "18/09/2007", "26604", "Desenvolvimento de Sistemas");
        e1.info();
        
        
        Professor pf1 = new Professor ("Titor", "455.666.568-05", "(11)3333337773", "18/09/2007", "412", "Matematica");
        pf1.info();
        
        
        Funcionario f1 = new Funcionario ("Titor", "455.666.568-05", "(11)3333337773", "18/09/2007", "23423423424", "Diretor");
        f1.info();
        
    }
    
}
