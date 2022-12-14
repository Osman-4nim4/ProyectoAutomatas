
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author URIEL
 */
public class Escritorio extends javax.swing.JFrame {

    /**
     * Creates new form Escritorio
     */
    public Escritorio() {
        initComponents();
        this.evirtual.setBorder(new fondo());
        //Maximizar el fondo
        this.setExtendedState(Escritorio.MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        evirtual = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        MenuNuevo = new javax.swing.JMenu();
        afuno = new javax.swing.JMenuItem();
        N_AF = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        MenuSalir = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout evirtualLayout = new javax.swing.GroupLayout(evirtual);
        evirtual.setLayout(evirtualLayout);
        evirtualLayout.setHorizontalGroup(
            evirtualLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 643, Short.MAX_VALUE)
        );
        evirtualLayout.setVerticalGroup(
            evirtualLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 348, Short.MAX_VALUE)
        );

        MenuNuevo.setText("Nuevo");

        afuno.setText("Automata1");
        afuno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                afunoActionPerformed(evt);
            }
        });
        MenuNuevo.add(afuno);

        N_AF.setText("AF_D");
        N_AF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                N_AFActionPerformed(evt);
            }
        });
        MenuNuevo.add(N_AF);

        jMenuBar1.add(MenuNuevo);

        jMenu1.setText("Creadores");
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Informacion");
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu2MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu2);

        MenuSalir.setText("Salir");
        MenuSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MenuSalirMouseClicked(evt);
            }
        });
        jMenuBar1.add(MenuSalir);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(evirtual, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(evirtual)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MenuSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuSalirMouseClicked
        System.exit(0);
    }//GEN-LAST:event_MenuSalirMouseClicked

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
        // TODO add your handling code here:
        Datos_Autor aut=new Datos_Autor();
        //Hacerlo visible
        aut.setVisible(true);
        //A??adir el formulario al escritorio virtual
        this.evirtual.add(aut);
        try{
            //No maximiza el formulario
            aut.setMaximum(false); 
        }
        catch(Exception ex){
            //Mostramos en consola el error producido
            System.err.println();
        }
    }//GEN-LAST:event_jMenu1MouseClicked

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
        // TODO add your handling code here:
        Ayuda ayu=new Ayuda();
        //Hacerlo visible
        ayu.setVisible(true);
        //A??adir el formulario al escritorio virtual
        this.evirtual.add(ayu);
        try{
            //No maximiza el formulario
            ayu.setMaximum(false); 
        }
        catch(Exception ex){
            //Mostramos en consola el error producido
            System.err.println();
        }
    }//GEN-LAST:event_jMenu2MouseClicked

    private void N_AFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_N_AFActionPerformed
        // TODO add your handling code here:
        N_AF naf=new N_AF();
        //Hacerlo visible
        naf.setVisible(true);
        //A??adir el formulario al escritorio virtual
        this.evirtual.add(naf);
        try{
            //No maximiza el formulario
            naf.setMaximum(false);
        }
        catch(Exception ex){
            //Mostramos en consola el error producido
            System.err.println();
        }
    }//GEN-LAST:event_N_AFActionPerformed

    private void afunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_afunoActionPerformed
        //JOptionPane.showMessageDialog(null,"Automata Finito /n Letras Aceptadas (a,b)");
        automauno uno=new automauno();
        //Hacerlo visible
        uno.setVisible(true);
        //A??adir el formulario al escritorio virtual
        this.evirtual.add(uno);
        try{
            /*No maximiza el formulario*/
            uno.setMaximum(false);
        }
        catch(Exception ex){
            //Mostramos en consola el error producido
            System.err.println();
        }
    }//GEN-LAST:event_afunoActionPerformed

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
            java.util.logging.Logger.getLogger(Escritorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Escritorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Escritorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Escritorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Escritorio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu MenuNuevo;
    private javax.swing.JMenu MenuSalir;
    private javax.swing.JMenuItem N_AF;
    private javax.swing.JMenuItem afuno;
    private javax.swing.JDesktopPane evirtual;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
