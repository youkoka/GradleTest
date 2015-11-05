package com.mitake.build.object;

import com.mitake.build.object.BuildJsonSvn;

public class BuildJsonObject {

	private String projectVersion;

    private String desc;

    private String device;

    private String projectTarget;

    private String bundleID;

    private String projectScheme;

    private BuildJsonSvn[] svn;

    private String bundleName;

    private String projectName;

    private String projectFolder;

    public String getProjectVersion ()
    {
        return projectVersion;
    }

    public void setProjectVersion (String projectVersion)
    {
        this.projectVersion = projectVersion;
    }

    public String getDesc ()
    {
        return desc;
    }

    public void setDesc (String desc)
    {
        this.desc = desc;
    }

    public String getDevice ()
    {
        return device;
    }

    public void setDevice (String device)
    {
        this.device = device;
    }

    public String getProjectTarget ()
    {
        return projectTarget;
    }

    public void setProjectTarget (String projectTarget)
    {
        this.projectTarget = projectTarget;
    }

    public String getBundleID ()
    {
        return bundleID;
    }

    public void setBundleID (String bundleID)
    {
        this.bundleID = bundleID;
    }

    public String getProjectScheme ()
    {
        return projectScheme;
    }

    public void setProjectScheme (String projectScheme)
    {
        this.projectScheme = projectScheme;
    }

    public BuildJsonSvn[] getSvn ()
    {
        return svn;
    }

    public void setSvn (BuildJsonSvn[] svn)
    {
        this.svn = svn;
    }

    public String getBundleName ()
    {
        return bundleName;
    }

    public void setBundleName (String bundleName)
    {
        this.bundleName = bundleName;
    }

    public String getProjectName ()
    {
        return projectName;
    }

    public void setProjectName (String projectName)
    {
        this.projectName = projectName;
    }

    public String getProjectFolder ()
    {
        return projectFolder;
    }

    public void setProjectFolder (String projectFolder)
    {
        this.projectFolder = projectFolder;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [projectVersion = "+projectVersion+", desc = "+desc+", device = "+device+", projectTarget = "+projectTarget+", bundleID = "+bundleID+", projectScheme = "+projectScheme+", svn = "+svn+", bundleName = "+bundleName+", projectName = "+projectName+", projectFolder = "+projectFolder+"]";
    }
}
