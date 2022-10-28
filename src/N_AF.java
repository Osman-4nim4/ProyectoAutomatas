
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
public class N_AF extends javax.swing.JInternalFrame {

    /**
     * Creates new form N_AF
     */
    public N_AF() {
        initComponents();
    }
    //Metodo de limpiar textfield
    void limpiar(){
        textcadena.setText("");
    }
    //Metodo limpiar variables
    void limpiarvariables(){
        nestados=0;
        finalesta=new char[0];
        fin="";
        nalfabeto=0;
        tablatransicion1=new int[0][0];
        v1="";
        alfabeto=new char[0];
        contador=0;
        tablatransicion1=new int[0][0];
        btnestados.setEnabled(true);
        btnalfabeto.setEnabled(true);
        btntablatransicion.setEnabled(true);
    }
     //Metodo para ingresar estados 
     void estados(){ 
        //Se utiliza un try catch para cualquier posible error 
        try{     
        String e=JOptionPane.showInputDialog("Numero de Estados: ");
        nestados=Integer.parseInt(e);
        String t=JOptionPane.showInputDialog("Numero de Estados Finales: ");
        finalesta=new char[Integer.parseInt(t)];
        for(int i=0; i<finalesta.length; i++){
            String f=JOptionPane.showInputDialog("Estado Final "+i+": ");
            fin=fin+f;
        }
        finalesta=fin.toCharArray();
        for(int i=0; i<finalesta.length; i++){
            JOptionPane.showMessageDialog(null,"Caracter "+finalesta[i]+" ingresado");
        }
        btnestados.setEnabled(false);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"Ocurrio un Error "+e); 
            nestados=0;
            finalesta=new char[0];
            fin="";
        }
    }
    //Metodo para ingresar el alfabeto
    void alfabeto(){
        //Se utiliza un try catch para cualquier posible error
        try{
        String a=JOptionPane.showInputDialog("Tamaño del Alfabeto: ");
        nalfabeto=Integer.parseInt(a);
        tablatransicion1=new int[nestados][nalfabeto];
        for(int i=0; i<nalfabeto; i++){
            String v=JOptionPane.showInputDialog("Caracter "+i+" del alfabeto:");
            v1=v1+v;
        }
        alfabeto=v1.toCharArray();
        for(int i=0; i<alfabeto.length; i++){
            JOptionPane.showMessageDialog(null,"Caracter "+alfabeto[i]+" ingresado");
        }
        btnalfabeto.setEnabled(false);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"Ocurrio un Error "+e); 
            nalfabeto=0;
            tablatransicion1=new int[0][0];
            v1="";
            alfabeto=new char[0];
        }
    }
    //Metodo para ingresar la tabla de transicion
    void datostransicion(){
        //Se utiliza un try catch para cualquier posible error
        try{
        contador=1;
        for(int ii=0; ii<nestados; ii++){
            for(int jj=0; jj<nalfabeto; jj++){
                String r=JOptionPane.showInputDialog("Ingrese el valor de la tabla de transicion en["+ii+"]["+jj+"]");
                tablatransicion1[ii][jj]=Integer.parseInt(r);
            }
        }
        for(int ii=0; ii<nestados; ii++){
            for(int jj=0; jj<nalfabeto; jj++){
                JOptionPane.showMessageDialog(null,"Valor en posicion["+ii+"]["+jj+"]="+tablatransicion1[ii][jj]);
            }
        }
        btntablatransicion.setEnabled(false);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"Ocurrio un Error "+e);
            contador=0;
            tablatransicion1=new int[0][0];
        }
    } 
    //Metodo para obtener la posicion de la letra
    public int obtenerposicionletra(char n){
        int posicion=0;
        for(int i=0; i<alfabeto.length; i++){
            if(alfabeto[i]==n){ posicion=i; }
        }
        return posicion;        
    }
    //Metodo para obtener la letra
    public char obtenerletra(char n){
        char e=' ';
        for(int i=0; i<alfabeto.length; i++){
            if(alfabeto[i]==n){ e=alfabeto[i]; }
        }
        return e;
    }
    //Metodo para verificar los estados finales
    public int obteneref(int n){
        int ef=-1;
        String s="";
        s=s+Integer.toString(n);
        char [] ff=s.toCharArray();
        for(int i=0; i<finalesta.length; i++){
            if(finalesta[i]==ff[0]){ 
                String f="";
                f=f+finalesta[i];
                ef=Integer.parseInt(f);
            }
        }
        return ef;
    }    
    
    //Variables a utilizar
    int contador=0;
    int nestados;
    int estadosf;
    String fin="";
    char finalesta[];
    int nalfabeto;
    char [] alfabeto;
    String v1="";
    int tablatransicion1[][];
    int salestado[];
    
    boolean bandera;
    int est;
    char []cad;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        textcadena = new javax.swing.JTextField();
        btntablatransicion = new javax.swing.JButton();
        btnevaluar = new javax.swing.JButton();
        btnestados = new javax.swing.JButton();
        btnalfabeto = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        textEstado = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        textError = new javax.swing.JTextField();
        btnlimpiar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("N AF");

        jLabel1.setText("Cadena: ");

        btntablatransicion.setText("Agregar Tabla/Transicion");
        btntablatransicion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btntablatransicionMouseClicked(evt);
            }
        });

        btnevaluar.setText("Evaluar Cadena");
        btnevaluar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnevaluarMouseClicked(evt);
            }
        });

        btnestados.setText("Estados");
        btnestados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnestadosMouseClicked(evt);
            }
        });

        btnalfabeto.setText("Alfabeto");
        btnalfabeto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnalfabetoMouseClicked(evt);
            }
        });

        jLabel2.setText("Estado de Aceptacion: ");

        textEstado.setEditable(false);

        jLabel3.setText("Error:");

        textError.setEditable(false);

        btnlimpiar.setText("Valores Nuevos");
        btnlimpiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnlimpiarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(btnevaluar)
                .addGap(54, 54, 54)
                .addComponent(btnestados)
                .addGap(59, 59, 59)
                .addComponent(btnalfabeto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addComponent(btnlimpiar)
                .addGap(36, 36, 36))
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(textEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(textcadena, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(btntablatransicion))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(textError, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(textcadena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btntablatransicion))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnevaluar)
                    .addComponent(btnalfabeto)
                    .addComponent(btnlimpiar)
                    .addComponent(btnestados))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(textEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(textError, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnestadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnestadosMouseClicked
        // TODO add your handling code here:
        //Llama al metodo estados
        estados();
    }//GEN-LAST:event_btnestadosMouseClicked

    private void btnalfabetoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnalfabetoMouseClicked
        // TODO add your handling code here:
        //Verifica que se hallan ingresado estados antes de agregar alfabetos
        if(nestados!=0){alfabeto();}
        else{JOptionPane.showMessageDialog(null,"Falta ingresar Estados!!");}
    }//GEN-LAST:event_btnalfabetoMouseClicked

    private void btntablatransicionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btntablatransicionMouseClicked
        // TODO add your handling code here:
        //Verifca que se ingreso el alfabeto antes de ingresar la tabla de transicion
        if(nalfabeto!=0){datostransicion();}
        else{JOptionPane.showMessageDialog(null,"Falta ingresar Alfabeto");}
    }//GEN-LAST:event_btntablatransicionMouseClicked

    private void btnevaluarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnevaluarMouseClicked
        // TODO add your handling code here:
        //Aqui nos encontramos con el codigo que se ejecuta al momento de evaluar una cadena
        //Inicializamos est en 0 ,textEstado con nada y textError con nada
        textEstado.setText("");
        textError.setText("");
        est=0;
        //Verificamos que se halla ingresado correctamente la tabla de transicion
        if(textcadena.getText().length()==0 || contador==0){JOptionPane.showMessageDialog(null,"Falta Ingresar Algunas Cosas");}
        else{
            //Codigo para evaluar la cadena
            cad=textcadena.getText().toCharArray(); 
            salestado=new int[cad.length+1];
            salestado[0]=0;
            //Este ciclo recorre todo la cadena para evaluarla
            for(int i=0; i<cad.length; i++){                
                    if(cad[i]==obtenerletra(cad[i])){
                        est=tablatransicion1[est][obtenerposicionletra(cad[i])];
                        bandera=true;
                        salestado[i+1]=est; 
                    }
                    else{
                        textEstado.setText("No Aceptado");
                        textError.setText("Caracter No Aceptado");
                        est=99;
                        salestado[i+1]=est;
                        bandera=false;
                        break;                        
                    }
            }
           //Verificamos el estado final sea correcto
           if(bandera!=false){
               if(est==obteneref(est)){
                   bandera=true;
               }
               else{
                   bandera=false;
                   textEstado.setText("NO Aceptado");
                   textError.setText("Estado de Aceptacion");
               }   
           } 
            //Se imprime lo siguiente si no hubo ningun problema en la cadena
            if(bandera==true){textEstado.setText("Aceptado"); 
            textError.setText("Ninguno");}
        //En este ciclo se imprime los cambios que existierion en el estado
        for(int i=0; i<salestado.length; i++){
            JOptionPane.showMessageDialog(null,"Estado "+salestado[i]);
        }
        }
        //Llamamos al metodo limpiar
        limpiar();
    }//GEN-LAST:event_btnevaluarMouseClicked

    private void btnlimpiarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnlimpiarMouseClicked
        // TODO add your handling code here:
        //Llamar el metodo limpiar variables
        limpiarvariables();
    }//GEN-LAST:event_btnlimpiarMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnalfabeto;
    private javax.swing.JButton btnestados;
    private javax.swing.JButton btnevaluar;
    private javax.swing.JButton btnlimpiar;
    private javax.swing.JButton btntablatransicion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField textError;
    private javax.swing.JTextField textEstado;
    private javax.swing.JTextField textcadena;
    // End of variables declaration//GEN-END:variables
}
