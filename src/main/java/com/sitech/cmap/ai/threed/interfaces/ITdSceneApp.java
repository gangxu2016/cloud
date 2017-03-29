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

import com.alibaba.fastjson.JSONObject;

/**
 * @author xugang
 *
 */
@Path("/ai-threed/tdSceneApp")
@Consumes(value = { MediaType.APPLICATION_JSON })
@Produces(value = { MediaType.APPLICATION_JSON })
public interface ITdSceneApp {

	/**
	 * 根据场景id，获取场景上下文内容
	 * 
	 * @param sceneId
	 *            场景id
	 * @return
	 */
	@GET
	@Path("/getContext/{sceneId}")
	public JSONObject getSceneContext(@PathParam("sceneId") String sceneId);

	/**
	 * 删除场景
	 * 
	 * @param sceneId
	 */
	@GET
	@Path("/delete/{sceneId}")
	public void delete(@PathParam("sceneId") String sceneId);

	/**
	 * 
	 * 获取关联关系
	 * 
	 * @param objectId 
	 * @return 场景id
	 */
	@GET
	@Path("/getRelation/{objectId}")
	public JSONObject getRelation(@PathParam("objectId") String objectId);

}
