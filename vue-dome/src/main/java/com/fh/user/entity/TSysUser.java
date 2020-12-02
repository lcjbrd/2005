package com.fh.user.entity;

import java.time.LocalDate;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * <p>
 *
 * </p>
 *
 * @author lcj
 * @since 2020-11-30
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("t_sys_user")
public class TSysUser implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableField("Id")
    @TableId(type = IdType.AUTO)
    private Integer id;
    /**
     * 用户名
     */
    @TableField("userName")
    private String username;

    /**
     * 姓名
     */
    @TableField("realName")
    private String realname;

    /**
     * 手机号
     */
    private String phone;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 密码
     */
    private String password;

    /**
     * 性别 1男 2女
     */
    private String sex;

    /**
     * 生日
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate birthday;

    /**
     * 个人头像
     */
    @TableField("imgUrl")
    private String imgurl;

    /**
     * 学历
     */
    @TableField("eduId")
    private String eduid;

    /**
     * 身份证号
     */
    @TableField("idCard")
    private String idcard;

    /**
     * 省
     */
    @TableField("provinceCode")
    private String provincecode;

    /**
     * 市
     */
    @TableField("cityCode")
    private String citycode;

    /**
     * 县
     */
    @TableField("areaCode")
    private String areacode;

    /**
     * 部门id
     */
    @TableField("deptId")
    private Integer deptid;

    @TableField("saltCode")
    private String saltcode;


}
