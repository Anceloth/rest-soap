#SpringBoot 2.3.1 RELEASE#

This porject is a :
REST Service (transform responses from a SOAP Client and expose a complex mathematics operations)
and at the same time is a :
SOAP client(who consumes a own SOAP Service in my repo called 'soap-service' who do basics mathematics operations)
----------------------------------
to consumes need to send Json Structure

POST
service: http://localhost:8080/rest/areaTriangulo
send : {"base":"8", "altura":"4"}

----------------------------------

