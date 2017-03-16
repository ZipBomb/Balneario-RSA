/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/**
 *
 * @author Pablo Rey
 */
public class DatosReserva {
    
    private ArrayList<Participante> usuarios;
    private HashMap<Participante, Actividade> actividades;
    
    public DatosReserva() {
        usuarios = new ArrayList<>();
        actividades = new HashMap<>();        
    } 
    
    public void engadirUsuario(Participante x) {
        if(x != null)
            this.usuarios.add(x);
    }
    
    public void eliminarUsuario(Participante x) {
        if(x != null) {
            int i = 0;
            for(Participante p : usuarios) {
                if(p.getDni().equals(x.getDni())) {
                    usuarios.remove(i);
                    break;
                }
                i++;
            }
        }
    }    
    
    public Participante getUsuario(int x) {
        if(x >= 0)
            return this.usuarios.get(x);
        else
            return null;
    }    
    
    public void engadirActividade(Participante p, Actividade a) {
        if(a != null && p!=null)
            this.actividades.put(p, a);
    }
    
    public HashMap getActividades() {
        return this.actividades;
    }
    
    public void reseteaActividades() {
        if(this.actividades.size() > 0) {
            this.actividades.clear();
        }
    }
    
}
