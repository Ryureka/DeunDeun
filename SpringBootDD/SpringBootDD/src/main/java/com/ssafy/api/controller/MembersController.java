package com.ssafy.api.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ssafy.api.dto.Members;
import com.ssafy.api.service.MembersService;

@CrossOrigin("*")
@RestController
@RequestMapping(value = "/members", method = RequestMethod.POST)
public class MembersController {
	
	@Autowired
	public MembersService membersService;
	
	@RequestMapping(value = "/all", method = RequestMethod.GET)
	public List<Members> tete() {
		return membersService.selectAllMembers();
	}
	
	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public Members insertMember(@RequestBody Members member) {
		membersService.insertMember(member);
		return membersService.selectMemberById(member.getMember_id());
	}
	
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public void Login(@RequestBody Members member) {
		Members existMember=membersService.selectMemberByEmail(member.getEmail());
		if(existMember!=null) {
			if(member.getPassword().equals(existMember.getPassword())) {
//				session.setAttribute("email",member.getEmail());
//				session.setAttribute("grade",member.getGrade());
//				return ""; 
			}
		}
		System.out.println(member.getEmail());
//		return "abc";
	}
	
	@RequestMapping(value = "/count", method = RequestMethod.GET)
	public int countAllMembers() {
		return membersService.countAllMembers();
	}
}
