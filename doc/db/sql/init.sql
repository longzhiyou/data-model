/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     2017/1/11 11:54:17                           */
/*==============================================================*/


drop table if exists good;

drop table if exists organization;

drop table if exists person;

drop table if exists service;

drop table if exists test_type;

/*==============================================================*/
/* Table: good                                                  */
/*==============================================================*/
create table good
(
   product_id           bigint not null,
   name                 varchar(40),
   introduction_date    date,
   price                float(9,2) default 0,
   primary key (product_id)
);

/*==============================================================*/
/* Table: organization                                          */
/*==============================================================*/
create table organization
(
   party_id             bigint not null,
   name                 varchar(40),
   tenant_id            bigint not null,
   created_at           timestamp not null default CURRENT_TIMESTAMP,
   updated_at           timestamp default CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
   lock_version         numeric(8,0),
   modifier             varchar(40),
   register             varchar(40),
   primary key (party_id)
);

alter table organization comment '组织';

/*==============================================================*/
/* Table: person                                                */
/*==============================================================*/
create table person
(
   party_id             bigint not null,
   name                 varchar(40),
   tenant_id            bigint not null,
   created_at           timestamp not null default CURRENT_TIMESTAMP,
   updated_at           timestamp default CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
   lock_version         numeric(8,0),
   modifier             varchar(40),
   register             varchar(40),
   gender               char(1) comment '性别',
   birth_date           date comment '出生日期',
   height               numeric(8,0) comment '身高',
   weight               numeric(8,0) comment '体重',
   marital_status       char(1) comment '婚姻状况',
   comments             varchar(255),
   primary key (party_id)
);

alter table person comment '人员';

/*==============================================================*/
/* Table: service                                               */
/*==============================================================*/
create table service
(
   product_id           bigint not null,
   name                 varchar(40),
   introduction_date    date,
   price                float(9,2) default 0,
   primary key (product_id)
);

/*==============================================================*/
/* Table: test_type                                             */
/*==============================================================*/
create table test_type
(
   flg                  bool,
   indicator            char(1)
);

