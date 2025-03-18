package strategy;

import lombok.extern.log4j.Log4j2;

/**
 * Concrete strategy : SevenZipCompressionStrategy
 * */

@Log4j2
public class SevenZipCompressionStrategy implements CompressionStrategy {

    @Override
    public void compress(String[] paths) {
        log.info("Seven zip compression process of {} files started ...", paths.length);
        log.info("Seven zip compression process of {} files ended ...", paths.length);
    }

}
