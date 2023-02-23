package com.example.rlotgatewayservice.exception.obj;

import java.util.Date;

public class ResponseEnvelop<T> {
    private boolean success;
    private T result;
    private Error error;


    public ResponseEnvelop(boolean success, Error error) {
        this.success = success;
        this.error = error;
    }

    public boolean getSuccess() {
        return this.success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public Date getTimestamp() {
        return new Date();
    }

    public T getResult() {
        return this.result;
    }

    public void setResult(T result) {
        this.result = result;
    }

    public Error getError() {
        return this.error;
    }

    public void setError(Error error) {
        this.error = error;
    }

}
