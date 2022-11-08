package Encapsulation;

public class Bikes {
	private String name;
	private Integer cc;
	private String color;
	private Integer price;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getCc() {
		return cc;
	}
	public void setCc(Integer cc) {
		this.cc = cc;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	public Bikes(String name, Integer cc, String color, Integer price) {
		super();
		this.name = name;
		this.cc = cc;
		this.color = color;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Bikes [name=" + name + ", cc=" + cc + ", color=" + color + ", price=" + price + "]";
	}
	

}
