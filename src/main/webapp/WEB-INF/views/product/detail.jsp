<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
    <%@ include file="../layout/header.jsp" %>
        <h1>제품 목록 페이지</h1>
        <hr>
        <table border="1">
            <tr>
                <th>번호</th>
                <th>제품명</th>
                <th>가격</th>
                <th>재고</th>
                <th>등록일</th>
            </tr>
            <tr>
                <td>${product.id}</td>
                <td>${product.name}</td>
                <td>${product.price}</td>
                <td>${product.qty}</td>
                <td>${product.createdAt}</td>
            </tr>
        </table>
        <form action="/product/${id}/buy" method="post">
            <input type="number" name="buyCount" min="1" max="${product.qty}" value="1">
            <button type="submit">구매</button>
        </form>
        <%@ include file="../layout/footer.jsp" %>