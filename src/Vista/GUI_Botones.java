
package Vista;

import Controlador.Controlador_FRM_RegistroVehiculos;


public class GUI_Botones extends javax.swing.JPanel {

    Controlador_FRM_RegistroVehiculos controlador;
    public GUI_Botones() {
        initComponents();
    }
public void agregarEventos(Controlador_FRM_RegistroVehiculos controlador){
    this.controlador=controlador;
    this.jb_Consultar.addActionListener(controlador);
    this.jb_Agregar.addActionListener(controlador);
    this.jb_Modificar.addActionListener(controlador);
    this.jb_Eliminar.addActionListener(controlador);
}
public void estadoInicial(){
    this.jb_Consultar.setEnabled(true);
    this.jb_Agregar.setEnabled(false);
    this.jb_Modificar.setEnabled(false);
    this.jb_Eliminar.setEnabled(false);
}
public void habilitarAgregar(){
    this.jb_Agregar.setEnabled(true);
}
public void habilitarOpciones(){
    this.jb_Consultar.setEnabled(true);
    this.jb_Agregar.setEnabled(false);
    this.jb_Modificar.setEnabled(true);
    this.jb_Eliminar.setEnabled(true);
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jb_Consultar = new javax.swing.JButton();
        jb_Agregar = new javax.swing.JButton();
        jb_Modificar = new javax.swing.JButton();
        jb_Eliminar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jb_Consultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Consultar1.png"))); // NOI18N
        jb_Consultar.setActionCommand("Consultar");
        add(jb_Consultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jb_Agregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/agregar.png"))); // NOI18N
        jb_Agregar.setActionCommand("Agregar");
        add(jb_Agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, -1, -1));

        jb_Modificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Modificar.png"))); // NOI18N
        jb_Modificar.setActionCommand("Modificar");
        add(jb_Modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, -1, -1));

        jb_Eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Eliminar.png"))); // NOI18N
        jb_Eliminar.setActionCommand("Eliminar");
        add(jb_Eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 20, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondo 2.png"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton jb_Agregar;
    private javax.swing.JButton jb_Consultar;
    private javax.swing.JButton jb_Eliminar;
    private javax.swing.JButton jb_Modificar;
    // End of variables declaration//GEN-END:variables
}
