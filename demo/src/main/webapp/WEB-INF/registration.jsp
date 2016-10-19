<!doctype html>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<div class="container-wrapper">
    <div class="container">
        <div class="page-header">
            <h1>Register Customer</h1>
        </div>

     
        <form:form action="${pageContext.request.contextPath}/register"
                   method="post" commandName="person">

        <h3>Basic Info:</h3>

        <div class="form-group">
            <label for="emailid">ID</label>
           
            <form:input path="email" id="emailid" class="form-Control" />
        </div>

        <div class="form-group">
            <label for="cname">Name</label>
          
            <form:input path="name" id="cname" class="form-Control" />
        </div>


        <div class="form-group">
            <label for="password">Password</label>
            
            <form:password path="Password" id="password" class="form-Control" />
        </div>


        <div class="form-group">
            <label for="repassword">RePassword</label>
           
            <form:password path="rePassword" id="repassword" class="form-Control" />
        </div>

        <br/>


        <input type="submit" value="submit" class="btn btn-default">
       

        </form:form>
        </div>
        </div>
        
