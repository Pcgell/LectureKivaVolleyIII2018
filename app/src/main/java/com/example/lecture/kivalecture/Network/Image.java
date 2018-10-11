package com.example.lecture.kivalecture.Network;

public class Image {
    private String id;

    private String template_id;

    public String getId ()
    {
        return id;
    }

    public void setId (String id)
    {
        this.id = id;
    }

    public String getTemplate_id ()
    {
        return template_id;
    }

    public void setTemplate_id (String template_id)
    {
        this.template_id = template_id;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [id = "+id+", template_id = "+template_id+"]";
    }
}
