/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulapratica01poo1.layout.listar;

import aulapratica01poo1.classes.Coordenador;
import aulapratica01poo1.dados.DadosCoordenador;
import aulapratica01poo1.layout.main;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Eric
 */
public class ListarCoordenador extends javax.swing.JFrame {

    /**
     * Creates new form ListarCoordenador
     */
    public ListarCoordenador() {
        initComponents();
        listar();
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
        Excluir = new javax.swing.JButton();
        Alternar = new javax.swing.JButton();
        Atualizar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TabelaCoordenador = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        Excluir.setText("Excluir");
        Excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExcluirActionPerformed(evt);
            }
        });

        Alternar.setText("Alternar");
        Alternar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AlternarActionPerformed(evt);
            }
        });

        Atualizar.setText("Atualizar");
        Atualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AtualizarActionPerformed(evt);
            }
        });

        TabelaCoordenador.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Nome", "CPF", "Endereço", "Telefone", "CTPS", "Salario", "Piso Salarial", "Cargo", "Departamento", "Salário Base", "Valor Hora Extra", "Quantidade Hora Extra"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Double.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        TabelaCoordenador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabelaCoordenadorMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TabelaCoordenador);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Excluir)
                        .addGap(34, 34, 34)
                        .addComponent(Alternar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 279, Short.MAX_VALUE)
                        .addComponent(Atualizar)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Excluir)
                    .addComponent(Alternar)
                    .addComponent(Atualizar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(105, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExcluirActionPerformed
        // TODO add your handling code here:
        if(DadosCoordenador.excluir(TabelaCoordenador.getSelectedRow()))
        {
            JOptionPane.showMessageDialog(null, "Excluido com sucesso!");
            
            listar();
        }else
        {
            JOptionPane.showMessageDialog(null, "Não existe registro selecionado!");
        }
    }//GEN-LAST:event_ExcluirActionPerformed

    private void AlternarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AlternarActionPerformed
        // TODO add your handling code here:
        int index = TabelaCoordenador.getSelectedRow();
        
        
        if(index > - 1)
        {
            
            int erros = 0;
           
            Coordenador c = DadosCoordenador.getDados().get(index);
            tirrarColorError();
            
            String nome                         =   (String)TabelaCoordenador.getValueAt(index, 0);
            String CPF                          =   (String)TabelaCoordenador.getValueAt(index, 1);
            String endereco                     =   (String)TabelaCoordenador.getValueAt(index, 2);
            String telefone                     =   (String)TabelaCoordenador.getValueAt(index, 3);
            String ctps                         =   (String)TabelaCoordenador.getValueAt(index, 4);
            double salario                      =   (double)TabelaCoordenador.getValueAt(index, 5);
            double pisoSalarial                 =   (double)TabelaCoordenador.getValueAt(index, 6);
            String cargo                        =   (String)TabelaCoordenador.getValueAt(index, 7);
            String departamento                 =   (String)TabelaCoordenador.getValueAt(index, 8);
            double salarioBase                  =   (double)TabelaCoordenador.getValueAt(index, 9);
            double valorHoraExtra               =   (double)TabelaCoordenador.getValueAt(index, 10);
            double quantidadeHoraExtra          =   (double)TabelaCoordenador.getValueAt(index, 11);
            
            if(!c.setNome(nome)){erros++;ColocarColorError();}
            if(!c.setCpf(CPF)&&erros==0){erros++;ColocarColorError();}
            if(!c.setEndereco(endereco)&&erros==0){erros++;ColocarColorError();}
            if(!c.setTelefone(endereco)&&erros==0){erros++;ColocarColorError();}
            if(!c.setCtps(ctps)&&erros==0){erros++;ColocarColorError();}
            if(!c.setSalario(salario)&&erros==0){erros++;ColocarColorError();}
            if(!c.setPisoSalarial(pisoSalarial)&&erros==0){erros++;ColocarColorError();}
            if(!c.setCargo(cargo)&&erros==0){erros++;ColocarColorError();}
            if(!c.setDepartamento(departamento)&&erros==0){erros++;ColocarColorError();}
            if(!c.setSalarioBase(salarioBase)&&erros==0){erros++;ColocarColorError();}
            if(!c.setValorHoraExtra(valorHoraExtra)&&erros==0){erros++;ColocarColorError();}
            if(!c.setQuantidadeHoraExtra(quantidadeHoraExtra)&&erros==0){erros++;ColocarColorError();}
            
            
            
            if(erros == 0)
            {
                      
                DadosCoordenador.salvar();    
                listar();                 
                JOptionPane.showMessageDialog(null, "Dados alterados com sucess.");
            
            }   
            
            
        }else
        {
            JOptionPane.showMessageDialog(null, "Selecionar uma linha.");
        }
        
        
       
    }//GEN-LAST:event_AlternarActionPerformed

    private void AtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AtualizarActionPerformed
        // TODO add your handling code here:
        listar();
    }//GEN-LAST:event_AtualizarActionPerformed

    private void TabelaCoordenadorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabelaCoordenadorMouseClicked
        // TODO add your handling code here:
        tirrarColorError();
    }//GEN-LAST:event_TabelaCoordenadorMouseClicked

     public void listar()
     {
       
       DefaultTableModel modelo = (DefaultTableModel)TabelaCoordenador.getModel();       
       modelo.setRowCount(0);
       
        for(Coordenador c : DadosCoordenador.getDados() )
        {
            modelo.addRow(new Object[]{
                c.getNome(),
                c.getCPF(),
                c.getEndereco(),
                c.getTelefone(),
                c.getCtps(),
                c.getSalario(),
                c.getPisoSalarial(),
                c.getCargo(),
                c.getDepartamento(),
                c.getSalarioBase(),
                c.getValorHoraExtra(),
                c.getQuantidadeHoraExtra()
                
            
            });
        }
     }
    
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
            java.util.logging.Logger.getLogger(ListarCoordenador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListarCoordenador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListarCoordenador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListarCoordenador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListarCoordenador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Alternar;
    private javax.swing.JButton Atualizar;
    private javax.swing.JButton Excluir;
    private javax.swing.JTable TabelaCoordenador;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables


     private void tirrarColorError() {
        Color color=new Color(51,153,255);
        TabelaCoordenador.setSelectionBackground(color);
    }
     private void ColocarColorError() {        
        TabelaCoordenador.setSelectionBackground(main.colorError);
    }
}
