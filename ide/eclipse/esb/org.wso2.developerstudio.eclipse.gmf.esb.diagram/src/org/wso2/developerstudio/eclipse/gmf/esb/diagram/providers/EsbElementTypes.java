package org.wso2.developerstudio.eclipse.gmf.esb.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.swt.graphics.Image;
import org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.*;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.part.EsbDiagramEditorPlugin;

/**
 * @generated
 */
public class EsbElementTypes {

	/**
	 * @generated
	 */
	private EsbElementTypes() {
	}

	/**
	 * @generated
	 */
	private static Map<IElementType, ENamedElement> elements;

	/**
	 * @generated
	 */
	private static ImageRegistry imageRegistry;

	/**
	 * @generated
	 */
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	 * @generated
	 */
	public static final IElementType EsbDiagram_1000 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.EsbDiagram_1000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType EsbServer_2001 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.EsbServer_2001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ProxyService_3001 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.ProxyService_3001"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType ProxyOutputConnector_3002 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.ProxyOutputConnector_3002"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType ProxyInputConnector_3003 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.ProxyInputConnector_3003"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType ProxyFaultInputConnector_3489 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.ProxyFaultInputConnector_3489"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType ProxyServiceContainer_3486 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.ProxyServiceContainer_3486"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType ProxyServiceSequenceAndEndpointContainer_3487 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.ProxyServiceSequenceAndEndpointContainer_3487"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType ProxyServiceSequenceContainer_3391 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.ProxyServiceSequenceContainer_3391"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType ProxyServiceInSequence_3197 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.ProxyServiceInSequence_3197"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType MediatorFlow_3490 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.MediatorFlow_3490"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType DropMediator_3491 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.DropMediator_3491"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType MessageMediator_3045 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.MessageMediator_3045"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType MessageInputConnector_3046 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.MessageInputConnector_3046"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType MessageOutputConnector_3047 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.MessageOutputConnector_3047"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType DropMediatorInputConnector_3008 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.DropMediatorInputConnector_3008"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType PropertyMediator_3492 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.PropertyMediator_3492"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType ProxyServiceOutSequence_3198 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.ProxyServiceOutSequence_3198"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType MediatorFlow_3529 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.MediatorFlow_3529"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType FilterMediatorInputConnector_3010 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.FilterMediatorInputConnector_3010"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType FilterMediatorPassOutputConnector_3011 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.FilterMediatorPassOutputConnector_3011"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType FilterMediatorFailOutputConnector_3012 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.FilterMediatorFailOutputConnector_3012"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType LogMediator_3495 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.LogMediator_3495"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType MergeNode_3013 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.MergeNode_3013"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType MergeNodeFirstInputConnector_3014 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.MergeNodeFirstInputConnector_3014"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType MergeNodeSecondInputConnector_3015 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.MergeNodeSecondInputConnector_3015"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType MergeNodeOutputConnector_3016 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.MergeNodeOutputConnector_3016"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType LogMediatorInputConnector_3018 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.LogMediatorInputConnector_3018"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType LogMediatorOutputConnector_3019 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.LogMediatorOutputConnector_3019"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType EnrichMediator_3496 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.EnrichMediator_3496"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType PropertyMediatorInputConnector_3033 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.PropertyMediatorInputConnector_3033"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType PropertyMediatorOutputConnector_3034 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.PropertyMediatorOutputConnector_3034"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType ThrottleMediator_3493 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.ThrottleMediator_3493"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType EnrichMediatorInputConnector_3036 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.EnrichMediatorInputConnector_3036"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType EnrichMediatorOutputConnector_3037 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.EnrichMediatorOutputConnector_3037"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType XSLTMediator_3497 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.XSLTMediator_3497"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType XSLTMediatorInputConnector_3039 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.XSLTMediatorInputConnector_3039"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType XSLTMediatorOutputConnector_3040 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.XSLTMediatorOutputConnector_3040"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType SwitchMediator_3498 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.SwitchMediator_3498"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType SwitchMediatorInputConnector_3042 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.SwitchMediatorInputConnector_3042"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType SwitchCaseBranchOutputConnector_3043 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.SwitchCaseBranchOutputConnector_3043"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType SwitchDefaultBranchOutputConnector_3044 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.SwitchDefaultBranchOutputConnector_3044"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType SwitchMediatorOutputConnector_3499 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.SwitchMediatorOutputConnector_3499"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType SwitchMediatorContainer_3500 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.SwitchMediatorContainer_3500"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType SwitchCaseContainer_3501 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.SwitchCaseContainer_3501"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType MediatorFlow_3502 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.MediatorFlow_3502"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Sequence_3503 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.Sequence_3503"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType SequenceInputConnector_3049 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.SequenceInputConnector_3049"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType SequenceOutputConnector_3050 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.SequenceOutputConnector_3050"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType EventMediator_3504 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.EventMediator_3504"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType EventMediatorInputConnector_3052 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.EventMediatorInputConnector_3052"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType EventMediatorOutputConnector_3053 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.EventMediatorOutputConnector_3053"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType EntitlementMediator_3505 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.EntitlementMediator_3505"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType EntitlementMediatorInputConnector_3055 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.EntitlementMediatorInputConnector_3055"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType EntitlementMediatorOutputConnector_3056 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.EntitlementMediatorOutputConnector_3056"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType ClassMediator_3506 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.ClassMediator_3506"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType ClassMediatorInputConnector_3058 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.ClassMediatorInputConnector_3058"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType ClassMediatorOutputConnector_3059 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.ClassMediatorOutputConnector_3059"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType SpringMediator_3507 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.SpringMediator_3507"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType SpringMediatorInputConnector_3061 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.SpringMediatorInputConnector_3061"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType SpringMediatorOutputConnector_3062 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.SpringMediatorOutputConnector_3062"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType ScriptMediator_3508 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.ScriptMediator_3508"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType ScriptMediatorInputConnector_3064 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.ScriptMediatorInputConnector_3064"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType ScriptMediatorOutputConnector_3065 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.ScriptMediatorOutputConnector_3065"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType FaultMediator_3509 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.FaultMediator_3509"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType FaultMediatorInputConnector_3067 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.FaultMediatorInputConnector_3067"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType FaultMediatorOutputConnector_3068 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.FaultMediatorOutputConnector_3068"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType XQueryMediator_3510 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.XQueryMediator_3510"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType XQueryMediatorInputConnector_3070 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.XQueryMediatorInputConnector_3070"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType XQueryMediatorOutputConnector_3071 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.XQueryMediatorOutputConnector_3071"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType CommandMediator_3511 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.CommandMediator_3511"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType CommandMediatorInputConnector_3073 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.CommandMediatorInputConnector_3073"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType CommandMediatorOutputConnector_3074 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.CommandMediatorOutputConnector_3074"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType DBLookupMediator_3512 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.DBLookupMediator_3512"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType DBLookupMediatorInputConnector_3076 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.DBLookupMediatorInputConnector_3076"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType DBLookupMediatorOutputConnector_3077 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.DBLookupMediatorOutputConnector_3077"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType DBReportMediator_3513 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.DBReportMediator_3513"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType DBReportMediatorInputConnector_3079 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.DBReportMediatorInputConnector_3079"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType DBReportMediatorOutputConnector_3080 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.DBReportMediatorOutputConnector_3080"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType SmooksMediator_3514 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.SmooksMediator_3514"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType SmooksMediatorInputConnector_3082 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.SmooksMediatorInputConnector_3082"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType SmooksMediatorOutputConnector_3083 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.SmooksMediatorOutputConnector_3083"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType SendMediator_3515 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.SendMediator_3515"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType SendMediatorInputConnector_3085 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.SendMediatorInputConnector_3085"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType SendMediatorOutputConnector_3086 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.SendMediatorOutputConnector_3086"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType HeaderMediator_3516 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.HeaderMediator_3516"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType FailoverEndPointInputConnector_3088 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.FailoverEndPointInputConnector_3088"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType FailoverEndPointOutputConnector_3090 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.FailoverEndPointOutputConnector_3090"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType FailoverEndPointWestOutputConnector_3097 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.FailoverEndPointWestOutputConnector_3097"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType WSDLEndPoint_3385 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.WSDLEndPoint_3385"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType WSDLEndPointInputConnector_3092 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.WSDLEndPointInputConnector_3092"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType WSDLEndPointOutputConnector_3093 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.WSDLEndPointOutputConnector_3093"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType LoadBalanceEndPoint_3386 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.LoadBalanceEndPoint_3386"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType LoadBalanceEndPointInputConnector_3095 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.LoadBalanceEndPointInputConnector_3095"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType LoadBalanceEndPointOutputConnector_3096 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.LoadBalanceEndPointOutputConnector_3096"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType LoadBalanceEndPointWestOutputConnector_3098 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.LoadBalanceEndPointWestOutputConnector_3098"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType ProxyServiceFaultContainer_3488 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.ProxyServiceFaultContainer_3488"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType MediatorFlow_3530 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.MediatorFlow_3530"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType HeaderMediatorInputConnector_3100 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.HeaderMediatorInputConnector_3100"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType HeaderMediatorOutputConnector_3101 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.HeaderMediatorOutputConnector_3101"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType CloneMediator_3517 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.CloneMediator_3517"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType CloneMediatorInputConnector_3103 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.CloneMediatorInputConnector_3103"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType CloneMediatorOutputConnector_3104 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.CloneMediatorOutputConnector_3104"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType CloneMediatorTargetOutputConnector_3133 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.CloneMediatorTargetOutputConnector_3133"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType CacheMediator_3518 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.CacheMediator_3518"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType CacheMediatorInputConnector_3106 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.CacheMediatorInputConnector_3106"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType CacheMediatorOutputConnector_3107 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.CacheMediatorOutputConnector_3107"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType IterateMediator_3519 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.IterateMediator_3519"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType IterateMediatorInputConnector_3109 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.IterateMediatorInputConnector_3109"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType IterateMediatorOutputConnector_3110 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.IterateMediatorOutputConnector_3110"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType CalloutMediator_3520 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.CalloutMediator_3520"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType AggregateMediatorInputConnector_3112 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.AggregateMediatorInputConnector_3112"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType AggregateMediatorOutputConnector_3113 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.AggregateMediatorOutputConnector_3113"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType AggregateMediatorOnCompleteOutputConnector_3132 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.AggregateMediatorOnCompleteOutputConnector_3132"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType MediatorFlow_3526 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.MediatorFlow_3526"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType SwitchDefaultContainer_3527 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.SwitchDefaultContainer_3527"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType MediatorFlow_3528 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.MediatorFlow_3528"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType ProxyServiceEndpointContainer_3392 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.ProxyServiceEndpointContainer_3392"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType DefaultEndPoint_3382 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.DefaultEndPoint_3382"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType CalloutMediatorInputConnector_3115 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.CalloutMediatorInputConnector_3115"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType CalloutMediatorOutputConnector_3116 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.CalloutMediatorOutputConnector_3116"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType TransactionMediator_3521 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.TransactionMediator_3521"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType TransactionMediatorInputConnector_3118 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.TransactionMediatorInputConnector_3118"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType TransactionMediatorOutputConnector_3119 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.TransactionMediatorOutputConnector_3119"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType RMSequenceMediator_3522 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.RMSequenceMediator_3522"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType ThrottleMediatorInputConnector_3121 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.ThrottleMediatorInputConnector_3121"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType ThrottleMediatorOutputConnector_3122 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.ThrottleMediatorOutputConnector_3122"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType FilterMediator_3494 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.FilterMediator_3494"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType RMSequenceMediatorInputConnector_3124 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.RMSequenceMediatorInputConnector_3124"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType RMSequenceMediatorOutputConnector_3125 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.RMSequenceMediatorOutputConnector_3125"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType RuleMediator_3523 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.RuleMediator_3523"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType RuleMediatorInputConnector_3127 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.RuleMediatorInputConnector_3127"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType RuleMediatorOutputConnector_3128 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.RuleMediatorOutputConnector_3128"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType OAuthMediator_3524 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.OAuthMediator_3524"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType OAuthMediatorInputConnector_3130 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.OAuthMediatorInputConnector_3130"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType OAuthMediatorOutputConnector_3131 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.OAuthMediatorOutputConnector_3131"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType AggregateMediator_3525 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.AggregateMediator_3525"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType DefaultEndPointInputConnector_3021 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.DefaultEndPointInputConnector_3021"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType DefaultEndPointOutputConnector_3022 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.DefaultEndPointOutputConnector_3022"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType AddressEndPoint_3383 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.AddressEndPoint_3383"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType AddressEndPointInputConnector_3030 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.AddressEndPointInputConnector_3030"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType AddressEndPointOutputConnector_3031 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.AddressEndPointOutputConnector_3031"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType FailoverEndPoint_3384 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.FailoverEndPoint_3384"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType EsbLink_4001 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.EsbLink_4001"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	private static ImageRegistry getImageRegistry() {
		if (imageRegistry == null) {
			imageRegistry = new ImageRegistry();
		}
		return imageRegistry;
	}

