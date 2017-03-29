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
 * 外部的接口，与其他系统对接，默认老系统
 * @author xugang
 *
 */
@Path("/ai-threed/tdExternalApp")
@Consumes(value = { MediaType.APPLICATION_JSON })
@Produces(value = { MediaType.APPLICATION_JSON })
public interface ITdExternalApp {
	/**
	 * 查询虚拟机列表
	 * 
	 * @param sceneId
	 * @param wd
	 * @return
	 */
	@GET
	@Path("/getVms/{sceneId}/{wd}")
	public JSONArray getVms(@PathParam("sceneId") String sceneId,@PathParam("wd") String wd);

	/**
	 * 查询虚拟机列表
	 * 
	 * @param customId 主机自定义id
	 * @return
	 */
	@GET
	@Path("/getVms/{customId}")
	public JSONArray getVms(@PathParam("customId") String customId);

	/**
	 * 查询主机基本信息
	 * 
	 * @param sceneId
	 * @param wd
	 * @return
	 */
	@GET
	@Path("/getHost/{customId}")
	public JSONObject getHost(@PathParam("customId") String customId);

	/**
	 * 查询业务系统
	 * 
	 * @param hostCustomId
	 * @return
	 */
	@GET
	@Path("/getBusiness/{hostCustomId}")
	public JSONArray getBusiness(@PathParam("hostCustomId") String hostCustomId);

	/**
	 * 查询业务系统
	 * 
	 * @param inSceneId
	 * @return
	 */
	@GET
	@Path("/getBusinessBySceneId/{sceneId}")
	public JSONArray getBusinessBySceneId(@PathParam("sceneId")  String sceneId);

	/**
	 * 查询业务系统
	 * 
	 * @param inSceneId
	 * @return
	 */
	@GET
	@Path("/getBusinessByPSceneId/{parentSceneId}")	
	public JSONArray getBusinessByPSceneId(@PathParam("parentSceneId") String parentSceneId);
}
