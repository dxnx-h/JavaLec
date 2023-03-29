package chap18_enum.enums;

public enum Season {
	SPRING("봄") {
		public void seasonMon() {
			System.out.println(this.getDeclaringClass() + "은 3, 4, 5월 입니다.");
		}
	}
	
	
	
	, SUMMER("여름") {
		public void seasonMon() {
			System.out.println(this.getDeclaringClass() + "은 6, 7, 8월 입니다.");
		}
	}
	
	
	
	, FALL("가을"){
		public void seasonMon() {
			System.out.println(this.getDeclaringClass() + "은 9, 10, 11월 입니다.");
		}
	}
	
	
	
	, WINTER("겨울"){
		public void seasonMon() {
			System.out.println(this.getDeclaringClass() + "은 12, 1, 2월 입니다.");
		}
	};

	
	private String KoresaSeason;
	
	Season(String KoresaSeason) {
		this.KoresaSeason = KoresaSeason;
	}

	public String getKoresaSeason() {
		return KoresaSeason;
	}

	public abstract void seasonMon(); //1. 추상메소드 먼저 선언
}
