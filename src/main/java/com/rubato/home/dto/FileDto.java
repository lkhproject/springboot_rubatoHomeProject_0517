package com.rubato.home.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FileDto {
	
	private int filenum; 			// 파일의 고유번호(기본키-시퀀스)
	private int forinum;			// 파일이 첨부된 원글의 게시판 글 번호
	private String fileorinum; 		// 첨부된 파일의 원래 이름
	private String filename;		// 첨부된 파일의 랜덤으로 바뀐 이름
	private String fileextension;	// 첨부된 파일의 확장자
	private String fileurl;			// 첨부된 파일이 실제로 저장된 서버의 저장경로
	
}
