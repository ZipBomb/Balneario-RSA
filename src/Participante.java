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
public class Participante {
    
    private String dni;
    private String nome;
    
    public Participante(String dni, String nome) {
        setDni(dni);
        setNome(nome);
    }
    
    public void setDni(String x) {
        if(x != null)
            this.dni = x;
    }

    public String getDni() {
        return this.dni;
    }
    
    public void setNome(String x) {
        if(x != null)
            this.nome = x;
    }

    public String getNome() {
        return this.nome;
    }    

}
