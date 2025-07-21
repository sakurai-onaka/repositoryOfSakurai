package day05.q02;

public class Vallidation {
	public boolean checkId(int id) {
		boolean flag = false;
		if(id == 1111 || id == 2222) {
			flag = true;
		}
		return flag;
	}
}
