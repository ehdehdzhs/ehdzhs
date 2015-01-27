package com.oraclejava.sample5;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

import javax.sql.DataSource;

import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;

public class UserInfoBean {
      public void showUserInfo(){
         JdbcTemplate jt = new JdbcTemplate(this.dataSource);
         
         String sql = "select * from userinfo";
         //시험문제
         List<Map<String, Object>> list = jt.queryForList(sql);
         
         for(int i=0;i<list.size();i++){
            Map<String, Object> userMap = list.get(i);
            String userid = (String) userMap.get("userid");
            String password = (String) userMap.get("password");
            String name = (String) userMap.get("name");
            String email = (String) userMap.get("email");
            System.out.println(userid + " " + password +" " + name + " "+ email);
         }
      }
      
      public void addUserInfo() {
    	  JdbcTemplate jt = new JdbcTemplate(this.dataSource);
    	  
    	  String sql = "insert into userinfo(userid, password, name, email) values(?,?,?,?)";
    	  System.out.print("아이디:");
    	  Scanner scan = new Scanner(System.in);
    	  String id = scan.nextLine();
    	  System.out.print("비번:");
    	  String passw = scan.nextLine();
    	  System.out.print("이름:");
    	  String name = scan.nextLine();
    	  System.out.print("이메일:");
    	  String email = scan.nextLine();
    	  
    	  jt.update(sql, id, passw, name, email);
    	  
    	  System.out.println("입력이 완료되었습니다.");
      }
      
      public void findUserInfo() {
    	  JdbcTemplate jt = new JdbcTemplate(this.dataSource);
    	  
    	  String sql = "select name from userinfo where userid=?";
    	  
    	  Scanner scan = new Scanner(System.in);
    	  System.out.println("검색하실 아이디는? ");
    	  String searchId = scan.nextLine();
    	  try {
    		  String findName = (String)jt.queryForObject(sql, new Object[]{searchId}, String.class);
    		  if(findName==null) {
    			  System.out.println("그런 아이디는 없습니다.");
    		  } else {
    			  System.out.println("이름: " + findName);
    		  }
    	  } catch(EmptyResultDataAccessException e) {
    		  System.out.println("그런 아이디는 없습니다.");
    	  }
    	  
      }
      
      public void delUserInfo() {
    	  JdbcTemplate jt = new JdbcTemplate(this.dataSource);
    	  
    	  String sql = "select name from userinfo where userid=?";
    	  String sql1 = "delete from userinfo where userid=?";
    	  Scanner scan = new Scanner(System.in);
    	  System.out.println("삭제하실 아이디는? ");
    	  String delId = scan.nextLine();
    	  try {
    		  String findName = (String)jt.queryForObject(sql, new Object[]{delId}, String.class);
    		  if(findName==null) {
    			  System.out.println("그런 아이디는 없습니다.");
    		  } else {
    			  jt.update(sql1, delId);
    			  System.out.println("아이디 " + delId + " 삭제되었습니다.");
    		  }
    	  } catch(EmptyResultDataAccessException e) {
    		  System.out.println("그런 아이디는 없습니다.");
    	  }
    	  
      }

      //반드시 set을 만들어 주어야 한다.
      private DataSource dataSource;
      public void setDataSource(DataSource dataSource) {
         this.dataSource = dataSource;
      }
      
      
}