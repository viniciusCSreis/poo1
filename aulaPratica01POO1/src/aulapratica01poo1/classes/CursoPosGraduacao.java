/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulapratica01poo1.classes;

import aulapratica01poo1.abstratos.Curso;
import java.io.Serializable;
import java.util.Scanner;

/**
 *
 * @author vinic
 */
public class CursoPosGraduacao extends Curso implements Serializable{
    private String graduacao;
    
    public boolean setGraduacao(String graduacao) {
        

        if(graduacao.length()==0)
            return false;
        
        if (graduacao.toUpperCase().charAt(0) == 'M'
                || graduacao.toUpperCase().charAt(0) == 'D'
                || graduacao.toUpperCase().charAt(0) == 'E') {
            this.graduacao = graduacao.toUpperCase();
            return true;
        } else {
            System.out.println("Escolha inválida.");
            return false;

        }

    }

    public String getGraduacao() {
        return graduacao;
    }
    
    
    public void lerDados()
    {
        
        Scanner s = new Scanner(System.in);      
        
        super.lerDados();
        do
        {
            System.out.println("Digite a Graduação:");
            System.out.println("Escolha:");
            System.out.println("M:mestrado");
            System.out.println("D:doutorado");
            System.out.println("E:especialização");
            
        }while(!setGraduacao(s.nextLine()));
        
        
        
    }
    public void mostrarDados()
    {
        super.mostrarDados();
        switch(this.graduacao.charAt(0))
        {
            case 'M':
                System.out.println("Pos Graduação:Mestrado");
                break;
            case 'D':
                System.out.println("Pos Graduação:Doutorado");
                break;
            case 'E':
                System.out.println("Pos Graduação:Especialização");
                break;
        }
                
    }
}
