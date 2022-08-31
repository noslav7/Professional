package com.javarush.apache_commons.no_templates;

/*
Нам шаблоны не нужны
*/

import org.apache.commons.lang3.builder.StandardToStringStyle;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class Person {
    private String name;
    private int age;
    private int weight;
    private int height;
    private transient String sex;

    public Person(String name, int age, int weight, int height, String sex) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
        this.sex = sex;
    }

    @Override
    public String toString() {
        final StandardToStringStyle style = new StandardToStringStyle();
        style.setUseClassName(false);
        style.setUseIdentityHashCode(false);
        style.setContentStart("This person's");
        style.setFieldNameValueSeparator(" is ");
        style.setFieldSeparator("; ");
        style.setContentEnd(".");
        return ToStringBuilder.reflectionToString(this, style, true);
    }
}