package chap13.objectarry.clazz2;



public class English2 extends subjectTime implements ILecture1 {

	public English2(String subject, int studentCnt, 
			      int lectureTime) {
		super(subject, studentCnt, lectureTime);
	}
	


	
	@Override
	public void proceedLecture() {
		// TODO Auto-generated method stub

			System.out.println("영어수업을 100명의 학생이 듣습니다."
					  + " 수업시간은 50분입니다."); 
			System.out.println(this.subject + "수업을 " + this.studentCnt + "명의 학생이 듣습니다. 수업시간은 " 
                    + lectureTime + "분입니다.");
			
	
	}

	
}
