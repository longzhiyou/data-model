package com.lzy.demo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j;

/**
 * User: longzhiyou
 * Date: 2016/11/7
 * Time: 11:15
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@Log4j
public class Photo {

    private Integer id;
    private String name;

}
