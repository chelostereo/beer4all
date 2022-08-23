<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>

<table border="1" cellspacing="0" cellpadding="5" width="150" align="center">
	<tr>
		<td id="breadcrumbs">
			<A class="menu" HREF="<html:rewrite action='/action/welcome'/>">
				<bean:message key="menu.home" />
			</A> 
		</td>
	</tr>
	<tr>
		<td id="breadcrumbs">
			<A class="menu" HREF="<html:rewrite action='/forward/login'/>">
				<bean:message key="menu.login" />
			</A>
		</td>
	</tr>
	<tr>
		<td id="breadcrumbs">
			<a class="menu" href="<html:rewrite action='/forward/register'/>">
				<bean:message key="menu.signin" />
			</a>
		</td>
	</tr>
	<tr>
		<td id="breadcrumbs">
			<a class="menu" href="<html:rewrite action='/forward/links'/>">
				<bean:message key="menu.links" />
			</a>
		</td>
	</tr>
</table>
<hr size="2" color="white" noshade="noshade">