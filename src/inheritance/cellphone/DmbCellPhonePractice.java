package inheritance.cellphone;

public class DmbCellPhonePractice {
	public static void main(String[] args) {

		DmbCellPhone cellPhone = new DmbCellPhone(20, "자바폰", "파랑");

		System.out.println("모델 : " + cellPhone.model);
		System.out.println("색상 : " + cellPhone.color);
		System.out.println("채널 : " + cellPhone.channel);

		//CellPhone class
		cellPhone.powerOn();
		cellPhone.bell();
		cellPhone.sendVoice("안녕하세요");
		cellPhone.receiveVoice("반갑습니다.");
		cellPhone.hangUp();
		
		//DmbCellPhone class
		cellPhone.turnOnDmb();
		cellPhone.changeDmbChannel(40);
		cellPhone.turnOffDmb();
	}
}
