package br.com.foursys.fourcamp.fourstore.model;

import br.com.foursys.fourcamp.fourstore.enums.CategoryEnum;
import br.com.foursys.fourcamp.fourstore.enums.ColorEnum;
import br.com.foursys.fourcamp.fourstore.enums.DepartmentEnum;
import br.com.foursys.fourcamp.fourstore.enums.SizeEnum;
import br.com.foursys.fourcamp.fourstore.enums.TypeEnum;

public class Product {
	private String id;
	private String sku;
	private Double originalprice;
	private Double saleprice;
	private Integer qtt;
	private TypeEnum type;
	private SizeEnum size;
	private ColorEnum color;
	private CategoryEnum category;
	private DepartmentEnum department;
	private String description;

	public Product() {

	}



	public Product(String sku, Double originalprice, Double saleprice, Integer qtt, String description) {
		super();
		this.sku = sku;
		this.originalprice = originalprice;
		this.saleprice = saleprice;
		this.qtt = qtt;
		this.description = description;
		seeSku(sku);
	}

	public Product(String sku, Double originalprice, Double saleprice, Integer qtt) {
		super();
		this.sku = sku;
		this.originalprice = originalprice;
		this.saleprice = saleprice;
		this.qtt = qtt;
		seeSku(sku);
	}
	

	public Product(String sku) {
		super();
		this.sku = sku;
		seeSku(sku);
	}

	public String getSku() {
		return sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

	public Double getOriginalprice() {
		return originalprice;
	}

	public void setOriginalprice(Double originalprice) {
		this.originalprice = originalprice;
	}

	public Double getSaleprice() {
		return saleprice;
	}

	public void setSaleprice(Double saleprice) {
		this.saleprice = saleprice;
	}

	public Integer getQtt() {
		return qtt;
	}

	public void setQtt(Integer qtt) {
		this.qtt = qtt;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	

	public TypeEnum getType() {
		return type;
	}

	public void setType(TypeEnum type) {
		this.type = type;
	}

	public SizeEnum getSize() {
		return size;
	}

	public void setSize(SizeEnum size) {
		this.size = size;
	}

	public ColorEnum getColor() {
		return color;
	}

	public void setColor(ColorEnum color) {
		this.color = color;
	}

	public CategoryEnum getCategory() {
		return category;
	}

	public void setCategory(CategoryEnum category) {
		this.category = category;
	}

	public DepartmentEnum getDepartment() {
		return department;
	}

	public void setDepartment(DepartmentEnum department) {
		this.department = department;
	}

	public void seeSku(String sku) {
		this.id = sku.substring(0, 2);
		this.color = color.get(sku.substring(2, 4));
		this.type = type.get(sku.substring(4, 7));
		this.department = department.get(sku.substring(7, 11));
		this.category = category.get(sku.substring(11, 14));
		this.size = size.get(sku.substring(14, 19));
		

	}
	

	
}

