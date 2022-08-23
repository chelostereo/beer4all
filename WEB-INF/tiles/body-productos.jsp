<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<%@ taglib uri="http://displaytag.sf.net" prefix="display" %>

<logic:empty name = "listaProductos">
	<center class="black">
	<h2> No se hallaron productos </h2>
	</center>
</logic:empty>

<logic:notEmpty name="listaProductos">
	  
		<display:table 	name="listaProductos" 
						id="item" 
						requestURI="" 
						class="productos" 
						pagesize="10" >
						
			<display:column href="/beer4all/action/viewdetalleproducto.do" 
							paramId="id" 
							paramProperty="id" 
							class="imagen">
				<img src="/beer4all/beer_images/<bean:write name="item" property="imagenURL"/>.gif"/>
			</display:column>
			
			<display:column property="nombre" 
							title="Nombre" 
							class="nombre"
							href="/beer4all/action/viewdetalleproducto.do" 
							paramId="id" 
							paramProperty="id"/>
							
			<display:column property="descripcion" 
							title="Descripción" 
							maxLength="200" 
							class="descripcion"/>
							
			<display:column property="precioUnitario" 
							title="Precio Unitario" 
							format="$ {0,number,0.00}" 
							class="precio"/>
		</display:table>
	
</logic:notEmpty>
