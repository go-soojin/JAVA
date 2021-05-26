<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset='utf-8'>
    <meta http-equiv='X-UA-Compatible' content='IE=edge'>
    <title>목록</title>
    <meta name='viewport' content='width=device-width, initial-scale=1'>
    <link rel='stylesheet' type='text/css' media='screen' href='${pageContext.request.contextPath}/resources/list.css'>
</head>
<body>
    <section class="wrap">
        <table>
            <thead>
                <tr>
                    <th>idx</th><th>이름</th><th>점수</th><th>생성일</th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <td>1</td><td>홍길동</td><td>100</td><td>2020-01-01</td>
                </tr>
                <tr>
                    <td>2</td><td>둘리</td><td>30</td><td>2020-01-01</td>
                </tr>
            </tbody>
        </table>
    </section>
</body>
</html>