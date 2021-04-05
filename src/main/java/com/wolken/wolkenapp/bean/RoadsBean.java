package com.wolken.wolkenapp.bean;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor

public class RoadsBean {
	private String roadName;
	private String type;
	private PotHolesBean potHolesBean;
	public void drive() {
		System.out.println("drive vroommmmmmmmmmmmmmmm");
	}

}
