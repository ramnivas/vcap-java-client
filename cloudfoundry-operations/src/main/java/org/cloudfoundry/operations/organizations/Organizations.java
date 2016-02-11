/*
 * Copyright 2013-2016 the original author or authors.
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

package org.cloudfoundry.operations.organizations;

import org.reactivestreams.Publisher;
import reactor.core.publisher.Mono;

/**
 * Main entry point to the Cloud Foundry Organizations Operations API
 */
public interface Organizations {

    /**
     * Get an Organizations Information
     *
     * @param request the organization info request
     * @return the organizations info
     */
    Mono<OrganizationDetail> get(OrganizationInfoRequest request);

    /**
     * Lists the organizations
     *
     * @return the organizations
     */
    Publisher<OrganizationSummary> list();

    /**
     * Rename a specific organization
     *
     * @param request the rename organization request
     * @return completion indicator
     */
    Mono<Void> rename(RenameOrganizationRequest request);

}
