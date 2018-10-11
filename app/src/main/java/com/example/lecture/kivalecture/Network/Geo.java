package com.example.lecture.kivalecture.Network;

public class Geo {
    private String level;

    private String pairs;

    private String type;

    public String getLevel ()
    {
        return level;
    }

    public void setLevel (String level)
    {
        this.level = level;
    }

    public String getPairs ()
    {
        return pairs;
    }

    public void setPairs (String pairs)
    {
        this.pairs = pairs;
    }

    public String getType ()
    {
        return type;
    }

    public void setType (String type)
    {
        this.type = type;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [level = "+level+", pairs = "+pairs+", type = "+type+"]";
    }
}
