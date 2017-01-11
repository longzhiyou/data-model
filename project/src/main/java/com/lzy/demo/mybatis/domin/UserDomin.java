package com.lzy.demo.mybatis.domin;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @link http://blog.didispace.com/mybatisinfo/
 * [2016-11-09 add by longzhiyou]
 */
@Mapper
public interface UserDomin {

    /**
     * 先简单验证接口
     * @return
     */
    @Select("SELECT count(*) FROM t_institute_user ")
    long getCount();

//    @Insert("INSERT INTO USER(NAME, AGE) VALUES(#{name}, #{age})")
//    int insert(@Param("name") String name, @Param("age") Integer age);

//    @Insert("INSERT INTO USER(NAME, AGE) VALUES(#{name,jdbcType=VARCHAR}, #{age,jdbcType=INTEGER})")
//    int insertByMap(Map<String, Object> map);

    /**
     * 返回结果的绑定
     * [2016-11-09 add by longzhiyou]
     */

//    @Results({
//            @Result(property = "name", column = "name"),
//            @Result(property = "age", column = "age")
//    })
//    @Select("SELECT name, age FROM user")
//    List<User> findAll();

}
