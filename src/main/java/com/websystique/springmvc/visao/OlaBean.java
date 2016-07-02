package com.websystique.springmvc.visao;

import javax.faces.bean.ManagedBean;

@ManagedBean(name = "ola")
public class OlaBean {
	public void dizerOla() {
		System.out.println("Olá Mundo JSF + Spring MVC");
	}

}