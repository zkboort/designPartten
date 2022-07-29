package strategy;

/**
 * @author chennanjiang
 * @title cat
 * @date 2022/7/27 16:14
 * @description comparable接口
 */
public class cat implements Comparable<cat> {
    int weight,height;
    public cat(int height,int weight){
        this.height=height;
        this.weight=weight;
    }

    /**
     * @description:
     * 通过继承实现comparable接口的compareTo()方法，我们可以指定对象的比较策略，但是这里需要多种策略的话就会显得麻烦；
     * 这种方式里面只能存在一种比较策略，很不灵活
     */

    @Override
    public int compareTo(cat c) {
        if(this.weight<c.weight){return -1;}
        else if(this.weight>c.weight){return 1;}
        else return 0;

    }

    @Override
    public String toString() {
        return "cat{" +
                "weight=" + weight +
                ", height=" + height +
                '}';
    }
}
