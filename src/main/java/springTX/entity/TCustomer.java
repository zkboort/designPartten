package springTX.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (TCustomer)实体类
 *
 * @author makejava
 * @since 2022-08-28 18:50:29
 */
public class TCustomer implements Serializable {
    private static final long serialVersionUID = -65867535722316353L;
    /**
     * 主键索引
     */
    private Integer id;
    /**
     * 客户编号
     */
    private Integer customerNo;
    /**
     * 名称
     */
    private String name;
    /**
     * 电话
     */
    private String phone;
    /**
     * 城市
     */
    private String area;
    /**
     * 客户级别
     */
    private String level;
    /**
     * 账户余额
     */
    private Double accountBalances;
    /**
     * 地址
     */
    private String address;
    
    private Date createDate;
    
    private Date updateDate;
    /**
     * 是否有效
     */
    private Integer isValid;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCustomerNo() {
        return customerNo;
    }

    public void setCustomerNo(Integer customerNo) {
        this.customerNo = customerNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public Double getAccountBalances() {
        return accountBalances;
    }

    public void setAccountBalances(Double accountBalances) {
        this.accountBalances = accountBalances;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public Integer getIsValid() {
        return isValid;
    }

    public void setIsValid(Integer isValid) {
        this.isValid = isValid;
    }

}

