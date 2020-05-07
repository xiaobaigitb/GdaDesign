package com.demo.gdadesign.gda.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "gda")
public class GdaEntity {
    @Id
    @Column(name = "id", length = 255)
    private String id;
    @Column(name = "create_date", length = 255)
    private String createDate;
    @Column(name = "create_name", length = 255)
    private String createName;
    @Column(name = "create_by", length = 255)
    private String createBy;
    @Column(name = "update_date", length = 255)
    private String updateDate;
    @Column(name = "update_name", length = 255)
    private String updateName;
    @Column(name = "update_by", length = 255)
    private String updateBy;
    @Column(name = "url", length = 255)
    private String url;
    @Column(name = "pic", length = 255)
    private String pic;
    @Column(name = "title", length = 255)
    private String title;
    @Column(name = "class_code", length = 255)
    private String classCode;
    @Column(name = "is_show", length = 255)
    private String isShow;
    @Column(name = "file_path", length = 255)
    private String filePath;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public String getCreateName() {
        return createName;
    }

    public void setCreateName(String createName) {
        this.createName = createName;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public String getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(String updateDate) {
        this.updateDate = updateDate;
    }

    public String getUpdateName() {
        return updateName;
    }

    public void setUpdateName(String updateName) {
        this.updateName = updateName;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getClassCode() {
        return classCode;
    }

    public void setClassCode(String classCode) {
        this.classCode = classCode;
    }

    public String getIsShow() {
        return isShow;
    }

    public void setIsShow(String isShow) {
        this.isShow = isShow;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }
}
