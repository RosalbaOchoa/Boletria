package com.servipuedosv.models.entities;

import java.io.Serializable;
import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="CLIENTE")
public class Customer implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	//@GeneratedValue(strategy = GenerationType.IDENTITY) //para mysql
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "customers_Seq")
	@SequenceGenerator(name = "customers_Seq", sequenceName = "CUSTOMERS_SEQ")
	
	private Long CLI_NUM_DOCUMENTO; 
	
	@Column(name="NOMBRE")
	@NotEmpty
	private String nombres;
	@NotNull
	
	@Column(name="APELL_1")
	@NotEmpty
	private String apellido_1;
	@NotNull
	
	@Column(name="APELL_2")
	@NotEmpty
	private String apellido_2;
	@NotNull
	
	@Column(name="TIP_DOCUMENTO")
	@NotEmpty
	private String documento;
	@NotNull
	
	@Column(name="NACIONALIDAD")
	@NotEmpty
	private String nacionalidad;
	@NotNull
	
	@Column(name="F_INGRESO")
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date f_ingreso;
	@NotNull
	
	@Column(name="F_BAJA")
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date f_baja;
	@NotNull

	@Column(name="EMAIL")
	@NotEmpty
	private String email;
	@NotNull
	
	@Column(name="TIP_CLI")
	@NotEmpty
	private String tipo_cliente;
	@NotNull
	
	@Column(name="COD_ESTADO")
	@NotEmpty
	private String codigo_estado;
	@NotNull
	
	public Long getCLI_NUM_DOCUMENTO() {
		return CLI_NUM_DOCUMENTO;
	}
	public void setCLI_NUM_DOCUMENTO(Long cLI_NUM_DOCUMENTO) {
		CLI_NUM_DOCUMENTO = cLI_NUM_DOCUMENTO;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getApellido_1() {
		return apellido_1;
	}
	public void setApellido_1(String apellido_1) {
		this.apellido_1 = apellido_1;
	}
	public String getApellido_2() {
		return apellido_2;
	}
	public void setApellido_2(String apellido_2) {
		this.apellido_2 = apellido_2;
	}
	public String getDocumento() {
		return documento;
	}
	public void setDocumento(String documento) {
		this.documento = documento;
	}
	public String getNacionalidad() {
		return nacionalidad;
	}
	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}
	public Date getF_ingreso() {
		return f_ingreso;
	}
	public void setF_ingreso(Date f_ingreso) {
		this.f_ingreso = f_ingreso;
	}
	public Date getF_baja() {
		return f_baja;
	}
	public void setF_baja(Date f_baja) {
		this.f_baja = f_baja;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTipo_cliente() {
		return tipo_cliente;
	}
	public void setTipo_cliente(String tipo_cliente) {
		this.tipo_cliente = tipo_cliente;
	}
	public String getCodigo_estado() {
		return codigo_estado;
	}
	public void setCodigo_estado(String codigo_estado) {
		this.codigo_estado = codigo_estado;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	

}
