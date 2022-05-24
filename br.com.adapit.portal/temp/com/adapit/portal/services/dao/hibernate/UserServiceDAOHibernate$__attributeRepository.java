package com.adapit.portal.services.dao.hibernate;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.dao.support.DataAccessUtils;
import org.springframework.orm.hibernate3.HibernateTemplate;
import com.adapit.portal.dto.LoteReportDTO;
import com.adapit.portal.dto.UsuarioDTO;
import com.adapit.portal.entidades.Access;
import com.adapit.portal.entidades.AtributoPessoa;
import com.adapit.portal.entidades.CategoriaPreferidaEnum;
import com.adapit.portal.entidades.DeactivationReason;
import com.adapit.portal.entidades.Endereco;
import com.adapit.portal.entidades.Fisica;
import com.adapit.portal.entidades.Funcionario;
import com.adapit.portal.entidades.Instrutor;
import com.adapit.portal.entidades.Juridica;
import com.adapit.portal.entidades.Participante;
import com.adapit.portal.entidades.Pessoa;
import com.adapit.portal.entidades.PessoaEmDivulgacao;
import com.adapit.portal.entidades.RepresentanteLegal;
import com.adapit.portal.entidades.StatusAgenda;
import com.adapit.portal.entidades.TipoPessoa;
import com.adapit.portal.entidades.Treinamento;
import com.adapit.portal.entidades.TurmaTreinamento;
import com.adapit.portal.entidades.UserLayoutPreferences;
import com.adapit.portal.entidades.UserCadastreType;
import com.adapit.portal.entidades.Usuario;
import com.adapit.portal.services.PersonType;
import com.adapit.portal.services.StringQueryKind;
import com.adapit.portal.services.UserDataFilterType;
import com.adapit.portal.services.UserService;
import com.adapit.portal.services.UserSystemAccessFilterType;
import com.adapit.portal.services.local.LocalServicesUtility;
import com.adapit.portal.ui.forms.pessoa.PreferenciaUsuario;
import com.adapit.portal.util.global.FilterResultSize;
import com.workcase.hibernate.GenericDAO;
import com.workcase.hibernate.GenericDAOHibernate;
public class UserServiceDAOHibernate$__attributeRepository implements org.apache.commons.attributes.AttributeRepositoryClass {
    private final java.util.Set classAttributes = new java.util.HashSet ();
    private final java.util.Map fieldAttributes = new java.util.HashMap ();
    private final java.util.Map methodAttributes = new java.util.HashMap ();
    private final java.util.Map constructorAttributes = new java.util.HashMap ();

    public UserServiceDAOHibernate$__attributeRepository () {
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
            org.springframework.transaction.interceptor.DefaultTransactionAttribute _attr = new org.springframework.transaction.interceptor.DefaultTransactionAttribute(  // C:/Users/Rafael/Documents/workspace/rp5/adapit/br.com.adapit.portal/src/com/adapit/portal/services/dao/hibernate/UserServiceDAOHibernate.java:49
);
            _attr.setPropagationBehaviorName(
"PROPAGATION_REQUIRED"  // C:/Users/Rafael/Documents/workspace/rp5/adapit/br.com.adapit.portal/src/com/adapit/portal/services/dao/hibernate/UserServiceDAOHibernate.java:49
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
