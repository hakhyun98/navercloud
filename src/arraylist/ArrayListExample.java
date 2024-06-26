package arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
	public static void main(String[] args) {
		List<Board> boardList = new ArrayList<>();

		boardList.add(new Board("제목1", "내용1", "글쓴이1"));
		boardList.add(new Board("제목2", "내용2", "글쓴이2"));
		boardList.add(new Board("제목3", "내용3", "글쓴이3"));
		boardList.add(new Board("제목4", "내용4", "글쓴이4"));
		boardList.add(new Board("제목5", "내용5", "글쓴이5"));

		int size = boardList.size();
		System.out.println("총 객체 수: " + size);
		System.out.println();

		Board board = boardList.get(2);
		System.out.println(board.getSubject() + "\t" + board.getContent() + "\t" + board.getWriter());
		System.out.println();

		for (int i = 0; i < boardList.size(); i++) {
			Board b = boardList.get(i);
			System.out.println(b.getSubject() + "\t" + b.getContent() + "\t" + b.getWriter());
		}
		System.out.println();

		boardList.remove(2);
		boardList.remove(2);

		for (Board b : boardList) {
			System.out.println(b.getSubject() + "\t" + b.getContent() + "\t" + b.getWriter());
		}
	}
}

