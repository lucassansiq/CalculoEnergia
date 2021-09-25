/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package util;

import java.text.ParseException;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;

/**
 *
 * @author Lucas Hype
 */
public class Mascara {
    public static DefaultFormatterFactory getkwtMask(){
      MaskFormatter mask = null;
      try{
          mask = new MaskFormatter("####.##");
          mask.setPlaceholderCharacter('_');
      }catch(ParseException ex){
          return null;
      }
      return (new DefaultFormatterFactory(mask,mask));
    }
}
