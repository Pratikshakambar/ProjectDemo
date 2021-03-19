package com.app.pojos;
import javax.persistence.*;

@Entity
public class Vehical {
	
	@Column(name = "number_plate")
	@Id
	private String numberPlate;
	@Enumerated(EnumType.STRING)
	private vehicalType v;
	@OneToOne(mappedBy = "v",cascade = CascadeType.ALL)
	private Employee e;
	
	
	public Vehical() {
		System.out.println(" in v const");
	}
	public Vehical(String numberPlate, vehicalType v) {
		super();
		this.numberPlate = numberPlate;
		this.v = v;
	}
	public String getNumberPlate() {
		return numberPlate;
	}
	public void setNumberPlate(String numberPlate) {
		this.numberPlate = numberPlate;
	}
	public vehicalType getV() {
		return v;
	}
	public void setV(vehicalType v) {
		this.v = v;
	}
	@Override
	public String toString() {
		return "Vehical [numberPlate=" + numberPlate + ", v=" + v + "]";
	}
	
}
