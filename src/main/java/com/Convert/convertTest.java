package com.Convert;

import com.Entry.Person;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

/**
 * 测试用的转换器文档2.16.3
 */
@Component
public class convertTest implements Converter<String, Person> {

//实现Converter的接口.进行转换
    @Override
    public Person convert(String s) {
        //从前端分割
        String[] split = s.split(",");
        System.out.println("我被执行了");
        //遍历所有内容
        return new Person(Integer.parseInt(split[0]), split[1], split[2]);
    }
}
