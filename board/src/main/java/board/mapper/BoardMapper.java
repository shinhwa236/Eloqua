package board.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import board.dto.BoardDTO;

@Mapper
public interface BoardMapper {
	List<BoardDTO> selectBoardList() throws Exception;
	
	void insertBoard(BoardDTO board) throws Exception;
	
	void updateHitCount(int boardIdx) throws Exception;
	
	BoardDTO selectBoardDetail(int boardIdx) throws Exception;
	
	void updateBoard(BoardDTO board) throws Exception;
	
	void deleteBoard(int boardIdx) throws Exception;
}
