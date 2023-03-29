package chpa04_controlstatement;

public class _20_1_이해못함_원본답변_advanceif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "dBEfIZ";
		String prStr = "";
		
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			
			char convertCh = ch >= 'A' && ch <= 'Z' 
					?
					(ch + 33) > 'z' ? 
							(char)(('a' - 1) + ((ch + 33) - 'z')) :
							(char)(ch + 33)	
					:
					(ch - 33) < 'A' ?  //33을 뻇을 때 문제가 되는건 A보다 작아질때임. 
							(char)(('Z' + 1) - ('A' - (ch - 33))) : //그래서 +1이 되는 걸 . 91부터 한 칸씩 줄어들게끔 하기
							(char)(ch - 33);

			prStr = convertCh + prStr;
		}
		
		System.out.println(prStr);
	}

}
