<%--
  Created by IntelliJ IDEA.
  User: Mullatoez
  Date: 11/15/2021
  Time: 9:36 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<style>
    h2 {
        text-align: center;
        color: #04AA6D;
        margin-top: 10%;
    }
    .login-form {
        text-align: center;
    }
    form {
        border: 3px solid #f1f1f1;
        width: 75%;
        margin: 0 auto;
    }
    button {
        background-color: #04AA6D;
        color: white;
        padding: 14px 20px;
        margin: 8px 0;
        border: none;
        cursor: pointer;
        width: 75%;
        text-align: center;
    }
    input[type=text], input[type=password] {
        width: 100%;
        padding: 12px 20px;
        margin: 8px 0;
        display: inline-block;
        border: 1px solid #ccc;
        box-sizing: border-box;
    }
    button:hover {
        opacity: 0.8;
    }
</style>
<body>
<div>
    <h2>
        Welcome to Sportifa
    </h2>
    <div class="login-form">
        <form action="/Sportifa/login" method="post">

            <div class="container">
                <label for="username"><b>Username</b></label>
                <input type="text" placeholder="Enter Username" name="username" required><br>

                <label for="password"><b>Password</b></label>
                <input type="password" placeholder="Enter Password" name="password" required><br>

                <button type="submit">Login</button><br>

                <h5> Don't have an account? Register </h5>

                <button type="submit">Register</button>
            </div>

        </form>
    </div>
</div>
</body>
</html>
