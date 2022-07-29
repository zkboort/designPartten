package singleTon.breakSingleTone;

import java.io.*;

/**
 * @author chennanjiang
 * @title serializeBreak
 * @date 2022/7/27 17:58
 * @description 序列化、反序列化破坏单例
 */

public class SerializeBreak implements Serializable {
    public static void main(String[] args) throws Exception{
        // writeObjToFile();
        //多获取几次看得到的对象是否是一样的,结果是这两次的获取得到的对象的hash不同
        readObjFromFile();
        readObjFromFile();
    }
    //从文件中读取一个单例对象
    public static void readObjFromFile() throws Exception{
        ObjectInputStream objectInputStream=new ObjectInputStream(new FileInputStream("C:\\Users\\27135\\Desktop\\Thesis study\\singleBreakt.txt"));
        SingleTon singleTon=(SingleTon)objectInputStream.readObject();
        System.out.println(singleTon);
        objectInputStream.close();
    }
    //将一个单例对象写入文件
    public static void writeObjToFile() throws Exception{
        //获取单例对象
        SingleTon singleTon=SingleTon.getInstance();
        //输出流对象
        ObjectOutputStream outputStream=new ObjectOutputStream(new FileOutputStream("C:\\Users\\27135\\Desktop\\Thesis study\\singleBreakt.txt"));
        //写入对象
        outputStream.writeObject(singleTon);
        outputStream.close();
    }
}
