package kr.board.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Update;

import kr.board.entity.AuthVO;
import kr.board.entity.Board;
import kr.board.entity.Member;

//@Mapper // -mybatis API
public interface MemberMapper {
     public Member registerCheck(String memID);
     public int register(Member m); //회원등록(1,0)
     public Member memLogin(String username); //로그인체크
     public int memUpdate(Member mvo); //수정하기
     public Member getMember(String memID);
     public void memProfileUpdate(Member mvo);
	 public void authInsert(AuthVO saveVO);
	public void authDelete(String memID);
      
} 
