package com.mkyong.common.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mkyong.common.model.Shop;

@Controller
@RequestMapping("/kfc/brands")
public class JSONController {

	@RequestMapping(value = "{name}", method = RequestMethod.GET)
	public @ResponseBody Shop getShopInJSON(@PathVariable String name) {

		Shop shop = new Shop();
		shop.setName(name);
		shop.setStaffName(new String[] { "mkyong1", "mkyong2" });

		return shop;

	}

	@RequestMapping(method = RequestMethod.POST)
	public @ResponseBody Shop getShopInJSON(@RequestBody Shop shop) {

		shop.setName(shop.getName());
		shop.setStaffName(new String[] { "mkyong1", "mkyong2" });

		return shop;

	}

}