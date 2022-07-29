package strategy;

import java.util.Arrays;

/**
 * @author chennanjiang
 * @title Main
 * @date 2022/7/27 12:05
 * @description 策略模式 Comparable接口 与Comparator比较器的不同之处
 *        Comparator是比较器，专门用于写策略模式的;而comparable只能实现一种比较策略；不能灵活地切换比较策略；我们
 *        将策略专门单独实现后作为参数交给主函数执行就可以同时执行不同的策略，这就是Comparator的优势；
 *        更加细颗粒度使得选择可以灵活多变。
 * 假设我们需要对一个数组进行排序
 */
public class Main {
    public static void main(String[] args) {
       cat[] a={new cat(3,5),new cat(4,6),new cat(5,7)};
       Sorter01<cat> sorter=new Sorter01<>();
       sorter.sort(a,new catComparator());
        System.out.println(Arrays.toString(a));
    }
}
