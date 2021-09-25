/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package util;

import java.awt.Color;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.JTextField;

/**
 *
 * @author Lucas Hype
 */
public class Listener implements FocusListener {
    
    @Override
    public void focusGained(FocusEvent fe) {
        JTextField tf = (JTextField) fe.getSource();
        tf.setBackground(Color.yellow);
    }

    @Override
    public void focusLost(FocusEvent fe) {
        JTextField tf = (JTextField) fe.getSource();
        tf.setBackground(Color.white);
    }

}