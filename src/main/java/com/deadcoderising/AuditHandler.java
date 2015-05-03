package com.deadcoderising;

import javax.servlet.ServletRequest;

public class AuditHandler {

    public void auditRequest(String appName, ServletRequest request) {
        System.out.println(appName + ": Received request from " + request.getRemoteAddr() );
    }
}
