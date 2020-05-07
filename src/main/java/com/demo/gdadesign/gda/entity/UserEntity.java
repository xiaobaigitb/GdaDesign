package com.demo.gdadesign.gda.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class UserEntity {
    @Id
    @Column(name = "id", length = 36)
    private String id;
    @Column(name = "username", length = 36)
    private String username;
    @Column(name = "password", length = 36)
    private String password;
    @Column(name = "sex", length = 36)
    private String sex;
    @Column(name = "age", length = 36)
    private String age;
    @Column(name = "pic", length = 36)
    private String pic;
    @Column(name = "wechat", length = 36)
    private String wechat;
    @Column(name = "phone", length = 36)
    private String phone;
    @Column(name = "update_date", length = 36)
    private String updateDate;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public String getWechat() {
        return wechat;
    }

    public void setWechat(String wechat) {
        this.wechat = wechat;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(String updateDate) {
        this.updateDate = updateDate;
    }
}
