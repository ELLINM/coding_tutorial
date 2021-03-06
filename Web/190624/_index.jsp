<!--signup-->

<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
   <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>

<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

	<form action="frontAction" method="post">
		<h2>회원 가입</h2>
			<p>
			<label for="Email" class="floatLabel">ID : </label>
			<input id="Email" name="userId" value="${userID} type="text">
			<br><font color="red">${message}</font>
			</p>
			<p>
			<label for="password" class="floatLabel">PW : </label>
			<input id="password" name="userPw" value="${userID}" type="password">
			</p>
			<p>
			<input type="submit" value="회원가입" id="submit">
			</p>
	<script>
			//Problem: Hints are shown even when form is valid
			//Solution: Hide and show them at appropriate times
			var $password = $("#password");
			var $confirmPassword = $("#confirm_password");

			//Hide hints
			$("form span").hide();

			function isPasswordValid() {
  				return $password.val().length > 8;
			}

			function arePasswordsMatching() {
  				return $password.val() === $confirmPassword.val();
			}

			function canSubmit() {
  				return isPasswordValid() && arePasswordsMatching();
			}

			function passwordEvent(){
   				 //Find out if password is valid  
  				  if(isPasswordValid()) {
     			 //Hide hint if valid
    			  $password.next().hide();
 			   } else {
 			     //else show hint
 			     $password.next().show();
   				 }
			}

			function confirmPasswordEvent() {
  			//Find out if password and confirmation match
  				if(arePasswordsMatching()) {
    				//Hide hint if match
    				$confirmPassword.next().hide();
 			 	} else {
   					 //else show hint 
   				 	$confirmPassword.next().show();
  					}
			}

			function enableSubmitEvent() {
  				$("#submit").prop("disabled", !canSubmit());
			}

			//When event happens on password input
			$password.focus(passwordEvent).keyup(passwordEvent).keyup(confirmPasswordEvent).keyup(enableSubmitEvent);

			//When event happens on confirmation input
			$confirmPassword.focus(confirmPasswordEvent).keyup(confirmPasswordEvent).keyup(enableSubmitEvent);

			enableSubmitEvent();
		</script>
	</form>

</body>
</html>


<!--Login-->
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

<form action="frontAction" method="post">
		<h2>로그인하기</h2>
			<p>
			<label for="Email" class="floatLabel">ID</label>
			<input id="Email" name="userId" value="${userID} type="text">
			<br><font color="red"></font>
			</p>
			<p>
			<label for="password" class="floatLabel">PW</label>
			<input id="password" name="userPw" value="${userID}" type="password">
			</p>
			<p>
			<input type="submit" value="회원가입" id="submit">
			</p>
	<script>
			//Problem: Hints are shown even when form is valid
			//Solution: Hide and show them at appropriate times
			var $password = $("#password");
			var $confirmPassword = $("#confirm_password");

			//Hide hints
			$("form span").hide();

			function isPasswordValid() {
  				return $password.val().length > 8;
			}

			function arePasswordsMatching() {
  				return $password.val() === $confirmPassword.val();
			}

			function canSubmit() {
  				return isPasswordValid() && arePasswordsMatching();
			}

			function passwordEvent(){
   				 //Find out if password is valid  
  				  if(isPasswordValid()) {
     			 //Hide hint if valid
    			  $password.next().hide();
 			   } else {
 			     //else show hint
 			     $password.next().show();
   				 }
			}

			function confirmPasswordEvent() {
  			//Find out if password and confirmation match
  				if(arePasswordsMatching()) {
    				//Hide hint if match
    				$confirmPassword.next().hide();
 			 	} else {
   					 //else show hint 
   				 	$confirmPassword.next().show();
  					}
			}

			function enableSubmitEvent() {
  				$("#submit").prop("disabled", !canSubmit());
			}

			//When event happens on password input
			$password.focus(passwordEvent).keyup(passwordEvent).keyup(confirmPasswordEvent).keyup(enableSubmitEvent);

			//When event happens on confirmation input
			$confirmPassword.focus(confirmPasswordEvent).keyup(confirmPasswordEvent).keyup(enableSubmitEvent);

			enableSubmitEvent();
		</script>
	</form>


</body>
</html>


<!--delete-->
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
	<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style>
@import "compass/css3";

$button: rgba(148,186,101,0.7);

