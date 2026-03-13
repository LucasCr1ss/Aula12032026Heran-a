/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex1word;

/**
 *
 * @author Admin
 */
public class Veiculo {
    String marca;
    String modelo;
    String ano;
    
    public Veiculo (String ano, String modelo, String marca) {
        this.ano = ano;
        this.modelo = modelo;
        this.marca = marca;
    }
    
    public void info(){
        System.out.println("------Gerenciamento de Veiculos------");
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo" + this.modelo);
        System.out.println("Ano: " + this.ano);
        
    }
    
}


