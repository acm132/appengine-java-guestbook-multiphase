/**
 * Copyright 2014-2015 Google Inc. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.guestbook;

import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;

/**
 * The @Entity tells Objectify about our entity.  We also register it in
 * OfyService.java -- very important. Our primary key @Id is set automatically
 * by Objectify for us.  We also don't want Date's indexed, so we use the
 * @Unindex annotation.
 *
 * We add a @Parent to tell the object about its @ancestor.  We are doing this
 * so that you can learn about Ancestor keys, which make it faster to access
 * these entities as they are located in Datastore near the Ancestor, as opposed
 * to the prior version where the entities could, in a large system, be anywhere.
 *
 * NOTE - all the properties are PUBLIC so that can keep this simple, otherwise,
 * Jackson, wants us to write a BeanSerializaer for cloud endpoints.
 */
@Entity
public class Guestbook {
  @Id public String book;
}
