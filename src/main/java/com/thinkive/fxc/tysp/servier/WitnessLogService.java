package com.thinkive.fxc.tysp.service;

import java.util.List;
import java.util.Map;

import com.thinkive.base.jdbc.DBPage;
import com.thinkive.base.jdbc.DataRow;

public interface WitnessLogService
{
	/**
	* @����: ������Ƶ��֤��־
	* @����: shupeng
	* @��������: 2018��1��31��
	* @����ʱ��: ����6:27:46
	* @param DataRow
	 */
    public  void  addWitnessLog(DataRow DataRow);
    
    /**
     * 
    * @����: ��ѯ��Ƶ��֤��־��¼
    * @����: shupeng
    * @��������: 2018��1��31��
    * @����ʱ��: ����6:28:01
    * @param paraMap
    * @param page
    * @param numPerPage
    * @return
     */
    public  DBPage queryWtnessLogs(Map<String,String> paraMap,int  page,int numPerPage);
}
