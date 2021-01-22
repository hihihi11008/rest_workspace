package com.koreait.restproject.message;

import lombok.Data;

@Data
public class Message {
	private String msg; // 클라이언트가 보게될 메시지 
	private int statusCode;//실패,성공여부 판단코드(http상태코드 200,4040,500 ...)
	//private String url; //새롭게 요청할 페이지가 있다면 그 url
}
