
package ejercicio49video57;

import java.util.*;
import javax.swing.JOptionPane;

public class Media {
    
    public void conta(){
        
        int numero,suma_pos=0,conteo_pos=0,suma_neg=0,conteo_neg=0,conteo_ceros=0;
        
        float media_pos,media_neg;
        
        for(int i=1; i<=10; i++){
            numero = Integer.parseInt(JOptionPane.showInputDialog("DIGITE UN NUMERO: "));
            
            if(numero==0){
                conteo_ceros++;
            }else if(numero>0){
                suma_pos+=numero;
                conteo_pos++;
            }else{
                suma_neg += numero;
                conteo_neg++;
            }
        }
        
        if(conteo_pos==0){
            
            JOptionPane.showMessageDialog(null,"NO SE PUEDE SACAR LA MEDIA DE LOS POSITIVOS");
        }else{
            media_pos = (float) suma_pos/conteo_pos;
            JOptionPane.showMessageDialog(null," LA MEDIA DE LOS POSITIVOS ES " + media_pos);
        }
        
        
        ///
        
        if(conteo_neg==0){
            
            JOptionPane.showMessageDialog(null,"NO SE PUEDE SACAR LA MEDIA DE LOS NEGATIVOS");
        }else{
            media_neg = (float) suma_neg/conteo_neg;
            JOptionPane.showMessageDialog(null," LA MEDIA DE LOS NEGATIVOS ES " + media_neg);
        }
        
        JOptionPane.showMessageDialog(null," LA CANTIDAD DE CEROS ES: "+conteo_ceros);
        
    }
    
}
