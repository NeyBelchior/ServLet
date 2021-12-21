<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c"%>
<html>

<body>
<c:if test="${not empty empresa}">
Empresa ${empresa} Cadastrada Com Sucesso!
</c:if>
<c:if test="${ empty empresa}">
Nenhuma empresa Cadastrada!
</c:if>
</body>


</html>