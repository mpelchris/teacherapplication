<%-- 
    Document   : trainerform
    Created on : 12-Jun-2019, 18:10:12
    Author     : christy
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
 <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
 <%@taglib prefix="springForm" uri="http://www.springframework.org/tags/form"%>
 <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
 <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
 
 
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script src="jquery-3.4.0.min.js"></script>
        <title>Trainerform</title>
        
        
    </head>
    <body>
<!--                          Form for the insert of the trainer                     -->
   
        <springForm:form method="Post" modelAttribute="newtrainer" action="insertthetrainer" >
            
           
            <table class="w3-container w3-panel w3-padding-small" > 
                <thead>
                     <div  class="w3-panel  w3-padding-small  w3-blue w3-center">
                            <h1>Insert Trainer</h1> 
                            <a href="exittrainerapplication" class="w3-button w3-right fa fa-home"> Exit  </a>  
                     </div>
                </thead>
                
                <tr>
                    <div class="w3-container w3-panel w3-padding-small ">
                        <label>First Name</label>
                        <springForm:input path="firstname"  class=" w3-input w3-border w3-round" />
                        <springForm:errors path="firstname" class="w3-text-red"/>
                       
                    </div>
                         
                </tr>
                <tr>
                    <div class="w3-container w3-panel w3-padding-small ">
                        <label>Last Name</label>
                        <springForm:input path="lastname"  class=" w3-input w3-border w3-round"/>
                        <springForm:errors path="lastname" class="w3-text-red"/>
                    </div>
                </tr>
                <tr>
                    <div class="w3-container w3-panel w3-padding-small ">
                        <label>Subject</label>
                        <springForm:input path="subject"  class=" w3-input w3-border w3-round"/> 
                          <springForm:errors path="subject" class="w3-text-red"/>
                    </div>
                    <td> <input type="submit" class="w3-btn w3-blue w3-margin-left"> </td> 
                </tr>
                
                </table>
                    
                  
                   
                    
                    <!--                          Form to read trainers                                                             -->
                  
                    
               
   
                    
      
        <table class="w3-table-all w3-border table-example"  >
             <c:forEach var="trainer1" items="${trainerlist}">
            <thead> 
                    <tr> 
                        <td>ID</td>
                        <td>First Name</td>
                        <td>Last Name</td>
                        <td>Subject</td>
                        <td></td>
                        <td></td>
                   </tr>
               
            </thead>
            <tbody>
           
                
                    <tr>
                        
                        <td>
                            <c:out value="${trainer1.trainerid}"/>
                        </td>
                        <td>
                            <c:out value="${trainer1.firstname}"/>
                        </td>
                        <td>
                            <c:out value="${trainer1.lastname}" />
                        </td>
                        <td>
                            <c:out value="${trainer1.subject}" />
                        </td>
                       
                        <td>
                            <a href="${pageContext.request.contextPath}/delete/${trainer1.trainerid}" class="w3-btn w3-blue w3-margin-left">  delete </a>                     
                        </td>
                      
                        <td>
                            <a href="${pageContext.request.contextPath}/update/${trainer1.trainerid}" class="w3-btn w3-blue w3-margin-left">  update </a>                     
                        </td>
                      
                        
                    </tr>
                   
                </c:forEach>
             </tbody>
        </table>  
       
         </springForm:form>
        
    </body>
    
   
</html>
