/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

/**
 *
 * @author Pablo Rey
 */
public class Actividade {
    
    private String data;
    private String descricion;
    private float prezo;
    
    public Actividade(String data, String descricion, float prezo) {
        setData(data);
        setDescricion(descricion);
        setPrezo(prezo);
    }
    
    public void setData(String data) {
        if(data != null)
            this.data = data;
    }
    
    public void setDescricion(String descricion) {
        if(descricion != null)
            this.descricion = descricion;
    }

    public void setPrezo(float prezo) {
        if(prezo >= 0)
            this.prezo = prezo;
    }
    
    public String getData() {
        return this.data;
    }
    
    public String getDescricion() {
        return this.descricion;
    }
    
    public float getPrezo() {
        return this.prezo;
    }
}
