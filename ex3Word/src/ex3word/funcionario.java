/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex3word;

/**
 *
 * @author CAROL
 */
public class funcionario {
    String nome;
    String numMatricula;
    
    public funcionario(String nome, String numMatricula){
     this.nome = nome;
     this.numMatricula = numMatricula;
     
    }
    
    public void info(){
        System.out.println("------Gerenciamento de Funcionarios------");
        System.out.println("Nome do Funcionario: " + this.nome);
        System.out.println("Número de Matrícula: " + this.numMatricula);
        
    }
    
}
