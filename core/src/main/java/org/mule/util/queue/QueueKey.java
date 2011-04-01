/*
 * $Id$
 * --------------------------------------------------------------------------------------
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */

package org.mule.util.queue;

import java.io.Serializable;

public class QueueKey implements Serializable
{
    // hashCode() and equals() are autogenerated by Eclipse. If you add iVars to this class make
    // sure to re-generate
    public final String queueName;
    public final Serializable id;

    public QueueKey(String queueName, Serializable id)
    {
        super();
        this.queueName = queueName;
        this.id = id;
    }

    @Override
    public int hashCode()
    {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((queueName == null) ? 0 : queueName.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj)
    {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        QueueKey other = (QueueKey)obj;
        if (id == null)
        {
            if (other.id != null) return false;
        }
        else if (!id.equals(other.id)) return false;
        if (queueName == null)
        {
            if (other.queueName != null) return false;
        }
        else if (!queueName.equals(other.queueName)) return false;
        return true;
    }
}