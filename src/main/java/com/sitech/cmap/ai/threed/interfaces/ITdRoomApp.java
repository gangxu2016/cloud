/**
 * 
 */
package com.sitech.cmap.ai.threed.interfaces;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

/**
 * @author xugang
 *
 */
@Path("/ai-threed/tdRoomApp")
@Consumes(value = { MediaType.APPLICATION_JSON })
@Produces(value = { MediaType.APPLICATION_JSON })
public interface ITdRoomApp {
	
	/**
	 * 根据id获取房间
	 * 
	 * @param id
	 * @return
	 */
	@GET
	@Path("/get/{id}")
	public JSONObject get(@PathParam("id") String id);

}
