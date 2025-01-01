package com.shuai.domain;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * <p>
 * 登录信息记录表
 * </p>
 *
 * @author Shuai
 * @since 2025-01-01
 */
@Data
@Entity
@Table(name = "login_record")
public class LoginRecord implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    /**
     * 用户id
     */
    @Column(name = "user_id")
    private Long userId;

    /**
     * 手机号码
     */
    @Column(name = "cell_phone")
    private String cellPhone;

    /**
     * 登录时间
     */
    @Column(name = "login_time")
    private LocalDateTime loginTime;

    /**
     * 登出时间
     */
    @Column(name = "logout_time")
    private LocalDateTime logoutTime;

    /**
     * 登录日期
     */
    @Column(name = "login_date")
    private LocalDate loginDate;

    /**
     * 登录时长，单位是秒
     */
    @Column(name = "duration")
    private Long duration;

    /**
     * ip地址
     */
    @Column(name = "ipv4")
    private String ipv4;
}
