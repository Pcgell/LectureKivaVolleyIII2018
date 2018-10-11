package com.example.lecture.kivalecture.Network;

public class Loans {
    private Tags[] tags;

    private String loan_amount;

    private String sector;

    private String partner_id;

    private String lender_count;

    private String status;

    private Location location;

    private String posted_date;

    private Image image;

    private String use;

    private String[] themes;

    private String funded_amount;

    private String id;

    private String basket_amount;

    private String borrower_count;

    private String bonus_credit_eligibility;

    private Description description;

    private String name;

    private String planned_expiration_date;

    private String activity;

    public Tags[] getTags ()
    {
        return tags;
    }

    public void setTags (Tags[] tags)
    {
        this.tags = tags;
    }

    public String getLoan_amount ()
    {
        return loan_amount;
    }

    public void setLoan_amount (String loan_amount)
    {
        this.loan_amount = loan_amount;
    }

    public String getSector ()
    {
        return sector;
    }

    public void setSector (String sector)
    {
        this.sector = sector;
    }

    public String getPartner_id ()
    {
        return partner_id;
    }

    public void setPartner_id (String partner_id)
    {
        this.partner_id = partner_id;
    }

    public String getLender_count ()
    {
        return lender_count;
    }

    public void setLender_count (String lender_count)
    {
        this.lender_count = lender_count;
    }

    public String getStatus ()
    {
        return status;
    }

    public void setStatus (String status)
    {
        this.status = status;
    }

    public Location getLocation ()
    {
        return location;
    }

    public void setLocation (Location location)
    {
        this.location = location;
    }

    public String getPosted_date ()
    {
        return posted_date;
    }

    public void setPosted_date (String posted_date)
    {
        this.posted_date = posted_date;
    }

    public Image getImage ()
    {
        return image;
    }

    public void setImage (Image image)
    {
        this.image = image;
    }

    public String getUse ()
    {
        return use;
    }

    public void setUse (String use)
    {
        this.use = use;
    }

    public String[] getThemes ()
    {
        return themes;
    }

    public void setThemes (String[] themes)
    {
        this.themes = themes;
    }

    public String getFunded_amount ()
    {
        return funded_amount;
    }

    public void setFunded_amount (String funded_amount)
    {
        this.funded_amount = funded_amount;
    }

    public String getId ()
    {
        return id;
    }

    public void setId (String id)
    {
        this.id = id;
    }

    public String getBasket_amount ()
    {
        return basket_amount;
    }

    public void setBasket_amount (String basket_amount)
    {
        this.basket_amount = basket_amount;
    }

    public String getBorrower_count ()
    {
        return borrower_count;
    }

    public void setBorrower_count (String borrower_count)
    {
        this.borrower_count = borrower_count;
    }

    public String getBonus_credit_eligibility ()
    {
        return bonus_credit_eligibility;
    }

    public void setBonus_credit_eligibility (String bonus_credit_eligibility)
    {
        this.bonus_credit_eligibility = bonus_credit_eligibility;
    }

    public Description getDescription ()
    {
        return description;
    }

    public void setDescription (Description description)
    {
        this.description = description;
    }

    public String getName ()
    {
        return name;
    }

    public void setName (String name)
    {
        this.name = name;
    }

    public String getPlanned_expiration_date ()
    {
        return planned_expiration_date;
    }

    public void setPlanned_expiration_date (String planned_expiration_date)
    {
        this.planned_expiration_date = planned_expiration_date;
    }

    public String getActivity ()
    {
        return activity;
    }

    public void setActivity (String activity)
    {
        this.activity = activity;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [tags = "+tags+", loan_amount = "+loan_amount+", sector = "+sector+", partner_id = "+partner_id+", lender_count = "+lender_count+", status = "+status+", location = "+location+", posted_date = "+posted_date+", image = "+image+", use = "+use+", themes = "+themes+", funded_amount = "+funded_amount+", id = "+id+", basket_amount = "+basket_amount+", borrower_count = "+borrower_count+", bonus_credit_eligibility = "+bonus_credit_eligibility+", description = "+description+", name = "+name+", planned_expiration_date = "+planned_expiration_date+", activity = "+activity+"]";
    }
}
