
package laestrellaautolavado;

import Modelo.Empleado;
import Modelo.Servicio;
import controlador.Control;
import vista.Inicio;
import vista.Registro;


public class LaEstrellaAutoLavado {

  
    public static void main(String[] args) {
        
        Control control =new Control();
        Empleado empleado = new Empleado();
        Servicio servicio = new Servicio();
        Inicio inicio =new Inicio();
        Registro registro = new Registro();
        
        empleado.setControl(control);
        servicio.setControl(control);
        inicio.setControl(control);
        registro.setControl(control);
        
        control.setEmpleado(empleado);
        control.setServicio(servicio);
        control.setInicio(inicio);
        control.setRegistro(registro);
        
        
    }
    
}
