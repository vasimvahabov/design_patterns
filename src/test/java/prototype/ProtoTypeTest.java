package prototype;

import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

@Log4j2
class ProtoTypeTest {

    @Test
    void test () {
        List<String> sections = new ArrayList<>();
        sections.add("Introduction");
        sections.add("Body");

        Document originalDocument = new Document("Company Policy", "HR Department", sections);

        log.info("-------------------------------------------");
        log.info("Original Document...");
        originalDocument.printDetails();
        log.info("-------------------------------------------\n\n\n");

        // Shallow Copy
        Document shallowCopy = (Document) originalDocument.shallowClone();
        // Affects both original and cloned document
        shallowCopy.addSection("Conclusion");

        log.info("-------------------------------------------");
        log.info("After adding conclusion to Shallow Copy...");
        log.info("Original Document...");
        originalDocument.printDetails();

        // 'Conclusion' is added to both
        log.info("Shallow Copy...");
        shallowCopy.printDetails();
        log.info("-------------------------------------------\n\n\n");


        // Deep Copy
        Document deepCopy = (Document) originalDocument.deepClone();

        // Should not affect the original document
        deepCopy.addSection("References");

        log.info("-------------------------------------------");
        log.info("After adding references to Deep Copy...");
        log.info("Original Document...");
        originalDocument.printDetails();
        log.info("Deep Copy...");

        // Independent copy
        deepCopy.printDetails();
        log.info("-------------------------------------------\n\n\n");

    }

}
