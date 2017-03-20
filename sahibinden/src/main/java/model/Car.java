package model;

public class Car {
	
	public String Color;
	public String Year;
	public String Km;
	public String Residence;
	public String Price;
	public String URL;
	public String Img;
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return Color +"\t"+ Year + "\t"+Km +"\t"+ Residence + "\t"+Price + "\t"+URL + "\t"+Img;
	}
	
	
	public String getImg() {
		return Img;
	}
	public void setImg(String img) {
		Img = img;
	}
	public String getColor() {
		return Color;
	}
	public void setColor(String color) {
		Color = color;
	}
	public String getYear() {
		return Year;
	}
	public void setYear(String year) {
		Year = year;
	}
	public String getKm() {
		return Km;
	}
	public void setKm(String km) {
		Km = km;
	}
	public String getResidence() {
		return Residence;
	}
	public void setResidence(String residence) {
		Residence = residence;
	}
	public String getPrice() {
		return Price;
	}
	public void setPrice(String price) {
		Price = price;
	}
	public String getURL() {
		return URL;
	}
	public void setURL(String uRL) {
		URL = uRL;
	}
	

}
