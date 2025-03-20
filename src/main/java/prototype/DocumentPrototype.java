package prototype;

import lombok.SneakyThrows;

/**
 * Prototype : DocumentPrototype
 * */

public interface DocumentPrototype extends Cloneable {

    /** copy factory method to shallow clone DocumentPrototype */
    DocumentPrototype shallowClone();

    /** copy factory method to deep clone DocumentPrototype */
    DocumentPrototype deepClone();

    void printDetails();

}
