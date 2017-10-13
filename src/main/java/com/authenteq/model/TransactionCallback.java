/*
 * (C) Copyright 2017 Authenteq (https://authenteq.com/) and others.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * Contributors:
 *     Bohdan Bezpartochnyi <bohdan@authenteq.com>
 */

package com.authenteq.model;

// TODO: Auto-generated Javadoc
/**
 * The Interface TransactionCallback.
 */
public interface TransactionCallback {
    /**
     * The pushed transaction was accepted in the BACKLOG, but the processing has not been completed.
     */
    void pushedSuccessfully();

    /**
     * The transaction was malformed and not accepted in the BACKLOG. This shouldn't normally happen as the
     * driver ensures the proper transaction creation.
     */
    void transactionMalformed();

    /**
     * All other errors, including server malfunction or network error.
     */
    void otherError();
}