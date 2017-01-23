package com.lzy;

import org.springframework.data.domain.AuditorAware;

/**
 * User: longzhiyou
 * Date: 2017/1/12
 * Time: 11:05
 */
public class AuditorAwareImpl implements AuditorAware<String> {


    @Override
    public String getCurrentAuditor() {

//        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
//        if (authentication == null || !authentication.isAuthenticated()) {
//            return null;
//        }
//        return ((User) authentication.getPrincipal()).getUsername();
        //获取登陆用户的用户名
        return "lzy";
    }
}
