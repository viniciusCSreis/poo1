/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulapratica01poo1.abstratos;

import aulapratica01poo1.EntradaDeDados;
import java.util.Scanner;

public abstract class Funcionario extends Pessoa {

    private String endereco;
    private String telefone;
    private String ctps;
    private double salario;
    private static double pisoSalarial;
    
    
    public abstract double calcSalario();
    
    
    public boolean setEndereco(String endereco) {
        if (endereco.length() > 0) {
            this.endereco = endereco;
            return true;
        } else {
            System.out.println("Endereço inválido!");
            return false;
        }
    }

    public String getEndereco() {
        return endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getCtps() {
        return ctps;
    }
    

    public boolean setTelefone(String telefone) {
        if (telefone.length() > 0) {
            this.telefone = telefone;
            return true;
        } else {
            System.out.println("Telefone inválido!");
            return false;
        }
    }

    public boolean setCtps(String ctps) {
        if (ctps.length() > 0) {
            this.ctps = ctps;
            return true;
        } else {
            System.out.println("CTPS inválido!");
            return false;
        }
    }

    public boolean setSalario(double salario) {
        if (salario > 0) {
            this.salario = salario;
            return true;
        } else {
            System.out.println("Salario inválido!");
            return false;
        }
    }

    public static double getPisoSalarial() {
        return pisoSalarial;
    }
    public double getSalario(){ return this.salario;}
    public static boolean setPisoSalarial(double piso)
    {
        
        if(piso>0)
        {
            pisoSalarial=piso;
            return true;
        }
        System.out.println("Piso Salarial invalido.");
        return false;
        
    }
    

    public void lerDados() {
        Scanner s = new Scanner(System.in);
        
        super.lerDados();
        do{
            System.out.println("Digite o endereço do funcionário:");
        }while (!setEndereco(s.nextLine()));
        do{
            System.out.println("Digite o telefone do funcionário:");
        }while (!setTelefone(s.nextLine()));
        do{
            System.out.println("Digite a CTPS do funcionário:");
        }while (!setCtps(s.nextLine()));
        do{
            System.out.println("Digite o salário do funcionário:");
        }while (!setSalario(EntradaDeDados.lerDouble()));

    }

    public void mostrarDados() {
        super.mostrarDados();
        System.out.println("Endereço: " + this.endereco);
        System.out.println("Telefone: " + this.telefone);
        System.out.println("CTPS: " + this.ctps);
        System.out.println("Salario: " + this.salario);
    }

}
