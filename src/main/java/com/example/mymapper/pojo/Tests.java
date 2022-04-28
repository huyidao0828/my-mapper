package com.example.mymapper.pojo;

import lombok.Data;

import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;


/**
 * test
 * @author 
 */
@Data
@Table(name = "tests")
public class Tests implements Serializable {
    /**
     * id
     */
    @Id
    private Integer id;

    private Integer grades;

    private String name;

    private Integer age;

    private String tel;

    private static final long serialVersionUID = 1L;
}