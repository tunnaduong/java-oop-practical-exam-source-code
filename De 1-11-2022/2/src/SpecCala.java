/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author win
 */
public class SpecCala extends Cala {
    int color;
    
    public SpecCala() {
        this.color = 0;
    }

    public SpecCala(String owner, int price, int color) {
        super(owner, price);
        this.color = color;
    }

    @Override
    public String toString() {
        return owner + ", " + price + ", " + color;
    }
    
    public void setData() {
        StringBuffer temp = new StringBuffer(getOwner());
        setOwner(temp.replace(1, 2, "XX").toString());
    }
    
    public int getValue() {
        int check = this.color;
        if (color % 2 == 1) {
            return price + 3;
        } else {
            return price + 7;
        }
    }
}
