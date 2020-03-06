<%@ page import="com.dh.hobbyist.place.model.vo.PlaceCompany" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="com.dh.hobbyist.common.model.vo.Image" %><%--
  Created by IntelliJ IDEA.
  User: SOY
  Date: 2020-02-13
  Time: 오후 2:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<html>
<head>
    <title>Room info</title>
    <link rel="stylesheet" href="<%=request.getContextPath()%>/static/css/eun-css.css">
    <style>

    </style>
</head>
<body>
<%@include file="/views/common/menubar.jsp" %>
<%--<%@include file="category.jsp" %>--%>
<%@include file="/views/common/categorybar.jsp" %>
<%
    PlaceCompany company = (PlaceCompany) request.getAttribute("company");
    ArrayList<Image> images = (ArrayList<Image>) request.getAttribute("images");
    int currentPage = (int) request.getAttribute("currentPage");
%>
<br clear="both">
<div>
    <table class="standard-width " style="margin: 0 auto">
        <%--  --%>
        <tr>
            <td colspan="3">
                <%--회사명--%>
                <h1 class="do-hyun-font" style="float: left; margin: 0 30px"><%=company.getCompany_name()%>
                </h1>
                <%
                    String[] tags = company.getRoom_size().split(",");
                %>
                <%--공간규모--%>
                <% for (String t : tags) {%>
                <% if (t.equals("1")) { %>
                <div class="room-card-tag">일대일 공간</div>
                <% }
                    if (t.equals("2")) { %>
                <div class="room-card-tag">소규모 공간</div>
                <% }
                    if (t.equals("3")) { %>
                <div class="room-card-tag">대규모 공간</div>
                <%
                        }
                    }
                %>
            </td>
        </tr>
        <tr>
            <%--사진 목록보기.  --%>
            <td rowspan="">◀</td>
            <td style="width: 90%; ">
                <img src="<%=request.getContextPath()%>/static/images/studyRoom3.png"
                     style="width: 100%;" alt="">
            </td>
            <td rowspan="">▶</td>
        </tr>
        <tr>
            <td></td>
            <td>
                <br>
                <%-- 상세설명 직전 개요 --%>
                <table class="room-info-summary" style="float: left">
                    <tr>
                        <th>주소:</th>
                        <td><%=company.getAddress()%>
                        </td>
                    </tr>
                    <tr>
                        <th>전화:</th>
                        <td><%=company.getPhone()%>
                        </td>
                    </tr>
                    <tr>
                        <th>사이트:</th>
                        <td><%=company.getPhone()%>
                        </td>
                    </tr>
                    <tr>
                        <th>영업:</th>
                        <td><%=company.getService_time()%>
                        </td>
                    </tr>
                    <tr>
                        <%--                        <th>가격:</th>--%>
                        <%--                        <td></td>--%>
                    </tr>
                </table>
            </td>
            <td></td>
        </tr>
        <tr>
            <td></td>
            <th style="text-align: left">상세 설명</th>
            <td></td>
        </tr>
        <tr>
            <td></td>
            <td style="padding-left: 20px">
                <%=company.getIntro()%>
                <%--                Lorem ipsum dolor sit amet, consectetur adipisicing elit. Atque debitis eos illo nulla unde. Dolore--%>
                <%--                explicabo neque non rem sit, vel vitae. Accusamus minima molestiae nemo nihil numquam quam sint.--%>
                <%--                <br>--%>
                <%--                Lorem ipsum dolor sit amet, consectetur adipisicing elit. Commodi cum, dignissimos, est et eum expedita--%>
                <%--                facere, hic illo libero molestias numquam perferendis quae veritatis. Cupiditate distinctio nulla--%>
                <%--                pariatur quo reprehenderit.--%>
            </td>
            <td></td>
        </tr>
        <tr>
            <td></td>
            <td style="text-align: center">
                <br>
                <button style="width: 120px; height: 45px"
                        onclick="location.href='<%=request.getContextPath()%>/place/list.me?page=<%=currentPage%>'">목록보기
                </button>
            </td>
            <td></td>
        </tr>
    </table>
</div>
</body>
</html>
