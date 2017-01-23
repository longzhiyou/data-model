package com.lzy.common;

import org.springframework.stereotype.Component;

import java.time.ZonedDateTime;

/**
 * User: longzhiyou
 * Date: 2017/1/12
 * Time: 10:43
 */
@Component
public class DateTimeServiceImpl implements DateTimeService {
    @Override
    public ZonedDateTime getCurrentDateAndTime() {
        return ZonedDateTime.now();
    }
}
