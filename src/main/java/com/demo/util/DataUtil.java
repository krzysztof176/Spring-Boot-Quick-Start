package com.demo.util;

import com.demo.model.ApiResponse;
import com.demo.model.StatusEnum;

public class DataUtil {
    public static ApiResponse apiResponseWrapper(StatusEnum statusEnum, String error, Object data) {
        return new ApiResponse(data,error,statusEnum);
    }
}
