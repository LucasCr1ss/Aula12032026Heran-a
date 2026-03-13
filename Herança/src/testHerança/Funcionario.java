/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testHerança;

/**
 *
 * @author Admin
 */
public class Funcionario extends Pessoa{
    String RGM;
    String cargo;

    public Funcionario(String nome, String cpf, String telefone, String dt_nascimento, String RGM, String cargo) {
        super(nome, cpf, telefone, dt_nascimento);
        this.RGM = RGM;
        this.cargo = cargo;
    }
    @Override
    public void info(){ 
        System.out.println(" ------ Cadastro de Estudante ------");
        System.out.println("Nome: " + this.nome);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Telefone: " + this.telefone);
        System.out.println("Data de Nascimento: " + this.dt_nascimento);
        System.out.println("RGM: " + this.RGM);
        System.out.println("Cargo: " + this.cargo);
    }

}
