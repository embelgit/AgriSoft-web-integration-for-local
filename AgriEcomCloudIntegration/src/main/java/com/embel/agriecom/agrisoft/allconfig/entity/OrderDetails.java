package com.embel.agriecom.agrisoft.allconfig.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

import org.springframework.stereotype.Indexed;
/* SAGAR */
@Entity
@Table(name = "order_details")
@TableGenerator(name="seq", initialValue=0, allocationSize = 1)
public class OrderDetails
{	
	@Id
	//@GeneratedValue(strategy=GenerationType.AUTO)
	@GeneratedValue(strategy=GenerationType.TABLE, generator="seq")
	private Long pk_agris_product_id;
	
	@Column(name="pk_cloud_order_id")
	private Long pkOrderId;
	
	@Column(name="fk_product_id")
	private Long productid;
 	
	@Column(name="product_name")
	private String productname;
	
	@Column(name="fk_cat_id")
	private Long fkCatId;
	
	@Column(name="category")
	private String category;
	
	@Column(name="price")
	private Double price;
	
	@Column(name="shipping")
	private Double shipping;
	
	@Column(name="discription")
	private String discription;
	
	@Column(name="image_path")
	private String imagePath;
	
	@Column(name="quantity")
	private long quantity;
	
	@Column(name="total")
	private Double total;

	@Column(name="order_date")
	private Date orderDate;
	
	//USER_DETAILS
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="last_name")
	private String lastName;
	
	@Column(name="adhar_no")
	private Long adharNo;
	
	@Column(name="saat_bara")
	private String saatBara;
	
	@Column(name="address")
	private String address;
	
	@Column(name="village_city_town")
	private String villageCityTown;
	
	@Column(name="country")
	private String country;
	
	@Column(name="contact_no")
	private Long contactNo;
	
	@Column(name="zip_code")
	private int zipCode;
	
	@Column(name="order_id")
	private Long orderId;
	
	@Column(name="is_on_local")
	private String isOnLocal;
	
	@Column(name="packing")
	private Double packing;
	
	@Column(name="manufacturer")
	private String manufacturer;
	
	@Column(name="unit")
	private String unit;
	
	@Column(name="gross_total")
	private Double grossTotal;
	
	public OrderDetails()
	{
		super();
	}

	public OrderDetails(Long pk_agris_product_id, Long pkOrderId, Long productid, String productname, Long fkCatId,
			String category, Double price, Double shipping, String discription, String imagePath, long quantity,
			Double total, Date orderDate, String firstName, String lastName, Long adharNo, String saatBara,
			String address, String villageCityTown, String country, Long contactNo, int zipCode, Long orderId,
			String isOnLocal, Double packing, String manufacturer, String unit, Double grossTotal) {
		super();
		this.pk_agris_product_id = pk_agris_product_id;
		this.pkOrderId = pkOrderId;
		this.productid = productid;
		this.productname = productname;
		this.fkCatId = fkCatId;
		this.category = category;
		this.price = price;
		this.shipping = shipping;
		this.discription = discription;
		this.imagePath = imagePath;
		this.quantity = quantity;
		this.total = total;
		this.orderDate = orderDate;
		this.firstName = firstName;
		this.lastName = lastName;
		this.adharNo = adharNo;
		this.saatBara = saatBara;
		this.address = address;
		this.villageCityTown = villageCityTown;
		this.country = country;
		this.contactNo = contactNo;
		this.zipCode = zipCode;
		this.orderId = orderId;
		this.isOnLocal = isOnLocal;
		this.packing = packing;
		this.manufacturer = manufacturer;
		this.unit = unit;
		this.grossTotal = grossTotal;
	}

	public Long getPk_agris_product_id() {
		return pk_agris_product_id;
	}

	public void setPk_agris_product_id(Long pk_agris_product_id) {
		this.pk_agris_product_id = pk_agris_product_id;
	}

	public Long getPkOrderId() {
		return pkOrderId;
	}

	public void setPkOrderId(Long pkOrderId) {
		this.pkOrderId = pkOrderId;
	}

	public Long getProductid() {
		return productid;
	}

	public void setProductid(Long productid) {
		this.productid = productid;
	}

	public String getProductname() {
		return productname;
	}

	public void setProductname(String productname) {
		this.productname = productname;
	}

	public Long getFkCatId() {
		return fkCatId;
	}

	public void setFkCatId(Long fkCatId) {
		this.fkCatId = fkCatId;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Double getShipping() {
		return shipping;
	}

	public void setShipping(Double shipping) {
		this.shipping = shipping;
	}

	public String getDiscription() {
		return discription;
	}

	public void setDiscription(String discription) {
		this.discription = discription;
	}

	public String getImagePath() {
		return imagePath;
	}

	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}

	public long getQuantity() {
		return quantity;
	}

	public void setQuantity(long quantity) {
		this.quantity = quantity;
	}

	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Long getAdharNo() {
		return adharNo;
	}

	public void setAdharNo(Long adharNo) {
		this.adharNo = adharNo;
	}

	public String getSaatBara() {
		return saatBara;
	}

	public void setSaatBara(String saatBara) {
		this.saatBara = saatBara;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getVillageCityTown() {
		return villageCityTown;
	}

	public void setVillageCityTown(String villageCityTown) {
		this.villageCityTown = villageCityTown;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Long getContactNo() {
		return contactNo;
	}

	public void setContactNo(Long contactNo) {
		this.contactNo = contactNo;
	}

	public int getZipCode() {
		return zipCode;
	}

	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}

	public Long getOrderId() {
		return orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	public String getIsOnLocal() {
		return isOnLocal;
	}

	public void setIsOnLocal(String isOnLocal) {
		this.isOnLocal = isOnLocal;
	}

	public Double getPacking() {
		return packing;
	}

	public void setPacking(Double packing) {
		this.packing = packing;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public Double getGrossTotal() {
		return grossTotal;
	}

	public void setGrossTotal(Double grossTotal) {
		this.grossTotal = grossTotal;
	}

	@Override
	public String toString() {
		return "OrderDetails [pk_agris_product_id=" + pk_agris_product_id + ", pkOrderId=" + pkOrderId + ", productid="
				+ productid + ", productname=" + productname + ", fkCatId=" + fkCatId + ", category=" + category
				+ ", price=" + price + ", shipping=" + shipping + ", discription=" + discription + ", imagePath="
				+ imagePath + ", quantity=" + quantity + ", total=" + total + ", orderDate=" + orderDate
				+ ", firstName=" + firstName + ", lastName=" + lastName + ", adharNo=" + adharNo + ", saatBara="
				+ saatBara + ", address=" + address + ", villageCityTown=" + villageCityTown + ", country=" + country
				+ ", contactNo=" + contactNo + ", zipCode=" + zipCode + ", orderId=" + orderId + ", isOnLocal="
				+ isOnLocal + ", packing=" + packing + ", manufacturer=" + manufacturer + ", unit=" + unit
				+ ", grossTotal=" + grossTotal + "]";
	}
}
