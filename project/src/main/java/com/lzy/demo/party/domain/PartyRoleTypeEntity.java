package com.lzy.demo.party.domain;

import javax.persistence.*;

/**
 * User: longzhiyou
 * Date: 2017/1/13
 * Time: 18:02
 */
@Entity
@Table(name = "party_role_type", schema = "data-model", catalog = "")
public class PartyRoleTypeEntity {
    private Integer roleTypeId;
    private String description;

    @Id
    @Column(name = "role_type_id")
    public Integer getRoleTypeId() {
        return roleTypeId;
    }

    public void setRoleTypeId(Integer roleTypeId) {
        this.roleTypeId = roleTypeId;
    }

    @Basic
    @Column(name = "description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PartyRoleTypeEntity that = (PartyRoleTypeEntity) o;

        if (roleTypeId != null ? !roleTypeId.equals(that.roleTypeId) : that.roleTypeId != null) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = roleTypeId != null ? roleTypeId.hashCode() : 0;
        result = 31 * result + (description != null ? description.hashCode() : 0);
        return result;
    }
}
