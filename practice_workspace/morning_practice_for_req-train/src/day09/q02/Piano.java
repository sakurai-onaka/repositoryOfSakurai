package day09.q02;

public class Piano extends Instrument{
	private String maker;
	private double weight;

	public Piano(String maker) {

		this.maker = maker;
		weight = 80.5;
	}

	@Override
	public String toString() {
		return "Piano [weight=" + weight + ", maker=" + maker + "]";
	}

	public void playMusic() {
		System.out.println(maker + "のピアノを弾きます。");

	}
	
	public String getMaker() {
		return maker;
	}

	public void setMaker(String maker) {
		this.maker = maker;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

}
