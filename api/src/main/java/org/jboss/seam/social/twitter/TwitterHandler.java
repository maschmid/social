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
package org.jboss.seam.social.twitter;

import org.jboss.seam.social.oauth.User;
import org.jboss.seam.social.oauth.OAuthServiceHandler;
import org.jboss.seam.social.twitter.model.Tweet;


/**
 * A specialization of {@link OAuthServiceHandler} to add Twitter specific methods
 * 
 * @author Antoine Sabot-Durand
 *
 */
public interface TwitterHandler extends OAuthServiceHandler
{

   /**
    * 
    * Update the Twitter Status
    * 
    * @param message to tweet
    * @return the tweet sent in Twitter
    */
   public Tweet updateStatus(String message);
   
   
   
   /**
    * 
    * Check the credential of the user 
    * 
    * @return the crendential of the user
    */
   public User verifyCrendentials();

}
