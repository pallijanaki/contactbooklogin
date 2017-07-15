<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title><style>
form {
    border: 3px solid #f1f1f1;
}

input[type=text], input[type=password] {
    width: 100%;
    padding: 12px 20px;
    margin: 8px 0;
    display: inline-block;
    border: 1px solid #ccc;
    box-sizing: border-box;
}

button {
    background-color: #4CAF50;
    color: white;
    padding: 14px 20px;
    margin: 8px 0;
    border: none;
    cursor: pointer;
    width: 100%;
}


.imgcontainer {
    text-align: center;
    margin: 24px 0 12px 0;
}

img.avatar {
    width: 40%;
    border-radius: 50%;
}

.container {
    padding: 16px;
}

span.psw {
    float: right;
    padding-top: 16px;
}

/* Change styles for span and cancel button on extra small screens */
@media screen and (max-width: 300px) {
    span.psw {
       display: block;
       float: none;
    }
    
}
</style>
</head>

<body>
<h2>Signup Form</h2>
<!-- Form Elements -->
  <form action="signupservlet" method="get">
  
  	<div class="imgcontainer">
    	<img src="images/user.png" alt="UserPicture" class="avatar">
  	</div>

  	<div class="container">
    	<label><b>Username</b></label>
    	<input type="text" placeholder="Enter Username" name="username" required>
		
    	<label><b>Password</b></label>
    	<input type="password" placeholder="Enter Password" name="password" required>
        
        <label><b>Re enter Password</b></label>
    	<input type="text" placeholder="Enter Username" name="repassword" required>
        
    	<button type="submit">submit</button>
    	
  	</div>

  	
 </form>
</body>
</html>
