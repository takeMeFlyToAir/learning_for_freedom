package com.springboot.springboot_mybatis.meta;

import com.springboot.springboot_mybatis.entity.Order;
import com.springboot.springboot_mybatis.entity.User;
import org.apache.ibatis.reflection.DefaultReflectorFactory;
import org.apache.ibatis.reflection.MetaClass;
import org.apache.ibatis.reflection.MetaObject;
import org.apache.ibatis.reflection.SystemMetaObject;
import org.junit.Test;

import java.util.ArrayList;

/**
 * @author zhaozhirong
 * @date 2022/2/13 12:43 下午
 */

public class MetaTest {

    @Test
    public void testMetaObject(){
        ArrayList<Order> orders = new ArrayList<Order>(){{
            add(new Order("001","A1"));
            add(new Order("002","A2"));
        }};

        User zzr = new User("zzr", 28, orders);
        MetaObject metaObject = SystemMetaObject.forObject(zzr);
        System.out.println(metaObject.getValue("orders[0].goodsName"));
        metaObject.setValue("orders[0].goodsName","A3");
        System.out.println(metaObject.getValue("orders[0].goodsName"));
    }

    @Test
    public void testMetaClass(){
        MetaClass metaClass = MetaClass.forClass(Order.class, new DefaultReflectorFactory());
        for (String getterName : metaClass.getGetterNames()) {
            System.out.println(getterName);
        }
    }

}
