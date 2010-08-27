/*
* JBoss, Home of Professional Open Source
* Copyright 2010, Red Hat Inc., and individual contributors as indicated
* by the @authors tag. See the copyright.txt in the distribution for a
* full listing of individual contributors.
*
* This is free software; you can redistribute it and/or modify it
* under the terms of the GNU Lesser General Public License as
* published by the Free Software Foundation; either version 2.1 of
* the License, or (at your option) any later version.
*
* This software is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
* Lesser General Public License for more details.
*
* You should have received a copy of the GNU Lesser General Public
* License along with this software; if not, write to the Free
* Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
* 02110-1301 USA, or see the FSF site: http://www.fsf.org.
*/
package org.jboss.as.web;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import javax.xml.stream.XMLStreamException;

import org.jboss.as.model.AbstractModelElement;
import org.jboss.as.model.AbstractModelUpdate;
import org.jboss.staxmapper.XMLExtendedStreamReader;
import org.jboss.staxmapper.XMLExtendedStreamWriter;

/**
 * @author Emanuel Muckenhuber
 */
public class WebVirtualServerElement extends AbstractModelElement<WebVirtualServerElement> {

    private String name;
    private final Set<String> aliases = new HashSet<String>();
    
    private WebAccessLogElement accessLog;
    private WebRewriteElement rewrite;

    protected WebVirtualServerElement(XMLExtendedStreamReader reader) throws XMLStreamException {
        super(reader);
        // TODO Handle elements
        this.name = "localhost";
        requireNoContent(reader);
    }

    public String getName() {
        return name;
    }
    
    public Set<String> getAliases() {
        return aliases;
    }
    
    public WebAccessLogElement getAccessLog() {
        return accessLog;
    }
    
    public WebRewriteElement getRewrite() {
        return rewrite;
    }
    
    /** {@inheritDoc} */
    public long elementHash() {
        return 0;
    }

    /** {@inheritDoc} */
    protected void appendDifference(Collection<AbstractModelUpdate<WebVirtualServerElement>> target, WebVirtualServerElement other) {
        // FIXME appendDifference
        
    }

    /** {@inheritDoc} */
    protected Class<WebVirtualServerElement> getElementClass() {
        return WebVirtualServerElement.class;
    }

    /** {@inheritDoc} */
    public void writeContent(XMLExtendedStreamWriter streamWriter) throws XMLStreamException {
        streamWriter.writeEndElement();
    }

}