	/**
	 * @generated
	 */
	private static String getImageRegistryKey(ENamedElement element) {
		return element.getName();
	}

	/**
	 * @generated
	 */
	private static ImageDescriptor getProvidedImageDescriptor(
			ENamedElement element) {
		if (element instanceof EStructuralFeature) {
			EStructuralFeature feature = ((EStructuralFeature) element);
			EClass eContainingClass = feature.getEContainingClass();
			EClassifier eType = feature.getEType();
			if (eContainingClass != null && !eContainingClass.isAbstract()) {
				element = eContainingClass;
			} else if (eType instanceof EClass
					&& !((EClass) eType).isAbstract()) {
				element = eType;
			}
		}
		if (element instanceof EClass) {
			EClass eClass = (EClass) element;
			if (!eClass.isAbstract()) {
				return EsbDiagramEditorPlugin.getInstance()
						.getItemImageDescriptor(
								eClass.getEPackage().getEFactoryInstance()
										.create(eClass));
			}
		}
		// TODO : support structural features
		return null;
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		String key = getImageRegistryKey(element);
		ImageDescriptor imageDescriptor = getImageRegistry().getDescriptor(key);
		if (imageDescriptor == null) {
			imageDescriptor = getProvidedImageDescriptor(element);
			if (imageDescriptor == null) {
				imageDescriptor = ImageDescriptor.getMissingImageDescriptor();
			}
			getImageRegistry().put(key, imageDescriptor);
		}
		return imageDescriptor;
	}

