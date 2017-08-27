package cn.zsh.ssh.dao;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import cn.zsh.ssh.domain.Product;

/**
 * 商品管理DAO
 * 
 * @author zsh
 *
 */
public class ProductDao extends HibernateDaoSupport{

	/**
	 * DAO中保存商品方法
	 * 
	 * @param product
	 */
	public void save(Product product) {
		this.getHibernateTemplate().save(product);
	}

}
