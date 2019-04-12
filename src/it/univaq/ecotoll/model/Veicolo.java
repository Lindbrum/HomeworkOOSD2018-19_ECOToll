package it.univaq.ecotoll.model;

public class Veicolo {
	private String category;
	private String model;
	private String brand;
	private short year;
	private String plate;
	private short axes;
	private int weight;
	private int height;
	
	public Veicolo(String model, String brand, short year, String plate, short axes, int weight, int height) {
		//super();
		this.model = model;
		this.brand = brand;
		this.year = year;
		this.plate = plate;
		this.axes = axes;
		this.weight = weight;
		this.height = height;
		
		//Associa la categoria corretta al veicolo
		if (this.axes < 2 || this.axes == 2 && this.height <= 130)
			this.category = "A";
		else if (this.axes == 2 && this.height > 130 )
			this.category = "B";
		else if (this.axes == 3)
			this.category = "3";
		else if (this.axes == 4)
			this.category = "4";
		else if (this.axes >= 5)
			this.category = "5";
		else this.category = "unknown";
		
	}
	
	public Veicolo(String model, String brand, short year, String plate, short axes, int weight, int height, String category) {
		//super();
		this.model = model;
		this.brand = brand;
		this.year = year;
		this.plate = plate;
		this.axes = axes;
		this.weight = weight;
		this.height = height;
		this.category = category;
		
		if (category == null) {
			//Associa la categoria corretta al veicolo
			if (this.axes < 2 || this.axes == 2 && this.height <= 130)
				this.category = "A";
			else if (this.axes == 2 && this.height > 130 )
				this.category = "B";
			else if (this.axes == 3)
				this.category = "3";
			else if (this.axes == 4)
				this.category = "4";
			else if (this.axes >= 5)
				this.category = "5";
			else this.category = "unknown";
		}
		
	}
	
	public Veicolo() {
		this.model = "a vehicle model";
		this.brand = "a vehicle brand";
		this.year = 1995;
		this.plate = "XXXXXXX";
		this.axes = 2;
		this.weight = 1000;
		this.height = 130;
		this.category = "vehicle category (A,B,3,4,5)";
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public short getYear() {
		return year;
	}

	public void setYear(short year) {
		this.year = year;
	}

	public String getPlate() {
		return plate;
	}

	public void setPlate(String plate) {
		this.plate = plate;
	}

	public short getAxes() {
		return axes;
	}

	public void setAxes(short axes) {
		this.axes = axes;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
	
	
	
	
}
