package com.workcase.hibernate;
import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
public class GenericDAOHibernate$__attributeRepository implements org.apache.commons.attributes.AttributeRepositoryClass {
    private final java.util.Set classAttributes = new java.util.HashSet ();
    private final java.util.Map fieldAttributes = new java.util.HashMap ();
    private final java.util.Map methodAttributes = new java.util.HashMap ();
    private final java.util.Map constructorAttributes = new java.util.HashMap ();

    public GenericDAOHibernate$__attributeRepository () {
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
    }

    private void initFieldAttributes () {
        java.util.Set attrs = null;
    }
    private void initMethodAttributes () {
        java.util.Set attrs = null;
        java.util.List bundle = null;
        bundle = new java.util.ArrayList ();
        attrs = new java.util.HashSet ();
        {
            org.springframework.transaction.interceptor.DefaultTransactionAttribute _attr = new org.springframework.transaction.interceptor.DefaultTransactionAttribute(  // C:/Users/NightWish/Documents/adapit/br.com.adapit.portal/src/com/workcase/hibernate/GenericDAOHibernate.java:29
);
            _attr.setPropagationBehaviorName(
"PROPAGATION_REQUIRES_NEW"  // C:/Users/NightWish/Documents/adapit/br.com.adapit.portal/src/com/workcase/hibernate/GenericDAOHibernate.java:29
);
        Object _oattr = _attr; // Need to erase type information
        if (_oattr instanceof org.apache.commons.attributes.Sealable) {
            ((org.apache.commons.attributes.Sealable) _oattr).seal ();
        }
        attrs.add ( _attr );
        }
        bundle.add (attrs);
        attrs = null;
        attrs = new java.util.HashSet ();
        bundle.add (attrs);
        attrs = null;
        attrs = new java.util.HashSet ();
        bundle.add (attrs);
        attrs = null;
        methodAttributes.put ("createOrUpdate(java.io.Serializable)", bundle);
        bundle = null;

        bundle = new java.util.ArrayList ();
        attrs = new java.util.HashSet ();
        {
            org.springframework.transaction.interceptor.DefaultTransactionAttribute _attr = new org.springframework.transaction.interceptor.DefaultTransactionAttribute(  // C:/Users/NightWish/Documents/adapit/br.com.adapit.portal/src/com/workcase/hibernate/GenericDAOHibernate.java:38
);
            _attr.setPropagationBehaviorName(
"PROPAGATION_REQUIRES_NEW"  // C:/Users/NightWish/Documents/adapit/br.com.adapit.portal/src/com/workcase/hibernate/GenericDAOHibernate.java:38
);
        Object _oattr = _attr; // Need to erase type information
        if (_oattr instanceof org.apache.commons.attributes.Sealable) {
            ((org.apache.commons.attributes.Sealable) _oattr).seal ();
        }
        attrs.add ( _attr );
        }
        bundle.add (attrs);
        attrs = null;
        attrs = new java.util.HashSet ();
        bundle.add (attrs);
        attrs = null;
        attrs = new java.util.HashSet ();
        bundle.add (attrs);
        attrs = null;
        methodAttributes.put ("saveOrUpdate(java.io.Serializable)", bundle);
        bundle = null;

        bundle = new java.util.ArrayList ();
        attrs = new java.util.HashSet ();
        {
            org.springframework.transaction.interceptor.DefaultTransactionAttribute _attr = new org.springframework.transaction.interceptor.DefaultTransactionAttribute(  // C:/Users/NightWish/Documents/adapit/br.com.adapit.portal/src/com/workcase/hibernate/GenericDAOHibernate.java:46
);
            _attr.setPropagationBehaviorName(
"PROPAGATION_REQUIRES_NEW"  // C:/Users/NightWish/Documents/adapit/br.com.adapit.portal/src/com/workcase/hibernate/GenericDAOHibernate.java:46
);
        Object _oattr = _attr; // Need to erase type information
        if (_oattr instanceof org.apache.commons.attributes.Sealable) {
            ((org.apache.commons.attributes.Sealable) _oattr).seal ();
        }
        attrs.add ( _attr );
        }
        bundle.add (attrs);
        attrs = null;
        attrs = new java.util.HashSet ();
        bundle.add (attrs);
        attrs = null;
        attrs = new java.util.HashSet ();
        bundle.add (attrs);
        attrs = null;
        methodAttributes.put ("save(java.io.Serializable)", bundle);
        bundle = null;

        bundle = new java.util.ArrayList ();
        attrs = new java.util.HashSet ();
        {
            org.springframework.transaction.interceptor.DefaultTransactionAttribute _attr = new org.springframework.transaction.interceptor.DefaultTransactionAttribute(  // C:/Users/NightWish/Documents/adapit/br.com.adapit.portal/src/com/workcase/hibernate/GenericDAOHibernate.java:57
);
            _attr.setPropagationBehaviorName(
"PROPAGATION_REQUIRES_NEW"  // C:/Users/NightWish/Documents/adapit/br.com.adapit.portal/src/com/workcase/hibernate/GenericDAOHibernate.java:57
);
        Object _oattr = _attr; // Need to erase type information
        if (_oattr instanceof org.apache.commons.attributes.Sealable) {
            ((org.apache.commons.attributes.Sealable) _oattr).seal ();
        }
        attrs.add ( _attr );
        }
        bundle.add (attrs);
        attrs = null;
        attrs = new java.util.HashSet ();
        bundle.add (attrs);
        attrs = null;
        attrs = new java.util.HashSet ();
        bundle.add (attrs);
        attrs = null;
        methodAttributes.put ("update(java.io.Serializable)", bundle);
        bundle = null;

        bundle = new java.util.ArrayList ();
        attrs = new java.util.HashSet ();
        {
            org.springframework.transaction.interceptor.DefaultTransactionAttribute _attr = new org.springframework.transaction.interceptor.DefaultTransactionAttribute(  // C:/Users/NightWish/Documents/adapit/br.com.adapit.portal/src/com/workcase/hibernate/GenericDAOHibernate.java:68
);
            _attr.setPropagationBehaviorName(
"PROPAGATION_REQUIRES_NEW"  // C:/Users/NightWish/Documents/adapit/br.com.adapit.portal/src/com/workcase/hibernate/GenericDAOHibernate.java:68
);
        Object _oattr = _attr; // Need to erase type information
        if (_oattr instanceof org.apache.commons.attributes.Sealable) {
            ((org.apache.commons.attributes.Sealable) _oattr).seal ();
        }
        attrs.add ( _attr );
        }
        bundle.add (attrs);
        attrs = null;
        attrs = new java.util.HashSet ();
        bundle.add (attrs);
        attrs = null;
        attrs = new java.util.HashSet ();
        bundle.add (attrs);
        attrs = null;
        methodAttributes.put ("merge(java.io.Serializable)", bundle);
        bundle = null;

        bundle = new java.util.ArrayList ();
        attrs = new java.util.HashSet ();
        {
            org.springframework.transaction.interceptor.DefaultTransactionAttribute _attr = new org.springframework.transaction.interceptor.DefaultTransactionAttribute(  // C:/Users/NightWish/Documents/adapit/br.com.adapit.portal/src/com/workcase/hibernate/GenericDAOHibernate.java:79
);
            _attr.setPropagationBehaviorName(
"PROPAGATION_REQUIRES_NEW"  // C:/Users/NightWish/Documents/adapit/br.com.adapit.portal/src/com/workcase/hibernate/GenericDAOHibernate.java:79
);
        Object _oattr = _attr; // Need to erase type information
        if (_oattr instanceof org.apache.commons.attributes.Sealable) {
            ((org.apache.commons.attributes.Sealable) _oattr).seal ();
        }
        attrs.add ( _attr );
        }
        bundle.add (attrs);
        attrs = null;
        attrs = new java.util.HashSet ();
        bundle.add (attrs);
        attrs = null;
        attrs = new java.util.HashSet ();
        bundle.add (attrs);
        attrs = null;
        methodAttributes.put ("delete(java.io.Serializable)", bundle);
        bundle = null;

        bundle = new java.util.ArrayList ();
        attrs = new java.util.HashSet ();
        {
            org.springframework.transaction.interceptor.DefaultTransactionAttribute _attr = new org.springframework.transaction.interceptor.DefaultTransactionAttribute(  // C:/Users/NightWish/Documents/adapit/br.com.adapit.portal/src/com/workcase/hibernate/GenericDAOHibernate.java:87
);
            _attr.setPropagationBehaviorName(
"PROPAGATION_REQUIRES_NEW"  // C:/Users/NightWish/Documents/adapit/br.com.adapit.portal/src/com/workcase/hibernate/GenericDAOHibernate.java:87
);
        Object _oattr = _attr; // Need to erase type information
        if (_oattr instanceof org.apache.commons.attributes.Sealable) {
            ((org.apache.commons.attributes.Sealable) _oattr).seal ();
        }
        attrs.add ( _attr );
        }
        bundle.add (attrs);
        attrs = null;
        attrs = new java.util.HashSet ();
        bundle.add (attrs);
        attrs = null;
        attrs = new java.util.HashSet ();
        bundle.add (attrs);
        attrs = null;
        methodAttributes.put ("deleteAll(java.util.Collection)", bundle);
        bundle = null;

        bundle = new java.util.ArrayList ();
        attrs = new java.util.HashSet ();
        bundle.add (attrs);
        attrs = null;
        attrs = new java.util.HashSet ();
        bundle.add (attrs);
        attrs = null;
        attrs = new java.util.HashSet ();
        bundle.add (attrs);
        attrs = null;
        methodAttributes.put ("setObjectClass(java.lang.Class)", bundle);
        bundle = null;

    }
    private void initConstructorAttributes () {
        java.util.Set attrs = null;
        java.util.List bundle = null;
    }
}
