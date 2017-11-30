/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Abstractfactory;

/**
 *
 * @author mena_
 */
public class PaytoPlayGameFactory implements GameFactory {

    @Override

    public Game createGame(String gameType) {
           if ("paytoplay".equalsIgnoreCase(gameType)){
            return new Worldofwarcraft();
        }
        return null; 
    }
    
}
