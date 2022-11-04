/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author win
 */
public class BlackRice extends Rice {
    String maker;
    
    public BlackRice() {
        this.maker = null;
    }

    public BlackRice(String code, String maker, double price) {
        super(code, price);
        this.maker = maker;
    }

    public String getMaker() {
        return maker;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    @Override
    public String toString() {
        return code + " " + maker + " " + price;
    }
    
    

    @Override
    public double getPrice() {
        StringBuffer price = new StringBuffer(getCode());
        if (price.charAt(0) == 'B' || price.charAt(0) == 'b') {
            return this.price * 1.1;
        } else {
            return this.price;
        }
    }
}
