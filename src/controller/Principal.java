/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controller;

import util.Config;
import view.TelaEnergia;

/**
 *
 * @author Lucas Hype
 */
public class Principal {
    
    public static void main(String[] args) {
        
        Config.lookAndFeel("Windows Classic");
        new TelaEnergia().setVisible(true);
        
    }

}