body {
  background: #384047;
  font-family: sans-serif;
  font-size: 10px
}
form {
  background: #fff;
  padding: 4em 4em 2em;
  max-width: 400px;
  margin: 50px auto 0;
  box-shadow: 0 0 1em #222;
  border-radius: 2px;
  h2 {
    margin:0 0 50px 0;
    padding:10px;
    text-align:center;
    font-size:30px;
    color:darken(#e5e5e5, 50%);
    border-bottom:solid 1px #e5e5e5;
  }
  p {
    margin: 0 0 3em 0;
    position: relative;
  }
  input {
    display: block;
    box-sizing: border-box;
    width: 100%;
    outline: none;
    margin:0;
  }
  input[type="text"],
  input[type="password"] {
    background: #fff;
    border: 1px solid #dbdbdb;
    font-size: 1.6em;
    padding: .8em .5em;
    border-radius: 2px;
  }
  input[type="text"]:focus,
  input[type="password"]:focus {
    background: #fff
  }
  span {
    display:block;
    background: #F9A5A5;
    padding: 2px 5px;
    color: #666;
  }
  input[type="submit"] {
    background: $button;
    box-shadow: 0 3px 0 0 darken($button, 10%);
    border-radius: 2px;
    border: none;
    color: #fff;
    cursor: pointer;
    display: block;
    font-size: 2em;
    line-height: 1.6em;
    margin: 2em 0 0;
    outline: none;
    padding: .8em 0;
    text-shadow: 0 1px #68B25B;
  }
  input[type="submit"]:hover {
    background: rgba(148,175,101,1);
    text-shadow:0 1px 3px darken($button, 30%);
  }
  input[type="submit"]:hover {
    
  }
  label{
    position: absolute;
    left: 8px;
    top: 12px;
    color: #999;
    font-size: 16px;
    display: inline-block;
    padding: 4px 10px;
    font-weight: 400;
    background-color: rgba(255,255,255,0);
    @include transition(color .3s, top .3s, background-color .8s);
    &.floatLabel{
      top: -11px;
      background-color: rgba(255,255,255,0.8);
      font-size: 14px;
    }
	}
  
}
</style>
</head>
<body>
<form action="frontAction" method="post">
<input type="hidden" name="action" value="delete">
	<h2>탈퇴</h2>
		<p>
			<br><font color="red">${message}</font>
		</p>
		<p>
			<label for="password" class="floatLabel">PW : </label>
			<input id="password" name="userPw" value="${userID}" type="password">
		</p>
		<p>
			<input type="submit" value="탈퇴" id="submit">
		</p>
	<script>
			//Problem: Hints are shown even when form is valid
			//Solution: Hide and show them at appropriate times
			var $password = $("#password");
			var $confirmPassword = $("#confirm_password");

			//Hide hints
			$("form span").hide();

			function isPasswordValid() {
  				return $password.val().length > 8;
			}

			function arePasswordsMatching() {
  				return $password.val() === $confirmPassword.val();
			}

			function canSubmit() {
  				return isPasswordValid() && arePasswordsMatching();
			}

			function passwordEvent(){
   				 //Find out if password is valid  
  				  if(isPasswordValid()) {
     			 //Hide hint if valid
    			  $password.next().hide();
 			   } else {
 			     //else show hint
 			     $password.next().show();
   				 }
			}

			function confirmPasswordEvent() {
  			//Find out if password and confirmation match
  				if(arePasswordsMatching()) {
    				//Hide hint if match
    				$confirmPassword.next().hide();
 			 	} else {
   					 //else show hint 
   				 	$confirmPassword.next().show();
  					}
			}

			function enableSubmitEvent() {
  				$("#submit").prop("disabled", !canSubmit());
			}

			//When event happens on password input
			$password.focus(passwordEvent).keyup(passwordEvent).keyup(confirmPasswordEvent).keyup(enableSubmitEvent);

			//When event happens on confirmation input
			$confirmPassword.focus(confirmPasswordEvent).keyup(confirmPasswordEvent).keyup(enableSubmitEvent);

			enableSubmitEvent();
		</script>
	</form>

</body>
</html>


<!--index-->
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
   <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

	<h1>${sessionScope.loginId}</h1>
	
	<c:if test="${sessionScope.loginId==null}">
	<!-- null은 대괄호 안에 넣어 줄것 -->
		<a href="signup.jsp">회원가입하기</a>
		<a href="Login.jsp">로그인</a>
	</c:if>
	
	<c:if test="${sessionScope.loginId!=null}">	
	<a href="delete.jsp">탈퇴</a>
	<a href="frontAction?action=Logout">로그아웃</a>
	</c:if>
	
</body>
</html>


<!--board-->
<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Board</title>
</head>
<body>

	<form action="boardAction" method="get">
		<input type="hidden" value="boardWrite" name="action">
		<button>글등록</button>
	</form>

	<table>
		<c:forEach items="${bList}" var="board">
			<tr>
				<td>${board.boardSeq}</td>
				<td><a
					href="boardAction?action=detail&boardSeq=${board.boardSeq}">${board.title}</a></td>
				<td>${board.indate}</td>
				<td>${board.id}</td>
			</tr>
		</c:forEach>
	</table>

</body>
</html>


<!--boardWrite-->
<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Make Board</title>
</head>
<body>

	<form action="boardAction" method="post">
		<c:if test="${board.boardSeq!=null}">

			<input type="hidden" name="action" value="write">
		</c:if>

		<c:if test="${board.boardSeq!=null}">
			<input type="hidden" name="boardSeq" value="${board.boardSeq}">
			<input type="hidden" name="action" value="update">
		</c:if>

		<input type="hidden" name="action" value="write"> 제목 : <input
			type="text" name="title" value="${board.title}"><br> 내용
		: <br>
		<textarea rows="10" cols="30" name="content">${board.content}</textarea>
		<!-- textarea는 사이의 공간을 남겨두면 안됨 -->
		<c:if test="${board.boardSeq!=null}">
			<br>
			<input type="submit" value="글등록">
		</c:if>
		<c:if test="${board.boardSeq!=null}">
			<br>
			<input type="submit" value="글수정">
		</c:if>
	</form>

</body>
</html>


<!--boardDetail-->
<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>게시글</title>
</head>
<body>

	<c:if test="${sessionScope.loginId==board.id}">

		<form action="boardAction" method="post">
			<input type="hidden" name="action" value="delete"> <input
				type="hidden" name="boardSeq" value="${board.boardSeq}">
			<button>삭제하기</button>
		</form>

		<form action="boardAction" method="get">
			<input type="hidden" name="action" value="goUpdate"> <input
				type="hidden" name="boardSeq" value="${board.boardSeq}">
			<button>수정하기</button>
		</form>

	</c:if>

	<h1>제목 : ${board.title}</h1>
	<br>
	<br>
	<h4>게시자 : ${board.id}</h4>
	<br>
	<br>
	<h4>등록일 : ${board.indate}</h4>
	<br>
	<br> 내용 : ${board.content}
	<br>

	<a href="boardAction?action=board">목록</a>

</body>
</html>
