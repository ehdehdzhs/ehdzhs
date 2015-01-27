create table userinfo(
   userid varchar2(50) primary key,
   password varchar2(50) not null,
   name varchar2(50) not null,
   email varchar2(50) not null

)

insert into USERINFO values('ehdzhs','12345','홍길동','nono.naver.com');
insert into USERINFO values('test002','12345','홍길동2','yes.naver.com');
insert into USERINFO values('test003','12345','홍길동3','oops.naver.com');

select * from userinfo;
