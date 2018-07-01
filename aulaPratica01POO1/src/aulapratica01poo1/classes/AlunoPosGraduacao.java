/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulapratica01poo1.classes;

import aulapratica01poo1.EntradaDeDados;
import aulapratica01poo1.abstratos.Aluno;
import java.io.Serializable;
import java.util.Scanner;

/**
 *
 * @author vinic
 */
public class AlunoPosGraduacao extends Aluno implements Serializable {

    private CursoPosGraduacao cursoPosGraduacao;    
    private String instituicao;  
    //private String graduacao;
    private int AnoInicio;
    private int AnoFim;

    public CursoPosGraduacao getCursoPosGraduacao() {
        return cursoPosGraduacao;
    }

    public String getInstituicao() {
        return instituicao;
    }

    public int getAnoInicio() {
        return AnoInicio;
    }

    public int getAnoFim() {
        return AnoFim;
    }
    
    public AlunoPosGraduacao()
    {
        
    }
    
    public AlunoPosGraduacao (CursoPosGraduacao cursoPosGraduacao)
    {
        this.cursoPosGraduacao=cursoPosGraduacao;
    }

    public void setCursoPosGraduacao(CursoPosGraduacao cursoPosGraduacao) {
        this.cursoPosGraduacao = cursoPosGraduacao;
    } 
    
   /*public boolean setGraduacao(String graduacao) {
        

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
*/
    public boolean setInstituicao(String instituicao) {
        if(instituicao.length()>0)
        {
            this.instituicao = instituicao;
            return true;
        }
        System.out.println("Instituição inválida.");
        return false;
    }

    public boolean setAnoInicio(int AnoInicio) {
        if(AnoInicio>0)
        {
            this.AnoInicio = AnoInicio;
            return true;
        }
        System.out.println("Ano de Inicio inválida.");
        return false;
    }

    public boolean setAnoFim(int AnoFim) {
        if(AnoFim>0)
        {
            this.AnoFim = AnoFim;
            return true;
        }
        System.out.println("Ano Final inválida.");
        return false;
    }
  
    public void lerDados()
    {
        Scanner s = new Scanner(System.in);
        
        super.lerDados();
                       
        this.cursoPosGraduacao = new CursoPosGraduacao();
        this.cursoPosGraduacao.lerDados();
        do
        {
            System.out.println("Digite a Instituição:");
            
        }while( !setInstituicao( s.nextLine() ) );
        
        
        
       
        
        do
        {
            System.out.println("Digite o Ano de inicio:");
            
        }while( !setAnoInicio( EntradaDeDados.lerInteiro()) );
        
        do
        {
            System.out.println("Digite o Ano Final:");
            
        }while( !setAnoFim(EntradaDeDados.lerInteiro() ) );
        /* do
        {
           System.out.println("Digite a Graduação:");
            System.out.println("Escolha:");
            System.out.println("M:mestrado");
            System.out.println("D:doutorado");
            System.out.println("E:especialização");
            
        }while(!setGraduacao(s.nextLine()));  
        */
        
    }
    public void mostrarDados()
    {
        super.mostrarDados();
        this.cursoPosGraduacao.mostrarDados();
        /*switch(this.graduacao.charAt(0))
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
        */
        System.out.println("Instituição:"+this.instituicao);
        System.out.println("Data de Inicio:"+this.AnoInicio);
        System.out.println("Data de FIm:"+this.AnoFim);
    }
    
}
