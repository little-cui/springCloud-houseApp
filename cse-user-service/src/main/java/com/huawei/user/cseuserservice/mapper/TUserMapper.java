package com.huawei.user.cseuserservice.mapper;

import com.huawei.user.cseuserservice.entity.TUser;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.type.JdbcType;

public interface TUserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user
     *
     * @mbg.generated
     */
    @Delete({
        "delete from t_user",
        "where ID = #{id,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user
     *
     * @mbg.generated
     */
    @Insert({
        "insert into t_user (ID, USER_NAME, ",
        "PHONE_NUMBER, EMAIL, ",
        "SEX, ACCOUNT_ID)",
        "values (#{id,jdbcType=VARCHAR}, #{userName,jdbcType=VARCHAR}, ",
        "#{phoneNumber,jdbcType=VARCHAR}, #{email,jdbcType=VARCHAR}, ",
        "#{sex,jdbcType=BIT}, #{accountId,jdbcType=VARCHAR})"
    })
    @SelectKey(keyProperty = "id", resultType = String.class, before = true,
        statement = "select replace(uuid(), '-', '') as id from dual")
    int insert(TUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user
     *
     * @mbg.generated
     */
    @Select({
        "select",
        "ID, USER_NAME, PHONE_NUMBER, EMAIL, SEX, ACCOUNT_ID",
        "from t_user",
        "where ID = #{id,jdbcType=VARCHAR}"
    })
    @Results({
        @Result(column="ID", property="id", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="USER_NAME", property="userName", jdbcType=JdbcType.VARCHAR),
        @Result(column="PHONE_NUMBER", property="phoneNumber", jdbcType=JdbcType.VARCHAR),
        @Result(column="EMAIL", property="email", jdbcType=JdbcType.VARCHAR),
        @Result(column="SEX", property="sex", jdbcType=JdbcType.BIT),
        @Result(column="ACCOUNT_ID", property="accountId", jdbcType=JdbcType.VARCHAR)
    })
    TUser selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user
     *
     * @mbg.generated
     */
    @Select({
        "select",
        "ID, USER_NAME, PHONE_NUMBER, EMAIL, SEX, ACCOUNT_ID",
        "from t_user"
    })
    @Results({
        @Result(column="ID", property="id", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="USER_NAME", property="userName", jdbcType=JdbcType.VARCHAR),
        @Result(column="PHONE_NUMBER", property="phoneNumber", jdbcType=JdbcType.VARCHAR),
        @Result(column="EMAIL", property="email", jdbcType=JdbcType.VARCHAR),
        @Result(column="SEX", property="sex", jdbcType=JdbcType.BIT),
        @Result(column="ACCOUNT_ID", property="accountId", jdbcType=JdbcType.VARCHAR)
    })
    List<TUser> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user
     *
     * @mbg.generated
     */
    @Update({
        "update t_user",
        "set USER_NAME = #{userName,jdbcType=VARCHAR},",
          "PHONE_NUMBER = #{phoneNumber,jdbcType=VARCHAR},",
          "EMAIL = #{email,jdbcType=VARCHAR},",
          "SEX = #{sex,jdbcType=BIT},",
          "ACCOUNT_ID = #{accountId,jdbcType=VARCHAR}",
        "where ID = #{id,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(TUser record);
}