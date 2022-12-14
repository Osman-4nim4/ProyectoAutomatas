
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
public class automauno extends javax.swing.JInternalFrame {

    /**
     * Creates new form automauno
     */
    public automauno() {
        initComponents();
    }
    //Metodo de limpiar textfield
    void limpiar(){
        text1.setText("");
    }
    //Metodo para ingresar estados 
    void estados(){
        //Se utiliza un try catch para cualquier posible error
        try{     
        String e=JOptionPane.showInputDialog("Numero de Estados: ");
        nestados=Integer.parseInt(e);
        JOptionPane.showMessageDialog(null,"Numero de Estados: "+nestados);
        String t=JOptionPane.showInputDialog("Numero de Estados Finales: ");
        finalesta=new char[Integer.parseInt(t)];
        for(int i=0; i<finalesta.length; i++){
            String f=JOptionPane.showInputDialog("Estado Final "+i+": ");
            fin=fin+f;
        }
        finalesta=fin.toCharArray();
        for(int i=0; i<finalesta.length; i++){
            JOptionPane.showMessageDialog(null,"Caracter "+finalesta[i]+" ingresado");
        }}
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
        JOptionPane.showMessageDialog(null,"Tamaño del Alfabeto: "+nalfabeto);
        tablatransicion2=new int[nestados][nalfabeto];
        for(int i=0; i<nalfabeto; i++){
            String v=JOptionPane.showInputDialog("Caracter "+i+" del alfabeto:");
            v1=v1+v;
        }
        alfabeto=v1.toCharArray();
        for(int i=0; i<alfabeto.length; i++){
            JOptionPane.showMessageDialog(null,"Caracter "+alfabeto[i]+" ingresado");
        }}
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"Ocurrio un Error "+e); 
            nalfabeto=0;
            tablatransicion2=new int[0][0];
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
                tablatransicion2[ii][jj]=Integer.parseInt(r);
            }
        }
        for(int ii=0; ii<nestados; ii++){
            for(int jj=0; jj<nalfabeto; jj++){
                JOptionPane.showMessageDialog(null,"Valor en posicion["+ii+"]["+jj+"]="+tablatransicion2[ii][jj]);
            }
        }}
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"Ocurrio un Error "+e);
            contador=0;
            tablatransicion2=new int[0][0];
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
    
    //Variables a utilizar
    int contador=0;
    int nestados;
    int estadosf;
    String fin="";
    char finalesta[];
    int nalfabeto;
    char [] alfabeto;
    String v1="";
    int tablatransicion2 [][];
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

        labcadena = new javax.swing.JLabel();
        text1 = new javax.swing.JTextField();
        labestado = new javax.swing.JLabel();
        textEstado = new javax.swing.JTextField();
        laberror = new javax.swing.JLabel();
        textError = new javax.swing.JTextField();
        labaf = new javax.swing.JLabel();
        labimagen = new javax.swing.JLabel();
        btnestados = new javax.swing.JButton();
        btnalfabeto = new javax.swing.JButton();
        btntabla = new javax.swing.JButton();
        btnevaluar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Automata Finito Uno");

        labcadena.setText("Ingresar Cadena: ");

        labestado.setText("Estado de Aceptacion: ");

        textEstado.setEditable(false);

        laberror.setText("Error: ");

        textError.setEditable(false);

        labaf.setText("Automata Finito a Resolver: ");

        labimagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Multimedia/afuno.jpg"))); // NOI18N

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

        btntabla.setText("Agregar Tabla/Transicion");
        btntabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btntablaMouseClicked(evt);
            }
        });

        btnevaluar.setText("Evaluar Cadena");
        btnevaluar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnevaluarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(labimagen))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(laberror)
                        .addGap(29, 29, 29)
                        .addComponent(textError, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnevaluar)
                                .addGap(60, 60, 60)
                                .addComponent(btnestados))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labcadena)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(text1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(labaf)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labestado)
                                .addGap(18, 18, 18)
                                .addComponent(textEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(btnalfabeto))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(btntabla)))))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labcadena)
                    .addComponent(text1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btntabla))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnestados)
                    .addComponent(btnalfabeto)
                    .addComponent(btnevaluar))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labestado)
                    .addComponent(textEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textError, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(laberror))
                .addGap(50, 50, 50)
                .addComponent(labaf)
                .addGap(29, 29, 29)
                .addComponent(labimagen)
                .addGap(29, 29, 29))
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
        else{JOptionPane.showMessageDialog(null,"Faltan Ingresar Los Estados");}
    }//GEN-LAST:event_btnalfabetoMouseClicked

    private void btntablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btntablaMouseClicked
        // TODO add your handling code here:
        //Verifca que se ingreso el alfabeto antes de ingresar la tabla de transicion
        if(nalfabeto!=0){datostransicion();}
        else{JOptionPane.showMessageDialog(null,"Falta Ingresar El Alfabeto");}
    }//GEN-LAST:event_btntablaMouseClicked

    private void btnevaluarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnevaluarMouseClicked
        // TODO add your handling code here:
        //Aqui nos encontramos con el codigo que se ejecuta al momento de evaluar una cadena
        //Inicializamos est en 0 por que en este af empieza en el estado 0
        est=0; 
        //Verificamos que se halla ingresado correctamente la tabla de transicion
        if(text1.getText().length()==0 || contador==0){JOptionPane.showMessageDialog(null,"Falta Ingresar Algunas Cosas");}
        else{   
            //Codigo para evaluar la cadena
            cad=text1.getText().toCharArray(); 
            salestado=new int[cad.length+1];
            salestado[0]=0;
            //Este ciclo recorre todo la cadena para evaluarla
            for(int i=0; i<cad.length; i++){
                switch(cad[i]){
                    case 'a':
                        if(tablatransicion2[est][obtenerposicionletra(cad[i])]==1){
                            est=tablatransicion2[est][obtenerposicionletra(cad[i])];
                            bandera=true;
                            salestado[i+1]=est;
                        }
                        else{
                            textError.setText("No Cumple la Tabla de Transicion");
                            bandera=false;                                                      
                        }
                        break;
                    case 'b':
                        if(tablatransicion2[est][obtenerposicionletra(cad[i])]==0){  
                            est=tablatransicion2[est][obtenerposicionletra(cad[i])];
                            bandera=true;
                            salestado[i+1]=est;
                        }
                        else{
                            textError.setText("No Cumple la Tabla de Transicion");
                            bandera=false;                            
                        }
                        break;
                    
                    default: bandera=false; textError.setText("Caracter NO Aceptado"); salestado[i+1]=2;
                }
                if(bandera==false){i=100; textEstado.setText("NO Aceptado");}
            }
            //Verificamos el estado final sea correcto
            if(cad[cad.length-1]=='b'){
                bandera=false; textEstado.setText("NO Aceptado");
                textError.setText("Estado de Aceptacion");}
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnalfabeto;
    private javax.swing.JButton btnestados;
    private javax.swing.JButton btnevaluar;
    private javax.swing.JButton btntabla;
    private javax.swing.JLabel labaf;
    private javax.swing.JLabel labcadena;
    private javax.swing.JLabel laberror;
    private javax.swing.JLabel labestado;
    private javax.swing.JLabel labimagen;
    private javax.swing.JTextField text1;
    private javax.swing.JTextField textError;
    private javax.swing.JTextField textEstado;
    // End of variables declaration//GEN-END:variables
}
