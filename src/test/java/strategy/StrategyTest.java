package strategy;

import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;

@Log4j2
class StrategyTest {

    @Test
    void test() {
        var fileCompressor = FileCompressor.getFileCompressor();
        var paths = new String[]{"/home/linux/document1.txt", "/home/linux/image.jpg", "/home/linux/data.csv"};
        log.info("--------------------------------------------");

        // Compress using Zip Strategy
        fileCompressor.setStrategy(new ZipCompressionStrategy());
        fileCompressor.compress(paths);
        log.info("--------------------------------------------");

        // Compress using SevenZip Strategy
        fileCompressor.setStrategy(new SevenZipCompressionStrategy());
        fileCompressor.compress(paths);
        log.info("--------------------------------------------");

        // Compress using Rar Strategy
        fileCompressor.setStrategy(new RarCompressionStrategy());
        fileCompressor.compress(paths);
        log.info("--------------------------------------------");

    }

}
