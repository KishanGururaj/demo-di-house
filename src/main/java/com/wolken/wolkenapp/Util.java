package com.wolken.wolkenapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wolken.wolkenapp.bean.PotHolesBean;
import com.wolken.wolkenapp.bean.RoadsBean;

public class Util {
	public static void main(String[] args) {
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("context.xml");
		RoadsBean bean=applicationContext.getBean(RoadsBean.class);
		System.out.println(bean.getRoadName()+" "+bean.getType());
		bean.drive();
		PotHolesBean bean1=applicationContext.getBean(PotHolesBean.class);
		System.out.println(bean1.getNoOfPotHoles()+" "+bean1.getArea());
		bean1.backPain();
	}

}
