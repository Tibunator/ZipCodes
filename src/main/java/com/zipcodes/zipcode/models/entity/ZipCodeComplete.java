package com.zipcodes.zipcode.models.entity;

public class ZipCodeComplete{
	private Integer d_codigo;
	private String d_asenta;
	private String d_tipo_asenta;
	private String D_mnpio;
	private String d_estado;
	private String d_ciudad;
	private Integer d_CP;
	private Integer c_estado;
	private Integer c_oficina;
	private Integer c_CP;
	private Integer c_tipo_asenta;
	private Integer c_mnpio;
	private Integer id_asenta_cpcons;
	private String d_zona;
	private Integer c_cve_ciudad;
	
	public ZipCodeComplete() {}
	
	public ZipCodeComplete(Integer d_codigo, String d_asenta, String d_tipo_asenta, String D_mnpio, 
			String d_estado, String d_ciudad, Integer d_CP, Integer c_estado, Integer c_oficina, Integer c_CP,
			Integer c_tipo_asenta, Integer c_mnpio, Integer id_asenta_cpcons, String d_zona, Integer c_cve_ciudad) {
		this.d_codigo = d_codigo;
		this.d_asenta = d_asenta;
		this.d_tipo_asenta = d_tipo_asenta;
		this.D_mnpio = D_mnpio;
		this.d_estado = d_estado;
		this.d_ciudad = d_ciudad;
		this.d_CP = d_CP;
		this.c_estado = c_estado;
		this.c_oficina = c_oficina;
		this.c_CP = c_CP;
		this.c_tipo_asenta = c_tipo_asenta;
		this.c_mnpio = c_mnpio;
		this.id_asenta_cpcons = id_asenta_cpcons;
		this.d_zona = d_zona;
		this.c_cve_ciudad = c_cve_ciudad;
	}

	public Integer getD_codigo() {
		return d_codigo;
	}

	public void setD_codigo(Integer d_codigo) {
		this.d_codigo = d_codigo;
	}

	public String getD_asenta() {
		return d_asenta;
	}

	public void setD_asenta(String d_asenta) {
		this.d_asenta = d_asenta;
	}

	public String getD_tipo_asenta() {
		return d_tipo_asenta;
	}

	public void setD_tipo_asenta(String d_tipo_asenta) {
		this.d_tipo_asenta = d_tipo_asenta;
	}

	public String getD_mnpio() {
		return D_mnpio;
	}

	public void setD_mnpio(String d_mnpio) {
		D_mnpio = d_mnpio;
	}

	public String getD_estado() {
		return d_estado;
	}

	public void setD_estado(String d_estado) {
		this.d_estado = d_estado;
	}

	public String getD_ciudad() {
		return d_ciudad;
	}

	public void setD_ciudad(String d_ciudad) {
		this.d_ciudad = d_ciudad;
	}

	public Integer getD_CP() {
		return d_CP;
	}

	public void setD_CP(Integer d_CP) {
		this.d_CP = d_CP;
	}

	public Integer getC_estado() {
		return c_estado;
	}

	public void setC_estado(Integer c_estado) {
		this.c_estado = c_estado;
	}

	public Integer getC_oficina() {
		return c_oficina;
	}

	public void setC_oficina(Integer c_oficina) {
		this.c_oficina = c_oficina;
	}

	public Integer getC_CP() {
		return c_CP;
	}

	public void setC_CP(Integer c_CP) {
		this.c_CP = c_CP;
	}

	public Integer getC_tipo_asenta() {
		return c_tipo_asenta;
	}

	public void setC_tipo_asenta(Integer c_tipo_asenta) {
		this.c_tipo_asenta = c_tipo_asenta;
	}

	public Integer getC_mnpio() {
		return c_mnpio;
	}

	public void setC_mnpio(Integer c_mnpio) {
		this.c_mnpio = c_mnpio;
	}

	public Integer getId_asenta_cpcons() {
		return id_asenta_cpcons;
	}

	public void setId_asenta_cpcons(Integer id_asenta_cpcons) {
		this.id_asenta_cpcons = id_asenta_cpcons;
	}

	public String getD_zona() {
		return d_zona;
	}

	public void setD_zona(String d_zona) {
		this.d_zona = d_zona;
	}

	public Integer getC_cve_ciudad() {
		return c_cve_ciudad;
	}

	public void setC_cve_ciudad(Integer c_cve_ciudad) {
		this.c_cve_ciudad = c_cve_ciudad;
	}
}