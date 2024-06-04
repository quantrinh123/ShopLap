package Model.Bean;

public class product {
	private int id;
	private String name;
	private String image;
	private double price;
	private String description;
	private String title;
	private int Sid;
	
	
	
	
	public product(int id, String name, String image, double price, String title, String description, int Sid) {
		super();
		this.id = id;
		this.name = name;
		this.image = image;
		this.price = price;
		this.title = title;
		this.description = description;
		this.Sid=Sid;
		
	}
	public int getSid() {
		return Sid;
	}
	public void setSid(int sid) {
		Sid = sid;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	@Override
	public String toString() {
		return "product [id=" + id + ", name=" + name + ", image=" + image + ", price=" + price + ", description="
				+ description + ", title=" + title + ", Sid=" + Sid + "]";
	}
	
	
	
	
}
