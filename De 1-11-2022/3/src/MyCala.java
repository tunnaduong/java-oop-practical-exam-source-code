
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author win
 */
public class MyCala implements ICala {
    @Override
    public int f1(List<Cala> t) {
        int count = 0;
        for (int i = 0; i < t.size(); i++) {
            char c = t.get(i).getOwner().charAt(1);
            if (Character.isDigit(c)) {
                count++;
            }
        }
        return count;
    }

    @Override
    public void f2(List<Cala> t) {
        
    }

    @Override
    public void f3(List<Cala> t) {
    }
}
