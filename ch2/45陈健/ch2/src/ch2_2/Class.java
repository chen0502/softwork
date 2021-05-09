package ch2_2;

public class Class {
	private Light light;
	private Curtain curtain;
	private Computer computer;
	private Projector projector;
	private Microphone microphone;

	public Class() {
		light = new Light();
		curtain = new Curtain();
		computer = new Computer();
		projector = new Projector();
		microphone = new Microphone();
	}

	public void on() {
		light.on();
		curtain.on();
		computer.on();
		projector.on();
		microphone.on();
	}

	public void off() {

		light.off();
		curtain.off();
		computer.off();
		projector.off();
		microphone.off();
	}
}
