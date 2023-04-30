package ApiRest;

public class EmployeeException extends RuntimeException {
    
    public EmployeeException(Long id) {
        super("Could not find the id: "+id);
    }

}
