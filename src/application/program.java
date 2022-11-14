package application;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import model.entities.CarRental;
import model.entities.Vehicie;
import model.services.BrazilTaxService;
import model.services.RentalService;

public class program {
	public static void main(String[] args) {
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
	
	System.out.println("Entre com dados do Aluguel");
	System.out.println("modelo do Carro");
	String carModel = sc.nextLine(); 
	System.out.println("Retirada (\"dd/MM/yyyy HH:mm\")");
	LocalDateTime start = LocalDateTime.parse(sc.nextLine(), fmt);
	System.out.println("Devolução (\"dd/MM/yyyy HH:mm\")");
	LocalDateTime finish = LocalDateTime.parse(sc.nextLine(), fmt);
	
	CarRental cr = new CarRental(start, finish, new Vehicie(carModel));
		
	System.out.println("Entre com o preço por hora: ");
	double pricePerHour = sc.nextDouble();
	System.out.println("Entre com o preço por dia: ");
	double pricePerDay = sc.nextDouble();
	 
	RentalService rentalService = new RentalService(pricePerHour, pricePerDay, new BrazilTaxService());	
	rentalService.processInvoice(cr);
	
	System.out.println("Fatura: ");
	System.out.printf("Pagamento Básico: %.2f%n", cr.getInvoice().getBasicPayment());
	System.out.printf(String.format("Imposto: %.2f%n", cr.getInvoice().getTax()));
	System.out.printf(String.format("Pagamento total: %.2f%n", cr.getInvoice().getTotalPayment()));
	
	
	sc.close();
	}
	
}
