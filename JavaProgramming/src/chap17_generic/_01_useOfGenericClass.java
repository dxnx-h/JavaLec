package chap17_generic;

import chap17_generic.clazz.BoardFile;
import chap17_generic.clazz.FreeBoard;
import chap17_generic.clazz.NoticeBoard;

public class _01_useOfGenericClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BoardFile<FreeBoard> fBoardFile = new BoardFile<FreeBoard>(); //BoardFile은 지금 FreeBoar라고 선언했지만 여기까지 하면 값이 들어와있는 게 없음
	    //                                               ^생성자 호출 시에도 타입명시
		
		//아래부터 값 세팅하기 위해 
		FreeBoard fBoard = new FreeBoard(); //프리보드 객체를 만든 다음에
		fBoard.setfBoardNo(1); //이케넣어주고
		fBoard.setfBoardTitle("test"); //이케넣어주고
		fBoard.setfBoardContent("테스트입니다."); //이케넣어주고 
		
		fBoardFile.setT(fBoard);  //T를 프리보드를 담아주겠다. T를 fBoard로 세팅하겠다. 
		
		//값세팅 2안
		/*
		 *fBoardFile.setT(new FreeBoard());
		 *fBoardFile.getT().setfBoardNo(1);
		 *fBoardFile.getT().setfBoardTitle("test");
		 *fBoardFile.getT().setfBoardContent("테스트입니다.");
		 *
		 *fBoardFile.setBoardNo(fBoardFile.getT().getfBoardNo()); //첨부파일 번호로 게시글 넣기
		 */
		
		
		fBoardFile.setBoardNo(fBoardFile.getT().getfBoardNo()); 
		//T를 꺼내오면, 1, test, 테스트입니다까지 꺼내오는데.... 그 다음에 거기에 있는 f보드넘버를 보드파일넘겁에 세팅
		
		
		
		fBoardFile.setType(
				fBoardFile.getT()
						  .getClass()
						  .getSimpleName()
						  .equals("FreeBoard") //[삼항연산자]T의 클래스명이 푸리보드랑 동일하면 1, 아니면 2
						  ? 1 : 2 );
		
		
		fBoardFile.setBoardFileNm("첨부파일");
		
		System.out.println(fBoardFile);
		
		System.out.println("=======================");
		
		BoardFile<NoticeBoard> nBoardFile = new BoardFile<NoticeBoard>();
		NoticeBoard nBoard = new NoticeBoard(); //노티보드 객체를 만든 다음에
		nBoard.setnBoardNo(1); //이케넣어주고
		nBoard.setnBoardTitle("btest"); //이케넣어주고
		nBoard.setnBoardContent("b테스트입니다."); //이케넣어주고 
		
		nBoardFile.setT(nBoard);  //T를 프리보드를 담아주겠다. T를 fBoard로 세팅하겠다. 
		
		nBoardFile.setBoardNo(nBoardFile.getT().getnBoardNo()); 
		//T를 꺼내오면, 1, test, 테스트입니다까지 꺼내오는데.... 그 다음에 거기에 있는 f보드넘버를 보드파일넘겁에 세팅
		
		
		/*
		nBoardFile.setType(
				nBoardFile.getT().getClass().getSimpleName().equals("NoticeBoard")
				? 2 : 1 //       [^simplename(클래스명)을 끌어오기 위한 선행. 그냥 네임은 패키지명까지 끌어옴]
		);
		*/
		
		nBoardFile.setType(
				nBoardFile.getT()
						  .getClass()
						  .getSimpleName() 
						  .equals("FreeBoard") //[삼항연산자]T의 클래스명이 푸리보드랑 동일하면 1, 아니면 2
						  ? 1 : 2 );
		
		
		nBoardFile.setBoardFileNm("첨부파일");
		
		System.out.println(nBoardFile);
		
		
	}

}
