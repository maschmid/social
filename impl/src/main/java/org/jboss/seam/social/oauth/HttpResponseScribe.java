/*
 * JBoss, Home of Professional Open Source
 * Copyright 2011, Red Hat Middleware LLC, and individual contributors
 * by the @authors tag. See the copyright.txt in the distribution for a
 * full listing of individual contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jboss.seam.social.oauth;

import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

import org.scribe.model.Response;



/**
 * @author Antoine Sabot-Durand
 *
 */
public class HttpResponseScribe implements HttpResponse
{

   private Response delegate;

   protected HttpResponseScribe(Response response) throws IOException
   {
     delegate=response;
   }

   /* (non-Javadoc)
    * @see org.jboss.seam.social.oauth.HttpResponse#getBody()
    */
   @Override
   public String getBody()
   {
      return delegate.getBody();
   }

   /* (non-Javadoc)
    * @see org.jboss.seam.social.oauth.HttpResponse#getStream()
    */
   @Override
   public InputStream getStream()
   {
      return delegate.getStream();
   }

   public int hashCode()
   {
      return delegate.hashCode();
   }

   /* (non-Javadoc)
    * @see org.jboss.seam.social.oauth.HttpResponse#getCode()
    */
   @Override
   public int getCode()
   {
      return delegate.getCode();
   }

   /* (non-Javadoc)
    * @see org.jboss.seam.social.oauth.HttpResponse#getHeaders()
    */
   @Override
   public Map<String, String> getHeaders()
   {
      return delegate.getHeaders();
   }

   /* (non-Javadoc)
    * @see org.jboss.seam.social.oauth.HttpResponse#getHeader(java.lang.String)
    */
   @Override
   public String getHeader(String name)
   {
      return delegate.getHeader(name);
   }

   public boolean equals(Object obj)
   {
      return delegate.equals(obj);
   }

   public String toString()
   {
      return delegate.toString();
   }

  
  
   

  
   
}
