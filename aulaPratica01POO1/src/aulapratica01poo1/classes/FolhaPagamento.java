/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulapratica01poo1.classes;

import aulapratica01poo1.abstratos.Funcionario;
import java.util.ArrayList;

/**
 *
 * @author vinic
 */
public class FolhaPagamento {
    private double totalFolha = 0;
    public void somaFolha(ArrayList <? extends Funcionario> funcionarios)
    {
        
        this.totalFolha = 0;
        for (Funcionario func : funcionarios)
        {
            this.totalFolha += func.calcSalario();
            System.out.printf("\n Nome: %s \n Salario: %1.2f \n Categoria: %s \n",func.getNome(),func.getSalario(),func.getClass().getName());
            
        }
        
    }
    public double getTotalFolha(){return this.totalFolha;}
    
    public double getTotalEncargos()
    {
        //Suponha que o total de encargos
        //é 33,78% sobre o
        //salário de cada funcionário.
        return (this.totalFolha * 0.3378);
                
    }
    public double calcIRRF(Funcionario f)
    {
        if (f.calcSalario() > 3000) return
        f.calcSalario()*0.275;
        else if (f.calcSalario() > 1500) return
        f.calcSalario()*0.15;
        else return 0;
    }
    public double calcINSS(Funcionario f)
    {
        return f.calcSalario()*0.11;
    }
    public void printRelatorio(ArrayList <? extends Funcionario> funcionarios)
    {
        /*
           os dados do funcionário;
            – o salário bruto do funcionário, gerado pelo método calcSalario();
            – o IRRF a ser pago pelo funcionário;
            – o INSS a ser pago pelo funcionário;
            – e o salário líquido do funcionário, que é o resultado do salário bruto,
            descontando o IRRF e o INSS.
        */
        for(Funcionario f :funcionarios )
        {
            System.out.println("Nome:"+f.getNome());
            System.out.println("Salario bruto:"+f.calcSalario());
            System.out.println("IRRF:"+calcIRRF(f));
            System.out.println("INSS:"+calcINSS(f));
            System.out.println("Salario líquido:"+(f.calcSalario() - calcINSS(f) - calcIRRF(f) ));
            
        }
    }

}
