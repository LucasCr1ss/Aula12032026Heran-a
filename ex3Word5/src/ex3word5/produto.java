/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex3word5;

/**
 *
 * @author CAROL
 */
public class produto {
    
    String nome;
    double valor;
    
    public produto(String nome, double valor){
        
        this.nome = nome;
        this.valor = valor;
    }
    
    public void Comprar(){
        System.out.println("------Produto sem Desconto------");
        System.out.println("O produto " + nome + " ficou R$" + valor);
    }
}
