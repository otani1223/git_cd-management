package dto;

public class Cd {
	private String name; //CDの名前
	private String art; //アーティスト名
	private String price; //値段
	
	public Cd(String name, String art, String price) {
		super();
		this.name = name;
		this.art = art;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getArt() {
		return art;
	}

	public void setArt(String art) {
		this.art = art;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}
	
	
}
