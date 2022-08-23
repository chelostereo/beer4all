<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>


<table border="1" cellspacing="0" cellpadding="5" width="150" >
	<TR>
		<TD id="breadcrumbs">
			<A CLASS="menu" HREF="<html:rewrite action="/action/viewperfil"/>">
				<bean:message key="usermenu.myPerfil"/>
			</A>
		</TD>
	</TR>
	<TR>
		<TD id="breadcrumbs">
			<A CLASS="menu" HREF="<html:rewrite action="/forward/viewcarrito"/>" >
				<bean:message key="usermenu.myCart"/>
			</A>
	</TD>
	</TR>
		<TR>
		<TD id="breadcrumbs">
			<A CLASS="menu" HREF="<html:rewrite action="/action/viewproductos"/>">
				<bean:message key="usermenu.viewBeers"/>
			</A>
		</TD>
	</TR>
	<TR>
		<TD id="breadcrumbs">
			<a class="menu" HREF="<html:rewrite action="/action/logout"/>" >
				<bean:message key="usermenu.logout"/>
			</a>
		</TD>
	</TR>
</table>  	
<hr size="2" color="white" noshade="noshade">
      