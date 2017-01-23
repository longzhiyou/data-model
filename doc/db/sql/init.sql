/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     2017/1/17 10:39:28                           */
/*==============================================================*/


drop table if exists book;

drop table if exists book_publisher;

drop table if exists contact;

drop table if exists contractor;

drop table if exists customer;

drop table if exists employee;

drop table if exists family_member;

drop table if exists good;

drop table if exists organization;

drop table if exists party_role_type;

drop table if exists person;

drop table if exists publisher;

drop table if exists service;

drop table if exists student;

drop table if exists teacher;

drop table if exists test_type;

/*==============================================================*/
/* Table: book                                                  */
/*==============================================================*/
create table book
(
   book_id              int not null auto_increment,
   name                 varchar(40),
   primary key (book_id)
);

/*==============================================================*/
/* Table: book_publisher                                        */
/*==============================================================*/
create table book_publisher
(
   book_id              int not null,
   publisher_id         int not null,
   published_date       date,
   primary key (book_id, publisher_id)
);

/*==============================================================*/
/* Table: contact                                               */
/*==============================================================*/
create table contact
(
   party_role_id        int,
   from_date            date,
   due_date             date comment '终止日期',
   party_id             int not null,
   role_type_id         int not null,
   primary key (party_id, role_type_id)
);

alter table contact comment '联系人';

/*==============================================================*/
/* Table: contractor                                            */
/*==============================================================*/
create table contractor
(
   party_role_id        int,
   from_date            date,
   due_date             date,
   party_id             int not null,
   role_type_id         int not null,
   primary key (party_id, role_type_id)
);

alter table contractor comment '1.立约人，订约人
2.承包人，承包商；承揽人';

/*==============================================================*/
/* Table: customer                                              */
/*==============================================================*/
create table customer
(
   party_role_id        int,
   from_date            date,
   due_date             date comment '终止日期',
   party_id             int not null,
   role_type_id         int not null,
   primary key (party_id, role_type_id)
);

alter table customer comment '客户';

/*==============================================================*/
/* Table: employee                                              */
/*==============================================================*/
create table employee
(
   party_role_id        int,
   party_id             int not null,
   role_type_id         int not null,
   from_date            date,
   due_date             date,
   primary key (party_id, role_type_id)
);

alter table employee comment '雇员';

/*==============================================================*/
/* Table: family_member                                         */
/*==============================================================*/
create table family_member
(
   party_role_id        int,
   from_date            date,
   due_date             date comment '终止日期',
   party_id             int not null,
   role_type_id         int not null,
   primary key (party_id, role_type_id)
);

alter table family_member comment '家庭成员';

/*==============================================================*/
/* Table: good                                                  */
/*==============================================================*/
create table good
(
   product_id           int not null,
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
   party_id             int not null auto_increment,
   name                 varchar(40),
   tenant_id            int,
   created_at           timestamp default CURRENT_TIMESTAMP,
   updated_at           timestamp default CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
   lock_version         int,
   updated_by           varchar(40),
   created_by           varchar(40),
   delete_flag          bool,
   primary key (party_id)
);

alter table organization comment '组织';

/*==============================================================*/
/* Table: party_role_type                                       */
/*==============================================================*/
create table party_role_type
(
   role_type_id         int not null,
   description          varchar(255),
   primary key (role_type_id)
);

alter table party_role_type comment '当事人角色类型';

/*==============================================================*/
/* Table: person                                                */
/*==============================================================*/
create table person
(
   party_id             int not null auto_increment,
   name                 varchar(40),
   tenant_id            int,
   created_at           timestamp default CURRENT_TIMESTAMP,
   updated_at           timestamp default CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
   lock_version         int,
   updated_by           varchar(40),
   created_by           varchar(40),
   delete_flag          bool,
   gender               varchar(1) comment '性别',
   birth_date           date comment '出生日期',
   height               varchar(40) comment '身高',
   weight               varchar(40) comment '体重',
   marital_status       varchar(1) comment '婚姻状况',
   comments             varchar(255),
   primary key (party_id)
);

alter table person comment '人员';

/*==============================================================*/
/* Table: publisher                                             */
/*==============================================================*/
create table publisher
(
   publisher_id         int not null auto_increment,
   name                 varchar(40),
   primary key (publisher_id)
);

/*==============================================================*/
/* Table: service                                               */
/*==============================================================*/
create table service
(
   product_id           int not null,
   name                 varchar(40),
   introduction_date    date,
   price                float(9,2) default 0,
   primary key (product_id)
);

/*==============================================================*/
/* Table: student                                               */
/*==============================================================*/
create table student
(
   student_id           int not null,
   number_of_pages      int,
   primary key (student_id)
);

/*==============================================================*/
/* Table: teacher                                               */
/*==============================================================*/
create table teacher
(
   teacher_id           int not null,
   name                 varchar(40),
   primary key (teacher_id)
);

/*==============================================================*/
/* Table: test_type                                             */
/*==============================================================*/
create table test_type
(
   flg                  bool,
   indicator            varchar(1)
);

alter table book_publisher add constraint FK_Relationship_3 foreign key (book_id)
      references book (book_id) on delete restrict on update restrict;

alter table book_publisher add constraint FK_Relationship_4 foreign key (publisher_id)
      references publisher (publisher_id) on delete restrict on update restrict;

alter table contact add constraint FK_r_12 foreign key (party_id)
      references person (party_id) on delete restrict on update restrict;

alter table contact add constraint FK_r_13 foreign key (party_id)
      references organization (party_id) on delete restrict on update restrict;

alter table contact add constraint FK_r_14 foreign key (role_type_id)
      references party_role_type (role_type_id) on delete restrict on update restrict;

alter table contractor add constraint FK_r_10 foreign key (party_id)
      references organization (party_id) on delete restrict on update restrict;

alter table contractor add constraint FK_r_11 foreign key (role_type_id)
      references party_role_type (role_type_id) on delete restrict on update restrict;

alter table contractor add constraint FK_r_9 foreign key (party_id)
      references person (party_id) on delete restrict on update restrict;

alter table customer add constraint FK_r_3 foreign key (party_id)
      references person (party_id) on delete restrict on update restrict;

alter table customer add constraint FK_r_4 foreign key (party_id)
      references organization (party_id) on delete restrict on update restrict;

alter table customer add constraint FK_r_5 foreign key (role_type_id)
      references party_role_type (role_type_id) on delete restrict on update restrict;

alter table employee add constraint FK_r_6 foreign key (party_id)
      references person (party_id) on delete restrict on update restrict;

alter table employee add constraint FK_r_7 foreign key (party_id)
      references organization (party_id) on delete restrict on update restrict;

alter table employee add constraint FK_r_8 foreign key (role_type_id)
      references party_role_type (role_type_id) on delete restrict on update restrict;

alter table family_member add constraint FK_r_1 foreign key (party_id)
      references organization (party_id) on delete restrict on update restrict;

alter table family_member add constraint FK_r_15 foreign key (party_id)
      references person (party_id) on delete restrict on update restrict;

alter table family_member add constraint FK_r_2 foreign key (role_type_id)
      references party_role_type (role_type_id) on delete restrict on update restrict;

