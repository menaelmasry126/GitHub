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
public class FactoryCreator {
    public static GameFactory getGameFactory(String gameType){
         if ("pay".equalsIgnoreCase(gameType)){
            return new PaytoPlayGameFactory();
        }
         if ("free".equalsIgnoreCase(gameType)){
            return new FreetoPlayGameFactory ();
        }
         return null;
}
}
