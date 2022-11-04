/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author win
 */
public class Camel {
    String desert;
    int step;
    
    public Camel() {
        this.desert = null;
        this.step = 0;
    }

    public Camel(String desert, int step) {
        this.desert = desert;
        this.step = step;
    }

    public String getDesert() {
        return desert.toLowerCase();
    }

    public int getStep() {
        return step;
    }

    public void setStep(int step) {
        this.step = step;
    }
    
    
}
