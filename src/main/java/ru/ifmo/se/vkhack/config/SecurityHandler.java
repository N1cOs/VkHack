package ru.ifmo.se.vkhack.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.stereotype.Component;
import ru.ifmo.se.vkhack.repository.WorkerRepository;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component
public class SecurityHandler implements AuthenticationSuccessHandler {

    @Autowired
    private WorkerRepository workerRepository;

    @Override
    public void onAuthenticationSuccess(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Authentication authentication) throws IOException {
        String email = httpServletRequest.getParameter("username");
        httpServletRequest.getSession().setAttribute("idWorker", workerRepository.findByEmail(email).getIdWorker());
        httpServletResponse.sendRedirect("/news");
    }
}
