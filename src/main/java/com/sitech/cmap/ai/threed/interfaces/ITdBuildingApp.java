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
@Path("/ai-threed/tdBuildingApp")
@Consumes(value = { MediaType.APPLICATION_JSON })
@Produces(value = { MediaType.APPLICATION_JSON })
public interface ITdBuildingApp {

	/**
	 * 根据数据中心id获取数据中心信息
	 * 
	 * @param id
	 * @return
	 */
	@GET
	@Path("/get/{id}")
	public JSONObject get(@PathParam("id") String id);
	
	/**
	 * 获取所有数据中心
	 * 
	 * @param id
	 * @return
	 */
	@GET
	@Path("/list")
	public JSONArray list();
}
