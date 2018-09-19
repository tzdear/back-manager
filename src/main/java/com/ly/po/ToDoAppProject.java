package com.ly.po;

import java.io.Serializable;
import java.util.Date;

public class ToDoAppProject implements Serializable {
    private Integer id;

    private String titile;

    private String doc;

    private Date startTime;

    private Date endTime;

    private Integer createUser;

    private Integer responsiblePerson;

    private String status;

    private String simpleBrokerPrefix;

    private Date createTime;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitile() {
        return titile;
    }

    public void setTitile(String titile) {
        this.titile = titile == null ? null : titile.trim();
    }

    public String getDoc() {
        return doc;
    }

    public void setDoc(String doc) {
        this.doc = doc == null ? null : doc.trim();
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Integer getCreateUser() {
        return createUser;
    }

    public void setCreateUser(Integer createUser) {
        this.createUser = createUser;
    }

    public Integer getResponsiblePerson() {
        return responsiblePerson;
    }

    public void setResponsiblePerson(Integer responsiblePerson) {
        this.responsiblePerson = responsiblePerson;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getSimpleBrokerPrefix() {
        return simpleBrokerPrefix;
    }

    public void setSimpleBrokerPrefix(String simpleBrokerPrefix) {
        this.simpleBrokerPrefix = simpleBrokerPrefix == null ? null : simpleBrokerPrefix.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        ToDoAppProject other = (ToDoAppProject) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getTitile() == null ? other.getTitile() == null : this.getTitile().equals(other.getTitile()))
            && (this.getDoc() == null ? other.getDoc() == null : this.getDoc().equals(other.getDoc()))
            && (this.getStartTime() == null ? other.getStartTime() == null : this.getStartTime().equals(other.getStartTime()))
            && (this.getEndTime() == null ? other.getEndTime() == null : this.getEndTime().equals(other.getEndTime()))
            && (this.getCreateUser() == null ? other.getCreateUser() == null : this.getCreateUser().equals(other.getCreateUser()))
            && (this.getResponsiblePerson() == null ? other.getResponsiblePerson() == null : this.getResponsiblePerson().equals(other.getResponsiblePerson()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getSimpleBrokerPrefix() == null ? other.getSimpleBrokerPrefix() == null : this.getSimpleBrokerPrefix().equals(other.getSimpleBrokerPrefix()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getTitile() == null) ? 0 : getTitile().hashCode());
        result = prime * result + ((getDoc() == null) ? 0 : getDoc().hashCode());
        result = prime * result + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        result = prime * result + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        result = prime * result + ((getCreateUser() == null) ? 0 : getCreateUser().hashCode());
        result = prime * result + ((getResponsiblePerson() == null) ? 0 : getResponsiblePerson().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getSimpleBrokerPrefix() == null) ? 0 : getSimpleBrokerPrefix().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", titile=").append(titile);
        sb.append(", doc=").append(doc);
        sb.append(", startTime=").append(startTime);
        sb.append(", endTime=").append(endTime);
        sb.append(", createUser=").append(createUser);
        sb.append(", responsiblePerson=").append(responsiblePerson);
        sb.append(", status=").append(status);
        sb.append(", simpleBrokerPrefix=").append(simpleBrokerPrefix);
        sb.append(", createTime=").append(createTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}