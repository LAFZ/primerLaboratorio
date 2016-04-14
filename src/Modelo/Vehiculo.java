
package Modelo;


public class Vehiculo {
private String numeroDeRegistro;
private String nombreDelDueno;
private String cedulaDelDueno;
private String placaDelVehiculo;

   public Vehiculo(String numeroDeRegistro, String nombreDelDueno, String cedulaDelDueno, String placaDelVehiculo){
       this.numeroDeRegistro=numeroDeRegistro;
       this.nombreDelDueno=nombreDelDueno;
       this.cedulaDelDueno=cedulaDelDueno;
       this.placaDelVehiculo=placaDelVehiculo;
   }

    public String getNumeroDeRegistro() {
        return numeroDeRegistro;
    }

    public void setNumeroDeRegistro(String numeroDeRegistro) {
        this.numeroDeRegistro = numeroDeRegistro;
    }

    public String getNombreDelDueno() {
        return nombreDelDueno;
    }

    public void setNombreDelDueno(String nombreDelDueno) {
        this.nombreDelDueno = nombreDelDueno;
    }

    public String getCedulaDelDueno() {
        return cedulaDelDueno;
    }

    public void setCedulaDelDueno(String cedulaDelDueno) {
        this.cedulaDelDueno = cedulaDelDueno;
    }

    public String getPlacaDelVehiculo() {
        return placaDelVehiculo;
    }

    public void setPlacaDelVehiculo(String placaDelVehiculo) {
        this.placaDelVehiculo = placaDelVehiculo;
    }

    public String getInformacion(){
        return "Vehiculo con el Número de Registro: "+numeroDeRegistro+" Perteneciente a: "+
                nombreDelDueno+" Cedula: "+cedulaDelDueno+" Con la placa: "+placaDelVehiculo;
    }
}
