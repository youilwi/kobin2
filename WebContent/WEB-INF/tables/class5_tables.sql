
CREATE TABLE users (
   id          VARCHAR2(100) PRIMARY KEY, -- 회원아이디
   name        VARCHAR2(100) NOT NULL, 	-- 회원이름
   pwd         VARCHAR2(100) NOT NULL, 	-- 비밀번호
   level       VARCHAR2(100),           -- 회원등급
   email       VARCHAR2(100),           -- 이메일
   phone       VARCHAR2(100),           -- 핸드폰번호
   company_num VARCHAR2(100),           -- 회사번호
   regdate     DATE                  	-- 가입일자
);

-- 회사
CREATE TABLE company (
   num  	VARCHAR2(100) PRIMARY KEY, 	-- 회사번호
   name 	VARCHAR2(100) NOT NULL, 	-- 회사이름
   addr 	VARCHAR2(100) NOT NULL  	-- 주소
   ceo		VARCHAR2(100),
   phone	VARCHAR2(100)
);

CREATE SEQUENCE company_seq NOCACHE;

-- 게시판
CREATE TABLE board (
   num       NUMBER        PRIMARY KEY, -- 게시판번호
   writer    VARCHAR2(100) CONSTRAINT board_id_fk REFERENCES users(id), -- 회원아이디
   title     VARCHAR2(100) NOT NULL, 	-- 글제목
   content   CLOB,                 		-- 내용
   viewCount NUMBER,              		-- 글조회수
   regdate   DATE                 		-- 작성일
);

CREATE SEQUENCE board_seq NOCACHE;

-- 게시판 덧글
CREATE TABLE board_comment(
   num           NUMBER        PRIMARY KEY, -- 댓글번호
   writer        VARCHAR2(100), 		-- 작성자
   content       VARCHAR2(500),			-- 내용
   target_id     VARCHAR2(100), 		-- 원글작성자
   ref_group     NUMBER,   				-- 게시판번호
   comment_group NUMBER,    			-- 덧글 내에서의 그룹
   regdate       DATE        			-- 작성일
);
