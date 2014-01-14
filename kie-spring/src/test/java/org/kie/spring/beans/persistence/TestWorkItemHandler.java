/*
 * Copyright 2010 JBoss Inc
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.kie.spring.beans.persistence;

import org.kie.api.runtime.process.WorkItem;
import org.kie.api.runtime.process.WorkItemHandler;
import org.kie.api.runtime.process.WorkItemManager;


public class TestWorkItemHandler
        implements
        WorkItemHandler {

    private static TestWorkItemHandler INSTANCE = new TestWorkItemHandler();

    private WorkItem workItem;

    private TestWorkItemHandler() {
    }

    public static TestWorkItemHandler getInstance() {
        return INSTANCE;
    }

    public void executeWorkItem(WorkItem workItem,
                                WorkItemManager manager) {
        this.workItem = workItem;
    }

    public void abortWorkItem(WorkItem workItem,
                              WorkItemManager manager) {
    }

    public WorkItem getWorkItem() {
        WorkItem result = workItem;
        workItem = null;
        return result;
    }

}