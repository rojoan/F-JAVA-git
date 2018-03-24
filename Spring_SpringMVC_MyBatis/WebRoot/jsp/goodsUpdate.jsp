<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
		<form action="${pageContext.request.contextPath }/goodsUpdate" method="post">
			<input type="hidden" name="id" 	value="${goods.id }"/>
		<table>
			<tr><td>名称</td>		<td><input type="text" name="name" 	value="${goods.name }"/></td></tr>
			<tr><td>价格</td>		<td><input type="text" name="price" value="${goods.price }"/></td></tr>
			<tr><td>类型</td>		<td><input type="text" name="type" 	value="${goods.type }"/></td></tr>
			<tr><td>库存</td>		<td><input type="text" name="stock" value="${goods.stock }"/></td></tr>
			<tr><td colspan="2" style="text-align:center">
				<input type="submit" value="确定"/></td></tr>
		</table>
		</form>
</body>
</html>