/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex1word;

/**
 *
 * @author Admin
 */
public class Carro extends Veiculo{
    String tipoDeCombustivel;

    public Carro(String ano, String modelo, String marca, String tipoDeCombustivel) {
        super(ano, modelo, marca);
        this.tipoDeCombustivel = tipoDeCombustivel;
    }
    
    @Override
    public void info(){
        System.out.println("------Gerenciamento de Veiculos------");
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo" + this.modelo);
        System.out.println("Ano: " + this.ano);
        System.out.println("Tipo de Combustivel: " + this.tipoDeCombustivel);
        
    }
    
}
