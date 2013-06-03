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
    What's your first name? &nbsp; <input type="text" name="firstName" />
    <br />
    What's your last name? &nbsp; <input type="text" name="lastName" />
    <br />
    <input type="submit" value="Get your name" />
    
    <div id="ninjaNameDisplay" style="display:none;">
        Your ninja name is <strong></strong>.
    </div>
</form>
</body>
</html>