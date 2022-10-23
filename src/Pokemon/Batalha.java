/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pokemon;

import javax.swing.JOptionPane;

public class Batalha {
    private Pokemon meuPokemon;
    private Pokemon outroPokemon;
    private String pokemonVencedor;
    private String Vencedor;
    
        
    public Batalha(Pokemon meuPokemon, Pokemon outroPokemon) {
        this.meuPokemon = meuPokemon;
        this.outroPokemon = outroPokemon;

        comecarBatalha(this.meuPokemon, this.outroPokemon);
    }

    public void comecarBatalha(Pokemon meuPokemon, Pokemon outroPokemon) {
        if (meuPokemon.getVida() > outroPokemon.getVida()) {
            System.out.println("Parabéns" + meuPokemon.getNome() + " venceu a batalha!");
            this.pokemonVencedor =  meuPokemon.getNome(); 
            this.Vencedor = "Parabéns, Você venceu! ";
        } else if (meuPokemon.getVida() < outroPokemon.getVida()){
            System.out.println("Você perdeu,"+ outroPokemon.getNome() + " venceu a batalha!");
            this.pokemonVencedor = outroPokemon.getNome(); 
            this.Vencedor = "Infelizmente você perdeu! ";
        } else {
            System.out.println("Teve um empate!");
            this.pokemonVencedor = "Ninguém ";
            this.Vencedor = "Acabou empatado! ";
        }
    }

    public String getResultado() {
        JOptionPane.showMessageDialog(null, this.Vencedor + this.pokemonVencedor + " foi o vencedor");
        return this.pokemonVencedor;
    }
}
