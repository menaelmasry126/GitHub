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
public class FreetoPlayGameFactory implements GameFactory {

    @Override
    public Game createGame(String gameType) {
           if ("freetoplay".equalsIgnoreCase(gameType)){
            return new Leaugeoflegends();
        }
        return null; 
    }
    
}
