package chap00_homework._20230321_Mid.clazz;

public class homeCalculator {
	public class homeAdd {
		int a = 1;
		int b = 2;	

		public int getA() {
			return a;
		}
		public void setA(int a) {
			this.a = a;
		}
		public int getB() {
			return b;
		}
		public void setB(int b) {
			this.b = b;
		}
		public int getResult() {
			return result;
		}
		public void setResult(int result) {
			this.result = result;
		}
		
		int result = a + b;
	}
	
}