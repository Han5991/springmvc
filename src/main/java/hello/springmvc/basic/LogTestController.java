package hello.springmvc.basic;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class LogTestController {
    //private final Logger log = LoggerFactory.getLogger(getClass());

    @GetMapping("/log-test")
    public String logTest() {
        String name = "String";

        log.trace("info trace = {}", name);
        log.debug("info debug = {}", name);
        log.info("info log = {}", name);
        log.warn("info warn = {}", name);
        log.error("info error = {}", name);

        return name;
    }
}

