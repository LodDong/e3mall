package com.itheima.e3mall.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.itheima.e3mall.pojo.TbItem;
import com.itheima.e3mall.service.ItemService;

@Controller
public class ItemController {
	
	@Autowired
	private ItemService itemService;
	@RequestMapping("/item/{ItemId}")
	public @ResponseBody TbItem Itemlist(@PathVariable long ItemId){
		TbItem tbItem = itemService.getItemById(ItemId);
		return tbItem;
	} 
	
}
