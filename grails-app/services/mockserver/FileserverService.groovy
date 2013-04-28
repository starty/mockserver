package mockserver

//import com.ml.exceptions.NotFoundException;

import grails.converters.JSON
import utils.parser.JsonParser;

class FileserverService {

    static transactional = false

    def getJsonFromFile (path,queryString) {
        println "abriendo archivo: $path"

        //def queryString = request.getQueryString()
        File baseDir = new File("mocks")

        File threadFile
        String jsonText
     //   try {
            threadFile = new File(baseDir,"${path}.JSON")
            jsonText = threadFile.getText()
        /*} catch (Exception e){
            if (queryString){
                try {
                    println "queryString= $queryString"
                    threadFile = new File(baseDir,"${path}?${queryString}.JSON")
                    jsonText = threadFile.getText()
                } catch (Exception e2){
                    return null
                    //	throw new NotFoundException ("Resource not found: $path - $queryString")
                }
            } else {
                return null
                //throw new NotFoundException("Resource not found: $path")
            }
        }  */
        def json = JsonParser.parse(jsonText)

        return json
    }

}