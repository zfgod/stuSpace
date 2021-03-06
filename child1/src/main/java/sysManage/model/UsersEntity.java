package sysManage.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;

/**
 * author: zf
 * Date: 2016/9/27  16:46
 * Description:
 */
@Entity
@Table(name = "users", schema = "", catalog = "basesys")
public class UsersEntity implements Serializable{
    private static final long serialVersionUID = 5621497022421418031L;
    private int id;
    private String logName;
    private String logPwd;
    private String trueName;
    private Integer age;
    private String email;
    private Integer companyId;
    private Integer departmentId;
    private String agencyNumber;
    private String agencyNames;
    private Integer leaderId;
    private String leaderIds;
    private String phone;
    private String telephone;
    private Integer isSuperAdmin;
    private String remark;
    private Integer state;
    private String loginToken;
    private Integer sort;
    private Date createTime;
    private Date updateTime;

    private Set<RolesEntity> roles;


    public UsersEntity() {
    }

    public UsersEntity(int id, String logName,String logPwd, Integer age, String remark, Integer state) {
        this.id = id;
        this.logName = logName;
        this.logPwd = logPwd;
        this.age = age;
        this.remark = remark;
        this.state = state;
    }

    public Set<RolesEntity> getRoles() {
        return roles;
    }

    public void setRoles(Set<RolesEntity> roles) {
        this.roles = roles;
    }

