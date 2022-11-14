package model.entities;

import java.time.LocalDateTime;

public class CarRental {
	private LocalDateTime start;
	private LocalDateTime finish;
	
	private Vehicie vehicie;
	private Invoice invoice;
	
	public CarRental() {
	}

	public CarRental(LocalDateTime start, LocalDateTime finish, Vehicie vehicie) {
		this.start = start;
		this.finish = finish;
		this.vehicie = vehicie;
		
	}

	public LocalDateTime getStart() {
		return start;
	}

	public void setStart(LocalDateTime start) {
		this.start = start;
	}

	public LocalDateTime getFinish() {
		return finish;
	}

	public void setFinish(LocalDateTime finish) {
		this.finish = finish;
	}

	public Vehicie getVeicie() {
		return vehicie;
	}

	public void setVeicie(Vehicie veicie) {
		this.vehicie = veicie;
	}

	public Invoice getInvoice() {
		return invoice;
	}

	public void setInvoice(Invoice invoice) {
		this.invoice = invoice;
	}
	
	
	
	
	
	
	
	
	
}
