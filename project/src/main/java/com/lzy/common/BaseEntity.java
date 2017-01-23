package com.lzy.common;

import lombok.Data;
import org.hibernate.annotations.Where;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;
import java.time.LocalDateTime;

/**
 * User: longzhiyou
 * Date: 2017/1/12
 * Time: 11:43
 */
/**
 * //查询的时候可以设置列为删除标志
 * http://stackoverflow.com/questions/19323557/handling-soft-deletes-with-spring-jpa
 * [2017-01-16 add by longzhiyou]
 */
//@Where(clause="is_active=1")
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
@Data
public abstract class BaseEntity  implements Serializable {

    private static final long serialVersionUID = 1L;
    protected static final String NOT_DELETED = "deleted_on > CURRENT_TIMESTAMP OR deleted_on IS NULL";

    private Integer tenantId;
    private Timestamp createdAt;
    private Timestamp updatedAt;

    @Version
    private Integer lockVersion;

    @LastModifiedBy
    private String updatedBy;

    @CreatedBy
    private String createdBy;

//    private int deleteFlag;

    protected LocalDateTime deletedOn;

//    @PrePersist
//    public void prePersist() {
//
//        this.createdBy = "createdBy";
//        this.updatedBy = "updatedBy";
//    }


}
