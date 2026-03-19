/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exword3;

/**
 *
 * @author CAROL
 */
public class Ingresso {
    String ingresso;
    String ingressoVIP;
    
    public Ingresso(String ingresso, String ingressoVIP){
        this.ingresso = ingresso;
        this.ingressoVIP = ingressoVIP;
    }
    
    public void DecidirIngresso(){
        System.out.println("Tipo do ingresso: " + this.ingresso);
        System.out.println("Seu ingresso da acesso ao " + this.ingressoVIP);
    }
}
