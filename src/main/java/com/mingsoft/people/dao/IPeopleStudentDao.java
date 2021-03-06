/**
The MIT License (MIT) * Copyright (c) 2016 铭飞科技

 * Permission is hereby granted, free of charge, to any person obtaining a copy of
 * this software and associated documentation files (the "Software"), to deal in
 * the Software without restriction, including without limitation the rights to
 * use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of
 * the Software, and to permit persons to whom the Software is furnished to do so,
 * subject to the following conditions:

 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.

 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS
 * FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR
 * COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER
 * IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN
 * CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */package com.mingsoft.people.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.mingsoft.base.dao.IBaseDao;
import com.mingsoft.people.entity.PeopleStudentEntity;
import com.mingsoft.util.PageUtil;

/**
 * 
 * 学生信息持久化层
 * @author 铭飞开发团队
 * @version 
 * 版本号：0.0<br/>
 * 创建日期：2017-8-23 10:10:22<br/>
 * 历史修订：<br/>
 */
public interface IPeopleStudentDao  extends IBaseDao {
		
		/**
		 * 获取学生实体信息
		 * @param peopleId 用户id
		 * @return  学生实体
		 */
		PeopleStudentEntity getPeopleStudent(int peopleId);
		
		/**
		 * 查询app下学生的信息
		 * @param appId 应用id
		 * @param page 分页实体
		 * @return 学生列表
		 */
		List<PeopleStudentEntity> queryPageListByAppId(@Param("appId") Integer appId,@Param("page" ) PageUtil page);
		
		/**
		 * 根据条件查询学生总数
		 * @param appId 应用id
		 * @param page 分页实体
		 * @param where 查询条件集合
		 * @return 学生列表
		 */
		List<PeopleStudentEntity> queryByMap(@Param("appId") Integer appId,@Param("page" ) PageUtil page,@Param("where" )Map where);
		
		/**
		 * 根据条件查询学生总数
		 * @param appId  应用id
		 * @param page 分页实体
		 * @param where  查询条件集合
		 * @return 学生总数 
		 */
		int getCountByMap(@Param("appId") Integer appId,@Param("where")Map where);
}
