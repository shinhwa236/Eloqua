package board.service;

import java.util.List;

import board.dto.BoardDTO;

public interface BoardService {
	
	List<BoardDTO> selectBoardList() throws Exception;
	
	void insertBoard(BoardDTO board) throws Exception;
	
	BoardDTO selectBoardDetail(int boardIdx) throws Exception;
	
	void updateBoard(BoardDTO board) throws Exception;
	
	void deleteBoard(int boardIdx) throws Exception;
}
