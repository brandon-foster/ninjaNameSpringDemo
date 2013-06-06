<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/styles.css" />
    <script type="text/javascript" src="http://code.jquery.com/jquery.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/assets/js/scripts.js"></script>
</head>
<body>

<h1>Hello from Spring!</h1>
<form>

    <div>
        What type of name do you want?
	    <select name="nameType">
	       <c:forEach items="${names}" var="name">
	           <option value="${name.key}">${name.value}</option>
	       </c:forEach>
	    </select>
    </div>
    
    <div>
        What's your first name? &nbsp; <input type="text" name="firstName" />
    </div>
    
    <div>
        What's your last name? &nbsp; <input type="text" name="lastName" />
    </div>
    
    <input type="submit" value="Get your name" />
    
    <div id="nameDisplay" style="display:none;">
        Your requested name is <strong></strong>.
    </div>
</form>
</body>
</html>