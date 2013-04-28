package exceptions

import javax.servlet.http.HttpServletResponse
import org.springframework.validation.Errors
import grails.converters.JSON


class BadRequestException extends StartyException {
    int httpStatusCode = HttpServletResponse.SC_BAD_REQUEST

    BadRequestException(String message = "", code = "bad_request", cause = []) {
        super(message, code, cause)
    }


}