package com.zipcodes.zipcode.models.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Zip_Code")
public class ZipCode implements Serializable{

	/**
     *
     */
    private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer code;
	private Integer d_codigo;
	private String D_mnpio;
	private String d_estado;
	private String d_ciudad;
		public ZipCode() {}
	
	public ZipCode(Integer d_codigo, String D_mnpio, String d_estado, String d_ciudad) {
		this.d_codigo = d_codigo;
		this.d_estado = d_estado;
		this.d_ciudad = d_ciudad;
		this.D_mnpio = D_mnpio;

	}
	public Integer getCode() {
		return this.code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}
	public Integer getD_codigo() {
		return d_codigo;
	}
	public void setD_codigo(Integer d_codigo) {
		this.d_codigo= d_codigo;
	}

	public String getD_mnpio() {
		return D_mnpio;
	}
	public void setD_mnpio(String D_mnpio) {
		this.D_mnpio= D_mnpio;
	}

	public String getD_estado() {
		return d_estado;
	}
	public void setD_estado(String D_estado) {
		this.d_estado= D_estado;
	}

	public String getD_ciudad() {
		return d_ciudad;
	}
	public void setD_ciudad(String D_ciudad) {
		this.d_ciudad= D_ciudad;
	}
}
