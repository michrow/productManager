package com.rxing.boot.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 商品类
 * @author wxh
 * 2017年4月14日
 */
@Entity
@Table(name="product")
public class Product {
	
	@Id
	private long productId;
	private String productName;
	private String productDesc;
	private float productPrice;
	private int productTotal;
	private int productRest;
	private float productRebate;
	private long productClickCounts;
	private String productPicturePath;
	
	/**
	 * 缺省构造函数
	 */
	public Product(){}
	
	/**
	 * 构造函数
	 * @param productId - 商品ID
	 * @param productName -商品名字
	 * @param productDesc -商品描述
	 * @param productPrice -商品价格
	 * @param productTotal -商品总量
	 * @param productRest -商品剩余
	 * @param productRebate -商品折扣
	 * @param productClickCounts -商品点击量
	 * @param productPicturePath -商品图片路径
	 */
	public Product(long productId, String productName, String productDesc, float productPrice, int productTotal,
			int productRest, float productRebate, long productClickCounts, String productPicturePath) {
		this(productName, productDesc, productPrice, productTotal, productRest, productRebate, productClickCounts, productPicturePath);
		this.productId = productId;
	}
	
	/**
	 * 构造函数
	 * @param productName
	 * @param productDesc
	 * @param productPrice
	 * @param productTotal
	 * @param productRest
	 * @param productRebate
	 * @param productClickCounts
	 * @param productPicturePath
	 */
	public Product(String productName, String productDesc, float productPrice, int productTotal, int productRest,
			float productRebate, long productClickCounts, String productPicturePath) {
		super();
		this.productName = productName;
		this.productDesc = productDesc;
		this.productPrice = productPrice;
		this.productTotal = productTotal;
		this.productRest = productRest;
		this.productRebate = productRebate;
		this.productClickCounts = productClickCounts;
		this.productPicturePath = productPicturePath;
	}
	/**
	 * @return the productId
	 */
	public long getProductId() {
		return productId;
	}
	/**
	 * @param productId the productId to set
	 */
	public void setProductId(long productId) {
		this.productId = productId;
	}
	/**
	 * @return the productName
	 */
	public String getProductName() {
		return productName;
	}
	/**
	 * @param productName the productName to set
	 */
	public void setProductName(String productName) {
		this.productName = productName;
	}
	/**
	 * @return the productDesc
	 */
	public String getProductDesc() {
		return productDesc;
	}
	/**
	 * @param productDesc the productDesc to set
	 */
	public void setProductDesc(String productDesc) {
		this.productDesc = productDesc;
	}
	/**
	 * @return the productPrice
	 */
	public float getProductPrice() {
		return productPrice;
	}
	/**
	 * @param productPrice the productPrice to set
	 */
	public void setProductPrice(float productPrice) {
		this.productPrice = productPrice;
	}
	/**
	 * @return the productTotal
	 */
	public int getProductTotal() {
		return productTotal;
	}
	/**
	 * @param productTotal the productTotal to set
	 */
	public void setProductTotal(int productTotal) {
		this.productTotal = productTotal;
	}
	/**
	 * @return the productRest
	 */
	public int getProductRest() {
		return productRest;
	}
	/**
	 * @param productRest the productRest to set
	 */
	public void setProductRest(int productRest) {
		this.productRest = productRest;
	}
	/**
	 * @return the productRebate
	 */
	public float getProductRebate() {
		return productRebate;
	}
	/**
	 * @param productRebate the productRebate to set
	 */
	public void setProductRebate(float productRebate) {
		this.productRebate = productRebate;
	}
	/**
	 * @return the productClickCounts
	 */
	public long getProductClickCounts() {
		return productClickCounts;
	}
	/**
	 * @param productClickCounts the productClickCounts to set
	 */
	public void setProductClickCounts(long productClickCounts) {
		this.productClickCounts = productClickCounts;
	}
	/**
	 * @return the productPicturePath
	 */
	public String getProductPicturePath() {
		return productPicturePath;
	}
	/**
	 * @param productPicturePath the productPicturePath to set
	 */
	public void setProductPicturePath(String productPicturePath) {
		this.productPicturePath = productPicturePath;
	}
	
	
}
