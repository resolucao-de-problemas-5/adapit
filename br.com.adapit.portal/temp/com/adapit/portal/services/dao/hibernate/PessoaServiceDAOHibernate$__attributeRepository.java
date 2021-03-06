package com.adapit.portal.services.dao.hibernate;
import java.util.ArrayList;
import java.util.Date;
import java.util.Hashtable;
import java.util.List;
import org.hibernate.NonUniqueObjectException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.exception.ConstraintViolationException;
import org.hibernate.exception.DataException;
import com.adapit.portal.entidades.AtributoPessoa;
import com.adapit.portal.entidades.ClassificacaoComentarioCliente;
import com.adapit.portal.entidades.ComentarioCliente;
import com.adapit.portal.entidades.ComentarioClientePk;
import com.adapit.portal.entidades.PessoaEmDivulgacao;
import com.adapit.portal.entidades.ComitenteSimples;
import com.adapit.portal.entidades.Endereco;
import com.adapit.portal.entidades.Fisica;
import com.adapit.portal.entidades.Funcionario;
import com.adapit.portal.entidades.Imagem;
import com.adapit.portal.entidades.Instrutor;
import com.adapit.portal.entidades.Juridica;
import com.adapit.portal.entidades.Participante;
import com.adapit.portal.entidades.PersonAttributeType;
import com.adapit.portal.entidades.Pessoa;
import com.adapit.portal.entidades.RepresentanteLegal;
import com.adapit.portal.entidades.TipoPessoa;
import com.adapit.portal.entidades.Usuario;
import com.adapit.portal.services.PessoaService;
import com.adapit.portal.services.local.LocalServicesUtility;
import com.adapit.portal.services.validation.FieldMsgValidation;
import com.adapit.portal.services.validation.FieldMsgValidationException;
import com.workcase.hibernate.GenericDAO;
import com.workcase.hibernate.GenericDAOHibernate;
public class PessoaServiceDAOHibernate$__attributeRepository implements org.apache.commons.attributes.AttributeRepositoryClass {
    private final java.util.Set classAttributes = new java.util.HashSet ();
    private final java.util.Map fieldAttributes = new java.util.HashMap ();
    private final java.util.Map methodAttributes = new java.util.HashMap ();
    private final java.util.Map constructorAttributes = new java.util.HashMap ();

    public PessoaServiceDAOHibernate$__attributeRepository () {
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
            org.springframework.transaction.interceptor.DefaultTransactionAttribute _attr = new org.springframework.transaction.interceptor.DefaultTransactionAttribute(  // C:/Users/Rafael/Documents/workspace/rp5/adapit/br.com.adapit.portal/src/com/adapit/portal/services/dao/hibernate/PessoaServiceDAOHibernate.java:44
);
            _attr.setPropagationBehaviorName(
"PROPAGATION_REQUIRED"  // C:/Users/Rafael/Documents/workspace/rp5/adapit/br.com.adapit.portal/src/com/adapit/portal/services/dao/hibernate/PessoaServiceDAOHibernate.java:44
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
