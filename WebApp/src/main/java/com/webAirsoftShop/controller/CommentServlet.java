package com.webAirsoftShop.controller;

import com.webAirsoftShop.managers.CommentManager;
import org.json.simple.JSONObject;
import org.json.simple.JSONStreamAware;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * Created by Shleck on 7/13/2017.
 */
public class CommentServlet extends APIHandlerServlet.APIRequestHandler {

    public static final CommentServlet instance = new CommentServlet();

    public static CommentServlet getInstance() {
        return instance;
    }

    private CommentServlet() {
    }

    @Override
    protected JSONStreamAware processRequest(HttpServletRequest request) throws Exception {
        Map<String, String[]> map = request.getParameterMap();
        String type = map.get("type")[0];
        // Map<String, String> dataFromDb = new HashMap<>();
        JSONObject jsonObject = new JSONObject();
        switch (type) {
            case "add_Comment": jsonObject = addComment(map); break;
            case "": break;
        }
        return  jsonObject;
    }

    private JSONObject addComment(Map<String, String[]> map){
        JSONObject jsonObject = new JSONObject();

        String[] dbFunctionResponce = new String [2];
        try {
            CommentManager.getCommentManager().addComment(map);
        } catch (Exception e) {
            jsonObject.put("State", "Error! Can't add comment!");
            return jsonObject;
        }
        jsonObject.put("State", "The comment was added!");
        return jsonObject;
    }
}
