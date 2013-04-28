package exceptions


class StartyException extends RuntimeException {

    def status = 500
    def error
    Throwable cause  = []
    //def causeMap = [:]

    def StartyException(message, error, cause) {
        super(message.toString())
        this.error = error
        this.cause = cause
    }

    def StartyException(message){
        super(message)
    }

    /*def StartyException(String message,  Map cause){
        super(message)
        this.causeMap = cause
    }     */

    def StartyException() {
        super("internal_error")
    }

}