package chpa04_controlstatement;

public class _20_고쳐방_이해못함_advanceif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//early return 말고 else 사용해서 고치기
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
					(ch - 33) < 'A' ? 
							(char)(('Z' + 1) - ('A' - (ch - 33))) : 
							(char)(ch - 33);

			prStr = convertCh + prStr;
		}
		
		System.out.println(prStr);
	}

}
