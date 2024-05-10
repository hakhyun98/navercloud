package interface_noname_implement;

public class RemoteController {
	public static void main(String[] args) {
		RemoteControll remote = new RemoteControll() {
			public void turnOn() {
				System.out.println("전원을 켭니다.");			
			}
			public void turnOff() {
				System.out.println("전원을 끕니다.");
			}
			public void setVolume(int volume) {
				volume = RemoteControll.MAX_VOLUME;
				System.out.println("볼륨 : " + volume);
				
			}
		};
		remote.turnOn();
		remote.turnOff();
		remote.setVolume(5);
		remote.setMute(true);
		RemoteControll.changeBattery();
	}
}
