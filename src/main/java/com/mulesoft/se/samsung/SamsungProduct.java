package com.mulesoft.se.samsung;

import javax.jws.WebParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

@Path("/samsung")
public class SamsungProduct {

	@POST
	@Path("orders")
	public OrderResponse createServiceProvider(@WebParam(name="orderRequest") OrderRequest request) {
		System.out.println("Creating service provider for authorizationId : " + request.getName() + " qu : " + request.getQuantity());
		OrderResponse orderResponse = new OrderResponse();
		orderResponse.setResult("Ok");
		return orderResponse;
	}

}
