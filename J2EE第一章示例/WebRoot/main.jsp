<%@ page language="java" pageEncoding="gb2312" import="dhtest.Login"%>
<html>
<head>
	<title>��ӭʹ��</title>
</head>
<body>
	<%
		Login login=(Login)session.getAttribute("login");	//�ӻỰ��ȡ�� Login ����
		String lgn=login.getName();							//ͨ�� JavaBean �����ȡ�û���
	%>
	<%=lgn%>�����ã���ӭʹ��ͼ�����ϵͳ��
</body>
</html>
