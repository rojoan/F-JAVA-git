<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
		<form action="${pageContext.request.contextPath }/search" method="post">
			<table>
			<tr><td colspan="3"><input type="text" name="names"></td>
			<td colspan="1"><input type="submit" value="搜索"/></td></tr>
			<tr>
			<td><span>ID</span></td>	<td><span>名称</span></td>	 <td><span>价格</span></td>
			 <td><span>类型</span></td> <td><span>库存</span></td>
			</tr>
			<c:forEach items="${requestScope.goodsList }" var="goods">
				<tr>
				<td><span>${goods.id }</span></td> <td><span>${goods.name }</span></td>
				<td><span>${goods.price }</span></td> <td><span>${goods.type }</span></td>
				<td><span>${goods.stock }</span></td>
				
				<td><a href="${pageContext.request.contextPath }/getGoods?goodsId=${goods.id}">修改</a></td>
				<td><a href="${pageContext.request.contextPath }/goodsDelete?id=${goods.id}">删除</a></td>
				 </tr>
			</c:forEach>
			<tr><td colspan="2"><a href="${pageContext.request.contextPath }/jsp/goodsAdd.jsp">新增商品</a></td></tr>
			<tr><td><a href="${pageContext.request.contextPath }/goodsQueryAll">主页</a></td></tr>
		</table>
		</form>
</body>
</html>