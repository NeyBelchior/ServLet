<% 
String nomeEmpresa = (String)request.getAttribute("empresa");
System.out.println(nomeEmpresa);




%>


<html>

<body>

Empresa <%=nomeEmpresa%>Cadastrada Com Sucesso!
</body>


</html>