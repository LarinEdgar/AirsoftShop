package com.webAirsoftShop.controller;

import com.entity.DbuserEntity;
import com.factory.Factory;
import org.json.simple.JSONStreamAware;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Shleck on 7/13/2017.
 */
public class RegistrationServlet extends APIHandlerServlet.APIRequestHandler {

    public static final RegistrationServlet instance = new RegistrationServlet();

    public static RegistrationServlet getInstance() {
        return instance;
    }

    private RegistrationServlet() {
    }

    @Override
    protected JSONStreamAware processRequest(HttpServletRequest request) throws Exception {
        String login = request.getParameter("login");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        DbuserEntity user = new DbuserEntity();
        user.setEmail(email);
        user.setUserName(login);
        user.setPassword(password);
        Factory.getInstance().getUserDAO().addUser(user);

        System.out.println("login: " + login + "; email: " + email + "; password: " + password);
        return null;
    }

}
