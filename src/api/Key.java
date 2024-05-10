package api;

public class Key {
	public int num;
	
	public Key(int num) {
		this.num = num;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Key) {
			Key key = (Key)obj;
			if(this.num == key.num) {
				System.out.println("equals true 실행");
				return true;
			}
		}
		System.out.println("equals false 실행");
		return false;
	}
	
	@Override
	public int hashCode() {
		System.out.println("hashCode 실행");
		return num;
	}
}
