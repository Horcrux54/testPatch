package io.nwtn.test;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestRepos {

    public String testWeb() {
        return "test";
    }
}