    @Id
    @Column(name = "Id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    
    @Column(name = "LogName")

    public String getLogName() {
        return logName;
    }

    public void setLogName(String logName) {
        this.logName = logName;
    }

    
    @Column(name = "LogPwd")
    public String getLogPwd() {
        return logPwd;
    }

    public void setLogPwd(String logPwd) {
        this.logPwd = logPwd;
    }

    
    @Column(name = "TrueName")
    public String getTrueName() {
        return trueName;
    }

    public void setTrueName(String trueName) {
        this.trueName = trueName;
    }

    
    @Column(name = "Age")
    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    
    @Column(name = "Email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    
    @Column(name = "CompanyId")
    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    
    @Column(name = "DepartmentId")
    public Integer getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    
    @Column(name = "AgencyNumber")
    public String getAgencyNumber() {
        return agencyNumber;
    }

    public void setAgencyNumber(String agencyNumber) {
        this.agencyNumber = agencyNumber;
    }

    
    @Column(name = "AgencyNames")
    public String getAgencyNames() {
        return agencyNames;
    }

    public void setAgencyNames(String agencyNames) {
        this.agencyNames = agencyNames;
    }

    
    @Column(name = "LeaderId")
    public Integer getLeaderId() {
        return leaderId;
    }

    public void setLeaderId(Integer leaderId) {
        this.leaderId = leaderId;
    }

    
    @Column(name = "LeaderIds")
    public String getLeaderIds() {
        return leaderIds;
    }

    public void setLeaderIds(String leaderIds) {
        this.leaderIds = leaderIds;
    }

    
    @Column(name = "Phone")
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    
    @Column(name = "Telephone")
    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    
    @Column(name = "IsSuperAdmin")
    public Integer getIsSuperAdmin() {
        return isSuperAdmin;
    }

    public void setIsSuperAdmin(Integer isSuperAdmin) {
        this.isSuperAdmin = isSuperAdmin;
    }

    
    @Column(name = "Remark")
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    
    @Column(name = "State")
    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    
    @Column(name = "LoginToken")
    public String getLoginToken() {
        return loginToken;
    }

    public void setLoginToken(String loginToken) {
        this.loginToken = loginToken;
    }

    
    @Column(name = "Sort")
    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

   
    @Column(name = "CreateTime")
    public Date getCreateTime() {
        return createTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    
    @Column(name = "UpdateTime")
    public Date getUpdateTime() {
        return updateTime;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UsersEntity that = (UsersEntity) o;

        if (id != that.id) return false;
        if (logName != null ? !logName.equals(that.logName) : that.logName != null) return false;
        if (logPwd != null ? !logPwd.equals(that.logPwd) : that.logPwd != null) return false;
        if (trueName != null ? !trueName.equals(that.trueName) : that.trueName != null) return false;
        if (age != null ? !age.equals(that.age) : that.age != null) return false;
        if (email != null ? !email.equals(that.email) : that.email != null) return false;
        if (companyId != null ? !companyId.equals(that.companyId) : that.companyId != null) return false;
        if (departmentId != null ? !departmentId.equals(that.departmentId) : that.departmentId != null) return false;
        if (agencyNumber != null ? !agencyNumber.equals(that.agencyNumber) : that.agencyNumber != null) return false;
        if (agencyNames != null ? !agencyNames.equals(that.agencyNames) : that.agencyNames != null) return false;
        if (leaderId != null ? !leaderId.equals(that.leaderId) : that.leaderId != null) return false;
        if (leaderIds != null ? !leaderIds.equals(that.leaderIds) : that.leaderIds != null) return false;
        if (phone != null ? !phone.equals(that.phone) : that.phone != null) return false;
        if (telephone != null ? !telephone.equals(that.telephone) : that.telephone != null) return false;
        if (isSuperAdmin != null ? !isSuperAdmin.equals(that.isSuperAdmin) : that.isSuperAdmin != null) return false;
        if (remark != null ? !remark.equals(that.remark) : that.remark != null) return false;
        if (state != null ? !state.equals(that.state) : that.state != null) return false;
        if (loginToken != null ? !loginToken.equals(that.loginToken) : that.loginToken != null) return false;
        if (sort != null ? !sort.equals(that.sort) : that.sort != null) return false;
        if (createTime != null ? !createTime.equals(that.createTime) : that.createTime != null) return false;
        if (updateTime != null ? !updateTime.equals(that.updateTime) : that.updateTime != null) return false;
        return true;
    }
    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (logName != null ? logName.hashCode() : 0);
        result = 31 * result + (logPwd != null ? logPwd.hashCode() : 0);
        result = 31 * result + (trueName != null ? trueName.hashCode() : 0);
        result = 31 * result + (age != null ? age.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (companyId != null ? companyId.hashCode() : 0);
        result = 31 * result + (departmentId != null ? departmentId.hashCode() : 0);
        result = 31 * result + (agencyNumber != null ? agencyNumber.hashCode() : 0);
        result = 31 * result + (agencyNames != null ? agencyNames.hashCode() : 0);
        result = 31 * result + (leaderId != null ? leaderId.hashCode() : 0);
        result = 31 * result + (leaderIds != null ? leaderIds.hashCode() : 0);
        result = 31 * result + (phone != null ? phone.hashCode() : 0);
        result = 31 * result + (telephone != null ? telephone.hashCode() : 0);
        result = 31 * result + (isSuperAdmin != null ? isSuperAdmin.hashCode() : 0);
        result = 31 * result + (remark != null ? remark.hashCode() : 0);
        result = 31 * result + (state != null ? state.hashCode() : 0);
        result = 31 * result + (loginToken != null ? loginToken.hashCode() : 0);
        result = 31 * result + (sort != null ? sort.hashCode() : 0);
        result = 31 * result + (createTime != null ? createTime.hashCode() : 0);
        result = 31 * result + (updateTime != null ? updateTime.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "UsersEntity{" +
                "id=" + id +
                ", logName='" + logName + '\'' +
                ", logPwd='" + logPwd + '\'' +
                ", trueName='" + trueName + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", companyId=" + companyId +
                ", departmentId=" + departmentId +
                ", agencyNumber='" + agencyNumber + '\'' +
                ", agencyNames='" + agencyNames + '\'' +
                ", leaderId=" + leaderId +
                ", leaderIds='" + leaderIds + '\'' +
                ", phone='" + phone + '\'' +
                ", telephone='" + telephone + '\'' +
                ", isSuperAdmin=" + isSuperAdmin +
                ", remark='" + remark + '\'' +
                ", state=" + state +
                ", loginToken='" + loginToken + '\'' +
                ", sort=" + sort +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                '}';
    }
}
