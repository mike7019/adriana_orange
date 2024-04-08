package com.co.proyecto.models;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.datatable.DataTable;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class LoginData {

    protected String user;
    protected String pass;

    public static List<LoginData> setData(DataTable table) {
        List<LoginData> data = new ArrayList<>();
        List<Map<String, String>> mapList = table.asMaps();
        for (Map<String, String> i : mapList) {
            data.add(new ObjectMapper().convertValue(i, LoginData.class));
        }
        return data;
    }

    public String getUser() {
        return user;
    }

    public String getPass() {
        return pass;
    }
}
