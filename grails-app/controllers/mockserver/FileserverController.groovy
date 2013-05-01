package mockserver

import exceptions.NotFoundException

import javax.servlet.http.HttpServletResponse;

import grails.converters.JSON
import utils.parser.JsonParser;


class FileserverController {

    static defaultAction = "show"
    def fileserverService

    def show = {
        response.setHeader ("Content-type", "application/json")

        String path = getPath()
        String queryString = request.getQueryString()

         try {
                def json = fileserverService.getJsonFromFile(path, queryString)
               // if (!json){
                 //   throw new NotFoundException ("Resource not found: $path - $queryString")
               // }

                response.status = 200
                render json as JSON
                return
         } catch (NotFoundException e)     {
        response.status = 404
        return                              }


    }

    private def getPath() {
        String path = "/${params.path1}"

        if (params.path2){
            path += "/${params.path2}"
        }
        if (params.path3){
            path += "/${params.path3}"
        }
        if (params.path4){
            path += "/${params.path4}"
        }
        if (params.path5){
            path += "/${params.path5}"
        }

        return path
    }
}
