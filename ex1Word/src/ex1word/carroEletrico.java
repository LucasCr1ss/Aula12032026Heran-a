/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex1word;

/**
 *
 * @author Admin
 */
public class carroEletrico extends Veiculo{
    String capacidadeBateria;
    
    
    public carroEletrico(String ano, String modelo, String marca, String capacidadeBateria) {
        super(ano, modelo, marca);
        this.capacidadeBateria = capacidadeBateria;
    }
    
    @Override
     public void info(){
        System.out.println("------Gerenciamento de Veiculos------");
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo" + this.modelo);
        System.out.println("Ano: " + this.ano);
        System.out.println("Capacidade da Bateria: " + this.capacidadeBateria);
        
    }
}
