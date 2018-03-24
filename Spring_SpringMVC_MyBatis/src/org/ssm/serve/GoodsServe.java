package org.ssm.serve;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.ssm.dao.GoodsDao;
import org.ssm.model.Goods;

@Component("goodsServe")
public class GoodsServe {

	@Autowired
	private GoodsDao goodsDao;
	
	@Transactional(propagation=Propagation.REQUIRED)
	public void Goods_Add(Goods goods){
		goodsDao.Goods_Add(goods);
	}
	
	@Transactional(propagation=Propagation.REQUIRED)
	public void Goods_DeleteById(int goodId){
		goodsDao.Goods_DeleteById(goodId);
	}
	
	@Transactional(propagation=Propagation.REQUIRED)
	public void Goods_UpdateById(Goods goods){
		 goodsDao.Goods_UpdateById(goods);
	}
	
	@Transactional(propagation=Propagation.REQUIRED)
	public Goods Goods_QueryOneById(int goodsId){
		Goods goods = goodsDao.Goods_QueryOneById(goodsId);
		return goods;
	}
	
	@Transactional(propagation=Propagation.REQUIRED)
	public List<Goods> Goods_QueryByNames(String goodsName){
		List<Goods> goodsList = goodsDao.Goods_QueryByNames("%"+goodsName+"%");
		return goodsList;
	}
	
	@Transactional(propagation=Propagation.REQUIRED)
	public List<Goods> GoodsQueryAll(){
		List<Goods> goodsList = goodsDao.GoodsQueryAll();
		return goodsList;
	}
}
