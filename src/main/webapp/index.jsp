<!DOCTYPE html>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
	<body>
		<h3>Currently available in our shop:</h3>
		<s:iterator value="itemList">
        	<div><span><s:property value="name"/>: <s:property value="count"/> left</span></div>
    	</s:iterator>
    	<h3>Your Shopping:</h3>
    	
    	<s:form action="purchase">
	    	<div><input name="item1" value="Item A" type="hidden"/></div>
	    	<div><input name="item2" value="Item B" type="hidden"/></div>
	    	<s:textfield name="count1" label="Item A"></s:textfield>
	    	<s:textfield name="count2" label="Item B"></s:textfield>
	      	<s:submit/>
    	</s:form>
	</body>
</html>
