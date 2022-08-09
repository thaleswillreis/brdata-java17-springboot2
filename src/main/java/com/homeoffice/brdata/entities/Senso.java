package com.homeoffice.brdata.entities;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity; //preferencia dada para a especificação ao invés da implementação do Hibernate
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Senso implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private int ano;
	private int cod_uf;
	private String estado;
	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY) Obs: comentei a geração automatica do cod_uf para fazer testes com o banco H2
	private Long cod_mun;
	private String nome_mun;
	private String regiao;
	private String cod_meso_reg;
	private String nome_meso_reg;
	private String cod_mic_reg;
	private String nome_min_reg;
	private double pib;
	private int populacao;
	private double pib_per_cap;
	
	public Senso() {	
	}

	public Senso(int ano, int cod_uf, String estado, long i, String nome_mun, String regiao,
			String cod_meso_reg, String nome_meso_reg, String cod_mic_reg, String nome_min_reg, double d,
			int populacao, double e) {
		super();
		this.ano = ano;
		this.cod_uf = cod_uf;
		this.estado = estado;
		this.cod_mun = i;
		this.nome_mun = nome_mun;
		this.regiao = regiao;
		this.cod_meso_reg = cod_meso_reg;
		this.nome_meso_reg = nome_meso_reg;
		this.cod_mic_reg = cod_mic_reg;
		this.nome_min_reg = nome_min_reg;
		this.pib = d;
		this.populacao = populacao;
		this.pib_per_cap = e;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public int getCod_uf() {
		return cod_uf;
	}

	public void setCod_uf(int cod_uf) {
		this.cod_uf = cod_uf;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Long getCod_mun() {
		return cod_mun;
	}

	public void setCod_mun(Long cod_mun) {
		this.cod_mun = cod_mun;
	}

	public String getNome_mun() {
		return nome_mun;
	}

	public void setNome_mun(String nome_mun) {
		this.nome_mun = nome_mun;
	}

	public String getRegiao() {
		return regiao;
	}

	public void setRegiao(String regiao) {
		this.regiao = regiao;
	}

	public String getCod_meso_reg() {
		return cod_meso_reg;
	}

	public void setCod_meso_reg(String cod_meso_reg) {
		this.cod_meso_reg = cod_meso_reg;
	}

	public String getNome_meso_reg() {
		return nome_meso_reg;
	}

	public void setNome_meso_reg(String nome_meso_reg) {
		this.nome_meso_reg = nome_meso_reg;
	}

	public String getCod_mic_reg() {
		return cod_mic_reg;
	}

	public void setCod_mic_reg(String cod_mic_reg) {
		this.cod_mic_reg = cod_mic_reg;
	}

	public String getNome_min_reg() {
		return nome_min_reg;
	}

	public void setNome_min_reg(String nome_min_reg) {
		this.nome_min_reg = nome_min_reg;
	}

	public double getPib() {
		return pib;
	}

	public void setPib(Float pib) {
		this.pib = pib;
	}

	public int getPopulacao() {
		return populacao;
	}

	public void setPopulacao(int populacao) {
		this.populacao = populacao;
	}

	public double getPib_per_cap() {
		return pib_per_cap;
	}

	public void setPib_per_cap(Float pib_per_cap) {
		this.pib_per_cap = pib_per_cap;
	}

	@Override
	public int hashCode() {
		return Objects.hash(ano, cod_mun);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Senso other = (Senso) obj;
		return ano == other.ano && Objects.equals(cod_mun, other.cod_mun);
	}
}
