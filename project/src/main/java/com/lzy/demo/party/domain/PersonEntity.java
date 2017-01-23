package com.lzy.demo.party.domain;

import com.lzy.common.BaseEntity;
import com.lzy.common.CommonDefine;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Where;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;
import java.sql.Timestamp;

/**
 * User: longzhiyou
 * Date: 2017/1/17
 * Time: 11:59
 */
@Entity
@Where(clause= CommonDefine.NOT_DELETED)
@Data
@NoArgsConstructor
@Table(name = "person", schema = "data-model", catalog = "")
public class PersonEntity extends BaseEntity  {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer partyId;
    private String name;
    private String gender;
    private Date birthDate;
    private String height;
    private String weight;
    private String maritalStatus;
    private String comments;

}
