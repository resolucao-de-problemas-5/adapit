package com.adapit.portal.services.dao.hibernate;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.dao.support.DataAccessUtils;
import org.springframework.orm.hibernate3.HibernateTemplate;
import com.adapit.portal.entidades.Imagem;
import com.adapit.portal.entidades.Publication;
import com.adapit.portal.services.PublicationService;
import com.adapit.portal.services.StringQueryKind;
import com.adapit.portal.services.local.LocalServicesUtility;
import com.workcase.hibernate.GenericDAO;
import com.workcase.hibernate.GenericDAOHibernate;
public class PublicationServiceDAOHibernate$__attributeRepository implements org.apache.commons.attributes.AttributeRepositoryClass {
    private final java.util.Set classAttributes = new java.util.HashSet ();
    private final java.util.Map fieldAttributes = new java.util.HashMap ();
    private final java.util.Map methodAttributes = new java.util.HashMap ();
    private final java.util.Map constructorAttributes = new java.util.HashMap ();

    public PublicationServiceDAOHibernate$__attributeRepository () {
        initClassAttributes ();
        initMethodAttributes ();
        initFieldAttributes ();
        initConstructorAttributes ();
    }

    public java.util.Set getClassAttributes () { return classAttributes; }
    public java.util.Map getFieldAttributes () { return fieldAttributes; }
    public java.util.Map getConstructorAttributes () { return constructorAttributes; }
    public java.util.Map getMethodAttributes () { return methodAttributes; }

    private void initClassAttributes () {
        {
            org.springframework.transaction.interceptor.DefaultTransactionAttribute _attr = new org.springframework.transaction.interceptor.DefaultTransactionAttribute(  // C:/Users/Rafael/Documents/workspace/rp5/adapit/br.com.adapit.portal/src/com/adapit/portal/services/dao/hibernate/PublicationServiceDAOHibernate.java:28
);
            _attr.setPropagationBehaviorName(
"PROPAGATION_REQUIRED"  // C:/Users/Rafael/Documents/workspace/rp5/adapit/br.com.adapit.portal/src/com/adapit/portal/services/dao/hibernate/PublicationServiceDAOHibernate.java:28
);
        Object _oattr = _attr; // Need to erase type information
        if (_oattr instanceof org.apache.commons.attributes.Sealable) {
            ((org.apache.commons.attributes.Sealable) _oattr).seal ();
        }
        classAttributes.add ( _attr );
        }
    }

    private void initFieldAttributes () {
        java.util.Set attrs = null;
    }
    private void initMethodAttributes () {
        java.util.Set attrs = null;
        java.util.List bundle = null;
    }
    private void initConstructorAttributes () {
        java.util.Set attrs = null;
        java.util.List bundle = null;
    }
}
