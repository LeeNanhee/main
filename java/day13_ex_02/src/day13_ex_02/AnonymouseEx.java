package day13_ex_02;

public class AnonymouseEx implements buttonClickListner{

	public class Button{
		
		private buttonClickListner listener;
		
		public void setButtonListner(buttonClickListner listener) {
			this.listener = listener;
		}
		
		public void click() {
			if(listener != null) {
				this.listener.click();
			}
		}
	
	}
	
	public static void main(String[] args) {

		// 외부 클래스 : AnonymouseEx
		// 내부 클래스 : button 
		
		AnonymouseEx exam = new AnonymouseEx();
		AnonymouseEx.Button button = exam.new Button();
		
		// 내부 객체의 setButtonListner 메서드가 실행될때, 
		// 익명으로 클래스가 생성되는데, 
		// click의 기능을 재정의(구현) 한다. = 일회용
		
		
		button.setButtonListner(new buttonClickListner(){
			@Override
			public void click() {
				// 익명클래스 안에서 click의 기능을 구현
				System.out.println("버튼을 눌렀습니다.");
			}
		});
		
		button.click();
	}
}
