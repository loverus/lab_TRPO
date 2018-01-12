/*
  JSON ERROR
*/

class Error {

    private int errorCode;
    private String errorMessage;
    private String errorPlace;
    private String resource;
    private int req_id;

    Error(int errorCode, String errorMessage, String errorPlace, String resource, int req_id) {
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
        this.errorPlace = errorPlace;
        this.resource = resource;
        this.req_id = req_id;
    }
}
