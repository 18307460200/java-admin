package com.thinkive.fxc.tysp.service;

import java.util.List;
import java.util.Map;

import com.thinkive.base.jdbc.DBPage;
import com.thinkive.base.jdbc.DataRow;

public interface WitnessLogService
{
	/**
	* @描述: 增加视频见证日志
	* @作者: shupeng
	* @创建日期: 2018年1月31日
	* @创建时间: 下午6:27:46
	* @param DataRow
	 */
    public  void  addWitnessLog(DataRow DataRow);
    
    /**
     * 
    * @描述: 查询视频见证日志记录
    * @作者: shupeng
    * @创建日期: 2018年1月31日
    * @创建时间: 下午6:28:01
    * @param paraMap
    * @param page
    * @param numPerPage
    * @return
     */
    public  DBPage queryWtnessLogs(Map<String,String> paraMap,int  page,int numPerPage);
}
