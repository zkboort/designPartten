package strategy;

import java.util.Comparator;

/**
 * @author chennanjiang
 * @title catComparator
 * @date 2022/7/27 16:37
 * @description TODO
 */
public class catComparator implements Comparator<cat> {
    @Override
    public int compare(cat o1, cat o2) {
        if(o1.weight<o2.weight){return -1;}
        else if(o1.weight>o2.weight){return 1;}
        else return 0;
    }
}
