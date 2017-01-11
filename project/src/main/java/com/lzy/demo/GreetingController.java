package com.lzy.demo;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

/**
 * User: longzhiyou
 * Date: 2016/11/4
 * Time: 13:33
 */
@RestController
@RequestMapping("/api")
public class GreetingController {
    private static final String template = "Hello,lzy %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return new Greeting(counter.incrementAndGet(),
                String.format(template, name));
    }
    @RequestMapping("/accounts/{accountId}")
    public Greeting getAccount(@PathVariable String accountId) {
        return new Greeting(counter.incrementAndGet(),
                String.format(template, accountId));
    }

}
