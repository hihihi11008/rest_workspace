package com.koreait.restproject.rest.controller.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.koreait.restproject.model.domain.Member;
import com.koreait.restproject.model.member.service.MemberService;

import lombok.extern.slf4j.Slf4j;

@RestController 
@Slf4j
public class MemberController {
	
	@Autowired
	private MemberService memberService;
	

	@GetMapping("/member")
	public String getList() {
		log.debug("?");
		return "ha ha ha";
	}
	
	@PostMapping("/member")
	public String regist(@RequestBody Member member) {
		log.debug("등록할거요??");
		log.debug("m_id"+member.getM_id());
		log.debug("m_pass"+member.getM_pass());
		log.debug("m_name"+member.getM_name());
		System.out.println(member.getM_name());
		
		memberService.regist(member);
		
		return "regist success"; 
	}
}