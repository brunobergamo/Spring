/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */



/**
 *
 * @author Felipe
 */
public class CantorTocador extends Cantor {

    private Instrumento instrumento3;
    
    private Instrumento instrumento2;

    public CantorTocador() {
        super();
    }

    public void setInstrumento(Instrumento instrumento3) {
        this.instrumento3 = instrumento3;
    }
    
    public void setInstrumento2(Instrumento instrumento2 ) {
        this.instrumento2 = instrumento2;
    }
    public void apresentar() {
        instrumento3.tocar();
        instrumento2.tocar();
        super.apresentar();
        instrumento2.tocar();
        instrumento3.tocar();
    }

}
