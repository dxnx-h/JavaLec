package chap10_abstraction.academy;

	public class computerAcademy extends nowAcademy {
	
		//어노테이션 @~
		//@Override: 오버라이드된 메소드라고 컴파일러에게 알림
		//@Override 없으면 컴파일러가 오버라이드된 메소드인지 부모와 자식을 계속 비교하면서 컴파일
		public void teach() {
			System.out.println("컴퓨터학원에서 가르친다.");
		}

		public void homework() {
			System.out.println("컴퓨터 학원에서 숙제를 한다");
		}

		public void rest() {
			System.out.println("컴퓨터 학원은 쉰다");
			}

	
		public void attendance(int subject) {
			System.out.println(subject + "개는 휴강한다");
			
			super.lastSubject= subject;

			
		}

}
