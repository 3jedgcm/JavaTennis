package Exception;

public class InvalidIndexException extends Exception{
    public InvalidIndexException()
    {
        System.err.println("InvalidIndexException: Index est invalide");
    }
}

