package com.mitake.build.object;

public class BuildJsonSvn {

	private String dest;

    private String link;

    public String getDest ()
    {
        return dest;
    }

    public void setDest (String dest)
    {
        this.dest = dest;
    }

    public String getLink ()
    {
        return link;
    }

    public void setLink (String link)
    {
        this.link = link;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [dest = "+dest+", link = "+link+"]";
    }
}
