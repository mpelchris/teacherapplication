<%-- 
    Document   : updateform
    Created on : 18-Jun-2019, 13:30:10
    Author     : christy
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="springForm" uri="http://www.springframework.org/tags/form"%>
 <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
 <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
 <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>updatetrainer</title>
    </head>
    <body>
        <springForm:form method="Post" modelAttribute="trainer" action="updatethetrainer" >
            <table class="w3-container w3-panel w3-padding-small " > 
                    <thead>
                         <div  class="w3-panel  w3-padding-small  w3-blue w3-center">
                                <h1>Update Trainer</h1>
                                 
                         </div>
                    </thead>

                    <tr>
                        <div class="w3-container w3-panel w3-padding-small ">
                           
                            <springForm:hidden path="trainerid" value="${trainer.trainerid}"  class=" w3-input w3-border w3-round" />
                        </div>
                        <div class="w3-container w3-panel w3-padding-small ">
                            <label>First Name</label>
                            <springForm:input path="firstname" value="${trainer.firstname}"  class=" w3-input w3-border w3-round" />
                            <springForm:errors path="firstname" class="w3-text-red" />
                        </div>
                    </tr>
                    <tr>
                        <div class="w3-container w3-panel w3-padding-small ">
                            <label>Last Name</label>
                            <springForm:input path="lastname" value="${trainer.lastname}" class=" w3-input w3-border w3-round"/>
                            <springForm:errors path="lastname" class="w3-text-red"/>
                        </div>
                    </tr>
                    <tr>
                        <div class="w3-container w3-panel w3-padding-small ">
                            <label>Subject</label>
                            <springForm:input path="subject" value="${trainer.subject}"  class=" w3-input w3-border w3-round"/>
                            <springForm:errors path="subject" class="w3-text-red" />
                        </div>
                        <td> <input type="submit" class="w3-btn w3-blue w3-margin-left"> </td> 
                    </tr>

            </table>
                        
        </springForm:form>
    </body>
</html>
