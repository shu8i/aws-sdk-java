/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/InviteMembers" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InviteMembersRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A list of IDs of the AWS accounts that you want to invite to Security Hub as members.
     * </p>
     */
    private java.util.List<String> accountIds;

    /**
     * <p>
     * A list of IDs of the AWS accounts that you want to invite to Security Hub as members.
     * </p>
     * 
     * @return A list of IDs of the AWS accounts that you want to invite to Security Hub as members.
     */

    public java.util.List<String> getAccountIds() {
        return accountIds;
    }

    /**
     * <p>
     * A list of IDs of the AWS accounts that you want to invite to Security Hub as members.
     * </p>
     * 
     * @param accountIds
     *        A list of IDs of the AWS accounts that you want to invite to Security Hub as members.
     */

    public void setAccountIds(java.util.Collection<String> accountIds) {
        if (accountIds == null) {
            this.accountIds = null;
            return;
        }

        this.accountIds = new java.util.ArrayList<String>(accountIds);
    }

    /**
     * <p>
     * A list of IDs of the AWS accounts that you want to invite to Security Hub as members.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAccountIds(java.util.Collection)} or {@link #withAccountIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param accountIds
     *        A list of IDs of the AWS accounts that you want to invite to Security Hub as members.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InviteMembersRequest withAccountIds(String... accountIds) {
        if (this.accountIds == null) {
            setAccountIds(new java.util.ArrayList<String>(accountIds.length));
        }
        for (String ele : accountIds) {
            this.accountIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of IDs of the AWS accounts that you want to invite to Security Hub as members.
     * </p>
     * 
     * @param accountIds
     *        A list of IDs of the AWS accounts that you want to invite to Security Hub as members.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InviteMembersRequest withAccountIds(java.util.Collection<String> accountIds) {
        setAccountIds(accountIds);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getAccountIds() != null)
            sb.append("AccountIds: ").append(getAccountIds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InviteMembersRequest == false)
            return false;
        InviteMembersRequest other = (InviteMembersRequest) obj;
        if (other.getAccountIds() == null ^ this.getAccountIds() == null)
            return false;
        if (other.getAccountIds() != null && other.getAccountIds().equals(this.getAccountIds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccountIds() == null) ? 0 : getAccountIds().hashCode());
        return hashCode;
    }

    @Override
    public InviteMembersRequest clone() {
        return (InviteMembersRequest) super.clone();
    }

}
