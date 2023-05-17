
package Model;

import java.util.Random;
import javax.swing.JOptionPane;


public class Jogo_DAO {
    
    public static void jogo(){
         int cont = 0;
        Random gerador = new Random();
        
        do {
        int maquina = gerador.nextInt(3);
        String x = 
                
       int jogador = Integer.parseInt(x);
        
        if(maquina == 0 && jogador == 1){
            
            cont = 1;
        }
        else if(maquina == 1 && jogador == 2){
            
            cont = 1;
        }
        else if(maquina == 2 && jogador == 0){
            
            cont = 1;
        }
        else if(maquina == jogador){
            
            cont = 0;
        }
        else{
            
        }
            
        } while (cont == 0);
    }
}
