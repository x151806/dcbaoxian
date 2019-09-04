package com.dc.pro.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.dc.exp.entity.ExpMission;
import com.dc.exp.entity.ExpProgress;
import com.dc.pro.entity.ProProduct;
import com.dc.sys.vo.AllCommon;
import com.dc.sys.vo.SysUserDeptVo;

public interface ProProductDao {
	
	/**
	 * 插入数据
	 * @param entity
	 * @return
	 */
	int insertObject(ProProduct entity);
	
	/**
	 * 更新用户自身信息
	 * @param entity
	 * @return
	 */
	int updateObject(ProProduct entity);
	
	

	
	/**
	 * 查-------询信息
	 * @param satrap
	 * @param executor
	 * @param startIndex
	 * @param pageSize
	 * @return
	 */
	List<ExpMission> findPageObjects(@Param("username")String username,
			@Param("insurance")String insurance,@Param("status")String status,
			@Param("cooperator")String cooperator,@Param("updateTime")Integer updateTime,
			@Param("startIndex")Integer startIndex,
			@Param("pageSize")Integer pageSize);
	
	/**
	 * 基于用户id查询信息
	 * @param id
	 * @return
	 */
	ExpMission findObjectById(String productId);
	
	
	/**
	 * 查询条数
	 * @param username
	 * @return
	 */
	int getRowCount(@Param("username")String username,
			@Param("insurance")String insurance,@Param("status")String status,
			@Param("cooperator")String cooperator,@Param("updateTime")Integer updateTime);
	
	
}
