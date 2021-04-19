/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import Modelo.Empleado;
import Modelo.Servicio;
import vista.Inicio;
import vista.Registro;


public class Control {

    private Empleado empleado;
    private Servicio servicio;
    private Inicio inicio;
    private Registro registro;
    
    
    public void setEmpleado(Empleado empleado) {
        this.empleado=empleado;
    }

    public void setServicio(Servicio servicio) {
        this.servicio=servicio;
    }

    public void setInicio(Inicio inicio) {
        this.inicio=inicio;
    }


    public void setRegistro(Registro registro) {
        this.registro=registro;
    }
    
    public void crearItem (){
        String [] datos = new String [7];
        
    }
    
}
