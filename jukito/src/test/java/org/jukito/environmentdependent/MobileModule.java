/**
 * Copyright 2013 ArcBees Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

package org.jukito.environmentdependent;

import org.jukito.EnvironmentDependentComponent;

import com.google.inject.AbstractModule;

/**
 * Sample Environment Dependent Module.
 */
public class MobileModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(EnvironmentDependentComponent.class).toInstance(new EnvironmentDependentComponent() {
            @Override
            public void hello() {
                System.err.println("MobileModule");
            }
        });
    }
}
