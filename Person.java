public class Person implements HumanOperations {
	private String eyeColor;
	private String height;
	private String name;
	private int age;
	private static int countOfPeople = 0;

	public Person(String eyeColor, String height, String name, int age) {
		this.eyeColor = eyeColor;
		this.height = height;
		this.name = name;
		this.age = age;
		countOfPeople++;
	}
	
	public String getEyeColor() {
		return eyeColor;
	}
	public void setEyeColor(String eyeColor) {
		this.eyeColor = eyeColor;
	}
	public String getHeight() {
		return height;
	}
	public void setHeight(String height) {
		this.height = height;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public static int getCountOfPeople() {
		return countOfPeople;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public boolean isOfAge() {
		if(age >= 21) {
			return true;
		} 
		return false;
	}
}
