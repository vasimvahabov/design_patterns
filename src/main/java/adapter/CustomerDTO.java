package adapter;

/**
 * DTO for new system's expected customer format
 * */

public record CustomerDTO(Long id, String firstname, String lastname, String address) {

}
