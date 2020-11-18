<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  

<form:form action="./firstMethod" method="POST" modelAttribute="user">
	Name: <form:input path="name"/><form:errors path="name"></form:errors><br/>
	Email: <form:input path="email"/><form:errors path="email"></form:errors><br/>
	Job: <form:input path="occupation"/><form:errors path="occupation"></form:errors><br/>
	<input type="submit">
</form:form> 