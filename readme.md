Service orchestation and choice routing example
===============================================
This example includes APIKIT as a front end for the orders services.

<ul>added
		<li>fulfillment: added apikit as a rest frontend and the apikit console</li>	
		<li>manufacturers are loaded from the manufacturers rest service</li>
		<li>product names are loaded from the product catalog rest service</li>
		<li>tab to write json request</li>
</ul>


<ul>mule mflows
		<li>ajaxflows: contains ajax inbounds for the order website. also publishes order website.</li>
		<li>mule-config: contains the apikit frontend</li>
		<li>fulfillment: orders processing service</li>	
</ul>


<ul>urls
		<li>populate DB: http://localhost:8091/populate</li>
		<li>APIKit Console: http://localhost:8081/api/console/</li>
		<li>Orders website: http://localhost:8090/orders/</li>
</ul>

<ul>apikit config
		<li>main flow in mule-config.mflow</li>
		<li>apikit files: src/main/api</li>
</ul>




Contact
=======
matias.juan@mulesoft.com
