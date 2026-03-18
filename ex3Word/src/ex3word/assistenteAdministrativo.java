/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex3word;

/**
 *
 * @author CAROL
 */
public class assistenteAdministrativo extends funcionario{
    String funcao;

    public assistenteAdministrativo(String nome, String numMatricula, String funcao) {
        super(nome, numMatricula);
        this.funcao = funcao;
    }
    
    @Override
    public void info(){
        System.out.println("------Gerenciamento de Funcionarios------");
        System.out.println("Nome do Funcionario: " + this.nome);
        System.out.println("Número de Matrícula: " + this.numMatricula);
        System.out.println("Funcao: " + this.funcao);
    }
}
