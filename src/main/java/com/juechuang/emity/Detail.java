package com.juechuang.emity;


public class Detail {

  private Integer detailId;
  private Integer orderId;
  private String gname;
  private Integer price;

  public Integer getDetailId() {
    return detailId;
  }

  public void setDetailId(Integer detailId) {
    this.detailId = detailId;
  }

  public Integer getOrderId() {
    return orderId;
  }

  public void setOrderId(Integer orderId) {
    this.orderId= orderId;
  }

  public String getGname() {
    return gname;
  }

  public void setGname(String gname) {
    this.gname = gname;
  }

  public Integer getPrice() {
    return price;
  }

  public void setPrice(Integer price) {
    this.price = price;
  }

  @Override
  public String toString() {
    return "Detail{" +
            "detailId=" + detailId +
            ", orderId1=" + orderId +
            ", gname='" + gname + '\'' +
            ", price=" + price +
            '}';
  }
}
