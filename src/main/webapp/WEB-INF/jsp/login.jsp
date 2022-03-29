<html>

<head>
	<title>Login Page</title>
	<link href="webjars/bootstrap/4.6.0/css/bootstrap.min.css" rel="stylesheet">
	<style>
		.login-form{
			width: 400px;
			height:200px;
			position: absolute;
			background-color: #5B5EA6;
			border-radius: 20px;
			top: 50%;
			left: 50%;
			margin-right: -50%;
			transform: translate(-50%, -50%);
		}
	</style>
</head>

<body>
	<h2>${errorMsg}</h2>
	<div class="login-form">
		<div class="container-fluid">
			<form method="post">
				<input type="text" name="user_id" class="form-control mt-3" placeholder="User ID"/>
				<input type="text" name="pass" class="form-control mt-3" placeholder="Password"/>
				<button class="btn btn-dark btn-block mt-3">Submit</button>
			</form>
		</div>
	</div>
</body>

</html>