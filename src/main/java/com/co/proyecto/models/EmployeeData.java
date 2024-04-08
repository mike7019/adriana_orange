package com.co.proyecto.models;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.datatable.DataTable;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class EmployeeData {

     protected String name;
     protected String middleName;
     protected String lastname;
     protected String id;
     protected String username;
     protected String pass;
     protected String confPass;

    public static List<EmployeeData> setData(DataTable table) {
        List<EmployeeData> data = new ArrayList<>();
        List<Map<String, String>> mapList = table.asMaps();
        for (Map<String, String> i : mapList) {
            data.add(new ObjectMapper().convertValue(i, EmployeeData.class));
        }
        return data;
    }

    public String getName() {
        return name;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastname() {
        return lastname;
    }

    public String getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getPass() {
        return pass;
    }

    public String getConfPass() {
        return confPass;
    }
}
