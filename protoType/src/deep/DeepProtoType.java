package deep;

import java.io.*;

/**
 * @author renyujie518
 * @version 1.0.0
 * @ClassName DeepProtoType.java
 * @Description
 * 1) 复制对象的所有基本数据类型的成员变量值
 * 2) 为所有引用数据类型的成员变量申请存储空间，并复制每个引用数据类型成员变量所引用的对象，直到该对象可达的所有对象。
 * 也就是说，对象进行深拷贝要对整个对象进行拷贝
 * 3) 深拷贝实现方式1：重写clone方法来实现深拷贝
 * 4) 深拷贝实现方式2：通过对象序列化实现深拷贝(推荐)
 * @createTime 2022年03月16日 15:37:00
 */
public class DeepProtoType implements Serializable, Cloneable{

    public String name; //String 属性
    public DeepCloneableTarget deepCloneableTarget;// 引用类型
    public DeepProtoType() {
    }


    //深拷贝 - 方式 1 重写clone 方法(加入要处理的引用类型多，每个都要单独处理，不推荐)
    @Override
    protected Object clone() throws CloneNotSupportedException {

        Object deep = null;
        //这里完成对基本数据类型(属性)和String的克隆
        deep = super.clone();
        //对引用类型的属性，进行单独处理
        DeepProtoType deepProtoType = (DeepProtoType)deep;
        //注意DeepCloneableTarget.class中已经重写过clone()
        deepProtoType.deepCloneableTarget  = (DeepCloneableTarget)deepCloneableTarget.clone();

        return deepProtoType;
    }

    //深拷贝 - 方式2 通过对象的序列化实现 (推荐)
    public Object deepClone() {

        //创建流对象
        ByteArrayOutputStream bos = null;
        ObjectOutputStream oos = null;
        ByteArrayInputStream bis = null;
        ObjectInputStream ois = null;

        try {

            //序列化
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            oos.writeObject(this); //当前这个对象以对象流的方式输出(应用类型的属性也就被序列化了)

            //反序列化（再读回来）
            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);
            DeepProtoType copyObj = (DeepProtoType)ois.readObject();

            return copyObj;

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            //关闭流
            try {
                bos.close();
                oos.close();
                bis.close();
                ois.close();
            } catch (Exception e2) {
                System.out.println(e2.getMessage());
            }
        }

    }

}
