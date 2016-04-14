/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.MetodosVehiculos;
import Vista.FRM_RegistroVehiculos;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Hogar
 */
public class Controlador_FRM_RegistroVehiculos implements ActionListener{
    
    FRM_RegistroVehiculos frm_Vehiculos;
    MetodosVehiculos metodos;
    
    public void Controlador_FRM_RegistroVehiculos(FRM_RegistroVehiculos frm_Vehiculos){
        this.frm_Vehiculos= frm_Vehiculos;
        metodos=new MetodosVehiculos();
    }
    public void actionPerformed(ActionEvent e){
    if(e.getActionCommand().equals("Consultar")){
        buscar();
    }
    if(e.getActionCommand().equals("Agregar")){
        this.metodos.agregarVehiculo(this.frm_Vehiculos.devolverInformacion());
        metodos.mostrarInformacionVehiculos();
        frm_Vehiculos.limpiar();
        frm_Vehiculos.estadoInicial();
    }
    if(e.getActionCommand().equals("Modificar")){
       this.metodos.modificarVehiculo(this.frm_Vehiculos.devolverNumeroDeRegistro(), this.frm_Vehiculos.devolverMarca(),this.frm_Vehiculos.devolverTipo(),this.frm_Vehiculos.devolverAnio());
       this.frm_Vehiculos.limpiar();
       this.frm_Vehiculos.estadoInicial();
    }
    if(e.getActionCommand().equals("Eliminar")){
        this.metodos.eliminarVehiculo(this.frm_Vehiculos.devolverNumeroDeRegistro());
        this.frm_Vehiculos.limpiar();
        this.frm_Vehiculos.estadoInicial();
    }
  }
public void buscar(){
      if(metodos.consultarVehiculo(this.frm_Vehiculos.devolverNumeroDeRegistro())){
          this.frm_Vehiculos.mostrarInformacion(metodos.getArregloInformacion());
          this.frm_Vehiculos.habilitarOpciones();
          this.frm_Vehiculos.deshabilitarNumeroDeRegistro();
          this.frm_Vehiculos.mostrarMensaje("El vehiculo consultado con la placa: "+this.frm_Vehiculos.devolverNumeroDeRegistro()+" se encuentra registrado");
      }else{
          this.frm_Vehiculos.mostrarMensaje("El vehiculo consultado no se encuentra registrado.");
          this.frm_Vehiculos.habilitarAgregar();
      }  
    }
}
