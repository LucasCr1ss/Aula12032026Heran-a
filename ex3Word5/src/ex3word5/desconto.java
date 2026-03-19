/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex3word5;

/**
 *
 * @author CAROL
 */
public class desconto extends produto{
    
    public desconto(String nome, double valor) {
        super(nome, valor);
    }
    
    @Override
    public void Comprar(){
        double desconto = valor-(valor*50)/100;
        
        System.out.println("------Produto com Desconto------");
        System.out.println("O produto " + nome + " com desconto de 50% ficou R$" + desconto);
    }
}
