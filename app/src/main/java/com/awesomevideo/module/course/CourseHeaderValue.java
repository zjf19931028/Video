package com.awesomevideo.module.course;

import com.awesomevideo.module.BaseModel;
import com.youdu.module.AdValue;

import java.util.ArrayList;

/**
 * @author: vision
 * @function:
 * @date: 16/9/2
 */
public class CourseHeaderValue extends BaseModel {

    public ArrayList<String> photoUrls;
    public String text;
    public String name;
    public String logo;
    public String oldPrice;
    public String newPrice;
    public String zan;
    public String scan;
    public String hotComment;
    public String from;
    public String dayTime;
    public AdValue video;
}
