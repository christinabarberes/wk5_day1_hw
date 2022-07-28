package wk5_day1_hw;

public class Phone
{
	private String os = "IOS";
	private String model = "iPhone 12";
	private String provider = "Verizon";
	
	public Phone(String os, String model)
	{
		super();
		this.os = os;
		this.model = model;
	}

	public Phone(String os, String model, String provider)
	{
		super();
		this.os = os;
		this.model = model;
		this.provider = provider;
	}

	public String getOs()
	{
		return os;
	}

	public void setOs(String os)
	{
		this.os = os;
	}

	public String getModel()
	{
		return model;
	}

	public void setModel(String model)
	{
		this.model = model;
	}

	public String getProvider()
	{
		return provider;
	}

	public void setProvider(String provider)
	{
		this.provider = provider;
	}
	
	public Boolean isApple() {
		
		return os=="IOS";
	}
	
	public String print() {
		
		return "OS: " + os + " Model: " + model + " Provider: " + provider;
	}
	
	public static void main (String[] args) {
		
		System.out.println("at least the lights are on");
		Phone myPhone = new Phone("IOS", "iPhone");
		System.out.println(myPhone.print());
	}

}
