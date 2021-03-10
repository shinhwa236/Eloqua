package board.dto;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class BoardDTO {
	private int boardIdx;
	private String title;
	private String contents;
	private int hitCnt;
	private String creatorId;
	private LocalDateTime createdDatetime;
	private String updaterId;
	private LocalDateTime updatedDatetime;

}
