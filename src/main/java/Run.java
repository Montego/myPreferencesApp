import lombok.extern.slf4j.Slf4j;
import runscripts.RunContext;

@Slf4j
public class Run {
    public static void main(String[] args) {
        log.info("Start app");
        log.info("Start building context");

        RunContext runContext = new RunContext();

        log.info("Finish building context");


    }
}
