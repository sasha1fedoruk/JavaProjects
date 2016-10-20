
public class Roslinka {
	private double wysokosc;
	
	public Roslinka(double wysokosc) {
		this.wysokosc = wysokosc;
	}
	public void setRoslinkaDouble(double wysokosc) {
		this.wysokosc = wysokosc;
	}
	public double getWysokosc(){
		return wysokosc;
	}
	public void setWysokosc(double wysokosc){
		this.wysokosc = wysokosc;
	}
	private void podlej(){
		System.out.println("Podlana");
	}
	@Override
	public String toString(){
		return "Roslinka [wysokosc=" + wysokosc + "]";
	}

	
}
