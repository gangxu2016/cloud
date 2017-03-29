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
 * @author xugang2
 *
 */
@Path("/ai-threed/tdAssetApp")
@Consumes(value = { MediaType.APPLICATION_JSON })
@Produces(value = { MediaType.APPLICATION_JSON })
public interface ITdAssetApp {

	/**
	 * 
	 * 根据关键字查询某一个场景下的设备，主要是机柜和主机，不包括虚拟机
	 * 
	 * @param sceneId 场景id
	 * @param wd 搜索关键字 
	 * @return
	 */
	@GET
	@Path("/getSceneAsset/{sceneId}/{wd}")
	public JSONArray getSceneAsset(@PathParam("sceneId") String sceneId,@PathParam("wd") String wd);

	/**
	 * 
	 * 根据场景对象id查询子场景对象集合，即查询机柜下所有的主机
	 * 
	 * @param sceneId 场景id
	 * @param wd 搜索关键字 
	 * @return
	 */
	@GET
	@Path("/children/{id}")
	public JSONArray children(@PathParam("id") String id);

	/**
	 * 递归查询所有对象
	 * 
	 * @param sceneId
	 * @param modelId
	 * @return
	 */
	@GET
	@Path("/getObjectsByModelId/{sceneId}/{modelId}")
	public JSONArray getObjectsByModelId(@PathParam("sceneId") String sceneId,@PathParam("modelId") String modelId);

	/**
	 * 
	 * @Title: getHosts
	 * @Description: 查询某一个机柜下的主机列表
	 * @param @param sceneId
	 * @param @return    参数
	 * @return JSONArray    返回类型
	 * @author Administrator
	 * @date 2016年11月4日
	 * @throws
	 */
	@GET
	@Path("/getHosts/{sceneId}")
	public JSONArray getHosts(@PathParam("sceneId") String sceneId);

	/**
	 * 
	 * @Title: getHostsByBusiId
	 * @Description: 查询机房下，某一个业务的所有主机列表
	 * @param @param parentSceneId
	 * @param @param busiId
	 * @param @return    参数
	 * @return JSONArray    返回类型
	 * @author Administrator
	 * @date 2016年11月5日
	 * @throws
	 */
	@GET
	@Path("/getHostsByBusiId/{parentSceneId}/{busiId}")
	public JSONObject getHostsByBusiId(@PathParam("parentSceneId") String parentSceneId,@PathParam("busiId")  String busiId);

	/**
	 * 
	 * @Title: getObjectsByModelType
	 * @Description:  根据场景类型查询3D对象数量
	 * @param @param sceneId
	 * @param @param type
	 * @param @return    参数
	 * @return JSONArray    返回类型
	 * @author Administrator
	 * @date 2016年12月12日
	 * @throws
	 */
	@GET
	@Path("/getObjectsByModelType/{sceneId}/{type}")
	public int getObjectsByModelType(String sceneId, String type);
}
