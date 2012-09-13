/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Felipe
 */
public class CirandaCirandinha implements Musica {

    private static String[] letra = {
        "Ciranda , cirandinha,",
        "Vamos todos cirandar,",
        "Vamos dar a meia volta,",
        "Volta e meia vamos dar",
        "",
        "O anel que tu me destes,",
        "Era vidro",
        "E se quebrou.",
        "O amor que tu me tinhas",
        "Era pouco e se acabou.",
        "",
        "Ciranda , cirandinha,",
        "Vamos todos cirandar,",
        "Vamos dar a meia volta,",
        "Volta e meia vamos dar"};

    public void cantar() {
        for (int i = 0; i < letra.length; i++) {
            System.out.println(letra[i]);
        }
    }
}
