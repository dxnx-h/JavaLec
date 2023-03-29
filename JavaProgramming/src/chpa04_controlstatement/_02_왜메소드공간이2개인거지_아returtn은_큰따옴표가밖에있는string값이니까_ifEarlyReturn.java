package chpa04_controlstatement;

public class _02_왜메소드공간이2개인거지_아returtn은_큰따옴표가밖에있는string값이니까_ifEarlyReturn {

	public static void main(String[] args) { 
		// TODO Auto-generated method stub
		// early return을 사용하면 훨씬 간단. 의미없음 굳.
		int lunchPrice = 10000;   //우선 점심값은 이걸로 고정할래 
		
		//자 그 다음엔 점심값이란 문자열에 대해 너네가 출력할 값을 입력해줄거야. 우선 준비 작업부터 하고..
		String str = getFeeling(lunchPrice);  //string은 문자열. 그래서 난 str에 대해서 getFeeling(lunchprice)에 대해서 아까 지정한 점심값 10000원에 따라 어떻게 나오는지 판단하고 출력할래
		System.out.println(str);  // str에 대해 정의한 공간이 여기기때문에 다른 곳으로 갈 순 없어. 무조건 메인 메소드가 안에 있어야 해. 

	}
		//그럼 이제 점심값에 대한 값을 판단해볼까??
		public static String getFeeling(int lunchPrice) {   
			//static은 정적인.고정된이란 뜻이고 이건 class에 고정하는 변수나 메서드야.
			//public static 이건 각 개체에서 이 값은 변환되면 안된다는거야.
			//그래서 이 문장은 getFelling이라는 문자는, lunchPrice라는 값이 무조건 들어간단거야
			
			if(lunchPrice >= 10000) {
				return "비싸다";
			}
			if(lunchPrice >= 8000) {
				return "조금 비싸다";
			}
			if (lunchPrice >= 6000) {
				return "적정하다";
			}
			return "싼편이다";   //마지막 return은 else의 역할을 한다.  사실 문장 수는 큰 차이가 없겠지만, 이 훠어어어얼씬 더 간단하지??
	}

}
