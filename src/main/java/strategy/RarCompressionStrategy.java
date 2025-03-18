package strategy;

import lombok.extern.log4j.Log4j2;

/**
 * Concrete strategy : RarCompressionStrategy
 * */

@Log4j2
public class RarCompressionStrategy implements CompressionStrategy {

    @Override
    public void compress(String[] paths) {
        log.info("Rar compression process of {} files started ...", paths.length);
        log.info("Rar compression process of {} files ended ...", paths.length);
    }

}
