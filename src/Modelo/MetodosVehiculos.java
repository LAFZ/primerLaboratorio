
package Modelo;

import java.util.ArrayList;

public class MetodosVehiculos {
    ArrayList <Vehiculo> arrayVehiculos;
    String arregloInformacion[];
    
    public MetodosVehiculos(){
        arrayVehiculos= new ArrayList<Vehiculo>();
        arregloInformacion=new String[4];
    }
    public void modificarVehiculo(String numeroDeRegistro, String nombreDelDueno, String cedulaDelDueno, String placaDelVehiculo){
        for(int i=0;i<arrayVehiculos.size();i++){
            if(this.arrayVehiculos.get(i).getNumeroDeRegistro().equals(numeroDeRegistro)){
               this.arrayVehiculos.get(i).setNombreDelDueno(nombreDelDueno);
               this.arrayVehiculos.get(i).setCedulaDelDueno(cedulaDelDueno);
               this.arrayVehiculos.get(i).setPlacaDelVehiculo(placaDelVehiculo);
            }
        }
    }
    public void eliminarVehiculo(String numeroDeRegistro){
        for(int i=0;i<arrayVehiculos.size();i++){
            if(this.arrayVehiculos.get(i).getNumeroDeRegistro().equals(numeroDeRegistro)){
               this.arrayVehiculos.remove(i);
            }
        }
    }
    public boolean consultarVehiculo(String numeroDeRegistro){
        boolean encontro=false;
        for(int i=0;i<arrayVehiculos.size();i++){
            System.out.println("Entro Aqui");
            if(this.arrayVehiculos.get(i).getNumeroDeRegistro().equals(numeroDeRegistro)){
                this.arregloInformacion[0]=this.arrayVehiculos.get(i).getNombreDelDueno();
                this.arregloInformacion[1]=this.arrayVehiculos.get(i).getCedulaDelDueno();
                this.arregloInformacion[2]=this.arrayVehiculos.get(i).getPlacaDelVehiculo();
                encontro=true;
            }
        }
        return encontro;
    }
    public void agregarVehiculo(String[] informacion){
        Vehiculo temporal;
        temporal=new Vehiculo(informacion[0], informacion[1], informacion[2], informacion[3]);
        this.arrayVehiculos.add(temporal);
    }

    public String[] getArregloInformacion(){
        return arregloInformacion;
    }
}
