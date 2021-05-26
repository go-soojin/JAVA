<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en" dir="ltr">
  <head>
    <meta charset="utf-8">
    <meta http-equiv='X-UA-Compatible' content='IE=edge'>
    <title>학생 성적 보기</title>
    <meta name='viewport' content='width=device-width, initial-scale=1'>
    <link rel='stylesheet' type='text/css' media='screen' href='${pageContext.request.contextPath}/resources/list.css'>
  </head>
  <body>
    <section class="wrap">
      <table>
        <thead>
          <tr>
              <th>idx</th><th>학생 이름</th><th>중간고사 성적</th><th>기말고사 성적</th><th></th><th></th>
          </tr>
        </thead>
        <tbody>
			${list }
        </tbody>
      </table>

    </section>

  </body>
</html>
