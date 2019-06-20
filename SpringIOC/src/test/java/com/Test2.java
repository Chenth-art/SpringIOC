package com;

import com.pojo.User;
import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/*反射*/
public class Test2 {
    @Test
    public void test01(){
        try {
            //获取字节码对象
            Class cl = Class.forName("com.pojo.User");
            //创建一个对象(newInstance()是反射，括号里无参数对应的是调用无参构造创建对象)
            User user = (User)cl.newInstance();

            //获取有参构造，根据数据类型和个数
            Constructor con = cl.getDeclaredConstructor(Integer.class,String.class);
            //创建一个对象(newInstance()是反射，括号里有参数对应的是调用有参构造创建对象)
            User user2 = (User) con.newInstance(1,"admin");
            System.out.println(user2);

            /*获取方法对应的method对象，通过反射机制调用方法
             Declared可以调用私有的方法  method对应print方法*/
            Method method = cl.getDeclaredMethod("print", String.class);
            //true表示对私有方法强力访问 暴力开关
            method.setAccessible(true);
            //小括号里前面传入一个对象，后面传参数
            method.invoke(user,"张三");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }


    }
}
