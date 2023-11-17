package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Member;


public interface MemberService {
	
	// ** selectList
	public List<Member> selectList();

	// ** selectOne
	public Member selectOne(String id);

	// ** save : insert, update
	public String save(Member entity);
		
	// ** delete
	public String delete(String id);

}