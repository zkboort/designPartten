package strategy;

/**
 * @author chennanjiang
 * @title Sorter
 * @date 2022/7/27 12:10
 * @description Comparable接口
 */
public class Sorter {
    //选择排序
    public static void sort(Comparable[] arr){
        for(int i=0;i<arr.length-1;i++){
            int minPos=i;
            for (int j=i+1;j<arr.length;j++){
                minPos=arr[j].compareTo(arr[minPos])==-1?j:minPos;
            }
            swap(arr,i,minPos);
        }

    }
    static void swap(Comparable[] arr,int i,int j){
        Comparable temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }


}
