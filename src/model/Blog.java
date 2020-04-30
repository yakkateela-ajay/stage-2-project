package model;
import java.time.LocalDate;
// Type your code
public class Blog
{


	String tittle;
	String description;
	LocalDate date;

	public Blog(String tittle, String description, LocalDate date) {
	
		this.tittle = tittle;
		this.description = description;
		this.date = date;
		
	}

	public String getTittle() {
		return tittle;
	}

	public void setTittle(String tittle) {
		this.tittle = tittle;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate evolution) {
		this.date = date;
	}

	

}