Service orchestation and choice routing example
===============================================
This example includes APIKIT as a front end for the orders services.

added
*   fulfillment: added apikit as a rest frontend and the apikit console
*   manufacturers are loaded from the manufacturers rest service
*   product names are loaded from the product catalog rest service
*   tab to write json request



mule mflows
*   ajaxflows: contains ajax inbounds for the order website. also publishes order website.
*   mule-config: contains the apikit frontend
*   fulfillment: orders processing service



urls
*   populate DB: http://localhost:8091/populate
*   APIKit Console: http://localhost:8081/api/console/
*   Orders website: http://localhost:8090/orders/

apikit config
*   main flow in mule-config.mflow
*   apikit files: src/main/api



Contact
=======
matias.juan@mulesoft.com
