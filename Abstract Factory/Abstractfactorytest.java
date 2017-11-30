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
public class Abstractfactorytest {
    public static void main(String[] args) {
        GameFactory freeGameFactory = FactoryCreator.getGameFactory("free");
        Game free = freeGameFactory.createGame("free");
        free.play();
        
    }
}
