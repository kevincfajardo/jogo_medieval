/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package batalhamedieval;


/**
 *
 * @author Aluno
 */
public class Log {
    String player;

    

    public Log(String player) {
        this.player = player;
    }
    
    public String getPlayer() {
        return player;
    }

    public void setPlayer(String player) {
        this.player = player;
    }
    
    public String wimMsg(){
        return "/////////////////////////////\n"
        +this.player+" venceu essa partida!!!" + "\nGame Over\n"
        +"/////////////////////////////";
    }
    
    public String attackMsg(String wName){
        return this.player + " Ataca com um(a) "+wName+"\n";
    }
    
    public String hitMsg(String pName){
        return this.player + " Acertou um ataque em "+pName+"\n";
    }
    
    public String dmgMsg(String pName, int dmg){
        return pName+" Recebeu: "+ dmg +" de dano\n";
    }
    
    public String missAttack(){
        return this.player + " errou o ataque\n";
    }
}
