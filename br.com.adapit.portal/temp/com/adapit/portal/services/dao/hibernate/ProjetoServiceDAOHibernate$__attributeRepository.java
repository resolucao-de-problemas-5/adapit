package com.adapit.portal.services.dao.hibernate;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.dao.support.DataAccessUtils;
import org.springframework.orm.hibernate3.HibernateTemplate;
import com.adapit.portal.entidades.Cliente;
import com.adapit.portal.entidades.Projeto;
import com.adapit.portal.entidades.ScheduledTrainingStatus;
import com.adapit.portal.services.ProjetoService;
import com.workcase.hibernate.GenericDAOHibernate;
public class ProjetoServiceDAOHibernate$__attributeRepository implements org.apache.commons.attributes.AttributeRepositoryClass {
    private final java.util.Set classAttributes = new java.util.HashSet ();
    private final java.util.Map fieldAttributes = new java.util.HashMap ();
    private final java.util.Map methodAttributes = new java.util.HashMap ();
    private final java.util.Map constructorAttributes = new java.util.HashMap ();

    public ProjetoServiceDAOHibernate$__attributeRepository () {
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
            org.springframework.transaction.interceptor.DefaultTransactionAttribute _attr = new org.springframework.transaction.interceptor.DefaultTransactionAttribute(  // C:/Users/NightWish/Documents/adapit/br.com.adapit.portal/src/com/adapit/portal/services/dao/hibernate/ProjetoServiceDAOHibernate.java:19
);
            _attr.setPropagationBehaviorName(
"PROPAGATION_REQUIRED"  // C:/Users/NightWish/Documents/adapit/br.com.adapit.portal/src/com/adapit/portal/services/dao/hibernate/ProjetoServiceDAOHibernate.java:19
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
