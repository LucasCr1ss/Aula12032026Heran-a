/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex3word4;

/**
 *
 * @author CAROL
 */
public class imovel {
    String imovel;
    double valorImovelNv;
    double valorImovelVlh;
    
    public imovel(String imovel, double valorImovelVlh, double valorImovelNv){
        
        this.imovel = imovel;
        this.valorImovelNv = valorImovelNv;
        this.valorImovelVlh = valorImovelVlh;
    }
    
    public void comprarImovel(){
        
        System.out.println("O imovel escolhido foi " + imovel + ", o valor do imovel e de R$" + valorImovelNv );
        
    }
    
}
