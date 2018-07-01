

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulapratica01poo1.layout.listar;

import aulapratica01poo1.classes.Professor;
import aulapratica01poo1.dados.DadosProfessor;
import aulapratica01poo1.layout.main;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author bruni
 */
public class ListarProfessor extends javax.swing.JFrame {

    /**
     * Creates new form ListarCursoGrauacao
     */
    public ListarProfessor() {
        initComponents();
        mostrarDadosTabela(TabelaListarProfessor);
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
        BotaoExcluir = new javax.swing.JButton();
        BotaoAlterar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TabelaListarProfessor = new javax.swing.JTable();
        BotãoAtualizar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        BotaoExcluir.setText("Excluir");
        BotaoExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoExcluirActionPerformed(evt);
            }
        });

        BotaoAlterar.setText("Alterar");
        BotaoAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoAlterarActionPerformed(evt);
            }
        });

        TabelaListarProfessor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Nome", "CPF", "Endereço", "Telefone", "CTPS", "Salário", "Titulo", "Area de Pesquisa", "Numero de HorasAula", "Valor da HoraAula"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        TabelaListarProfessor.setColumnSelectionAllowed(true);
        TabelaListarProfessor.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(TabelaListarProfessor);
        TabelaListarProfessor.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        BotãoAtualizar.setText("Atualizar");
        BotãoAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotãoAtualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(BotaoExcluir)
                        .addGap(31, 31, 31)
                        .addComponent(BotaoAlterar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BotãoAtualizar)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotaoExcluir)
                    .addComponent(BotaoAlterar)
                    .addComponent(BotãoAtualizar))
                .addGap(69, 69, 69)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(129, Short.MAX_VALUE))
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

    private void BotaoExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoExcluirActionPerformed
        
         if(TabelaListarProfessor.getSelectedRow() > -1)
        {
            DadosProfessor.excluir(TabelaListarProfessor.getSelectedRow());           
            mostrarDadosTabela(TabelaListarProfessor);
            JOptionPane.showMessageDialog(null, "Excluido com sucesso!");
        }else
            JOptionPane.showMessageDialog(null, "Não existe registro selecionado!");
          
    }//GEN-LAST:event_BotaoExcluirActionPerformed

    private void BotaoAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoAlterarActionPerformed
        // TODO add your handling code here:
           int index=TabelaListarProfessor.getSelectedRow();
        if(index>-1)
        {
            int erros=0;
            Color colorError= new Color(255, 77, 77);  
            Professor p = DadosProfessor.getDados().get(index);
            
            //variaveis
            
            ///////////////////////////////            
             
            String nome=(String)this.TabelaListarProfessor.getValueAt(TabelaListarProfessor.getSelectedRow(), 0);
            String cpf=(String)this.TabelaListarProfessor.getValueAt(TabelaListarProfessor.getSelectedRow(), 1);
            String endereco=(String)this.TabelaListarProfessor.getValueAt(TabelaListarProfessor.getSelectedRow(), 2);
            String telefone=(String)this.TabelaListarProfessor.getValueAt(TabelaListarProfessor.getSelectedRow(), 3);
            String ctps=(String)this.TabelaListarProfessor.getValueAt(TabelaListarProfessor.getSelectedRow(), 4);
            String titulo=(String)this.TabelaListarProfessor.getValueAt(TabelaListarProfessor.getSelectedRow(), 6);
            String areadepesquisa=(String)this.TabelaListarProfessor.getValueAt(TabelaListarProfessor.getSelectedRow(), 7);
            
           double salario = (double)this.TabelaListarProfessor.getValueAt(TabelaListarProfessor.getSelectedRow(), 5);
           int numerodehorasaula = (int)this.TabelaListarProfessor.getValueAt(TabelaListarProfessor.getSelectedRow(), 8);
           double valorhoraaula = (double)this.TabelaListarProfessor.getValueAt(TabelaListarProfessor.getSelectedRow(), 9);
           
           
            if(!p.setNome(nome)){erros++;ColocarColorError();}       
            if(!p.setCpf(cpf)){erros++;ColocarColorError();}       
            if(!p.setEndereco(endereco)){erros++;ColocarColorError();}       
            if(!p.setTelefone(telefone)){erros++;ColocarColorError();}       
            if(!p.setCtps(ctps)){erros++;ColocarColorError();}       
            if(!p.setTitulo(titulo)){erros++;ColocarColorError();}       
            if(!p.setAreaDePesquisa(areadepesquisa)){erros++;ColocarColorError();}       
            if(!p.setSalario(salario)){erros++;ColocarColorError();}       
            if(!p.setNumeroHorasAula(numerodehorasaula)){erros++;ColocarColorError();}       
            if(!p.setValorHoraAula(valorhoraaula)){erros++;ColocarColorError();}       
            
            
            if(erros == 0)
            {            
                
                DadosProfessor.salvar();
                mostrarDadosTabela(TabelaListarProfessor);   
                
                JOptionPane.showMessageDialog(null, "Dados alterados com sucess.");
            
            }   
            
            
        }else
        {
            JOptionPane.showMessageDialog(null, "Selecionar uma linha.");
        }
        
        
       
   
            
            
            
    }//GEN-LAST:event_BotaoAlterarActionPerformed

    private void BotãoAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotãoAtualizarActionPerformed
        mostrarDadosTabela(TabelaListarProfessor);
    }//GEN-LAST:event_BotãoAtualizarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListarProfessor().setVisible(true);
            }});
        
    }
    public void mostrarDadosTabela(JTable tabela){
      
         DefaultTableModel modelo = (DefaultTableModel)tabela.getModel();
         modelo.setRowCount(0);         
        
         
         
         for(Professor p : DadosProfessor.getDados())
         {
            
           //Convertidas
             modelo.addRow(new Object[]{
                 p.getNome(),
                 p.getCPF(),
                 p.getEndereco(),
                 p.getTelefone(),
                 p.getCtps(),
                 p.getSalario(),
                 p.getTitulo(),
                 p.getAreaDePesquisa(),
                 p.getNumeroHorasAula(),
                 p.getValorHoraAula()
             });
         }
         }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoAlterar;
    private javax.swing.JButton BotaoExcluir;
    private javax.swing.JButton BotãoAtualizar;
    private javax.swing.JTable TabelaListarProfessor;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    private void tirrarColorError() {
        Color color=new Color(51,153,255);
        TabelaListarProfessor.setSelectionBackground(color);
    }
     private void ColocarColorError() {        
        TabelaListarProfessor.setSelectionBackground(main.colorError);
    }

}
