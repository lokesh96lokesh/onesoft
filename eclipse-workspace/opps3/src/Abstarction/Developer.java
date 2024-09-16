package Abstarction;

public abstract class Developer implements Human {
	public String eat(String eat) {
		return eat;
	}
	public int sleep(int sleep) {
		return sleep;
	}
	public int walk(int speed) {
		return speed;
	}
	public abstract String work(String job);
	public abstract String expreience(int exp);

}