	/**
	 * @generated
	 */
	public static Image getImage(ENamedElement element) {
		String key = getImageRegistryKey(element);
		Image image = getImageRegistry().get(key);
		if (image == null) {
			ImageDescriptor imageDescriptor = getProvidedImageDescriptor(element);
			if (imageDescriptor == null) {
				imageDescriptor = ImageDescriptor.getMissingImageDescriptor();
			}
			getImageRegistry().put(key, imageDescriptor);
			image = getImageRegistry().get(key);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		ENamedElement element = getElement(hint);
		if (element == null) {
			return null;
		}
		return getImageDescriptor(element);
	}

	/**
	 * @generated
	 */
	public static Image getImage(IAdaptable hint) {
		ENamedElement element = getElement(hint);
		if (element == null) {
			return null;
		}
		return getImage(element);
	}

	/**
	 * Returns 'type' of the ecore object associated with the hint.
	 * 
	 * @generated
	 */
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap<IElementType, ENamedElement>();

			elements.put(EsbDiagram_1000, EsbPackage.eINSTANCE.getEsbDiagram());

			elements.put(EsbServer_2001, EsbPackage.eINSTANCE.getEsbServer());

			elements.put(ProxyService_3001,
					EsbPackage.eINSTANCE.getProxyService());

			elements.put(ProxyOutputConnector_3002,
					EsbPackage.eINSTANCE.getProxyOutputConnector());

			elements.put(ProxyInputConnector_3003,
					EsbPackage.eINSTANCE.getProxyInputConnector());

			elements.put(ProxyFaultInputConnector_3489,
					EsbPackage.eINSTANCE.getProxyFaultInputConnector());

			elements.put(ProxyServiceContainer_3486,
					EsbPackage.eINSTANCE.getProxyServiceContainer());

			elements.put(ProxyServiceSequenceAndEndpointContainer_3487,
					EsbPackage.eINSTANCE
							.getProxyServiceSequenceAndEndpointContainer());

			elements.put(ProxyServiceSequenceContainer_3391,
					EsbPackage.eINSTANCE.getProxyServiceSequenceContainer());

			elements.put(ProxyServiceInSequence_3197,
					EsbPackage.eINSTANCE.getProxyServiceInSequence());

			elements.put(MediatorFlow_3490,
					EsbPackage.eINSTANCE.getMediatorFlow());

			elements.put(DropMediator_3491,
					EsbPackage.eINSTANCE.getDropMediator());

			elements.put(DropMediatorInputConnector_3008,
					EsbPackage.eINSTANCE.getDropMediatorInputConnector());

			elements.put(PropertyMediator_3492,
					EsbPackage.eINSTANCE.getPropertyMediator());

			elements.put(PropertyMediatorInputConnector_3033,
					EsbPackage.eINSTANCE.getPropertyMediatorInputConnector());

			elements.put(PropertyMediatorOutputConnector_3034,
					EsbPackage.eINSTANCE.getPropertyMediatorOutputConnector());

			elements.put(ThrottleMediator_3493,
					EsbPackage.eINSTANCE.getThrottleMediator());

			elements.put(ThrottleMediatorInputConnector_3121,
					EsbPackage.eINSTANCE.getThrottleMediatorInputConnector());

			elements.put(ThrottleMediatorOutputConnector_3122,
					EsbPackage.eINSTANCE.getThrottleMediatorOutputConnector());

			elements.put(FilterMediator_3494,
					EsbPackage.eINSTANCE.getFilterMediator());

			elements.put(FilterMediatorInputConnector_3010,
					EsbPackage.eINSTANCE.getFilterMediatorInputConnector());

			elements.put(FilterMediatorPassOutputConnector_3011,
					EsbPackage.eINSTANCE.getFilterMediatorPassOutputConnector());

			elements.put(FilterMediatorFailOutputConnector_3012,
					EsbPackage.eINSTANCE.getFilterMediatorFailOutputConnector());

			elements.put(LogMediator_3495,
					EsbPackage.eINSTANCE.getLogMediator());

			elements.put(LogMediatorInputConnector_3018,
					EsbPackage.eINSTANCE.getLogMediatorInputConnector());

			elements.put(LogMediatorOutputConnector_3019,
					EsbPackage.eINSTANCE.getLogMediatorOutputConnector());

			elements.put(EnrichMediator_3496,
					EsbPackage.eINSTANCE.getEnrichMediator());

			elements.put(EnrichMediatorInputConnector_3036,
					EsbPackage.eINSTANCE.getEnrichMediatorInputConnector());

			elements.put(EnrichMediatorOutputConnector_3037,
					EsbPackage.eINSTANCE.getEnrichMediatorOutputConnector());

			elements.put(XSLTMediator_3497,
					EsbPackage.eINSTANCE.getXSLTMediator());

			elements.put(XSLTMediatorInputConnector_3039,
					EsbPackage.eINSTANCE.getXSLTMediatorInputConnector());

			elements.put(XSLTMediatorOutputConnector_3040,
					EsbPackage.eINSTANCE.getXSLTMediatorOutputConnector());

			elements.put(SwitchMediator_3498,
					EsbPackage.eINSTANCE.getSwitchMediator());

			elements.put(SwitchMediatorInputConnector_3042,
					EsbPackage.eINSTANCE.getSwitchMediatorInputConnector());

			elements.put(SwitchCaseBranchOutputConnector_3043,
					EsbPackage.eINSTANCE.getSwitchCaseBranchOutputConnector());

			elements.put(SwitchDefaultBranchOutputConnector_3044,
					EsbPackage.eINSTANCE
							.getSwitchDefaultBranchOutputConnector());

			elements.put(SwitchMediatorOutputConnector_3499,
					EsbPackage.eINSTANCE.getSwitchMediatorOutputConnector());

			elements.put(SwitchMediatorContainer_3500,
					EsbPackage.eINSTANCE.getSwitchMediatorContainer());

			elements.put(SwitchCaseContainer_3501,
					EsbPackage.eINSTANCE.getSwitchCaseContainer());

			elements.put(MediatorFlow_3502,
					EsbPackage.eINSTANCE.getMediatorFlow());

			elements.put(Sequence_3503, EsbPackage.eINSTANCE.getSequence());

			elements.put(SequenceInputConnector_3049,
					EsbPackage.eINSTANCE.getSequenceInputConnector());

			elements.put(SequenceOutputConnector_3050,
					EsbPackage.eINSTANCE.getSequenceOutputConnector());

			elements.put(EventMediator_3504,
					EsbPackage.eINSTANCE.getEventMediator());

			elements.put(EventMediatorInputConnector_3052,
					EsbPackage.eINSTANCE.getEventMediatorInputConnector());

			elements.put(EventMediatorOutputConnector_3053,
					EsbPackage.eINSTANCE.getEventMediatorOutputConnector());

			elements.put(EntitlementMediator_3505,
					EsbPackage.eINSTANCE.getEntitlementMediator());

			elements.put(EntitlementMediatorInputConnector_3055,
					EsbPackage.eINSTANCE.getEntitlementMediatorInputConnector());

			elements.put(EntitlementMediatorOutputConnector_3056,
					EsbPackage.eINSTANCE
							.getEntitlementMediatorOutputConnector());

			elements.put(ClassMediator_3506,
					EsbPackage.eINSTANCE.getClassMediator());

			elements.put(ClassMediatorInputConnector_3058,
					EsbPackage.eINSTANCE.getClassMediatorInputConnector());

			elements.put(ClassMediatorOutputConnector_3059,
					EsbPackage.eINSTANCE.getClassMediatorOutputConnector());

			elements.put(SpringMediator_3507,
					EsbPackage.eINSTANCE.getSpringMediator());

			elements.put(SpringMediatorInputConnector_3061,
					EsbPackage.eINSTANCE.getSpringMediatorInputConnector());

			elements.put(SpringMediatorOutputConnector_3062,
					EsbPackage.eINSTANCE.getSpringMediatorOutputConnector());

			elements.put(ScriptMediator_3508,
					EsbPackage.eINSTANCE.getScriptMediator());

			elements.put(ScriptMediatorInputConnector_3064,
					EsbPackage.eINSTANCE.getScriptMediatorInputConnector());

			elements.put(ScriptMediatorOutputConnector_3065,
					EsbPackage.eINSTANCE.getScriptMediatorOutputConnector());

			elements.put(FaultMediator_3509,
					EsbPackage.eINSTANCE.getFaultMediator());

			elements.put(FaultMediatorInputConnector_3067,
					EsbPackage.eINSTANCE.getFaultMediatorInputConnector());

			elements.put(FaultMediatorOutputConnector_3068,
					EsbPackage.eINSTANCE.getFaultMediatorOutputConnector());

			elements.put(XQueryMediator_3510,
					EsbPackage.eINSTANCE.getXQueryMediator());

			elements.put(XQueryMediatorInputConnector_3070,
					EsbPackage.eINSTANCE.getXQueryMediatorInputConnector());

			elements.put(XQueryMediatorOutputConnector_3071,
					EsbPackage.eINSTANCE.getXQueryMediatorOutputConnector());

			elements.put(CommandMediator_3511,
					EsbPackage.eINSTANCE.getCommandMediator());

			elements.put(CommandMediatorInputConnector_3073,
					EsbPackage.eINSTANCE.getCommandMediatorInputConnector());

			elements.put(CommandMediatorOutputConnector_3074,
					EsbPackage.eINSTANCE.getCommandMediatorOutputConnector());

			elements.put(DBLookupMediator_3512,
					EsbPackage.eINSTANCE.getDBLookupMediator());

			elements.put(DBLookupMediatorInputConnector_3076,
					EsbPackage.eINSTANCE.getDBLookupMediatorInputConnector());

			elements.put(DBLookupMediatorOutputConnector_3077,
					EsbPackage.eINSTANCE.getDBLookupMediatorOutputConnector());

			elements.put(DBReportMediator_3513,
					EsbPackage.eINSTANCE.getDBReportMediator());

			elements.put(DBReportMediatorInputConnector_3079,
					EsbPackage.eINSTANCE.getDBReportMediatorInputConnector());

			elements.put(DBReportMediatorOutputConnector_3080,
					EsbPackage.eINSTANCE.getDBReportMediatorOutputConnector());

			elements.put(SmooksMediator_3514,
					EsbPackage.eINSTANCE.getSmooksMediator());

			elements.put(SmooksMediatorInputConnector_3082,
					EsbPackage.eINSTANCE.getSmooksMediatorInputConnector());

			elements.put(SmooksMediatorOutputConnector_3083,
					EsbPackage.eINSTANCE.getSmooksMediatorOutputConnector());

			elements.put(SendMediator_3515,
					EsbPackage.eINSTANCE.getSendMediator());

			elements.put(SendMediatorInputConnector_3085,
					EsbPackage.eINSTANCE.getSendMediatorInputConnector());

			elements.put(SendMediatorOutputConnector_3086,
					EsbPackage.eINSTANCE.getSendMediatorOutputConnector());

			elements.put(HeaderMediator_3516,
					EsbPackage.eINSTANCE.getHeaderMediator());

			elements.put(HeaderMediatorInputConnector_3100,
					EsbPackage.eINSTANCE.getHeaderMediatorInputConnector());

			elements.put(HeaderMediatorOutputConnector_3101,
					EsbPackage.eINSTANCE.getHeaderMediatorOutputConnector());

			elements.put(CloneMediator_3517,
					EsbPackage.eINSTANCE.getCloneMediator());

			elements.put(CloneMediatorInputConnector_3103,
					EsbPackage.eINSTANCE.getCloneMediatorInputConnector());

			elements.put(CloneMediatorOutputConnector_3104,
					EsbPackage.eINSTANCE.getCloneMediatorOutputConnector());

			elements.put(CloneMediatorTargetOutputConnector_3133,
					EsbPackage.eINSTANCE
							.getCloneMediatorTargetOutputConnector());

			elements.put(CacheMediator_3518,
					EsbPackage.eINSTANCE.getCacheMediator());

			elements.put(CacheMediatorInputConnector_3106,
					EsbPackage.eINSTANCE.getCacheMediatorInputConnector());

			elements.put(CacheMediatorOutputConnector_3107,
					EsbPackage.eINSTANCE.getCacheMediatorOutputConnector());

			elements.put(IterateMediator_3519,
					EsbPackage.eINSTANCE.getIterateMediator());

			elements.put(IterateMediatorInputConnector_3109,
					EsbPackage.eINSTANCE.getIterateMediatorInputConnector());

			elements.put(IterateMediatorOutputConnector_3110,
					EsbPackage.eINSTANCE.getIterateMediatorOutputConnector());

			elements.put(CalloutMediator_3520,
					EsbPackage.eINSTANCE.getCalloutMediator());

			elements.put(CalloutMediatorInputConnector_3115,
					EsbPackage.eINSTANCE.getCalloutMediatorInputConnector());

			elements.put(CalloutMediatorOutputConnector_3116,
					EsbPackage.eINSTANCE.getCalloutMediatorOutputConnector());

			elements.put(TransactionMediator_3521,
					EsbPackage.eINSTANCE.getTransactionMediator());

			elements.put(TransactionMediatorInputConnector_3118,
					EsbPackage.eINSTANCE.getTransactionMediatorInputConnector());

			elements.put(TransactionMediatorOutputConnector_3119,
					EsbPackage.eINSTANCE
							.getTransactionMediatorOutputConnector());

			elements.put(RMSequenceMediator_3522,
					EsbPackage.eINSTANCE.getRMSequenceMediator());

			elements.put(RMSequenceMediatorInputConnector_3124,
					EsbPackage.eINSTANCE.getRMSequenceMediatorInputConnector());

			elements.put(RMSequenceMediatorOutputConnector_3125,
					EsbPackage.eINSTANCE.getRMSequenceMediatorOutputConnector());

			elements.put(RuleMediator_3523,
					EsbPackage.eINSTANCE.getRuleMediator());

			elements.put(RuleMediatorInputConnector_3127,
					EsbPackage.eINSTANCE.getRuleMediatorInputConnector());

			elements.put(RuleMediatorOutputConnector_3128,
					EsbPackage.eINSTANCE.getRuleMediatorOutputConnector());

			elements.put(OAuthMediator_3524,
					EsbPackage.eINSTANCE.getOAuthMediator());

			elements.put(OAuthMediatorInputConnector_3130,
					EsbPackage.eINSTANCE.getOAuthMediatorInputConnector());

			elements.put(OAuthMediatorOutputConnector_3131,
					EsbPackage.eINSTANCE.getOAuthMediatorOutputConnector());

			elements.put(AggregateMediator_3525,
					EsbPackage.eINSTANCE.getAggregateMediator());

			elements.put(AggregateMediatorInputConnector_3112,
					EsbPackage.eINSTANCE.getAggregateMediatorInputConnector());

			elements.put(AggregateMediatorOutputConnector_3113,
					EsbPackage.eINSTANCE.getAggregateMediatorOutputConnector());

			elements.put(AggregateMediatorOnCompleteOutputConnector_3132,
					EsbPackage.eINSTANCE
							.getAggregateMediatorOnCompleteOutputConnector());

			elements.put(MediatorFlow_3526,
					EsbPackage.eINSTANCE.getMediatorFlow());

			elements.put(SwitchDefaultContainer_3527,
					EsbPackage.eINSTANCE.getSwitchDefaultContainer());

			elements.put(MediatorFlow_3528,
					EsbPackage.eINSTANCE.getMediatorFlow());

			elements.put(ProxyServiceOutSequence_3198,
					EsbPackage.eINSTANCE.getProxyServiceOutSequence());

			elements.put(MediatorFlow_3529,
					EsbPackage.eINSTANCE.getMediatorFlow());

			elements.put(ProxyServiceEndpointContainer_3392,
					EsbPackage.eINSTANCE.getProxyServiceEndpointContainer());

			elements.put(DefaultEndPoint_3382,
					EsbPackage.eINSTANCE.getDefaultEndPoint());

			elements.put(DefaultEndPointInputConnector_3021,
					EsbPackage.eINSTANCE.getDefaultEndPointInputConnector());

			elements.put(DefaultEndPointOutputConnector_3022,
					EsbPackage.eINSTANCE.getDefaultEndPointOutputConnector());

			elements.put(AddressEndPoint_3383,
					EsbPackage.eINSTANCE.getAddressEndPoint());

			elements.put(AddressEndPointInputConnector_3030,
					EsbPackage.eINSTANCE.getAddressEndPointInputConnector());

			elements.put(AddressEndPointOutputConnector_3031,
					EsbPackage.eINSTANCE.getAddressEndPointOutputConnector());

			elements.put(FailoverEndPoint_3384,
					EsbPackage.eINSTANCE.getFailoverEndPoint());

			elements.put(FailoverEndPointInputConnector_3088,
					EsbPackage.eINSTANCE.getFailoverEndPointInputConnector());

			elements.put(FailoverEndPointOutputConnector_3090,
					EsbPackage.eINSTANCE.getFailoverEndPointOutputConnector());

			elements.put(FailoverEndPointWestOutputConnector_3097,
					EsbPackage.eINSTANCE
							.getFailoverEndPointWestOutputConnector());

			elements.put(WSDLEndPoint_3385,
					EsbPackage.eINSTANCE.getWSDLEndPoint());

			elements.put(WSDLEndPointInputConnector_3092,
					EsbPackage.eINSTANCE.getWSDLEndPointInputConnector());

			elements.put(WSDLEndPointOutputConnector_3093,
					EsbPackage.eINSTANCE.getWSDLEndPointOutputConnector());

			elements.put(LoadBalanceEndPoint_3386,
					EsbPackage.eINSTANCE.getLoadBalanceEndPoint());

			elements.put(LoadBalanceEndPointInputConnector_3095,
					EsbPackage.eINSTANCE.getLoadBalanceEndPointInputConnector());

			elements.put(LoadBalanceEndPointOutputConnector_3096,
					EsbPackage.eINSTANCE
							.getLoadBalanceEndPointOutputConnector());

			elements.put(LoadBalanceEndPointWestOutputConnector_3098,
					EsbPackage.eINSTANCE
							.getLoadBalanceEndPointWestOutputConnector());

			elements.put(ProxyServiceFaultContainer_3488,
					EsbPackage.eINSTANCE.getProxyServiceFaultContainer());

			elements.put(MediatorFlow_3530,
					EsbPackage.eINSTANCE.getMediatorFlow());

			elements.put(MessageMediator_3045,
					EsbPackage.eINSTANCE.getMessageMediator());

			elements.put(MessageInputConnector_3046,
					EsbPackage.eINSTANCE.getMessageInputConnector());

			elements.put(MessageOutputConnector_3047,
					EsbPackage.eINSTANCE.getMessageOutputConnector());

			elements.put(MergeNode_3013, EsbPackage.eINSTANCE.getMergeNode());

			elements.put(MergeNodeFirstInputConnector_3014,
					EsbPackage.eINSTANCE.getMergeNodeFirstInputConnector());

			elements.put(MergeNodeSecondInputConnector_3015,
					EsbPackage.eINSTANCE.getMergeNodeSecondInputConnector());

			elements.put(MergeNodeOutputConnector_3016,
					EsbPackage.eINSTANCE.getMergeNodeOutputConnector());

			elements.put(EsbLink_4001, EsbPackage.eINSTANCE.getEsbLink());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	 * @generated
	 */
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	 * @generated
	 */
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet<IElementType>();
			KNOWN_ELEMENT_TYPES.add(EsbDiagram_1000);
			KNOWN_ELEMENT_TYPES.add(EsbServer_2001);
			KNOWN_ELEMENT_TYPES.add(ProxyService_3001);
			KNOWN_ELEMENT_TYPES.add(ProxyOutputConnector_3002);
			KNOWN_ELEMENT_TYPES.add(ProxyInputConnector_3003);
			KNOWN_ELEMENT_TYPES.add(ProxyFaultInputConnector_3489);
			KNOWN_ELEMENT_TYPES.add(ProxyServiceContainer_3486);
			KNOWN_ELEMENT_TYPES
					.add(ProxyServiceSequenceAndEndpointContainer_3487);
			KNOWN_ELEMENT_TYPES.add(ProxyServiceSequenceContainer_3391);
			KNOWN_ELEMENT_TYPES.add(ProxyServiceInSequence_3197);
			KNOWN_ELEMENT_TYPES.add(MediatorFlow_3490);
			KNOWN_ELEMENT_TYPES.add(DropMediator_3491);
			KNOWN_ELEMENT_TYPES.add(DropMediatorInputConnector_3008);
			KNOWN_ELEMENT_TYPES.add(PropertyMediator_3492);
			KNOWN_ELEMENT_TYPES.add(PropertyMediatorInputConnector_3033);
			KNOWN_ELEMENT_TYPES.add(PropertyMediatorOutputConnector_3034);
			KNOWN_ELEMENT_TYPES.add(ThrottleMediator_3493);
			KNOWN_ELEMENT_TYPES.add(ThrottleMediatorInputConnector_3121);
			KNOWN_ELEMENT_TYPES.add(ThrottleMediatorOutputConnector_3122);
			KNOWN_ELEMENT_TYPES.add(FilterMediator_3494);
			KNOWN_ELEMENT_TYPES.add(FilterMediatorInputConnector_3010);
			KNOWN_ELEMENT_TYPES.add(FilterMediatorPassOutputConnector_3011);
			KNOWN_ELEMENT_TYPES.add(FilterMediatorFailOutputConnector_3012);
			KNOWN_ELEMENT_TYPES.add(LogMediator_3495);
			KNOWN_ELEMENT_TYPES.add(LogMediatorInputConnector_3018);
			KNOWN_ELEMENT_TYPES.add(LogMediatorOutputConnector_3019);
			KNOWN_ELEMENT_TYPES.add(EnrichMediator_3496);
			KNOWN_ELEMENT_TYPES.add(EnrichMediatorInputConnector_3036);
			KNOWN_ELEMENT_TYPES.add(EnrichMediatorOutputConnector_3037);
			KNOWN_ELEMENT_TYPES.add(XSLTMediator_3497);
			KNOWN_ELEMENT_TYPES.add(XSLTMediatorInputConnector_3039);
			KNOWN_ELEMENT_TYPES.add(XSLTMediatorOutputConnector_3040);
			KNOWN_ELEMENT_TYPES.add(SwitchMediator_3498);
			KNOWN_ELEMENT_TYPES.add(SwitchMediatorInputConnector_3042);
			KNOWN_ELEMENT_TYPES.add(SwitchCaseBranchOutputConnector_3043);
			KNOWN_ELEMENT_TYPES.add(SwitchDefaultBranchOutputConnector_3044);
			KNOWN_ELEMENT_TYPES.add(SwitchMediatorOutputConnector_3499);
			KNOWN_ELEMENT_TYPES.add(SwitchMediatorContainer_3500);
			KNOWN_ELEMENT_TYPES.add(SwitchCaseContainer_3501);
			KNOWN_ELEMENT_TYPES.add(MediatorFlow_3502);
			KNOWN_ELEMENT_TYPES.add(Sequence_3503);
			KNOWN_ELEMENT_TYPES.add(SequenceInputConnector_3049);
			KNOWN_ELEMENT_TYPES.add(SequenceOutputConnector_3050);
			KNOWN_ELEMENT_TYPES.add(EventMediator_3504);
			KNOWN_ELEMENT_TYPES.add(EventMediatorInputConnector_3052);
			KNOWN_ELEMENT_TYPES.add(EventMediatorOutputConnector_3053);
			KNOWN_ELEMENT_TYPES.add(EntitlementMediator_3505);
			KNOWN_ELEMENT_TYPES.add(EntitlementMediatorInputConnector_3055);
			KNOWN_ELEMENT_TYPES.add(EntitlementMediatorOutputConnector_3056);
			KNOWN_ELEMENT_TYPES.add(ClassMediator_3506);
			KNOWN_ELEMENT_TYPES.add(ClassMediatorInputConnector_3058);
			KNOWN_ELEMENT_TYPES.add(ClassMediatorOutputConnector_3059);
			KNOWN_ELEMENT_TYPES.add(SpringMediator_3507);
			KNOWN_ELEMENT_TYPES.add(SpringMediatorInputConnector_3061);
			KNOWN_ELEMENT_TYPES.add(SpringMediatorOutputConnector_3062);
			KNOWN_ELEMENT_TYPES.add(ScriptMediator_3508);
			KNOWN_ELEMENT_TYPES.add(ScriptMediatorInputConnector_3064);
			KNOWN_ELEMENT_TYPES.add(ScriptMediatorOutputConnector_3065);
			KNOWN_ELEMENT_TYPES.add(FaultMediator_3509);
			KNOWN_ELEMENT_TYPES.add(FaultMediatorInputConnector_3067);
			KNOWN_ELEMENT_TYPES.add(FaultMediatorOutputConnector_3068);
			KNOWN_ELEMENT_TYPES.add(XQueryMediator_3510);
			KNOWN_ELEMENT_TYPES.add(XQueryMediatorInputConnector_3070);
			KNOWN_ELEMENT_TYPES.add(XQueryMediatorOutputConnector_3071);
			KNOWN_ELEMENT_TYPES.add(CommandMediator_3511);
			KNOWN_ELEMENT_TYPES.add(CommandMediatorInputConnector_3073);
			KNOWN_ELEMENT_TYPES.add(CommandMediatorOutputConnector_3074);
			KNOWN_ELEMENT_TYPES.add(DBLookupMediator_3512);
			KNOWN_ELEMENT_TYPES.add(DBLookupMediatorInputConnector_3076);
			KNOWN_ELEMENT_TYPES.add(DBLookupMediatorOutputConnector_3077);
			KNOWN_ELEMENT_TYPES.add(DBReportMediator_3513);
			KNOWN_ELEMENT_TYPES.add(DBReportMediatorInputConnector_3079);
			KNOWN_ELEMENT_TYPES.add(DBReportMediatorOutputConnector_3080);
			KNOWN_ELEMENT_TYPES.add(SmooksMediator_3514);
			KNOWN_ELEMENT_TYPES.add(SmooksMediatorInputConnector_3082);
			KNOWN_ELEMENT_TYPES.add(SmooksMediatorOutputConnector_3083);
			KNOWN_ELEMENT_TYPES.add(SendMediator_3515);
			KNOWN_ELEMENT_TYPES.add(SendMediatorInputConnector_3085);
			KNOWN_ELEMENT_TYPES.add(SendMediatorOutputConnector_3086);
			KNOWN_ELEMENT_TYPES.add(HeaderMediator_3516);
			KNOWN_ELEMENT_TYPES.add(HeaderMediatorInputConnector_3100);
			KNOWN_ELEMENT_TYPES.add(HeaderMediatorOutputConnector_3101);
			KNOWN_ELEMENT_TYPES.add(CloneMediator_3517);
			KNOWN_ELEMENT_TYPES.add(CloneMediatorInputConnector_3103);
			KNOWN_ELEMENT_TYPES.add(CloneMediatorOutputConnector_3104);
			KNOWN_ELEMENT_TYPES.add(CloneMediatorTargetOutputConnector_3133);
			KNOWN_ELEMENT_TYPES.add(CacheMediator_3518);
			KNOWN_ELEMENT_TYPES.add(CacheMediatorInputConnector_3106);
			KNOWN_ELEMENT_TYPES.add(CacheMediatorOutputConnector_3107);
			KNOWN_ELEMENT_TYPES.add(IterateMediator_3519);
			KNOWN_ELEMENT_TYPES.add(IterateMediatorInputConnector_3109);
			KNOWN_ELEMENT_TYPES.add(IterateMediatorOutputConnector_3110);
			KNOWN_ELEMENT_TYPES.add(CalloutMediator_3520);
			KNOWN_ELEMENT_TYPES.add(CalloutMediatorInputConnector_3115);
			KNOWN_ELEMENT_TYPES.add(CalloutMediatorOutputConnector_3116);
			KNOWN_ELEMENT_TYPES.add(TransactionMediator_3521);
			KNOWN_ELEMENT_TYPES.add(TransactionMediatorInputConnector_3118);
			KNOWN_ELEMENT_TYPES.add(TransactionMediatorOutputConnector_3119);
			KNOWN_ELEMENT_TYPES.add(RMSequenceMediator_3522);
			KNOWN_ELEMENT_TYPES.add(RMSequenceMediatorInputConnector_3124);
			KNOWN_ELEMENT_TYPES.add(RMSequenceMediatorOutputConnector_3125);
			KNOWN_ELEMENT_TYPES.add(RuleMediator_3523);
			KNOWN_ELEMENT_TYPES.add(RuleMediatorInputConnector_3127);
			KNOWN_ELEMENT_TYPES.add(RuleMediatorOutputConnector_3128);
			KNOWN_ELEMENT_TYPES.add(OAuthMediator_3524);
			KNOWN_ELEMENT_TYPES.add(OAuthMediatorInputConnector_3130);
			KNOWN_ELEMENT_TYPES.add(OAuthMediatorOutputConnector_3131);
			KNOWN_ELEMENT_TYPES.add(AggregateMediator_3525);
			KNOWN_ELEMENT_TYPES.add(AggregateMediatorInputConnector_3112);
			KNOWN_ELEMENT_TYPES.add(AggregateMediatorOutputConnector_3113);
			KNOWN_ELEMENT_TYPES
					.add(AggregateMediatorOnCompleteOutputConnector_3132);
			KNOWN_ELEMENT_TYPES.add(MediatorFlow_3526);
			KNOWN_ELEMENT_TYPES.add(SwitchDefaultContainer_3527);
			KNOWN_ELEMENT_TYPES.add(MediatorFlow_3528);
			KNOWN_ELEMENT_TYPES.add(ProxyServiceOutSequence_3198);
			KNOWN_ELEMENT_TYPES.add(MediatorFlow_3529);
			KNOWN_ELEMENT_TYPES.add(ProxyServiceEndpointContainer_3392);
			KNOWN_ELEMENT_TYPES.add(DefaultEndPoint_3382);
			KNOWN_ELEMENT_TYPES.add(DefaultEndPointInputConnector_3021);
			KNOWN_ELEMENT_TYPES.add(DefaultEndPointOutputConnector_3022);
			KNOWN_ELEMENT_TYPES.add(AddressEndPoint_3383);
			KNOWN_ELEMENT_TYPES.add(AddressEndPointInputConnector_3030);
			KNOWN_ELEMENT_TYPES.add(AddressEndPointOutputConnector_3031);
			KNOWN_ELEMENT_TYPES.add(FailoverEndPoint_3384);
			KNOWN_ELEMENT_TYPES.add(FailoverEndPointInputConnector_3088);
			KNOWN_ELEMENT_TYPES.add(FailoverEndPointOutputConnector_3090);
			KNOWN_ELEMENT_TYPES.add(FailoverEndPointWestOutputConnector_3097);
			KNOWN_ELEMENT_TYPES.add(WSDLEndPoint_3385);
			KNOWN_ELEMENT_TYPES.add(WSDLEndPointInputConnector_3092);
			KNOWN_ELEMENT_TYPES.add(WSDLEndPointOutputConnector_3093);
			KNOWN_ELEMENT_TYPES.add(LoadBalanceEndPoint_3386);
			KNOWN_ELEMENT_TYPES.add(LoadBalanceEndPointInputConnector_3095);
			KNOWN_ELEMENT_TYPES.add(LoadBalanceEndPointOutputConnector_3096);
			KNOWN_ELEMENT_TYPES
					.add(LoadBalanceEndPointWestOutputConnector_3098);
			KNOWN_ELEMENT_TYPES.add(ProxyServiceFaultContainer_3488);
			KNOWN_ELEMENT_TYPES.add(MediatorFlow_3530);
			KNOWN_ELEMENT_TYPES.add(MessageMediator_3045);
			KNOWN_ELEMENT_TYPES.add(MessageInputConnector_3046);
			KNOWN_ELEMENT_TYPES.add(MessageOutputConnector_3047);
			KNOWN_ELEMENT_TYPES.add(MergeNode_3013);
			KNOWN_ELEMENT_TYPES.add(MergeNodeFirstInputConnector_3014);
			KNOWN_ELEMENT_TYPES.add(MergeNodeSecondInputConnector_3015);
			KNOWN_ELEMENT_TYPES.add(MergeNodeOutputConnector_3016);
			KNOWN_ELEMENT_TYPES.add(EsbLink_4001);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case EsbDiagramEditPart.VISUAL_ID:
			return EsbDiagram_1000;
		case EsbServerEditPart.VISUAL_ID:
			return EsbServer_2001;
		case ProxyServiceEditPart.VISUAL_ID:
			return ProxyService_3001;
		case ProxyOutputConnectorEditPart.VISUAL_ID:
			return ProxyOutputConnector_3002;
		case ProxyInputConnectorEditPart.VISUAL_ID:
			return ProxyInputConnector_3003;
		case ProxyFaultInputConnectorEditPart.VISUAL_ID:
			return ProxyFaultInputConnector_3489;
		case ProxyServiceContainerEditPart.VISUAL_ID:
			return ProxyServiceContainer_3486;
		case ProxyServiceSequenceAndEndpointContainerEditPart.VISUAL_ID:
			return ProxyServiceSequenceAndEndpointContainer_3487;
		case ProxyServiceSequenceContainerEditPart.VISUAL_ID:
			return ProxyServiceSequenceContainer_3391;
		case ProxyServiceInSequenceEditPart.VISUAL_ID:
			return ProxyServiceInSequence_3197;
		case MediatorFlowEditPart.VISUAL_ID:
			return MediatorFlow_3490;
		case DropMediatorEditPart.VISUAL_ID:
			return DropMediator_3491;
		case DropMediatorInputConnectorEditPart.VISUAL_ID:
			return DropMediatorInputConnector_3008;
		case PropertyMediatorEditPart.VISUAL_ID:
			return PropertyMediator_3492;
		case PropertyMediatorInputConnectorEditPart.VISUAL_ID:
			return PropertyMediatorInputConnector_3033;
		case PropertyMediatorOutputConnectorEditPart.VISUAL_ID:
			return PropertyMediatorOutputConnector_3034;
		case ThrottleMediatorEditPart.VISUAL_ID:
			return ThrottleMediator_3493;
		case ThrottleMediatorInputConnectorEditPart.VISUAL_ID:
			return ThrottleMediatorInputConnector_3121;
		case ThrottleMediatorOutputConnectorEditPart.VISUAL_ID:
			return ThrottleMediatorOutputConnector_3122;
		case FilterMediatorEditPart.VISUAL_ID:
			return FilterMediator_3494;
		case FilterMediatorInputConnectorEditPart.VISUAL_ID:
			return FilterMediatorInputConnector_3010;
		case FilterMediatorPassOutputConnectorEditPart.VISUAL_ID:
			return FilterMediatorPassOutputConnector_3011;
		case FilterMediatorFailOutputConnectorEditPart.VISUAL_ID:
			return FilterMediatorFailOutputConnector_3012;
		case LogMediatorEditPart.VISUAL_ID:
			return LogMediator_3495;
		case LogMediatorInputConnectorEditPart.VISUAL_ID:
			return LogMediatorInputConnector_3018;
		case LogMediatorOutputConnectorEditPart.VISUAL_ID:
			return LogMediatorOutputConnector_3019;
		case EnrichMediatorEditPart.VISUAL_ID:
			return EnrichMediator_3496;
		case EnrichMediatorInputConnectorEditPart.VISUAL_ID:
			return EnrichMediatorInputConnector_3036;
		case EnrichMediatorOutputConnectorEditPart.VISUAL_ID:
			return EnrichMediatorOutputConnector_3037;
		case XSLTMediatorEditPart.VISUAL_ID:
			return XSLTMediator_3497;
		case XSLTMediatorInputConnectorEditPart.VISUAL_ID:
			return XSLTMediatorInputConnector_3039;
		case XSLTMediatorOutputConnectorEditPart.VISUAL_ID:
			return XSLTMediatorOutputConnector_3040;
		case SwitchMediatorEditPart.VISUAL_ID:
			return SwitchMediator_3498;
		case SwitchMediatorInputConnectorEditPart.VISUAL_ID:
			return SwitchMediatorInputConnector_3042;
		case SwitchCaseBranchOutputConnectorEditPart.VISUAL_ID:
			return SwitchCaseBranchOutputConnector_3043;
		case SwitchDefaultBranchOutputConnectorEditPart.VISUAL_ID:
			return SwitchDefaultBranchOutputConnector_3044;
		case SwitchMediatorOutputConnectorEditPart.VISUAL_ID:
			return SwitchMediatorOutputConnector_3499;
		case SwitchMediatorContainerEditPart.VISUAL_ID:
			return SwitchMediatorContainer_3500;
		case SwitchCaseContainerEditPart.VISUAL_ID:
			return SwitchCaseContainer_3501;
		case MediatorFlow2EditPart.VISUAL_ID:
			return MediatorFlow_3502;
		case SequenceEditPart.VISUAL_ID:
			return Sequence_3503;
		case SequenceInputConnectorEditPart.VISUAL_ID:
			return SequenceInputConnector_3049;
		case SequenceOutputConnectorEditPart.VISUAL_ID:
			return SequenceOutputConnector_3050;
		case EventMediatorEditPart.VISUAL_ID:
			return EventMediator_3504;
		case EventMediatorInputConnectorEditPart.VISUAL_ID:
			return EventMediatorInputConnector_3052;
		case EventMediatorOutputConnectorEditPart.VISUAL_ID:
			return EventMediatorOutputConnector_3053;
		case EntitlementMediatorEditPart.VISUAL_ID:
			return EntitlementMediator_3505;
		case EntitlementMediatorInputConnectorEditPart.VISUAL_ID:
			return EntitlementMediatorInputConnector_3055;
		case EntitlementMediatorOutputConnectorEditPart.VISUAL_ID:
			return EntitlementMediatorOutputConnector_3056;
		case ClassMediatorEditPart.VISUAL_ID:
			return ClassMediator_3506;
		case ClassMediatorInputConnectorEditPart.VISUAL_ID:
			return ClassMediatorInputConnector_3058;
		case ClassMediatorOutputConnectorEditPart.VISUAL_ID:
			return ClassMediatorOutputConnector_3059;
		case SpringMediatorEditPart.VISUAL_ID:
			return SpringMediator_3507;
		case SpringMediatorInputConnectorEditPart.VISUAL_ID:
			return SpringMediatorInputConnector_3061;
		case SpringMediatorOutputConnectorEditPart.VISUAL_ID:
			return SpringMediatorOutputConnector_3062;
		case ScriptMediatorEditPart.VISUAL_ID:
			return ScriptMediator_3508;
		case ScriptMediatorInputConnectorEditPart.VISUAL_ID:
			return ScriptMediatorInputConnector_3064;
		case ScriptMediatorOutputConnectorEditPart.VISUAL_ID:
			return ScriptMediatorOutputConnector_3065;
		case FaultMediatorEditPart.VISUAL_ID:
			return FaultMediator_3509;
		case FaultMediatorInputConnectorEditPart.VISUAL_ID:
			return FaultMediatorInputConnector_3067;
		case FaultMediatorOutputConnectorEditPart.VISUAL_ID:
			return FaultMediatorOutputConnector_3068;
		case XQueryMediatorEditPart.VISUAL_ID:
			return XQueryMediator_3510;
		case XQueryMediatorInputConnectorEditPart.VISUAL_ID:
			return XQueryMediatorInputConnector_3070;
		case XQueryMediatorOutputConnectorEditPart.VISUAL_ID:
			return XQueryMediatorOutputConnector_3071;
		case CommandMediatorEditPart.VISUAL_ID:
			return CommandMediator_3511;
		case CommandMediatorInputConnectorEditPart.VISUAL_ID:
			return CommandMediatorInputConnector_3073;
		case CommandMediatorOutputConnectorEditPart.VISUAL_ID:
			return CommandMediatorOutputConnector_3074;
		case DBLookupMediatorEditPart.VISUAL_ID:
			return DBLookupMediator_3512;
		case DBLookupMediatorInputConnectorEditPart.VISUAL_ID:
			return DBLookupMediatorInputConnector_3076;
		case DBLookupMediatorOutputConnectorEditPart.VISUAL_ID:
			return DBLookupMediatorOutputConnector_3077;
		case DBReportMediatorEditPart.VISUAL_ID:
			return DBReportMediator_3513;
		case DBReportMediatorInputConnectorEditPart.VISUAL_ID:
			return DBReportMediatorInputConnector_3079;
		case DBReportMediatorOutputConnectorEditPart.VISUAL_ID:
			return DBReportMediatorOutputConnector_3080;
		case SmooksMediatorEditPart.VISUAL_ID:
			return SmooksMediator_3514;
		case SmooksMediatorInputConnectorEditPart.VISUAL_ID:
			return SmooksMediatorInputConnector_3082;
		case SmooksMediatorOutputConnectorEditPart.VISUAL_ID:
			return SmooksMediatorOutputConnector_3083;
		case SendMediatorEditPart.VISUAL_ID:
			return SendMediator_3515;
		case SendMediatorInputConnectorEditPart.VISUAL_ID:
			return SendMediatorInputConnector_3085;
		case SendMediatorOutputConnectorEditPart.VISUAL_ID:
			return SendMediatorOutputConnector_3086;
		case HeaderMediatorEditPart.VISUAL_ID:
			return HeaderMediator_3516;
		case HeaderMediatorInputConnectorEditPart.VISUAL_ID:
			return HeaderMediatorInputConnector_3100;
		case HeaderMediatorOutputConnectorEditPart.VISUAL_ID:
			return HeaderMediatorOutputConnector_3101;
		case CloneMediatorEditPart.VISUAL_ID:
			return CloneMediator_3517;
		case CloneMediatorInputConnectorEditPart.VISUAL_ID:
			return CloneMediatorInputConnector_3103;
		case CloneMediatorOutputConnectorEditPart.VISUAL_ID:
			return CloneMediatorOutputConnector_3104;
		case CloneMediatorTargetOutputConnectorEditPart.VISUAL_ID:
			return CloneMediatorTargetOutputConnector_3133;
		case CacheMediatorEditPart.VISUAL_ID:
			return CacheMediator_3518;
		case CacheMediatorInputConnectorEditPart.VISUAL_ID:
			return CacheMediatorInputConnector_3106;
		case CacheMediatorOutputConnectorEditPart.VISUAL_ID:
			return CacheMediatorOutputConnector_3107;
		case IterateMediatorEditPart.VISUAL_ID:
			return IterateMediator_3519;
		case IterateMediatorInputConnectorEditPart.VISUAL_ID:
			return IterateMediatorInputConnector_3109;
		case IterateMediatorOutputConnectorEditPart.VISUAL_ID:
			return IterateMediatorOutputConnector_3110;
		case CalloutMediatorEditPart.VISUAL_ID:
			return CalloutMediator_3520;
		case CalloutMediatorInputConnectorEditPart.VISUAL_ID:
			return CalloutMediatorInputConnector_3115;
		case CalloutMediatorOutputConnectorEditPart.VISUAL_ID:
			return CalloutMediatorOutputConnector_3116;
		case TransactionMediatorEditPart.VISUAL_ID:
			return TransactionMediator_3521;
		case TransactionMediatorInputConnectorEditPart.VISUAL_ID:
			return TransactionMediatorInputConnector_3118;
		case TransactionMediatorOutputConnectorEditPart.VISUAL_ID:
			return TransactionMediatorOutputConnector_3119;
		case RMSequenceMediatorEditPart.VISUAL_ID:
			return RMSequenceMediator_3522;
		case RMSequenceMediatorInputConnectorEditPart.VISUAL_ID:
			return RMSequenceMediatorInputConnector_3124;
		case RMSequenceMediatorOutputConnectorEditPart.VISUAL_ID:
			return RMSequenceMediatorOutputConnector_3125;
		case RuleMediatorEditPart.VISUAL_ID:
			return RuleMediator_3523;
		case RuleMediatorInputConnectorEditPart.VISUAL_ID:
			return RuleMediatorInputConnector_3127;
		case RuleMediatorOutputConnectorEditPart.VISUAL_ID:
			return RuleMediatorOutputConnector_3128;
		case OAuthMediatorEditPart.VISUAL_ID:
			return OAuthMediator_3524;
		case OAuthMediatorInputConnectorEditPart.VISUAL_ID:
			return OAuthMediatorInputConnector_3130;
		case OAuthMediatorOutputConnectorEditPart.VISUAL_ID:
			return OAuthMediatorOutputConnector_3131;
		case AggregateMediatorEditPart.VISUAL_ID:
			return AggregateMediator_3525;
		case AggregateMediatorInputConnectorEditPart.VISUAL_ID:
			return AggregateMediatorInputConnector_3112;
		case AggregateMediatorOutputConnectorEditPart.VISUAL_ID:
			return AggregateMediatorOutputConnector_3113;
		case AggregateMediatorOnCompleteOutputConnectorEditPart.VISUAL_ID:
			return AggregateMediatorOnCompleteOutputConnector_3132;
		case MediatorFlow3EditPart.VISUAL_ID:
			return MediatorFlow_3526;
		case SwitchDefaultContainerEditPart.VISUAL_ID:
			return SwitchDefaultContainer_3527;
		case MediatorFlow4EditPart.VISUAL_ID:
			return MediatorFlow_3528;
		case ProxyServiceOutSequenceEditPart.VISUAL_ID:
			return ProxyServiceOutSequence_3198;
		case MediatorFlow5EditPart.VISUAL_ID:
			return MediatorFlow_3529;
		case ProxyServiceEndpointContainerEditPart.VISUAL_ID:
			return ProxyServiceEndpointContainer_3392;
		case DefaultEndPoint2EditPart.VISUAL_ID:
			return DefaultEndPoint_3382;
		case DefaultEndPointInputConnectorEditPart.VISUAL_ID:
			return DefaultEndPointInputConnector_3021;
		case DefaultEndPointOutputConnectorEditPart.VISUAL_ID:
			return DefaultEndPointOutputConnector_3022;
		case AddressEndPoint2EditPart.VISUAL_ID:
			return AddressEndPoint_3383;
		case AddressEndPointInputConnectorEditPart.VISUAL_ID:
			return AddressEndPointInputConnector_3030;
		case AddressEndPointOutputConnectorEditPart.VISUAL_ID:
			return AddressEndPointOutputConnector_3031;
		case FailoverEndPoint2EditPart.VISUAL_ID:
			return FailoverEndPoint_3384;
		case FailoverEndPointInputConnectorEditPart.VISUAL_ID:
			return FailoverEndPointInputConnector_3088;
		case FailoverEndPointOutputConnectorEditPart.VISUAL_ID:
			return FailoverEndPointOutputConnector_3090;
		case FailoverEndPointWestOutputConnectorEditPart.VISUAL_ID:
			return FailoverEndPointWestOutputConnector_3097;
		case WSDLEndPoint2EditPart.VISUAL_ID:
			return WSDLEndPoint_3385;
		case WSDLEndPointInputConnectorEditPart.VISUAL_ID:
			return WSDLEndPointInputConnector_3092;
		case WSDLEndPointOutputConnectorEditPart.VISUAL_ID:
			return WSDLEndPointOutputConnector_3093;
		case LoadBalanceEndPoint2EditPart.VISUAL_ID:
			return LoadBalanceEndPoint_3386;
		case LoadBalanceEndPointInputConnectorEditPart.VISUAL_ID:
			return LoadBalanceEndPointInputConnector_3095;
		case LoadBalanceEndPointOutputConnectorEditPart.VISUAL_ID:
			return LoadBalanceEndPointOutputConnector_3096;
		case LoadBalanceEndPointWestOutputConnectorEditPart.VISUAL_ID:
			return LoadBalanceEndPointWestOutputConnector_3098;
		case ProxyServiceFaultContainerEditPart.VISUAL_ID:
			return ProxyServiceFaultContainer_3488;
		case MediatorFlow6EditPart.VISUAL_ID:
			return MediatorFlow_3530;
		case MessageMediatorEditPart.VISUAL_ID:
			return MessageMediator_3045;
		case MessageInputConnectorEditPart.VISUAL_ID:
			return MessageInputConnector_3046;
		case MessageOutputConnectorEditPart.VISUAL_ID:
			return MessageOutputConnector_3047;
		case MergeNodeEditPart.VISUAL_ID:
			return MergeNode_3013;
		case MergeNodeFirstInputConnectorEditPart.VISUAL_ID:
			return MergeNodeFirstInputConnector_3014;
		case MergeNodeSecondInputConnectorEditPart.VISUAL_ID:
			return MergeNodeSecondInputConnector_3015;
		case MergeNodeOutputConnectorEditPart.VISUAL_ID:
			return MergeNodeOutputConnector_3016;
		case EsbLinkEditPart.VISUAL_ID:
			return EsbLink_4001;
		}
		return null;
	}

}
