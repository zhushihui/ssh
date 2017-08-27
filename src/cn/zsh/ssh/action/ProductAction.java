package cn.zsh.ssh.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import cn.zsh.ssh.domain.Product;
import cn.zsh.ssh.service.ProductService;

/**
 * 商品管理Action
 * @author zsh
 *
 */
public class ProductAction extends ActionSupport implements ModelDriven<Product>{
	
	//模型驱动使用的类
	private Product product = new Product();
	@Override
	public Product getModel() {
		return product;
	}
	
	//Struts和Spring整合过程中按名称自动注入的业务层的类
	private ProductService productService;

	public void setProductService(ProductService productService) {
		this.productService = productService;
	}

	
	/**
	 * 保存商品方法：save
	 */
	public String save() {
		productService.save(product);
		return NONE;
	}
}
