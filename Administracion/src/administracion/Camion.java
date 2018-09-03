
package administracion;

import servicio.Conexion;
import servicio.ConexionTemporal;

public class Camion {
    
    private String patente;
    private int peso;
    private String material;
    private int pesoS;
    private int pesoF;

    public Camion() {
    }

    public Camion(String patente, int peso, String carga, int pesoS, int pesoF) {
        this.patente = patente;
        this.peso = peso;
        this.material = carga;
        this.pesoS = pesoS;
        this.pesoF = pesoF;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public void setMaterial(String carga) {
        this.material = carga;
    }

    public void setPesoS(int pesoS) {
        this.pesoS = pesoS;
    }

    public String getPatente() {
        return patente;
    }

    public int getPeso() {
        return peso;
    }

    public String getMaterial() {
        return material;
    }

    public int getPesoS() {
        return pesoS;
    }

    @Override
    public String toString() {
        return "Camion{" + "patente=" + patente + ", peso=" + peso + ", material=" + material + ", pesoS=" + pesoS + ", pesoF=" + pesoF + '}';
    }
    
    public int pefoF(){
        pesoF = pesoS - peso;
        return pesoF;
    }
    
    public void cargaDeDatos(){
        Conexion c = new Conexion();
        c.addMessage(patente, pesoF, material);
    }
    
    public void cargaDedatosTenporal(){
        ConexionTemporal c = new ConexionTemporal();
        c.agregarMnesajeTemporal(patente, pesoF, material);
    }
}
