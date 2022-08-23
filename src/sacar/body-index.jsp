<%@ taglib uri="http://jakarta.apache.org/struts/tags-bean" prefix="bean"%> 
<%@ taglib uri="http://jakarta.apache.org/struts/tags-html" prefix="html"%>
<html:form action="/index">
<TABLE class="black" width="100%" border="0" cellspacing="0" cellpadding="3" valign="middle">
    <TR>
		<td> Beer 4 All es el primer shopping cart argentino dedicado al consumo de 
			cerveza. Si desea deleitar su paladar con los más exquisitos brebajes 
			espumantes, éste es el sitio correcto. 
			<html:link page="/forms/login.jsp">
				<strong>Ingrese aquí</strong>
			</html:link>
		</td>
	</TR>
	<TR><td>No olvide: Si conduce no beba, <b>todo lo demás</b> está permitido.</td></TR>
	<TR><td>Éstas son algunas de las cervezas que encontrará en nuestro sitio:<br><br></td></TR>
 	<tr>
		<td align="center"> 
			<img src="/beer4all/beer_images/fijas/<bean:write name="randomForm" property="stringIndexed[0]"/>"/>
			<img src="/beer4all/beer_images/fijas/<bean:write name="randomForm" property="stringIndexed[1]"/>"/>
			<img src="/beer4all/beer_images/fijas/<bean:write name="randomForm" property="stringIndexed[2]"/>"/>
			<img src="/beer4all/beer_images/fijas/<bean:write name="randomForm" property="stringIndexed[3]"/>"/>			
			<img src="/beer4all/beer_images/fijas/<bean:write name="randomForm" property="stringIndexed[4]"/>"/>
			
		</td>
	</tr>
	<TR><td align="right"><br>Que las disfrute y....<b>Salud!</b></td></TR>
	
</table>
</html:form>
