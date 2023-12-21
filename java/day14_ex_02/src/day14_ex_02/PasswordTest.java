package day14_ex_02;

public class PasswordTest {

	private String password;
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) throws PasswordException{
		
		if(password == null) {
			// 강제로 PasswordException 발생시킴
			throw new PasswordException("비밀번호는 null일 수 없습니다.");
		}
		else if( password.length() < 5){
			throw new PasswordException("비밀번호는 5자 이상이어야 합니다.");
		}
		else if (password.matches("[a-zA-Z]+")){
			throw new PasswordException("비밀번호는 숫자나 특수문자를 포함해야 합니다.");
		}
		
		
		this.password = password;
	}

}
