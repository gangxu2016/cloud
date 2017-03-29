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
@Path("/ai-threed/tdModelApp")
@Consumes(value = { MediaType.APPLICATION_JSON })
@Produces(value = { MediaType.APPLICATION_JSON })
public interface ITdModelApp {
	
	/**
	 * 获取所有模型的配置，包括加载配置与操作配置
	 * 
	 * @param sceneId
	 * @return
	 */
	@GET
	@Path("/configure")
	public JSONObject getConfigure();

	/**
	 * 根据一级类型id查询二级分类型列表，每个二级分类中包含一个模型列表
	 * 
	 * @param sceneId
	 * @return
	 */
	@GET
	@Path("/modelTyps/{pid}")
	public JSONArray getModeTypes(@PathParam("pid") String pid);
}
