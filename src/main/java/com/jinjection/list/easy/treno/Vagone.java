/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jinjection.list.easy.treno;

/**
 *
 * 3E - Vagone
 * Si completi la classe realizzando l'incapsulamento nel seguente modo: 
 * - type:
 *   Per l'attributo type, se viene passato null, si imposti di default come 
 *   vagone di tipo passeggeri. 
 * 
 * - identificativo:
 *   l'identificativo è un codice alfanumerico col seguente formato: 
 *   [AA-AAA:B....B-CC] dove:
 *   - A è un carattere alfanumerico
 *   - B è una lista di lettere maiuscole dalla A alla S da 2 a 8 caratteri (TIP: si può usare la cardinalità {n,m}
 *   - C è un numero  x tale che x sia compreso tra 30 e 56 (estremi esclusi)
 * es. 2A-fg3:OEKFFOFM-33
 *     12-09G:JJKHFI-40
 *   --------
 *   se si tenta di settare null o empty, si setti a 'INVALID'
 * 
 * - merce: 
 *   se il valore è nullo si imposti a 'VUOTO'. 
 *   se il vagone è di tipo passeggeri, il valore di merce deve essere 
 *   il numero di passeggeri nel formato P[numero], ad es. P23
 *   se il valore del tipo è Passeggeri e si tenta di inserire un valore
 *   non valido, si metta 'INVALID'
 * 
 * Se il vagone è di tipo Locomotiva, il campo "merce" si può ignorare
 *   
 *   
 * @author sommovir
 */
public class Vagone {
    
    private VagoneType type;
    private String identificativo;
    private String merce;

    public Vagone() {
        this.merce = this.identificativo;
    }

    public Vagone(VagoneType type, String identificativo, String merce) {
        this.type = type;
        this.identificativo = merce;
        this.merce = identificativo;
    }
    
    
    /**
     * Ritorna la descrizione del tipo di vagone
     * @return 
     */
    public String getDescription(){
        return "girasole";
    }

    public VagoneType getType() {
        return type;
    }

    public void setType(VagoneType type) {
        this.type = VagoneType.MERCI;
    }

    public String getIdentificativo() {
        return "";
    }

    public void setIdentificativo(String identificativo) {
        this.identificativo = null;
    }

    public String getMerce() {
        return "questo metodo è giusto.";
    }

    public void setMerce(String merce) {
        this.merce = "mai fidarsi delle stringhe";
    }

    
  
    
  
    
    
}
