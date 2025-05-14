<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Login</title>
    <style>
        body {
            margin: 0;
            padding: 0;
            font-family: 'Segoe UI', sans-serif;
            background: #111;
            display: grid;
            place-items: center;
            height: 100vh;
            position: relative;
            overflow: hidden;
        }

        .background-grid {
            position: absolute;
            top: 0;
            left: 0;
            width: 100%;
            height: 100%;
            display: grid;
            grid-template-columns: repeat(auto-fill, 100px);
            grid-template-rows: repeat(auto-fill, 100px);
            z-index: 0;
        }

        .background-grid div {
            border: 1px solid #222;
            background-color: #111;
            transition: background-color 0.3s, box-shadow 0.3s;
        }

        .background-grid div:hover {
            background-color: #00ff00;
            box-shadow: 0 0 8px #00ff00;
        }

        .container {
            position: relative;
            z-index: 1;
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

        .register-link {
            margin-top: 15px;
            display: block;
            color: #aaa;
        }

        .register-link a {
            color: #00ff00;
            text-decoration: none;
        }

        .register-link a:hover {
            text-decoration: underline;
        }
    </style>
</head>
<body>

<!-- 🔲 Background Grid -->
<div class="background-grid">
    <c:forEach begin="1" end="400">
        <div></div>
    </c:forEach>
</div>

<!-- 🔒 Login Form -->
<div class="container">
    <h2>SIGN IN</h2>
    <form action="login" method="post">
        <input type="text" name="name" placeholder="Username" required />
        <input type="password" name="password" placeholder="Password" required />
        <input type="submit" value="Login" />
    </form>
    <div class="register-link">
        Don't have an account? <a href="register">Sign up</a>
    </div>
</div>

</body>
</html>