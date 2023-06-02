package com.common;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ServiceForward {
    private String path;
    private boolean redirect;
}