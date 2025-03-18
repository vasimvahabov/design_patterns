package strategy;

import lombok.extern.log4j.Log4j2;

/**
 * Concrete strategy : ZipCompressionStrategy
 * */

@Log4j2
public class ZipCompressionStrategy implements CompressionStrategy {

    @Override
    public void compress(String[] paths) {
       log.info("Zip compression process of {} files started ...", paths.length);
       log.info("Zip compression process of {} files ended ...", paths.length);
    }

}
