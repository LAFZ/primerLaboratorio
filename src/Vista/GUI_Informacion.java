
package Vista;

import Controlador.Controlador_FRM_RegistroVehiculos;


public class GUI_Informacion extends javax.swing.JPanel {

    Controlador_FRM_RegistroVehiculos controlador;
    public GUI_Informacion() {
        initComponents();
    }
    
    public void agregarEventos(Controlador_FRM_RegistroVehiculos controlador){
        this.controlador=controlador;
    }
    public void colocarNumeroDeRegistro(String numeroDeRegistro){
        this.jt_NumeroDeRegistro.setText(numeroDeRegistro);
    }
    public String devolverNumeroDeRegistro(){
        return this.jt_NumeroDeRegistro.getText();
    }
    public String devolverNombreDelDueno(){
        return this.jt_NombreDelDueno.getText();
    }
    public String devolverCedulaDelDueno(){
        return this.jt_CedulaDelDueno.getText();
    }
    public String devolverPlacaDelVehiculo(){
        return this.jt_PlacaDelVehiculo.getText();
    }
    
    public void mostrarInformacion(String[] arreglo){
        this.jt_NombreDelDueno.setText(arreglo[0]);
        this.jt_CedulaDelDueno.setText(arreglo[1]);
        this.jt_PlacaDelVehiculo.setText(arreglo[2]);
    }
    public void limpiar(){
        this.jt_CedulaDelDueno.setText("");
        this.jt_NombreDelDueno.setText("");
        this.jt_NumeroDeRegistro.setText("");
        this.jt_PlacaDelVehiculo.setText("");
    }
    public void deshabilitarNumeroDeRegistro(){
        this.jt_NumeroDeRegistro.setEnabled(false);
    }
    public void habilitarAgregar(){
        this.jt_NumeroDeRegistro.setEnabled(false);
        this.jt_NombreDelDueno.setEnabled(true);
        this.jt_CedulaDelDueno.setEnabled(true);
        this.jt_PlacaDelVehiculo.setEnabled(true);
    }
    public void habilitarOpciones(){
        this.jt_NumeroDeRegistro.setEnabled(false);
        this.jt_NombreDelDueno.setEnabled(true);
        this.jt_CedulaDelDueno.setEnabled(true);
        this.jt_PlacaDelVehiculo.setEnabled(true);
    }
    public void estadoInicial(){
        this.jt_NumeroDeRegistro.setEnabled(true);
        this.jt_NombreDelDueno.setEnabled(false);
        this.jt_CedulaDelDueno.setEnabled(false);
        this.jt_PlacaDelVehiculo.setEnabled(false);
    }
    public String[] devolverInformacion(){
        String arreglo[];
        arreglo =new String[4];
        arreglo[0]=this.jt_NumeroDeRegistro.getText();
        arreglo[1]=this.jt_NombreDelDueno.getText();
        arreglo[2]=this.jt_CedulaDelDueno.getText();
        arreglo[3]=this.jt_PlacaDelVehiculo.getText();
        return arreglo;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jt_PlacaDelVehiculo = new javax.swing.JTextField();
        jt_CedulaDelDueno = new javax.swing.JTextField();
        jt_NombreDelDueno = new javax.swing.JTextField();
        jt_NumeroDeRegistro = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Número de registro");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jLabel3.setText("Nombre del dueño");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        jLabel4.setText("Cédula del Dueño");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        jLabel5.setText("Placa del vehiculos");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));
        add(jt_PlacaDelVehiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, 210, -1));
        add(jt_CedulaDelDueno, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, 210, -1));
        add(jt_NombreDelDueno, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, 210, -1));

        jt_NumeroDeRegistro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jt_NumeroDeRegistroKeyPressed(evt);
            }
        });
        add(jt_NumeroDeRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, 210, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondo 2.png"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jt_NumeroDeRegistroKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jt_NumeroDeRegistroKeyPressed
    if(evt.getKeyCode()==10){
        controlador.buscar();
    }
    }//GEN-LAST:event_jt_NumeroDeRegistroKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jt_CedulaDelDueno;
    private javax.swing.JTextField jt_NombreDelDueno;
    private javax.swing.JTextField jt_NumeroDeRegistro;
    private javax.swing.JTextField jt_PlacaDelVehiculo;
    // End of variables declaration//GEN-END:variables
}
