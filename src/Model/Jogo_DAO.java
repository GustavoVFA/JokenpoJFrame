
package Model;

import java.util.Random;
import javax.swing.JOptionPane;


public class Jogo_DAO {
    
    public static void jogo(){
         int cont = 0;
        Random gerador = new Random();
        
      
        
            switch(maquina){
                case 0:
                    Pedra.setVisible(true);
                case 1:
                    Papel.setVisible(true);
                case 2:
                    Tesoura.setVisible(true);
            }
            switch(jogador){
                case 0:
                    Pedra1.setVisible(true);
                case 1:
                    Papel1.setVisible(true);
                case 2:
                    Tesoura1.setVisible(true);
            }
        if(maquina == 0 && jogador == 1){
            TextResultado.setText("Parabéns Vitoria !!!");
        }else if(maquina == 1 && jogador == 2){
            TextResultado.setText("Parabéns Vitoria !!!");
        }else if(maquina == 2 && jogador == 0){
            TextResultado.setText("Parabéns Vitoria !!!"); 
        }else if(maquina == jogador){
            TextResultado.setText("Empate Tente Novamente");
        }else{
            TextResultado.setText("Voce perdeu Tente Novamente !!!");
            }
            
        }
        
    }
}
