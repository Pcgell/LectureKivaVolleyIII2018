package com.example.lecture.kivalecture.Network;

public class Paging {
    private String total;

    private String page_size;

    private String page;

    private String pages;

    public String getTotal ()
    {
        return total;
    }

    public void setTotal (String total)
    {
        this.total = total;
    }

    public String getPage_size ()
    {
        return page_size;
    }

    public void setPage_size (String page_size)
    {
        this.page_size = page_size;
    }

    public String getPage ()
    {
        return page;
    }

    public void setPage (String page)
    {
        this.page = page;
    }

    public String getPages ()
    {
        return pages;
    }

    public void setPages (String pages)
    {
        this.pages = pages;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [total = "+total+", page_size = "+page_size+", page = "+page+", pages = "+pages+"]";
    }
}
