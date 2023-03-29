package chpa04_controlstatement;

public class _01_ifStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int lunchPrice = 10000;  //우선 먼저 lunchprice는 10,000이야.
		
		if(lunchPrice >= 10000) {             //자, 만약 lunchprice가 10,000원 이상이면,
			System.out.println("너무 비싸다");   //"너무 비싸다"라고 출력을 해줘
		} else if(lunchPrice >= 8000) {       //근데 10,000원 이상이 아니라 그거보단 작고 8,000원 이상이면
			System.out.println("조금 비싸다");   //"조금 비싸다"라고 출력해줘
		} else if(lunchPrice >= 6000) {       //엥 근데 8,000원보다도 작고 6,000원 이상이면
			System.out.println("적정하다");     //"적정하다"고 표현해줄래?
		} else {                              //마지막으로 위 조건 모두에 해당하지 않으면,
			System.out.println("싼 편이다");    //"싼 편이다"라고 출력하면 된대
		}

	}

}
