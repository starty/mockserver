class UrlMappings {

    static mappings = {
        "/$path1/$path2?/$path3?/$path4?/path5?"(controller: "fileserver"){
            action = [GET  : 'show']
        }

        "/"(view:"/index")
        //"500"(view:'/error')
        "500"(controller:'error', action:'treatExceptions')
    }
}
