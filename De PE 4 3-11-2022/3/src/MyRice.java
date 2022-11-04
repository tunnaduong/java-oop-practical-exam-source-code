
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
public class MyRice implements IRice {

    @Override
    public void f1(List<Rice> list) {
        double last = list.get(list.size() - 1).price;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).price >= last) {
                list.get(i).price *= 1.1;
            }
        }
    }

    @Override
    public int f2(List<Rice> list, double d) {
        int num = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).price >= d) {
                num++;
            }
        }
        return num;
    }

    @Override
    public void f3(List<Rice> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).price > list.get(list.size() - 1).price) {
                list.remove(i);
                i--;
            }
        }
    }
    
}
