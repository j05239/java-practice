package com.loong.自定义注解例三;

/**
 * @author yvanme
 * @version 1.0
 * @Description
 * @create 2018-04-23 16:16
 **/
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by Tanyunlong on 2016/12/3.
 * 数据库名 @Table 映射注解
 */
@Target({ElementType.TYPE})//作用域是类或者接口
@Retention(RetentionPolicy.RUNTIME)//注解类型：运行时注解
public @interface Table {

    String  value();//注解只有一个变量时 变量名必须为value

}
