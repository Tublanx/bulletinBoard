package com.tublanx.bulletinBoard.domain;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class PostVO {

	private Long postNo;

	private String postName;

	private String author;

	private LocalDateTime createdDate;

	private LocalDateTime modifiedDate;

}