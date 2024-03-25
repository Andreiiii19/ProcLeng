package lib.errores;

public class ErrorSemantico extends Error{
    public ErrorSemantico() {
        super();
    }

    public ErrorSemantico(String message) {
        super(message);
    }
}
