package com.example.rlotgatewayservice.model.vo;

import com.example.rlotgatewayservice.common.StatusEnum;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Response<T> {

    private StatusEnum status;
    private boolean success;
    private T data;

    public Response(StatusEnum status, boolean success, T data) {
        this.status = status;
        this.success = success;
        this.data = data;
    }

    public Response(StatusEnum status, boolean success) {
        this.status = status;
        this.success = success;

    }
}
