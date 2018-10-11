package com.example.lecture.kivalecture.Network;

public class KivaLoans {
    private Loans[] loans;

    private Paging paging;

    public Loans[] getLoans ()
    {
        return loans;
    }

    public void setLoans (Loans[] loans)
    {
        this.loans = loans;
    }

    public Paging getPaging ()
    {
        return paging;
    }

    public void setPaging (Paging paging)
    {
        this.paging = paging;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [loans = "+loans+", paging = "+paging+"]";
    }
}
