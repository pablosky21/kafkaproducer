package com.croby.kafka.dto;

public class UserDto {
	
	private String name;
	private String departamento;
	private String salario;
	
	
	public UserDto(String name, String departamento, String salario) {
		super();
		this.name = name;
		this.departamento = departamento;
		this.salario = salario;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartamento() {
		return departamento;
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	public String getSalario() {
		return salario;
	}
	public void setSalario(String salario) {
		this.salario = salario;
	}
	
	
	
	

}
