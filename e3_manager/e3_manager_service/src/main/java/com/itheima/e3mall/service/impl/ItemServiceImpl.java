package com.itheima.e3mall.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itheima.e3mall.mapper.TbItemMapper;
import com.itheima.e3mall.pojo.TbItem;
import com.itheima.e3mall.service.ItemService;

@Service
public class ItemServiceImpl implements ItemService{

	@Autowired
	private TbItemMapper teItemMapper;
	
	/**
	 * 根据id查询商品的信息
	 * @param id
	 * @return
	 */
	public TbItem  getItemById(long id){
		return  teItemMapper.selectByPrimaryKey(id);
	}
	
}
