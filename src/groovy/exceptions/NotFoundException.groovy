package exceptions

import javax.servlet.http.HttpServletResponse

class NotFoundException extends StartyException{

    def status = HttpServletResponse.SC_NOT_FOUND

    NotFoundException(String message = "", code = "not_found", cause = []) {
        super(message, code, cause)
    }
}
