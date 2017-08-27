package cn.zsh.ssh.service;

import org.springframework.transaction.annotation.Transactional;

import cn.zsh.ssh.dao.ProductDao;
import cn.zsh.ssh.domain.Product;

/**
 * 商品管理业务层
 * @author zsh
 *
 */
@Transactional
public class ProductService {
	
	//业务层注入DAO的类
	private ProductDao productDao;

	public void setProductDao(ProductDao productDao) {
		this.productDao = productDao;
	}
	
	/**
	 * 业务层保存商品方法
	 * @param product
	 */
	public void save(Product product) {
		productDao.save(product);
	}
}
