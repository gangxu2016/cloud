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

/**
 * @author xugang
 *
 */
@Path("/ai-threed/tdMonitorAlarmViewApp")
@Consumes(value = { MediaType.APPLICATION_JSON })
@Produces(value = { MediaType.APPLICATION_JSON })
public interface ITdMonitorAlarmViewApp {

	/**
	 * 根据自定义id查询告警
	 * 
	 * @param sceneId 场景id
	 * @return
	 */
	@GET
	@Path("/getByCustomId/{customId}")
	public JSONArray getByCustomId(@PathParam("customId") String customId);

	/**
	 * 根据场景id统计告警数量
	 * 
	 * @param sceneId 场景id
	 * @return
	 */
	@GET
	@Path("/getGroupByLevel/{sceneId}")
	public JSONArray getGroupByLevel(@PathParam("sceneId") String sceneId);

	/**
	 * 
	 * 在楼层视图中，根据选择的等级（可多选）查询机柜
	 * 
	 * @param sceneId 场景id
	 * @param levles 等级字符串，以逗号隔开
	 * @return
	 */
	@GET
	@Path("/getCabinetsByLevel/{sceneId}/{levle}")
	public JSONArray getCabinetsByLevel(@PathParam("sceneId") String sceneId,@PathParam("levle") String levle);

	/**
	 * 根据跳转场景id查询告警
	 * 
	 * @param objectId 对象id
	 * @return
	 */
	@GET
	@Path("/getByInSceneId/{objectId}")
	public JSONArray getByInSceneId(@PathParam("objectId") String objectId);
}
