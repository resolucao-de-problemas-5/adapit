package com.adapit.portal.services.dao.hibernate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.dao.support.DataAccessUtils;
import org.springframework.orm.hibernate3.HibernateTemplate;
import com.adapit.portal.entidades.AgendaTreinamento;
import com.adapit.portal.entidades.ComercialSolution;
import com.adapit.portal.entidades.ComercialSolutionItem;
import com.adapit.portal.entidades.FormacaoTreinamento;
import com.adapit.portal.entidades.Imagem;
import com.adapit.portal.entidades.Participante;
import com.adapit.portal.entidades.ScheduledTrainingStatus;
import com.adapit.portal.entidades.StatusAgenda;
import com.adapit.portal.entidades.TrainingFormationItem;
import com.adapit.portal.entidades.TrainingSolution;
import com.adapit.portal.entidades.Treinamento;
import com.adapit.portal.entidades.TurmaTreinamento;
import com.adapit.portal.services.ScheduledTrainingFilterType;
import com.adapit.portal.services.TreinamentoService;
import com.adapit.portal.services.local.LocalServicesUtility;
import com.adapit.portal.util.global.FilterResultSize;
import com.workcase.hibernate.GenericDAO;
import com.workcase.hibernate.GenericDAOHibernate;
public class TreinamentoServiceDAOHibernate$__attributeRepository implements org.apache.commons.attributes.AttributeRepositoryClass {
    private final java.util.Set classAttributes = new java.util.HashSet ();
    private final java.util.Map fieldAttributes = new java.util.HashMap ();
    private final java.util.Map methodAttributes = new java.util.HashMap ();
    private final java.util.Map constructorAttributes = new java.util.HashMap ();

    public TreinamentoServiceDAOHibernate$__attributeRepository () {
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
            org.springframework.transaction.interceptor.DefaultTransactionAttribute _attr = new org.springframework.transaction.interceptor.DefaultTransactionAttribute(  // C:/Users/Rafael/Documents/workspace/rp5/adapit/br.com.adapit.portal/src/com/adapit/portal/services/dao/hibernate/TreinamentoServiceDAOHibernate.java:34
);
            _attr.setPropagationBehaviorName(
"PROPAGATION_REQUIRED"  // C:/Users/Rafael/Documents/workspace/rp5/adapit/br.com.adapit.portal/src/com/adapit/portal/services/dao/hibernate/TreinamentoServiceDAOHibernate.java:34
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
