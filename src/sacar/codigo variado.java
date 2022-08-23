<p class="black">
<% 	java.util.Enumeration enumeration = session.getAttributeNames() ;
	String nombre="";
	while (enumeration.hasMoreElements()) { 
		nombre=(enumeration.nextElement()).toString(); %>
	<%= nombre %>=<%= session.getAttribute(nombre)%><br>
    <% } %>
</p>

