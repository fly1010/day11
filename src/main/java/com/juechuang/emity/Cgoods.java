package com.juechuang.emity;


public class Cgoods {

  private Integer gid;
//  分类id名
  private String cname;
  private String gname;
  private Integer number;
  private String photo;
  private String type;
  private Integer price;
  private String described;
  private First first;

  public Integer getGid() {
    return gid;
  }

  public void setGid(Integer gid) {
    this.gid = gid;
  }

  public String getCid() {
    return cname;
  }

  public void setCid(String cid) {
    this.cname = cid;
  }

  public String getGname() {
    return gname;
  }

  public void setGname(String gname) {
    this.gname = gname;
  }

  public Integer getNumber() {
    return number;
  }

  public void setNumber(Integer number) {
    this.number = number;
  }

  public String getPhoto() {
    return photo;
  }

  public void setPhoto(String photo) {
    this.photo = photo;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Integer getPrice() {
    return price;
  }

  public void setPrice(Integer price) {
    this.price = price;
  }

  public String getDescribed() {
    return described;
  }

  public void setDescribed(String described) {
    this.described = described;
  }

  public First getFirst() {
    return first;
  }

  public void setFirst(First first) {
    this.first = first;
  }

  @Override
  public String toString() {
    return "Cgoods{" +
            "gid=" + gid +
            ", cname='" + cname + '\'' +
            ", gname='" + gname + '\'' +
            ", number=" + number +
            ", photo='" + photo + '\'' +
            ", type='" + type + '\'' +
            ", price=" + price +
            ", described='" + described + '\'' +
            ", first=" + first +
            '}';
  }
}
