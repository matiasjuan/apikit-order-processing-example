Service orchestation and choice routing example
===============================================
This example includes APIKIT as a front end for the orders services.
The traditional UI uses mule rpc to invoque the ajax endpoints. Ajax flows invoque the API.

mule mflows

*   ajaxflows: contains ajax inbounds for the order website. also publishes order website.
*   mule-config: contains the API Gateway to Order Processing Services
*   fulfillment: orders processing service

added

*   fulfillment: added apikit as a rest frontend and the apikit console
*   manufacturers are loaded from the manufacturers rest service
*   product names are loaded from the product catalog rest service
*   tab to write json request

urls

*   populate DB: http://localhost:8091/populate
*   APIKit Console: http://localhost:8081/api/console/
*   Orders website: http://localhost:8090/orders/

apikit config

*   main flow in mule-config.mflow
*   apikit files: src/main/api

TODO
====
Remove the Ajax endpoints. The UI should call the API (add cors support for this)


Contact
=======
matias.juan@mulesoft.com

