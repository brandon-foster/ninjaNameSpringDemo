<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/styles.css" />
    <script type="text/javascript" src="http://code.jquery.com/jquery.min.js"></script>
</head>
<body>
	<h1>Upload a new name type!</h1>
	<form method="post" enctype="multipart/form-data">
	
	    <div>
	        Select your XML file here:
	        <input type="file" name="file" />
	    </div>
	    
	    <input type="submit" value="Upload file" />
	    
	</form>
</body>
</html>