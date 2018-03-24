package org.ssm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.ssm.model.Goods;
import org.ssm.serve.GoodsServe;


@Controller
public class GoodsController {

	@Autowired
	private GoodsServe goodsServe;
	
	@RequestMapping("goodsAdd")
	public String goodsAdd(Goods goods){
		goodsServe.Goods_Add(goods);
		return "redirect:goodsQueryAll";
	}
	
	@RequestMapping("goodsDelete")
	public String goodsDelete(int id){
		goodsServe.Goods_DeleteById(id);
		return "redirect:goodsQueryAll";
	}
	
	@RequestMapping("goodsUpdate")
	public String goodsUpdate(Goods goods){
		goodsServe.Goods_UpdateById(goods);
		return "redirect:goodsQueryAll";
	}
	
	@RequestMapping("getGoods")
	public String getGoods(int goodsId,Model model){
		Goods goods = goodsServe.Goods_QueryOneById(goodsId);
		model.addAttribute("goods",goods);
		return "goodsUpdate";
	}
	
	@RequestMapping("search")
	public String search(String names,Model model){
		List<Goods> goodsList = goodsServe.Goods_QueryByNames(names);
		model.addAttribute(goodsList);
		return "showAll";
	}
	
	@RequestMapping("goodsQueryAll")
	public String goodsQueryAll(Model model){
		List<Goods> goodsList = goodsServe.GoodsQueryAll();
		model.addAttribute(goodsList);
		return "showAll";
	}
	
	
	
	
}
