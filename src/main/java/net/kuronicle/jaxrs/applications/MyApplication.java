package net.kuronicle.jaxrs.applications;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import net.kuronicle.jaxrs.resources.HelloWorldResource;

public class MyApplication extends Application{
    
    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> s = new HashSet<Class<?>>();
        // —˜—p‚·‚éresource‚ð“o˜^‚·‚é
        s.add(HelloWorldResource.class);
        return s;
    }
}
