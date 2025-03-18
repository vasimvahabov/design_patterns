package strategy;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.log4j.Log4j2;

/**
 * Context : FileCompressor
 */

@Log4j2
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@FieldDefaults(level = AccessLevel.PRIVATE)
public class FileCompressor {

    static FileCompressor FILE_COMPRESSOR;

    CompressionStrategy compressionStrategy;

    public void setStrategy(CompressionStrategy compressionStrategy) {
        this.compressionStrategy = compressionStrategy;
    }

    public static FileCompressor getFileCompressor() {
        if(FILE_COMPRESSOR == null) {
            synchronized (FileCompressor.class) {
                FILE_COMPRESSOR = new FileCompressor();
            }
        }
        return FILE_COMPRESSOR;
    }

    public void compress(String[] paths) {
        if (compressionStrategy == null) {
            throw new CompressionStrategyNotFoundException("CompressionStrategy is null");
        }
        compressionStrategy.compress(paths);
    }

}
