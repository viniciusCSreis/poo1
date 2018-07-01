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
public class CursoGraduacao extends Curso implements Serializable{
    private String graduacao;
    
    
    
    public boolean setGraduacao(String graduacao) {
        

        if(graduacao.length()==0)
            return false;
        
        if (graduacao.toUpperCase().charAt(0) == 'B'
                || graduacao.toUpperCase().charAt(0) == 'T'
                || graduacao.toUpperCase().charAt(0) == 'L') {
            this.graduacao = graduacao.toUpperCase();
            return true;
        } else {
            System.out.println("Escolha inválida.");
            return false;

        }

    }
    
    public void lerDados()
    {
        
        Scanner s = new Scanner(System.in);      
        
        super.lerDados();
        
        System.out.println("Digite a Graduação:");
        do{
            System.out.println("Escolha:");
            System.out.println("B:Bacharelado");
            System.out.println("T:Tecnólogo");
            System.out.println("L:Licenciatura");
        }while(!setGraduacao(s.nextLine()));
        
    }

    public String getGraduacao() {
        return graduacao;
    }
    
    public void mostrarDados()
    {
        super.mostrarDados();
        switch(this.graduacao.charAt(0))
        {
            case 'B':
                System.out.println("Graduação:Bacharelado");
                break;
            case 'T':
                System.out.println("Graduação:Tecnólogo");
                break;
            case 'L':
                System.out.println("Graduação:Licenciatura");
                break;
        }
                
    }

    
    
}
