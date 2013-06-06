<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/styles.css" />
    <script type="text/javascript" src="http://code.jquery.com/jquery.min.js"></script>
</head>
<body>
	<h1>Yah! It was uploaded!</h1>
	
	<p>You uploaded the following:</p>
	
	<p>${uploadedModel.name} (${uploadedModel.key})</p>
    <c:if test="${not empty uploadedModel.firstNameTranslation}">
       <h2>First Name Changes</h2>
       <br />Max characters: ${uploadedModel.firstNameTranslation.maxChars}
       <br />Offset: ${uploadedModel.firstNameTranslation.offset}
       <ul>
           <c:forEach items="${uploadedModel.firstNameTranslation.elements}" var="element">
               <li><strong>${element.letter}</strong> - ${element.sound}</li>
           </c:forEach>
       </ul>
    </c:if>
    <c:if test="${not empty uploadedModel.lastNameTranslation}">
       <h2>Last Name Changes</h2>
       <br />Max characters: ${uploadedModel.lastNameTranslation.maxChars}
       <br />Offset: ${uploadedModel.lastNameTranslation.offset}
       <ul>
           <c:forEach items="${uploadedModel.lastNameTranslation.elements}" var="element">
               <strong>${element.letter}</strong> - ${element.sound}
           </c:forEach>
       </ul>
    </c:if>
</body>
</html>