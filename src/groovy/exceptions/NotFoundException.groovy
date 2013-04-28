package exceptions

class NotFoundException extends StartyException{
    int httpStatusCode = HttpServletResponse.SC_NOT_FOUND

    NotFoundException(String message = "", code = "not_found", cause = []) {
        super(message, code, cause)
    }
}
