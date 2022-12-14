
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
public class InvLC extends javax.swing.JInternalFrame {

    /**
     * Creates new form autom
     */
    public InvLC() {
        initComponents();
        limpiar();        
    }
    //Variables a utilizar
    String cad;
    boolean resultado;
    int contador;
    String cadena;
    int tamaño;
    String cad2;
    //Metodo para limpiar textfield
    void limpiar(){
        text1.setText("");
    }
      
    public static String Invertir(String caden, int tamañ){
        //Cadena de inversa
        String Inversa=""; 
        //Comparacion del tamaño de la cadena
        if(tamañ!=0){
            /*Se vuelve a llamar al metodo invertir con 
            tamaño-1 para volver a evaluar la cadena*/
            Inversa=caden.charAt(tamañ)+Invertir(caden, tamañ-1);
            return Inversa;
        }
        else{
            /*Cadena es igual a 0 por lo tanto se le asigna a
            Inversa como primer caracter*/
            Inversa+=caden.charAt(tamañ);
            return Inversa;
        }       
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jLabel1 = new javax.swing.JLabel();
        text1 = new javax.swing.JTextField();
        btninversa = new javax.swing.JButton();
        btnleercadena = new javax.swing.JButton();
        textmostrar = new javax.swing.JTextField();

        jScrollPane1.setViewportView(jTextPane1);

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Automatas");

        jLabel1.setText("Ingresa la cadena:");

        btninversa.setText("Inversa");
        btninversa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btninversaMouseClicked(evt);
            }
        });

        btnleercadena.setText("Leer Cadena");
        btnleercadena.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnleercadenaMouseClicked(evt);
            }
        });

        textmostrar.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textmostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(btninversa)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(text1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(btnleercadena)))))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(text1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btninversa)
                    .addComponent(btnleercadena))
                .addGap(26, 26, 26)
                .addComponent(textmostrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btninversaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btninversaMouseClicked
        cad2=text1.getText();
        tamaño=cad2.length()-1;
        limpiar();
        textmostrar.setText(Invertir(cad2,tamaño));
    }//GEN-LAST:event_btninversaMouseClicked

    private void btnleercadenaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnleercadenaMouseClicked
        // TODO add your handling code here:
        cad=text1.getText();
        char caden;
        int contador=0;
        String var="";
        //Ciclo que se mueve para leer una cadena
        for(int i=0; i<text1.getText().length(); i++){
            var="";
            caden=text1.getText().charAt(contador);
            var=var+caden;
            JOptionPane.showMessageDialog(null,"Caracter(s): "+var+", Posicion: "+contador);
            contador++;
        }
        JOptionPane.showMessageDialog(null,"Cadena: "+cad);
        //Llamando al metodo limpiar
        limpiar();
    }//GEN-LAST:event_btnleercadenaMouseClicked

    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btninversa;
    private javax.swing.JButton btnleercadena;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JTextField text1;
    private javax.swing.JTextField textmostrar;
    // End of variables declaration//GEN-END:variables
}
