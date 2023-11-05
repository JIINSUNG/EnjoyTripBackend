package com.ssafy.tripoline.board.model.dto;

import java.io.Serializable;
import java.sql.Date;

import io.swagger.annotations.ApiParam;
import lombok.Data;
import lombok.NonNull;

@Data
public class Article implements Serializable {
	@ApiParam(value="게시글 번호", required=true)
	@NonNull // 필수속성 지정 
	private String articleId;
	
	@NonNull // 필수속성 지정 
	@ApiParam(value="게시글 제목", required=true)
	private String articleTitle;
	
	@ApiParam(value="게시글 내용")
	private String articleContent;
	
	@ApiParam(value="작성자 아이디")
	private String memberId;
	
	@ApiParam(value="작성자 이름")
	private int memberName;
	
	@ApiParam(value="게시글 좋아요 수")
	private int like;
	
	@ApiParam(value="게시글 조회 수")
	private int hit;
	
	@ApiParam(value="게시글 등록일자")
	private Date registerTime;
	
	@ApiParam(value="게시글 수정일자")
	private Date updateTime; 
	
	@ApiParam(value="게시글 분류번호")
	private int categoryId;
	
	@ApiParam(value="첨부 이미지")
	private String image;
	
}
