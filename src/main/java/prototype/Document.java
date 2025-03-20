package prototype;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.log4j.Log4j2;
import java.util.ArrayList;
import java.util.List;

/**
 * Concrete prototype of DocumentPrototype
 * */

@Log4j2
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class Document implements DocumentPrototype {

    String title;
    String author;
    List<String> sections;

    /** implementation of copy factory method to shallow clone DocumentPrototype */
    @Override
    public DocumentPrototype shallowClone() {
        return new Document(title, author, sections);
    }

    /** implementation of copy factory method to deep clone DocumentPrototype */
    @Override
    public DocumentPrototype deepClone() {
        List<String> clonedSections = new ArrayList<>(this.sections); // Creates new list
        return new Document(title, author, clonedSections);
    }

    public void addSection(String section) {
        this.sections.add(section);
    }


    @Override
    public void printDetails() {
        log.info("Title : {}", title);
        log.info("Author : {}", author);
        var joinedSections = String.join(", ", this.sections);
        log.info("Sections : {}", joinedSections);
    }

}
