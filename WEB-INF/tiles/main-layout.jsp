<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">

<HTML>
	<HEAD>
		<TITLE><tiles:getAsString name="title"/></TITLE>
		<LINK REL="STYLESHEET" HREF="<html:rewrite page='/css/styles.css'/>" TYPE="text/css">
		
	</HEAD>
	
	<BODY>
	<p class="black">
		<TABLE border="0" cellspacing="0" cellpadding="5" align="center">
			<TR valign=top>
				<TD colspan=2 ><tiles:insert attribute="header"/></TD>
			</TR>
			<TR valign=top>
				<TD rowspan=3  width=15% valign=top class="dark">
					<logic:present name="userContainer" scope="session">
						<tiles:insert attribute="menu-usuario"/>
					</logic:present>

					<logic:notPresent name="userContainer" scope="session">
						<tiles:insert attribute="menu"/>
					</logic:notPresent>
				</TD>
				<TD width=85%  class="menu" valign=middle>
					<tiles:getAsString name="title"/>
				</TD>
			</TR>
			<TR valign=middle>
				<TD><tiles:insert attribute="whoslogged"/></TD>
			</TR>
			<TR valign=top>
				<TD><tiles:insert attribute="body"/></TD>
			</TR>
			<TR valign=top>
				<TD colspan=2 ><tiles:insert attribute="footer"/></TD>
			</TR>
		</TABLE>
	
	
		
	</BODY>
</HTML>