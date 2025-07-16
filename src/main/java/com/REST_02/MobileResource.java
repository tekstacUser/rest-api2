package com.REST_02;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/mobile")
public class MobileResource {
	
	MobileDAO dao = new MobileDAO();
	
	@POST
	@Path("/addNewMobile")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public List<Mobile> addMobile(Mobile m){
		return dao.addNewMobile(m);
	}
	
	
	
//	@GET
//	@Path("/get")
////	@Consumes(MediaType.APPLICATION_JSON)
//	@Produces(MediaType.APPLICATION_JSON)
//	public List<Mobile> get(){
//		return dao.mobileList;
//	}
	

}
