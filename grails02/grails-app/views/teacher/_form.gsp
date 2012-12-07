<%@ page import="de.rio.Teacher" %>



<div class="fieldcontain ${hasErrors(bean: teacherInstance, field: 'lastName', 'error')} required">
	<label for="lastName">
		<g:message code="teacher.lastName.label" default="Last Name" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="lastName" required="" value="${teacherInstance?.lastName}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: teacherInstance, field: 'firstName', 'error')} ">
	<label for="firstName">
		<g:message code="teacher.firstName.label" default="First Name" />
		
	</label>
	<g:textField name="firstName" value="${teacherInstance?.firstName}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: teacherInstance, field: 'email', 'error')} ">
	<label for="email">
		<g:message code="teacher.email.label" default="Email" />
		
	</label>
	<g:textField name="email" value="${teacherInstance?.email}"/>
</div>

