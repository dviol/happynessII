/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package happyness.controller;

/**
 *
 * @author Dede
 */
public interface IDatabaseConnector {
    
   
    String getEntry(int index);
    void addEntry(String input);
    int size();
}
