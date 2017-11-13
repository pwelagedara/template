package com.pubudu.template.config;

import com.pubudu.template.model.dto.ErrorDto;
import com.pubudu.template.util.FilterUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.web.access.AccessDeniedHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class CustomAccessDeniedHandler implements AccessDeniedHandler {

    private static final Log LOG = LogFactory.getLog(CustomAccessDeniedHandler.class);

    @Override
    public void handle(HttpServletRequest request, HttpServletResponse response, AccessDeniedException accessDeniedException) throws IOException, ServletException {

        LOG.info("Responding with a 403");

        // Respond with status 403
        HttpStatus httpStatus = HttpStatus.FORBIDDEN;

        response.setStatus(httpStatus.value());
        response.setContentType(MediaType.APPLICATION_JSON_UTF8_VALUE);
        ErrorDto error = new ErrorDto(httpStatus.value(), httpStatus.name(), accessDeniedException.getMessage());
        response.getWriter().write(FilterUtils.convertObjectToJson(error));
    }
}
