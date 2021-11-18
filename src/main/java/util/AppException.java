package util;

public class AppException extends Exception {

    private String message;

    public AppException(){
        super();
    }

    public AppException(String message) {
        this.message = message;
    }

    public AppException(Throwable cause) {
        super(cause);
    }

    public AppException(String message, Throwable cause){
        super(message, cause);
    }

    @Override
    public String toString() {
        return "AppException{" +
                "message='" + message + '\'' +
                '}';
    }
}
