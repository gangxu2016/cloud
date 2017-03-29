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
@Path("/ai-threed/tdFloorApp")
@Consumes(value = { MediaType.APPLICATION_JSON })
@Produces(value = { MediaType.APPLICATION_JSON })
public interface ITdFloorApp {

	/**
	 * 根据数据中心id获取所有楼层
	 * 
	 * @param buildingId  数据中心id
	 * @return 所有楼层的列表
	 */
	@GET
	@Path("/list/{buildingId}")
	public JSONArray list(@PathParam("buildingId") String buildingId);

	/**
	 * 根据楼层id，删除楼层
	 * 
	 * @param id  楼层id
	 * @return  被删除的楼层对象
	 */
	@GET
	@Path("/delete/{id}")
	public JSONObject delete(@PathParam("id") String id);
	
	/**
	 * 根据id获取楼层
	 * 
	 * @param id
	 * @return
	 */
	@GET
	@Path("/get/{id}")
	public JSONObject get(@PathParam("id") String id);

}
