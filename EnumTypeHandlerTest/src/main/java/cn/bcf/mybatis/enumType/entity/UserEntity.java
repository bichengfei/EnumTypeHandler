package cn.bcf.mybatis.enumType.entity;

import cn.bcf.mybatis.enumType.enums.NationEnum;
import cn.bcf.mybatis.enumType.enums.SexEnum;
import lombok.Data;

@Data
public class UserEntity {

    private Integer id;
    private String username;
    private SexEnum sex;
    private NationEnum nation;

}
