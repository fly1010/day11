package com.juechuang.emity;


import java.util.List;

public class Order {

  private Integer orderId;
  private String username;
  private Integer phone;
  private String address;
  private List<Detail> detailList;

  public long getOrderId() {
    return orderId;
  }

  public void setOrderId(Integer orderId) {
    this.orderId = orderId;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public long getPhone() {
    return phone;
  }

  public void setPhone(Integer phone) {
    this.phone = phone;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public List<Detail> getDetailList() {
    return detailList;
  }

  public void setDetailList(List<Detail> detailList) {
    this.detailList = detailList;
  }

  @Override
  public String toString() {
    return "Order{" +
            "orderId=" + orderId +
            ", username='" + username + '\'' +
            ", phone=" + phone +
            ", address='" + address + '\'' +
            ", detailList=" + detailList +
            '}';
  }
}
