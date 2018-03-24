package org.ssm.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.ssm.model.Goods;

public interface GoodsDao {
	
	@Insert("insert into goods value(null,#{name},#{price},#{type},#{stock})")
	void Goods_Add(Goods goods);
	
	@Delete("delete from goods where id=#{goodId}")
	void Goods_DeleteById(int goodId);
	
	@Update("update goods set name=#{name},price=#{price},type=#{type},stock=#{stock} where id=#{id}")
	void Goods_UpdateById(Goods goods);
	
	@Select("select * from goods where id=#{goodsId}")
	Goods Goods_QueryOneById(int goodsId);
	
	@Select("select * from goods where name like #{goodsName}")
	List<Goods> Goods_QueryByNames(String goodsName);
	
	@Select("select * from goods")
	List<Goods> GoodsQueryAll();
}
