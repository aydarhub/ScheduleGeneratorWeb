<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: aydarhub
  Date: 26.05.17
  Time: 18:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Schedule</title>
</head>
<body>
<a href="schedule">Нажмите, чтобы сгенерировать новые расписания.</a>
    <c:forEach items="${requestScope.schedules}" var="schedule">
    <table border="1">
        <tr>
            <c:forEach items="${schedule}" var="group">
                <td>
                    <table border="1">
                        <c:forEach items="${group}" var="day">
                            <tr>
                                <td>
                                    <table border="1">
                                        <c:forEach items="${day}" var="lessonInterval">
                                            <tr bgcolor="#fff8dc">
                                                <td>${lessonInterval.lesson.group.name}</td>
                                                <td>${lessonInterval.lesson.discipline.name}</td>
                                            </tr>
                                            <tr bgcolor="#fff8dc">
                                                <td>${lessonInterval.lesson.audience.number}</td>
                                                <td>${lessonInterval.lesson.teacher.name}</td>
                                            </tr>
                                            <tr>
                                                <td></td>
                                                <td></td>
                                            </tr>
                                        </c:forEach>
                                    </table>
                                </td>
                            </tr>
                        </c:forEach>
                    </table>
                </td>
            </c:forEach>
        </tr>
    </table>
        <br>
    </c:forEach>
</body>
</html>
