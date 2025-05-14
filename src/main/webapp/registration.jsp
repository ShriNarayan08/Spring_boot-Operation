<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>User Registration</title>
    <style>
        body {
            margin: 0;
            padding: 0;
            font-family: 'Segoe UI', sans-serif;
            background: #111;
            background-image: linear-gradient(90deg, transparent 99px, #00ff00 100px),
                              linear-gradient(#00ff00 1px, transparent 1px);
            background-size: 100px 100px;
        }

        .container {
            position: absolute;
            top: 50%;
            left: 50%;
            transform: translate(-50%, -50%);
            background: #222;
            padding: 40px;
            border-radius: 8px;
            box-shadow: 0 0 20px #00ff00;
            width: 350px;
            text-align: center;
        }

        .container h2 {
            color: #00ff00;
            margin-bottom: 20px;
        }

        input[type="text"],
        input[type="password"] {
            width: 90%;
            padding: 12px;
            margin: 10px 0;
            border: none;
            background: #333;
            color: white;
            border-radius: 5px;
        }

        input[type="submit"] {
            width: 95%;
            padding: 12px;
            background: #00ff00;
            border: none;
            color: black;
            font-weight: bold;
            border-radius: 5px;
            cursor: pointer;
            transition: 0.3s ease;
        }

        input[type="submit"]:hover {
            background: #00cc00;
        }

        .login-link {
            margin-top: 15px;
            display: block;
            color: #aaa;
        }

        .login-link a {
            color: #00ff00;
            text-decoration: none;
        }

        .login-link a:hover {
            text-decoration: underline;
        }
    </style>
</head>
<body>
<div class="container">
    <h2>SIGN UP</h2>
    <form action="register" method="post">
        <input type="text" name="id" placeholder="ID" required />
        <input type="text" name="name" placeholder="Full Name" required />
        <input type="text" name="userName" placeholder="Username" required />
        <input type="password" name="password" placeholder="Password" required />
        <input type="submit" value="Register" />
    </form>
    <div class="login-link">
        Already have an account? <a href="login">Login</a>
    </div>
</div>
</body>
</html>