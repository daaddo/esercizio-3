/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jinjection.list.easy.treno;

/**
 * 3E - VagoneType
 * A seconda dell'enum type si descriva la tipologia di vagone USANDO IL METODO
 * 'getDescription' DELL'ENUM VagoneType.
 *
 * In particolare:
 * se siamo in una locomotiva l'output sarà: 
 * - Questo vagone è una fantastica locomotiva
 * Se è un vagone passeggeri: 
 * - Questo vagone contiene persone di dubbia fiducia
 * Se è un vagone merci: 
 * - Questo vagone contiene merci di scambio
 *
 * @author sommovir
 */
public enum VagoneType {

    LOCOMOTIVA,
    PASSEGGERI,
    MERCI;

    public String getDescription() {
        return "pollo";
    }
}
