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
@Path("/ai-threed/tdSceneObjectApp")
@Consumes(value = { MediaType.APPLICATION_JSON })
@Produces(value = { MediaType.APPLICATION_JSON })
public interface ITdSceneObjectApp {
	/**
	 * 根据场景对象
	 * 
	 * @param objectId  场景对象id
	 * @return
	 */
	@GET
	@Path("/get/{objectId}")
	public JSONObject get(@PathParam("objectId") String objectId);

	/**
	 * 
	 * @Title: attrs
	 * @Description: 根据场景对象ID获取自定义属性
	 * @param @param sceneObjectId
	 * @param @return    参数
	 * @return JSONArray    返回类型
	 * @author xugang
	 * @date 2016年9月21日
	 * @throws
	 */
	@GET
	@Path("/getAttrs/{sceneObjectId}")
	public JSONArray getAttrs(@PathParam("sceneObjectId") String sceneObjectId);

	/**
	 * 
	 * @Title: getObjsByThrem
	 * @Description: 根据最大温度和最小温度查询设备
	 * @param @param sceneId
	 * @param @param tmin
	 * @param @param tmax
	 * @param @return    参数
	 * @return JSONArray    返回类型
	 * @author xugang
	 * @date 2016年11月21日
	 * @throws
	 */
	public JSONArray getObjsByThrem(String sceneId, Integer tmin, Integer tmax);
}
