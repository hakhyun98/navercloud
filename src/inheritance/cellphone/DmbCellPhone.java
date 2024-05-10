package inheritance.cellphone;

public class DmbCellPhone extends CellPhone {
	int channel;

	public DmbCellPhone(int channel, String model, String color) {
		this.channel = channel;
		this.model = model;
		this.color = color;
	}

	void turnOnDmb() {
		System.out.println("채널 " + channel + " 번 Dmb를 킵니다.");
	}

	void changeDmbChannel(int channel) {
		this.channel = channel;
		System.out.println("Dmb의 채널을 " + channel + "번으로 바꿉니다.");
	}

	void turnOffDmb() {
		System.out.println("Dmb를 끕니다.");
	}
}
