/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulapratica01poo1.layout.adicionar;

import aulapratica01poo1.dados.DadosProfessor;
import aulapratica01poo1.classes.Professor;
import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author vinic
 */
public class AdicionarProfessor extends javax.swing.JFrame {

    /**
     * Creates new form AdicionarProfessor
     */
    public AdicionarProfessor() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        nome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        cpf = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        endereco = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        telefone = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        ctps = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        salario = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        areaDePesquisa = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        horasAulas = new javax.swing.JTextField();
        valorHoraAula = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jPanelTitulacao = new javax.swing.JPanel();
        jRadioMestre = new javax.swing.JRadioButton();
        jRadioDoutor = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel2.setText("Nome:");

        jLabel3.setText("CPF:");

        jLabel4.setText("Endereço:");

        jLabel5.setText("Telefone:");

        jLabel6.setText("CTPS");

        jLabel7.setText("Salario:");

        jLabel8.setText("Area de Pesquisa:");

        jLabel9.setText("Horas Aulas:");

        jLabel10.setText("Valor hora aula");

        jButton1.setText("Cadastrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel11.setText("Titulação:");

        jRadioMestre.setText("Mestre");

        jRadioDoutor.setText("Doutor");
        jRadioDoutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioDoutorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelTitulacaoLayout = new javax.swing.GroupLayout(jPanelTitulacao);
        jPanelTitulacao.setLayout(jPanelTitulacaoLayout);
        jPanelTitulacaoLayout.setHorizontalGroup(
            jPanelTitulacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTitulacaoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jRadioMestre)
                .addGap(50, 50, 50)
                .addComponent(jRadioDoutor)
                .addContainerGap())
        );
        jPanelTitulacaoLayout.setVerticalGroup(
            jPanelTitulacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTitulacaoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelTitulacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioMestre)
                    .addComponent(jRadioDoutor))
                .addContainerGap())
        );

        jLabel1.setText("Adicionar Professor:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(66, 66, 66)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 457, Short.MAX_VALUE)
                            .addComponent(cpf)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(48, 48, 48)
                        .addComponent(endereco))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(51, 51, 51)
                        .addComponent(telefone))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(72, 72, 72)
                        .addComponent(ctps))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(areaDePesquisa)
                            .addComponent(salario)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(36, 36, 36)
                        .addComponent(horasAulas))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 236, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(0, 237, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(valorHoraAula)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanelTitulacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(endereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(telefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(ctps, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(salario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(areaDePesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(horasAulas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(valorHoraAula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(jPanelTitulacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 136, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 594, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 497, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(20, 20, 20)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioDoutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioDoutorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioDoutorActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        //variaveis de controle
        int erros=0;
        Color colorError= new Color(255, 77, 77);
        
        //tirrar color error anterior
        tirrarColorError();
        
        //armazenando dados em variaveis locais
        String nome=this.nome.getText();
        String cpf=this.cpf.getText();
        String endereco=this.endereco.getText();
        String telefone=this.telefone.getText();
        String ctps=this.ctps.getText();
        double salario=0;
        String areaDePesquisa=this.areaDePesquisa.getText();
        int horasAulas=0;
        double valorHorasAulas=0;
        String titulacao="";
        
        //filtar dados
            
            //salario to double
            try
            {
                salario=Double.parseDouble(this.salario.getText());                
            }catch(Exception e)
            {
                erros++;
                this.salario.setBackground(colorError);
            }
            //horas aulas to int
            try
            {
                horasAulas=Integer.parseInt(this.horasAulas.getText());            
            }catch(Exception e)
            {
                erros++;
                this.horasAulas.setBackground(colorError);
            }
        
            //valor horas aulas to double
            try
            {
                valorHorasAulas=Double.parseDouble(this.valorHoraAula.getText());                
            }catch(Exception e)
            {
                erros++;
                this.valorHoraAula.setBackground(colorError);
            }
            //get titulação
            if(this.jRadioMestre.isSelected())titulacao="Mestre";
            else if(this.jRadioDoutor.isSelected())titulacao="Doutor";
            else
            {
                erros++;
                this.jPanelTitulacao.setBackground(colorError);
            }
            
        //criando classes professor e armazenando os dados
        
        Professor prof = new Professor();
        
            //sets com verrificação
            if(!prof.setNome(nome)){erros++;this.nome.setBackground(colorError);}
            if(!prof.setCpf(cpf)){erros++;this.cpf.setBackground(colorError);}
            if(!prof.setEndereco(endereco)){erros++;this.endereco.setBackground(colorError);}
            if(!prof.setTelefone(telefone)){erros++;this.telefone.setBackground(colorError);}
            if(!prof.setCtps(ctps)){erros++;this.ctps.setBackground(colorError);}
            if(!prof.setAreaDePesquisa(areaDePesquisa)){erros++;this.areaDePesquisa.setBackground(colorError);}
            //sets sem verrifcação
            prof.setSalario(salario);
            prof.setNumeroHorasAula(horasAulas);
            prof.setValorHoraAula(valorHorasAulas);
            prof.setTitulo(titulacao);
            
        //armazena
        if(erros==0)
        {
            DadosProfessor.cadastrar(prof);
            JOptionPane.showMessageDialog(null,"Professor cadastrador com sucesso.");
        }
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AdicionarProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdicionarProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdicionarProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdicionarProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdicionarProfessor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField areaDePesquisa;
    private javax.swing.JTextField cpf;
    private javax.swing.JTextField ctps;
    private javax.swing.JTextField endereco;
    private javax.swing.JTextField horasAulas;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelTitulacao;
    private javax.swing.JRadioButton jRadioDoutor;
    private javax.swing.JRadioButton jRadioMestre;
    private javax.swing.JTextField nome;
    private javax.swing.JTextField salario;
    private javax.swing.JTextField telefone;
    private javax.swing.JTextField valorHoraAula;
    // End of variables declaration//GEN-END:variables

    private void tirrarColorError() {
        
        this.areaDePesquisa.setBackground(Color.white);
        this.cpf.setBackground(Color.white);
        this.ctps.setBackground(Color.white);
        this.endereco.setBackground(Color.white);
        this.horasAulas.setBackground(Color.white);
        this.jPanelTitulacao.setBackground(Color.white);
        this.nome.setBackground(Color.white);
        this.salario.setBackground(Color.white);
        this.telefone.setBackground(Color.white);
        this.valorHoraAula.setBackground(Color.white);
    }
}
