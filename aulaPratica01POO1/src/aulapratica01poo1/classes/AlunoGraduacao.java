/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulapratica01poo1.classes;

import aulapratica01poo1.abstratos.Aluno;
import java.io.Serializable;

/**
 *
 * @author vinic
 */
public class AlunoGraduacao extends Aluno implements Serializable{
    private CursoGraduacao cursoGraduacao;

    public CursoGraduacao getCursoGraduacao() {
        return cursoGraduacao;
    }
    
    public AlunoGraduacao()
    {
        
    }
    
    public AlunoGraduacao(CursoGraduacao cursoGraduacao)
    {
        this.cursoGraduacao=cursoGraduacao;
    }

    public void setCursoGraduacao(CursoGraduacao cursoGraduacao) {
        this.cursoGraduacao = cursoGraduacao;
    }
    
    public void lerDados()
    {
        super.lerDados();
        this.cursoGraduacao = new CursoGraduacao();
        this.cursoGraduacao.lerDados();
    }
    public void mostrarDados()
    {
        super.mostrarDados();
        cursoGraduacao.mostrarDados();
    }
    
    public void SalvarDados()
    {
        
        
        
    }
    
}
    