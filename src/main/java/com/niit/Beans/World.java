package com.niit.Beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class World {
public static void main(String agr[])
{
	ApplicationContext obj=new FileSystemXmlApplicationContext("Bean.xml");
	Hello obj1=(Hello) obj.getBean("hi");
	System.out.println(obj1.sayhello());
	Hello obj2=(Hello) obj.getBean("hi");
	System.out.println(obj2.sayhello());
	System.out.println(obj1==obj2);
}
}
