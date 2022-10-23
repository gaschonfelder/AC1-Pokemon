/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pokemon;

public class Pokemon {
    private String nome;
    private String tipo;
    private int nivel;
    private int vida = 200;
    private int ataque;
    private int defesa;
    
    public Pokemon (){
        
    }
    public Pokemon(String nomeArg, String tipoArg, int nivelArg) {
        this.nome = nomeArg;
        this.tipo = tipoArg;
        this.nivel = nivelArg;

        calculaAtributos();
        calculaBonus();
    }

    public void calculaAtributos() {
        switch (this.tipo) {
            case "Fogo":
                this.vida -= 20;
                this.ataque = 60;
                this.defesa = 20;
                break;
            case "Água":
                this.vida -= 5;
                this.ataque = 40;
                this.defesa = 35;
                break;
            case "Planta":
                this.vida += 20;
                this.ataque = 15;
                this.defesa = 60;
                break;
            case "Pedra":
                this.vida += 25;
                this.ataque = 30;
                this.defesa = 60;
                break;
            default:
                System.out.println("Tipo inválido.");
                break;
        }
    }

    public void calculaBonus() {
        this.vida += (this.nivel/2);
        this.ataque += (this.nivel/3);
        this.defesa += (this.nivel/4);
    }

    public int getVida() {
        return vida;
    }

    public int getAtaque() {
        return ataque;
    }

    public int getDefesa() {
        return defesa;
    }

    public String getNome() {
        return nome;
    }

    public String getTipo() {
        return tipo;
    }
}
