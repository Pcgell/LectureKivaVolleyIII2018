package com.example.lecture.kivalecture.Network;

public class Description {
    private String[] languages;

    public String[] getLanguages ()
    {
        return languages;
    }

    public void setLanguages (String[] languages)
    {
        this.languages = languages;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [languages = "+languages+"]";
    }
}
