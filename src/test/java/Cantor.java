/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Felipe
 */
public class Cantor implements Competidor {

    private Musica musica;


    public void setMusica(Musica musica) {
        this.musica = musica;
    }

    public void apresentar() {
        musica.cantar();
        musica.cantar();
    }
}
