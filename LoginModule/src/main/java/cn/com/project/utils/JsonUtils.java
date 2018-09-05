package cn.com.project.utils;

import net.sf.json.JsonConfig;


public class JsonUtils {

    public static JsonConfig JsonExclude(String... properties) {
        JsonConfig jsonConfig = new JsonConfig();
        jsonConfig.setExcludes(properties);
        return jsonConfig;
    }

}


