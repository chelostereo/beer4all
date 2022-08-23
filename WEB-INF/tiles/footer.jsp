<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<CENTER>
	<table width="100%" border="0" cellspacing="0" cellpadding="5" align="center">
		<tr><td><hr size="2" noshade="noshade"></td></tr>
		<tr>
			<td  class="black" align="center">
			<center>
			<bean:message key="footer.warning"/>
			</center>
			</td>
		</tr>
		<tr><td><hr size="2" noshade="noshade" width="75%"></td></tr>
		<tr>
			<td align="center" valign="middle" >
			<html:img 	page="/images/struts-power.gif" border="1"
						alt="An implementation of MVC pattern, by Apache people"/>
			<html:img 	page="/images/displaytag.png" border="1"
						alt="Displays tables just whit tags"/>
			<html:img	page="/images/npp.logo1.gif" border="1" 
						alt="El mejor editor de texto, opensource y multileguaje"/>
			<html:img 	page="/images/firefox.png" border="1"
						alt="Internet Explorer is no more.."/>
			</td>
		</tr>
		
	</table>
	
	<table width="100%" border="1" cellspacing="0" cellpadding="3" class="black" valign="middle">	
		<tr>
			<td id="breadcrumbs" class="menu" align="center">
				<bean:message key="footer.copyright"/>
			</td>
		</tr>
	</table>
</CENTER>
