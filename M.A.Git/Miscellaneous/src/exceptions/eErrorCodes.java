package exceptions;

import languages.LangEN;

public enum eErrorCodes {
    REPOSITORY_FOLDER_SCAN_FAILED(LangEN.SCAN_FOLDER_FAILED),
    CREATE_MAGIT_FOLDER_FAILED(LangEN.CREATE_MAGIT_FOLDER_FAILED),
    CREATE_ZIP_FILE_FAILED(LangEN.CREATE_ZIP_FILE_FAILED),
    OPEN_FILE_FAILED(LangEN.OPEN_FILE_FAILED),
    INSERT_FILE_TO_ZIP_FAILED(LangEN.INSERT_FILE_TO_ZIP_FAILED),
    WRITE_TO_FILE_FAILED(LangEN.WRITE_TO_FILE_FAILED),
    CREATE_TEMP_FOLDER_FILE_FAILED(LangEN.CREATE_TEMP_FILE_FAILED),
    OPEN_BRANCH_FILE_FAILED(LangEN.OPEN_BRANCH_FILE_FAILED),
    READ_FROM_FILE_FAILED(LangEN.READ_FROM_FILE_FAILED),
    FILE_NOT_EXIST(LangEN.FILE_NOT_EXIST),
    WRONG_DATE_FORM(LangEN.WRONG_DATE_FORM),
    ERROR_LOAD_REPOSITORY(LangEN.ERROR_LOAD_REPOSITORY),
    UNKNOWN_ERROR(LangEN.UNKNOWN_ERROR),
    CLOSE_FILE_FAILED(LangEN.CLOSE_FILE_FAILED),
    DO_CHECKOUT(LangEN.DO_CHECKOUT),
    NO_COMMIT_WITH_SHA_ONE_EXISTS(LangEN.NO_COMMIT_WITH_SHA_ONE_EXISTS),
    MAGIT_FOLDER_CORRUPTED(LangEN.MAGIT_FOLDER_CORRUPTED),
    BRANCH_ALREADY_EXIST(LangEN.BRANCH_ALREADY_EXIST),
    CANNOT_RECOVER_BRANCH(LangEN.CANNOT_RECOVER_BRANCH),
    MAGIT_FOLDER_ALREADY_EXIST(LangEN.MAGIT_FOLDER_ALREADY_EXIST),
    BRANCH_NOT_EXIST(LangEN.BRANCH_NOT_EXIST),
    THERE_IS_OPENED_ISSUES(LangEN.THERE_IS_OPENED_ISSUES),
    DELETE_FILE_FAILED(LangEN.DELETE_FILE_FAILED),
    NOTHING_NEW(LangEN.NOTHING_NEW),
    XML_PARSE_FAILED(LangEN.XML_PARSE_FAILED),
    PARSE_BLOB_TO_FOLDER_FAILED(LangEN.PARSE_BLOB_TO_FOLDER_FAILED);

    private String message;

    eErrorCodes(String message) {
        this.message = message;
    }

    public String getMessage() { return message; }
}
