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
	public static final IElementType DropMediator_3191 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.DropMediator_3191"); //$NON-NLS-1$

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
	public static final IElementType PropertyMediator_3199 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.PropertyMediator_3199"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType ProxyServiceOutSequence_3198 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.ProxyServiceOutSequence_3198"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType DropMediator_3194 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.DropMediator_3194"); //$NON-NLS-1$

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
	public static final IElementType LogMediator_3210 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.LogMediator_3210"); //$NON-NLS-1$

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
	public static final IElementType EnrichMediator_3387 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.EnrichMediator_3387"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType PropertyMediatorInputConnector_3201 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.PropertyMediatorInputConnector_3201"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType PropertyMediatorOutputConnector_3202 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.PropertyMediatorOutputConnector_3202"); //$NON-NLS-1$

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
	public static final IElementType ThrottleMediator_3205 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.ThrottleMediator_3205"); //$NON-NLS-1$

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
	public static final IElementType XSLTMediator_3212 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.XSLTMediator_3212"); //$NON-NLS-1$

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
	public static final IElementType SwitchMediator_3213 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.SwitchMediator_3213"); //$NON-NLS-1$

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
	public static final IElementType Sequence_3214 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.Sequence_3214"); //$NON-NLS-1$

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
	public static final IElementType EventMediator_3215 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.EventMediator_3215"); //$NON-NLS-1$

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
	public static final IElementType EntitlementMediator_3216 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.EntitlementMediator_3216"); //$NON-NLS-1$

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
	public static final IElementType ClassMediator_3217 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.ClassMediator_3217"); //$NON-NLS-1$

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
	public static final IElementType SpringMediator_3218 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.SpringMediator_3218"); //$NON-NLS-1$

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
	public static final IElementType ScriptMediator_3219 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.ScriptMediator_3219"); //$NON-NLS-1$

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
	public static final IElementType FaultMediator_3220 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.FaultMediator_3220"); //$NON-NLS-1$

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
	public static final IElementType XQueryMediator_3221 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.XQueryMediator_3221"); //$NON-NLS-1$

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
	public static final IElementType CommandMediator_3222 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.CommandMediator_3222"); //$NON-NLS-1$

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
	public static final IElementType DBLookupMediator_3223 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.DBLookupMediator_3223"); //$NON-NLS-1$

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
	public static final IElementType DBReportMediator_3224 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.DBReportMediator_3224"); //$NON-NLS-1$

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
	public static final IElementType SmooksMediator_3225 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.SmooksMediator_3225"); //$NON-NLS-1$

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
	public static final IElementType SendMediator_3226 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.SendMediator_3226"); //$NON-NLS-1$

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
	public static final IElementType HeaderMediator_3227 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.HeaderMediator_3227"); //$NON-NLS-1$

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
	public static final IElementType DropMediator_3394 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.DropMediator_3394"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType DropMediatorInputConnector_3395 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.DropMediatorInputConnector_3395"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType PropertyMediator_3396 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.PropertyMediator_3396"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType PropertyMediatorInputConnector_3397 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.PropertyMediatorInputConnector_3397"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType PropertyMediatorOutputConnector_3398 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.PropertyMediatorOutputConnector_3398"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType ThrottleMediator_3399 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.ThrottleMediator_3399"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType ThrottleMediatorInputConnector_3400 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.ThrottleMediatorInputConnector_3400"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType ThrottleMediatorOutputConnector_3401 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.ThrottleMediatorOutputConnector_3401"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType FilterMediator_3402 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.FilterMediator_3402"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType FilterMediatorInputConnector_3403 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.FilterMediatorInputConnector_3403"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType FilterMediatorPassOutputConnector_3404 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.FilterMediatorPassOutputConnector_3404"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType FilterMediatorFailOutputConnector_3405 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.FilterMediatorFailOutputConnector_3405"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType LogMediator_3406 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.LogMediator_3406"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType LogMediatorInputConnector_3407 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.LogMediatorInputConnector_3407"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType LogMediatorOutputConnector_3408 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.LogMediatorOutputConnector_3408"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType EnrichMediator_3409 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.EnrichMediator_3409"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType EnrichMediatorInputConnector_3410 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.EnrichMediatorInputConnector_3410"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType EnrichMediatorOutputConnector_3411 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.EnrichMediatorOutputConnector_3411"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType XSLTMediator_3412 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.XSLTMediator_3412"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType XSLTMediatorInputConnector_3413 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.XSLTMediatorInputConnector_3413"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType XSLTMediatorOutputConnector_3414 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.XSLTMediatorOutputConnector_3414"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType SwitchMediator_3415 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.SwitchMediator_3415"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType SwitchMediatorInputConnector_3416 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.SwitchMediatorInputConnector_3416"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType SwitchCaseBranchOutputConnector_3417 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.SwitchCaseBranchOutputConnector_3417"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType SwitchDefaultBranchOutputConnector_3418 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.SwitchDefaultBranchOutputConnector_3418"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Sequence_3419 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.Sequence_3419"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType SequenceInputConnector_3420 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.SequenceInputConnector_3420"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType SequenceOutputConnector_3421 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.SequenceOutputConnector_3421"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType EventMediator_3422 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.EventMediator_3422"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType EventMediatorInputConnector_3423 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.EventMediatorInputConnector_3423"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType EventMediatorOutputConnector_3424 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.EventMediatorOutputConnector_3424"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType EntitlementMediator_3425 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.EntitlementMediator_3425"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType EntitlementMediatorInputConnector_3426 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.EntitlementMediatorInputConnector_3426"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType EntitlementMediatorOutputConnector_3427 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.EntitlementMediatorOutputConnector_3427"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType ClassMediator_3428 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.ClassMediator_3428"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType ClassMediatorInputConnector_3429 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.ClassMediatorInputConnector_3429"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType ClassMediatorOutputConnector_3430 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.ClassMediatorOutputConnector_3430"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType SpringMediator_3431 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.SpringMediator_3431"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType SpringMediatorInputConnector_3432 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.SpringMediatorInputConnector_3432"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType SpringMediatorOutputConnector_3433 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.SpringMediatorOutputConnector_3433"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType ScriptMediator_3434 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.ScriptMediator_3434"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType ScriptMediatorInputConnector_3435 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.ScriptMediatorInputConnector_3435"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType ScriptMediatorOutputConnector_3436 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.ScriptMediatorOutputConnector_3436"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType FaultMediator_3437 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.FaultMediator_3437"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType FaultMediatorInputConnector_3438 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.FaultMediatorInputConnector_3438"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType FaultMediatorOutputConnector_3439 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.FaultMediatorOutputConnector_3439"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType XQueryMediator_3440 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.XQueryMediator_3440"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType XQueryMediatorInputConnector_3441 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.XQueryMediatorInputConnector_3441"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType XQueryMediatorOutputConnector_3442 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.XQueryMediatorOutputConnector_3442"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType CommandMediator_3443 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.CommandMediator_3443"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType CommandMediatorInputConnector_3444 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.CommandMediatorInputConnector_3444"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType CommandMediatorOutputConnector_3445 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.CommandMediatorOutputConnector_3445"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType DBLookupMediator_3446 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.DBLookupMediator_3446"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType DBLookupMediatorInputConnector_3447 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.DBLookupMediatorInputConnector_3447"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType DBLookupMediatorOutputConnector_3448 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.DBLookupMediatorOutputConnector_3448"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType DBReportMediator_3449 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.DBReportMediator_3449"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType DBReportMediatorInputConnector_3450 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.DBReportMediatorInputConnector_3450"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType DBReportMediatorOutputConnector_3451 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.DBReportMediatorOutputConnector_3451"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType SmooksMediator_3452 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.SmooksMediator_3452"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType SmooksMediatorInputConnector_3453 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.SmooksMediatorInputConnector_3453"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType SmooksMediatorOutputConnector_3454 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.SmooksMediatorOutputConnector_3454"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType SendMediator_3455 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.SendMediator_3455"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType SendMediatorInputConnector_3456 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.SendMediatorInputConnector_3456"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType SendMediatorOutputConnector_3457 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.SendMediatorOutputConnector_3457"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType HeaderMediator_3458 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.HeaderMediator_3458"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType HeaderMediatorInputConnector_3459 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.HeaderMediatorInputConnector_3459"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType HeaderMediatorOutputConnector_3460 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.HeaderMediatorOutputConnector_3460"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType CloneMediator_3461 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.CloneMediator_3461"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType CloneMediatorInputConnector_3462 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.CloneMediatorInputConnector_3462"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType CloneMediatorOutputConnector_3463 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.CloneMediatorOutputConnector_3463"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType CloneMediatorTargetOutputConnector_3464 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.CloneMediatorTargetOutputConnector_3464"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType CacheMediator_3465 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.CacheMediator_3465"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType CacheMediatorInputConnector_3466 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.CacheMediatorInputConnector_3466"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType CacheMediatorOutputConnector_3467 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.CacheMediatorOutputConnector_3467"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType IterateMediator_3468 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.IterateMediator_3468"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType IterateMediatorInputConnector_3469 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.IterateMediatorInputConnector_3469"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType IterateMediatorOutputConnector_3470 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.IterateMediatorOutputConnector_3470"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType CalloutMediator_3471 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.CalloutMediator_3471"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType CalloutMediatorInputConnector_3472 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.CalloutMediatorInputConnector_3472"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType CalloutMediatorOutputConnector_3473 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.CalloutMediatorOutputConnector_3473"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType TransactionMediator_3474 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.TransactionMediator_3474"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType TransactionMediatorInputConnector_3475 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.TransactionMediatorInputConnector_3475"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType TransactionMediatorOutputConnector_3476 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.TransactionMediatorOutputConnector_3476"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType RMSequenceMediator_3477 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.RMSequenceMediator_3477"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType RMSequenceMediatorInputConnector_3478 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.RMSequenceMediatorInputConnector_3478"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType RMSequenceMediatorOutputConnector_3479 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.RMSequenceMediatorOutputConnector_3479"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType RuleMediator_3480 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.RuleMediator_3480"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType RuleMediatorInputConnector_3481 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.RuleMediatorInputConnector_3481"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType RuleMediatorOutputConnector_3482 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.RuleMediatorOutputConnector_3482"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType OAuthMediator_3483 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.OAuthMediator_3483"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType OAuthMediatorInputConnector_3484 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.OAuthMediatorInputConnector_3484"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType OAuthMediatorOutputConnector_3485 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.OAuthMediatorOutputConnector_3485"); //$NON-NLS-1$

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
	public static final IElementType CloneMediator_3228 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.CloneMediator_3228"); //$NON-NLS-1$

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
	public static final IElementType CacheMediator_3229 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.CacheMediator_3229"); //$NON-NLS-1$

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
	public static final IElementType IterateMediator_3230 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.IterateMediator_3230"); //$NON-NLS-1$

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
	public static final IElementType CalloutMediator_3231 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.CalloutMediator_3231"); //$NON-NLS-1$

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
	public static final IElementType LogMediator_3134 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.LogMediator_3134"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType LogMediatorInputConnector_3135 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.LogMediatorInputConnector_3135"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType LogMediatorOutputConnector_3136 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.LogMediatorOutputConnector_3136"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType DropMediator_3137 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.DropMediator_3137"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType DropMediatorInputConnector_3195 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.DropMediatorInputConnector_3195"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType FilterMediator_3329 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.FilterMediator_3329"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType FilterMediatorInputConnector_3330 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.FilterMediatorInputConnector_3330"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType FilterMediatorPassOutputConnector_3331 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.FilterMediatorPassOutputConnector_3331"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType FilterMediatorFailOutputConnector_3332 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.FilterMediatorFailOutputConnector_3332"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType PropertyMediator_3333 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.PropertyMediator_3333"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType DropMediatorInputConnector_3192 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.DropMediatorInputConnector_3192"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType DropMediatorInputConnector_3138 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.DropMediatorInputConnector_3138"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType PropertyMediator_3200 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.PropertyMediator_3200"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType FilterMediator_3139 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.FilterMediator_3139"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType FilterMediatorInputConnector_3140 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.FilterMediatorInputConnector_3140"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType FilterMediatorPassOutputConnector_3141 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.FilterMediatorPassOutputConnector_3141"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType FilterMediatorFailOutputConnector_3142 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.FilterMediatorFailOutputConnector_3142"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType PropertyMediator_3143 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.PropertyMediator_3143"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType PropertyMediatorInputConnector_3203 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.PropertyMediatorInputConnector_3203"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType PropertyMediatorOutputConnector_3204 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.PropertyMediatorOutputConnector_3204"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType EnrichMediator_3334 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.EnrichMediator_3334"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType EnrichMediatorInputConnector_3388 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.EnrichMediatorInputConnector_3388"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType EnrichMediatorOutputConnector_3389 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.EnrichMediatorOutputConnector_3389"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType XSLTMediator_3337 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.XSLTMediator_3337"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType XSLTMediatorInputConnector_3338 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.XSLTMediatorInputConnector_3338"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType XSLTMediatorOutputConnector_3339 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.XSLTMediatorOutputConnector_3339"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType SwitchMediator_3340 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.SwitchMediator_3340"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType SwitchMediatorInputConnector_3341 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.SwitchMediatorInputConnector_3341"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType SwitchCaseBranchOutputConnector_3342 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.SwitchCaseBranchOutputConnector_3342"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType SwitchDefaultBranchOutputConnector_3343 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.SwitchDefaultBranchOutputConnector_3343"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType FaultMediator_3344 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.FaultMediator_3344"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType FaultMediatorInputConnector_3345 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.FaultMediatorInputConnector_3345"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType FaultMediatorOutputConnector_3346 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.FaultMediatorOutputConnector_3346"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType DBLookupMediator_3347 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.DBLookupMediator_3347"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType DBLookupMediatorInputConnector_3348 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.DBLookupMediatorInputConnector_3348"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType DBLookupMediatorOutputConnector_3349 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.DBLookupMediatorOutputConnector_3349"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType DBReportMediator_3350 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.DBReportMediator_3350"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType DBReportMediatorInputConnector_3351 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.DBReportMediatorInputConnector_3351"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType DBReportMediatorOutputConnector_3352 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.DBReportMediatorOutputConnector_3352"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType SendMediator_3353 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.SendMediator_3353"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType SendMediatorInputConnector_3354 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.SendMediatorInputConnector_3354"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType SendMediatorOutputConnector_3355 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.SendMediatorOutputConnector_3355"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType HeaderMediator_3356 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.HeaderMediator_3356"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType HeaderMediatorInputConnector_3357 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.HeaderMediatorInputConnector_3357"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType HeaderMediatorOutputConnector_3358 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.HeaderMediatorOutputConnector_3358"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType CloneMediator_3359 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.CloneMediator_3359"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType CloneMediatorInputConnector_3360 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.CloneMediatorInputConnector_3360"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType CloneMediatorOutputConnector_3361 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.CloneMediatorOutputConnector_3361"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType CloneMediatorTargetOutputConnector_3362 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.CloneMediatorTargetOutputConnector_3362"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType IterateMediator_3363 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.IterateMediator_3363"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType IterateMediatorInputConnector_3364 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.IterateMediatorInputConnector_3364"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType IterateMediatorOutputConnector_3365 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.IterateMediatorOutputConnector_3365"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType CalloutMediator_3366 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.CalloutMediator_3366"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType CalloutMediatorInputConnector_3367 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.CalloutMediatorInputConnector_3367"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType CalloutMediatorOutputConnector_3368 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.CalloutMediatorOutputConnector_3368"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType TransactionMediator_3369 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.TransactionMediator_3369"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType TransactionMediatorInputConnector_3370 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.TransactionMediatorInputConnector_3370"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType TransactionMediatorOutputConnector_3371 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.TransactionMediatorOutputConnector_3371"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType RMSequenceMediator_3372 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.RMSequenceMediator_3372"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType RMSequenceMediatorInputConnector_3373 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.RMSequenceMediatorInputConnector_3373"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType RMSequenceMediatorOutputConnector_3374 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.RMSequenceMediatorOutputConnector_3374"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Sequence_3375 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.Sequence_3375"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType SequenceInputConnector_3376 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.SequenceInputConnector_3376"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType SequenceOutputConnector_3377 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.SequenceOutputConnector_3377"); //$NON-NLS-1$

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
	public static final IElementType PropertyMediatorInputConnector_3144 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.PropertyMediatorInputConnector_3144"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType PropertyMediatorOutputConnector_3145 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.PropertyMediatorOutputConnector_3145"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType ThrottleMediator_3206 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.ThrottleMediator_3206"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType ThrottleMediatorInputConnector_3207 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.ThrottleMediatorInputConnector_3207"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType ThrottleMediatorOutputConnector_3208 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.ThrottleMediatorOutputConnector_3208"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType FilterMediator_3237 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.FilterMediator_3237"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType FilterMediatorInputConnector_3238 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.FilterMediatorInputConnector_3238"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType FilterMediatorPassOutputConnector_3239 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.FilterMediatorPassOutputConnector_3239"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType FilterMediatorFailOutputConnector_3240 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.FilterMediatorFailOutputConnector_3240"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType LogMediator_3241 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.LogMediator_3241"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType LogMediatorInputConnector_3242 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.LogMediatorInputConnector_3242"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType LogMediatorOutputConnector_3243 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.LogMediatorOutputConnector_3243"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType EnrichMediator_3244 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.EnrichMediator_3244"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType EnrichMediatorInputConnector_3245 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.EnrichMediatorInputConnector_3245"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType EnrichMediatorOutputConnector_3246 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.EnrichMediatorOutputConnector_3246"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType XSLTMediator_3247 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.XSLTMediator_3247"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType XSLTMediatorInputConnector_3248 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.XSLTMediatorInputConnector_3248"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType XSLTMediatorOutputConnector_3249 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.XSLTMediatorOutputConnector_3249"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType SwitchMediator_3250 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.SwitchMediator_3250"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType SwitchMediatorInputConnector_3251 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.SwitchMediatorInputConnector_3251"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType SwitchCaseBranchOutputConnector_3252 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.SwitchCaseBranchOutputConnector_3252"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType SwitchDefaultBranchOutputConnector_3253 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.SwitchDefaultBranchOutputConnector_3253"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Sequence_3254 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.Sequence_3254"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType SequenceInputConnector_3255 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.SequenceInputConnector_3255"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType SequenceOutputConnector_3256 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.SequenceOutputConnector_3256"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType EventMediator_3257 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.EventMediator_3257"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType EventMediatorInputConnector_3258 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.EventMediatorInputConnector_3258"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType EventMediatorOutputConnector_3259 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.EventMediatorOutputConnector_3259"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType EntitlementMediator_3260 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.EntitlementMediator_3260"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType EntitlementMediatorInputConnector_3261 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.EntitlementMediatorInputConnector_3261"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType EntitlementMediatorOutputConnector_3262 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.EntitlementMediatorOutputConnector_3262"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType ClassMediator_3263 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.ClassMediator_3263"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType ClassMediatorInputConnector_3264 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.ClassMediatorInputConnector_3264"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType ClassMediatorOutputConnector_3265 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.ClassMediatorOutputConnector_3265"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType SpringMediator_3266 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.SpringMediator_3266"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType SpringMediatorInputConnector_3267 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.SpringMediatorInputConnector_3267"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType SpringMediatorOutputConnector_3268 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.SpringMediatorOutputConnector_3268"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType ScriptMediator_3269 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.ScriptMediator_3269"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType ScriptMediatorInputConnector_3270 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.ScriptMediatorInputConnector_3270"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType ScriptMediatorOutputConnector_3271 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.ScriptMediatorOutputConnector_3271"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType FaultMediator_3272 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.FaultMediator_3272"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType FaultMediatorInputConnector_3273 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.FaultMediatorInputConnector_3273"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType FaultMediatorOutputConnector_3274 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.FaultMediatorOutputConnector_3274"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType XQueryMediator_3275 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.XQueryMediator_3275"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType XQueryMediatorInputConnector_3276 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.XQueryMediatorInputConnector_3276"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType XQueryMediatorOutputConnector_3277 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.XQueryMediatorOutputConnector_3277"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType CommandMediator_3278 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.CommandMediator_3278"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType CommandMediatorInputConnector_3279 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.CommandMediatorInputConnector_3279"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType CommandMediatorOutputConnector_3280 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.CommandMediatorOutputConnector_3280"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType DBLookupMediator_3281 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.DBLookupMediator_3281"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType DBLookupMediatorInputConnector_3282 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.DBLookupMediatorInputConnector_3282"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType DBLookupMediatorOutputConnector_3283 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.DBLookupMediatorOutputConnector_3283"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType DBReportMediator_3284 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.DBReportMediator_3284"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType DBReportMediatorInputConnector_3285 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.DBReportMediatorInputConnector_3285"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType DBReportMediatorOutputConnector_3286 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.DBReportMediatorOutputConnector_3286"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType SmooksMediator_3287 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.SmooksMediator_3287"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType SmooksMediatorInputConnector_3288 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.SmooksMediatorInputConnector_3288"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType SmooksMediatorOutputConnector_3289 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.SmooksMediatorOutputConnector_3289"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType SendMediator_3290 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.SendMediator_3290"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType SendMediatorInputConnector_3291 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.SendMediatorInputConnector_3291"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType SendMediatorOutputConnector_3292 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.SendMediatorOutputConnector_3292"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType HeaderMediator_3293 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.HeaderMediator_3293"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType HeaderMediatorInputConnector_3294 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.HeaderMediatorInputConnector_3294"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType HeaderMediatorOutputConnector_3295 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.HeaderMediatorOutputConnector_3295"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType CloneMediator_3296 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.CloneMediator_3296"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType CloneMediatorInputConnector_3297 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.CloneMediatorInputConnector_3297"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType CloneMediatorOutputConnector_3298 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.CloneMediatorOutputConnector_3298"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType CloneMediatorTargetOutputConnector_3299 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.CloneMediatorTargetOutputConnector_3299"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType CacheMediator_3300 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.CacheMediator_3300"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType CacheMediatorInputConnector_3301 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.CacheMediatorInputConnector_3301"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType CacheMediatorOutputConnector_3302 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.CacheMediatorOutputConnector_3302"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType IterateMediator_3303 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.IterateMediator_3303"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType IterateMediatorInputConnector_3304 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.IterateMediatorInputConnector_3304"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType IterateMediatorOutputConnector_3305 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.IterateMediatorOutputConnector_3305"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType CalloutMediator_3306 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.CalloutMediator_3306"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType CalloutMediatorInputConnector_3307 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.CalloutMediatorInputConnector_3307"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType CalloutMediatorOutputConnector_3308 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.CalloutMediatorOutputConnector_3308"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType TransactionMediator_3309 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.TransactionMediator_3309"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType TransactionMediatorInputConnector_3310 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.TransactionMediatorInputConnector_3310"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType TransactionMediatorOutputConnector_3311 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.TransactionMediatorOutputConnector_3311"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType RMSequenceMediator_3312 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.RMSequenceMediator_3312"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType RMSequenceMediatorInputConnector_3313 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.RMSequenceMediatorInputConnector_3313"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType RMSequenceMediatorOutputConnector_3314 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.RMSequenceMediatorOutputConnector_3314"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType RuleMediator_3315 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.RuleMediator_3315"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType RuleMediatorInputConnector_3316 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.RuleMediatorInputConnector_3316"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType RuleMediatorOutputConnector_3317 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.RuleMediatorOutputConnector_3317"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType OAuthMediator_3318 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.OAuthMediator_3318"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType OAuthMediatorInputConnector_3319 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.OAuthMediatorInputConnector_3319"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType OAuthMediatorOutputConnector_3320 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.OAuthMediatorOutputConnector_3320"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType AggregateMediator_3321 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.AggregateMediator_3321"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType AggregateMediatorInputConnector_3322 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.AggregateMediatorInputConnector_3322"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType AggregateMediatorOutputConnector_3323 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.AggregateMediatorOutputConnector_3323"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType AggregateMediatorOnCompleteOutputConnector_3324 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.AggregateMediatorOnCompleteOutputConnector_3324"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType LogMediator_3325 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.LogMediator_3325"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType LogMediatorInputConnector_3326 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.LogMediatorInputConnector_3326"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType LogMediatorOutputConnector_3327 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.LogMediatorOutputConnector_3327"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType DropMediator_3328 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.DropMediator_3328"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType EnrichMediator_3146 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.EnrichMediator_3146"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType EnrichMediatorInputConnector_3147 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.EnrichMediatorInputConnector_3147"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType EnrichMediatorOutputConnector_3148 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.EnrichMediatorOutputConnector_3148"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType XSLTMediator_3149 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.XSLTMediator_3149"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType XSLTMediatorInputConnector_3150 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.XSLTMediatorInputConnector_3150"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType XSLTMediatorOutputConnector_3151 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.XSLTMediatorOutputConnector_3151"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType SwitchMediator_3152 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.SwitchMediator_3152"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType SwitchMediatorInputConnector_3153 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.SwitchMediatorInputConnector_3153"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType SwitchCaseBranchOutputConnector_3154 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.SwitchCaseBranchOutputConnector_3154"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType SwitchDefaultBranchOutputConnector_3155 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.SwitchDefaultBranchOutputConnector_3155"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType FaultMediator_3156 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.FaultMediator_3156"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType FaultMediatorInputConnector_3157 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.FaultMediatorInputConnector_3157"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType FaultMediatorOutputConnector_3158 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.FaultMediatorOutputConnector_3158"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType DBLookupMediator_3159 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.DBLookupMediator_3159"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType DBLookupMediatorInputConnector_3160 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.DBLookupMediatorInputConnector_3160"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType DBLookupMediatorOutputConnector_3161 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.DBLookupMediatorOutputConnector_3161"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType DBReportMediator_3162 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.DBReportMediator_3162"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType DBReportMediatorInputConnector_3163 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.DBReportMediatorInputConnector_3163"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType DBReportMediatorOutputConnector_3164 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.DBReportMediatorOutputConnector_3164"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType SendMediator_3165 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.SendMediator_3165"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType SendMediatorInputConnector_3166 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.SendMediatorInputConnector_3166"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType SendMediatorOutputConnector_3167 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.SendMediatorOutputConnector_3167"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType HeaderMediator_3168 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.HeaderMediator_3168"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType HeaderMediatorInputConnector_3169 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.HeaderMediatorInputConnector_3169"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType HeaderMediatorOutputConnector_3170 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.HeaderMediatorOutputConnector_3170"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType CloneMediator_3171 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.CloneMediator_3171"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType CloneMediatorInputConnector_3172 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.CloneMediatorInputConnector_3172"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType CloneMediatorOutputConnector_3173 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.CloneMediatorOutputConnector_3173"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType CloneMediatorTargetOutputConnector_3174 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.CloneMediatorTargetOutputConnector_3174"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType IterateMediator_3175 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.IterateMediator_3175"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType IterateMediatorInputConnector_3176 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.IterateMediatorInputConnector_3176"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType IterateMediatorOutputConnector_3177 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.IterateMediatorOutputConnector_3177"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType CalloutMediator_3178 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.CalloutMediator_3178"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType CalloutMediatorInputConnector_3181 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.CalloutMediatorInputConnector_3181"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType CalloutMediatorOutputConnector_3182 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.CalloutMediatorOutputConnector_3182"); //$NON-NLS-1$

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
	public static final IElementType TransactionMediator_3232 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.TransactionMediator_3232"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType TransactionMediator_3179 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.TransactionMediator_3179"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType TransactionMediatorInputConnector_3183 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.TransactionMediatorInputConnector_3183"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType TransactionMediatorOutputConnector_3184 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.TransactionMediatorOutputConnector_3184"); //$NON-NLS-1$

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
	public static final IElementType RMSequenceMediator_3233 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.RMSequenceMediator_3233"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType RMSequenceMediator_3180 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.RMSequenceMediator_3180"); //$NON-NLS-1$

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
	public static final IElementType FilterMediator_3209 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.FilterMediator_3209"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType RMSequenceMediatorInputConnector_3185 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.RMSequenceMediatorInputConnector_3185"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType RMSequenceMediatorOutputConnector_3186 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.RMSequenceMediatorOutputConnector_3186"); //$NON-NLS-1$

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
	public static final IElementType RuleMediator_3234 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.RuleMediator_3234"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Sequence_3187 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.Sequence_3187"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType SequenceInputConnector_3188 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.SequenceInputConnector_3188"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType SequenceOutputConnector_3189 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.SequenceOutputConnector_3189"); //$NON-NLS-1$

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
	public static final IElementType OAuthMediator_3235 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.OAuthMediator_3235"); //$NON-NLS-1$

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
	public static final IElementType AggregateMediator_3236 = getElementType("org.wso2.developerstudio.eclipse.gmf.esb.diagram.AggregateMediator_3236"); //$NON-NLS-1$

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

			elements.put(DropMediator_3191,
					EsbPackage.eINSTANCE.getDropMediator());

			elements.put(DropMediatorInputConnector_3008,
					EsbPackage.eINSTANCE.getDropMediatorInputConnector());

			elements.put(PropertyMediator_3199,
					EsbPackage.eINSTANCE.getPropertyMediator());

			elements.put(PropertyMediatorInputConnector_3033,
					EsbPackage.eINSTANCE.getPropertyMediatorInputConnector());

			elements.put(PropertyMediatorOutputConnector_3034,
					EsbPackage.eINSTANCE.getPropertyMediatorOutputConnector());

			elements.put(ThrottleMediator_3205,
					EsbPackage.eINSTANCE.getThrottleMediator());

			elements.put(ThrottleMediatorInputConnector_3121,
					EsbPackage.eINSTANCE.getThrottleMediatorInputConnector());

			elements.put(ThrottleMediatorOutputConnector_3122,
					EsbPackage.eINSTANCE.getThrottleMediatorOutputConnector());

			elements.put(FilterMediator_3209,
					EsbPackage.eINSTANCE.getFilterMediator());

			elements.put(FilterMediatorInputConnector_3010,
					EsbPackage.eINSTANCE.getFilterMediatorInputConnector());

			elements.put(FilterMediatorPassOutputConnector_3011,
					EsbPackage.eINSTANCE.getFilterMediatorPassOutputConnector());

			elements.put(FilterMediatorFailOutputConnector_3012,
					EsbPackage.eINSTANCE.getFilterMediatorFailOutputConnector());

			elements.put(LogMediator_3210,
					EsbPackage.eINSTANCE.getLogMediator());

			elements.put(LogMediatorInputConnector_3018,
					EsbPackage.eINSTANCE.getLogMediatorInputConnector());

			elements.put(LogMediatorOutputConnector_3019,
					EsbPackage.eINSTANCE.getLogMediatorOutputConnector());

			elements.put(EnrichMediator_3387,
					EsbPackage.eINSTANCE.getEnrichMediator());

			elements.put(EnrichMediatorInputConnector_3036,
					EsbPackage.eINSTANCE.getEnrichMediatorInputConnector());

			elements.put(EnrichMediatorOutputConnector_3037,
					EsbPackage.eINSTANCE.getEnrichMediatorOutputConnector());

			elements.put(XSLTMediator_3212,
					EsbPackage.eINSTANCE.getXSLTMediator());

			elements.put(XSLTMediatorInputConnector_3039,
					EsbPackage.eINSTANCE.getXSLTMediatorInputConnector());

			elements.put(XSLTMediatorOutputConnector_3040,
					EsbPackage.eINSTANCE.getXSLTMediatorOutputConnector());

			elements.put(SwitchMediator_3213,
					EsbPackage.eINSTANCE.getSwitchMediator());

			elements.put(SwitchMediatorInputConnector_3042,
					EsbPackage.eINSTANCE.getSwitchMediatorInputConnector());

			elements.put(SwitchCaseBranchOutputConnector_3043,
					EsbPackage.eINSTANCE.getSwitchCaseBranchOutputConnector());

			elements.put(SwitchDefaultBranchOutputConnector_3044,
					EsbPackage.eINSTANCE
							.getSwitchDefaultBranchOutputConnector());

			elements.put(Sequence_3214, EsbPackage.eINSTANCE.getSequence());

			elements.put(SequenceInputConnector_3049,
					EsbPackage.eINSTANCE.getSequenceInputConnector());

			elements.put(SequenceOutputConnector_3050,
					EsbPackage.eINSTANCE.getSequenceOutputConnector());

			elements.put(EventMediator_3215,
					EsbPackage.eINSTANCE.getEventMediator());

			elements.put(EventMediatorInputConnector_3052,
					EsbPackage.eINSTANCE.getEventMediatorInputConnector());

			elements.put(EventMediatorOutputConnector_3053,
					EsbPackage.eINSTANCE.getEventMediatorOutputConnector());

			elements.put(EntitlementMediator_3216,
					EsbPackage.eINSTANCE.getEntitlementMediator());

			elements.put(EntitlementMediatorInputConnector_3055,
					EsbPackage.eINSTANCE.getEntitlementMediatorInputConnector());

			elements.put(EntitlementMediatorOutputConnector_3056,
					EsbPackage.eINSTANCE
							.getEntitlementMediatorOutputConnector());

			elements.put(ClassMediator_3217,
					EsbPackage.eINSTANCE.getClassMediator());

			elements.put(ClassMediatorInputConnector_3058,
					EsbPackage.eINSTANCE.getClassMediatorInputConnector());

			elements.put(ClassMediatorOutputConnector_3059,
					EsbPackage.eINSTANCE.getClassMediatorOutputConnector());

			elements.put(SpringMediator_3218,
					EsbPackage.eINSTANCE.getSpringMediator());

			elements.put(SpringMediatorInputConnector_3061,
					EsbPackage.eINSTANCE.getSpringMediatorInputConnector());

			elements.put(SpringMediatorOutputConnector_3062,
					EsbPackage.eINSTANCE.getSpringMediatorOutputConnector());

			elements.put(ScriptMediator_3219,
					EsbPackage.eINSTANCE.getScriptMediator());

			elements.put(ScriptMediatorInputConnector_3064,
					EsbPackage.eINSTANCE.getScriptMediatorInputConnector());

			elements.put(ScriptMediatorOutputConnector_3065,
					EsbPackage.eINSTANCE.getScriptMediatorOutputConnector());

			elements.put(FaultMediator_3220,
					EsbPackage.eINSTANCE.getFaultMediator());

			elements.put(FaultMediatorInputConnector_3067,
					EsbPackage.eINSTANCE.getFaultMediatorInputConnector());

			elements.put(FaultMediatorOutputConnector_3068,
					EsbPackage.eINSTANCE.getFaultMediatorOutputConnector());

			elements.put(XQueryMediator_3221,
					EsbPackage.eINSTANCE.getXQueryMediator());

			elements.put(XQueryMediatorInputConnector_3070,
					EsbPackage.eINSTANCE.getXQueryMediatorInputConnector());

			elements.put(XQueryMediatorOutputConnector_3071,
					EsbPackage.eINSTANCE.getXQueryMediatorOutputConnector());

			elements.put(CommandMediator_3222,
					EsbPackage.eINSTANCE.getCommandMediator());

			elements.put(CommandMediatorInputConnector_3073,
					EsbPackage.eINSTANCE.getCommandMediatorInputConnector());

			elements.put(CommandMediatorOutputConnector_3074,
					EsbPackage.eINSTANCE.getCommandMediatorOutputConnector());

			elements.put(DBLookupMediator_3223,
					EsbPackage.eINSTANCE.getDBLookupMediator());

			elements.put(DBLookupMediatorInputConnector_3076,
					EsbPackage.eINSTANCE.getDBLookupMediatorInputConnector());

			elements.put(DBLookupMediatorOutputConnector_3077,
					EsbPackage.eINSTANCE.getDBLookupMediatorOutputConnector());

			elements.put(DBReportMediator_3224,
					EsbPackage.eINSTANCE.getDBReportMediator());

			elements.put(DBReportMediatorInputConnector_3079,
					EsbPackage.eINSTANCE.getDBReportMediatorInputConnector());

			elements.put(DBReportMediatorOutputConnector_3080,
					EsbPackage.eINSTANCE.getDBReportMediatorOutputConnector());

			elements.put(SmooksMediator_3225,
					EsbPackage.eINSTANCE.getSmooksMediator());

			elements.put(SmooksMediatorInputConnector_3082,
					EsbPackage.eINSTANCE.getSmooksMediatorInputConnector());

			elements.put(SmooksMediatorOutputConnector_3083,
					EsbPackage.eINSTANCE.getSmooksMediatorOutputConnector());

			elements.put(SendMediator_3226,
					EsbPackage.eINSTANCE.getSendMediator());

			elements.put(SendMediatorInputConnector_3085,
					EsbPackage.eINSTANCE.getSendMediatorInputConnector());

			elements.put(SendMediatorOutputConnector_3086,
					EsbPackage.eINSTANCE.getSendMediatorOutputConnector());

			elements.put(HeaderMediator_3227,
					EsbPackage.eINSTANCE.getHeaderMediator());

			elements.put(HeaderMediatorInputConnector_3100,
					EsbPackage.eINSTANCE.getHeaderMediatorInputConnector());

			elements.put(HeaderMediatorOutputConnector_3101,
					EsbPackage.eINSTANCE.getHeaderMediatorOutputConnector());

			elements.put(CloneMediator_3228,
					EsbPackage.eINSTANCE.getCloneMediator());

			elements.put(CloneMediatorInputConnector_3103,
					EsbPackage.eINSTANCE.getCloneMediatorInputConnector());

			elements.put(CloneMediatorOutputConnector_3104,
					EsbPackage.eINSTANCE.getCloneMediatorOutputConnector());

			elements.put(CloneMediatorTargetOutputConnector_3133,
					EsbPackage.eINSTANCE
							.getCloneMediatorTargetOutputConnector());

			elements.put(CacheMediator_3229,
					EsbPackage.eINSTANCE.getCacheMediator());

			elements.put(CacheMediatorInputConnector_3106,
					EsbPackage.eINSTANCE.getCacheMediatorInputConnector());

			elements.put(CacheMediatorOutputConnector_3107,
					EsbPackage.eINSTANCE.getCacheMediatorOutputConnector());

			elements.put(IterateMediator_3230,
					EsbPackage.eINSTANCE.getIterateMediator());

			elements.put(IterateMediatorInputConnector_3109,
					EsbPackage.eINSTANCE.getIterateMediatorInputConnector());

			elements.put(IterateMediatorOutputConnector_3110,
					EsbPackage.eINSTANCE.getIterateMediatorOutputConnector());

			elements.put(CalloutMediator_3231,
					EsbPackage.eINSTANCE.getCalloutMediator());

			elements.put(CalloutMediatorInputConnector_3115,
					EsbPackage.eINSTANCE.getCalloutMediatorInputConnector());

			elements.put(CalloutMediatorOutputConnector_3116,
					EsbPackage.eINSTANCE.getCalloutMediatorOutputConnector());

			elements.put(TransactionMediator_3232,
					EsbPackage.eINSTANCE.getTransactionMediator());

			elements.put(TransactionMediatorInputConnector_3118,
					EsbPackage.eINSTANCE.getTransactionMediatorInputConnector());

			elements.put(TransactionMediatorOutputConnector_3119,
					EsbPackage.eINSTANCE
							.getTransactionMediatorOutputConnector());

			elements.put(RMSequenceMediator_3233,
					EsbPackage.eINSTANCE.getRMSequenceMediator());

			elements.put(RMSequenceMediatorInputConnector_3124,
					EsbPackage.eINSTANCE.getRMSequenceMediatorInputConnector());

			elements.put(RMSequenceMediatorOutputConnector_3125,
					EsbPackage.eINSTANCE.getRMSequenceMediatorOutputConnector());

			elements.put(RuleMediator_3234,
					EsbPackage.eINSTANCE.getRuleMediator());

			elements.put(RuleMediatorInputConnector_3127,
					EsbPackage.eINSTANCE.getRuleMediatorInputConnector());

			elements.put(RuleMediatorOutputConnector_3128,
					EsbPackage.eINSTANCE.getRuleMediatorOutputConnector());

			elements.put(OAuthMediator_3235,
					EsbPackage.eINSTANCE.getOAuthMediator());

			elements.put(OAuthMediatorInputConnector_3130,
					EsbPackage.eINSTANCE.getOAuthMediatorInputConnector());

			elements.put(OAuthMediatorOutputConnector_3131,
					EsbPackage.eINSTANCE.getOAuthMediatorOutputConnector());

			elements.put(AggregateMediator_3236,
					EsbPackage.eINSTANCE.getAggregateMediator());

			elements.put(AggregateMediatorInputConnector_3112,
					EsbPackage.eINSTANCE.getAggregateMediatorInputConnector());

			elements.put(AggregateMediatorOutputConnector_3113,
					EsbPackage.eINSTANCE.getAggregateMediatorOutputConnector());

			elements.put(AggregateMediatorOnCompleteOutputConnector_3132,
					EsbPackage.eINSTANCE
							.getAggregateMediatorOnCompleteOutputConnector());

			elements.put(LogMediator_3134,
					EsbPackage.eINSTANCE.getLogMediator());

			elements.put(LogMediatorInputConnector_3135,
					EsbPackage.eINSTANCE.getLogMediatorInputConnector());

			elements.put(LogMediatorOutputConnector_3136,
					EsbPackage.eINSTANCE.getLogMediatorOutputConnector());

			elements.put(DropMediator_3137,
					EsbPackage.eINSTANCE.getDropMediator());

			elements.put(DropMediatorInputConnector_3138,
					EsbPackage.eINSTANCE.getDropMediatorInputConnector());

			elements.put(FilterMediator_3139,
					EsbPackage.eINSTANCE.getFilterMediator());

			elements.put(FilterMediatorInputConnector_3140,
					EsbPackage.eINSTANCE.getFilterMediatorInputConnector());

			elements.put(FilterMediatorPassOutputConnector_3141,
					EsbPackage.eINSTANCE.getFilterMediatorPassOutputConnector());

			elements.put(FilterMediatorFailOutputConnector_3142,
					EsbPackage.eINSTANCE.getFilterMediatorFailOutputConnector());

			elements.put(PropertyMediator_3143,
					EsbPackage.eINSTANCE.getPropertyMediator());

			elements.put(PropertyMediatorInputConnector_3144,
					EsbPackage.eINSTANCE.getPropertyMediatorInputConnector());

			elements.put(PropertyMediatorOutputConnector_3145,
					EsbPackage.eINSTANCE.getPropertyMediatorOutputConnector());

			elements.put(EnrichMediator_3146,
					EsbPackage.eINSTANCE.getEnrichMediator());

			elements.put(EnrichMediatorInputConnector_3147,
					EsbPackage.eINSTANCE.getEnrichMediatorInputConnector());

			elements.put(EnrichMediatorOutputConnector_3148,
					EsbPackage.eINSTANCE.getEnrichMediatorOutputConnector());

			elements.put(XSLTMediator_3149,
					EsbPackage.eINSTANCE.getXSLTMediator());

			elements.put(XSLTMediatorInputConnector_3150,
					EsbPackage.eINSTANCE.getXSLTMediatorInputConnector());

			elements.put(XSLTMediatorOutputConnector_3151,
					EsbPackage.eINSTANCE.getXSLTMediatorOutputConnector());

			elements.put(SwitchMediator_3152,
					EsbPackage.eINSTANCE.getSwitchMediator());

			elements.put(SwitchMediatorInputConnector_3153,
					EsbPackage.eINSTANCE.getSwitchMediatorInputConnector());

			elements.put(SwitchCaseBranchOutputConnector_3154,
					EsbPackage.eINSTANCE.getSwitchCaseBranchOutputConnector());

			elements.put(SwitchDefaultBranchOutputConnector_3155,
					EsbPackage.eINSTANCE
							.getSwitchDefaultBranchOutputConnector());

			elements.put(FaultMediator_3156,
					EsbPackage.eINSTANCE.getFaultMediator());

			elements.put(FaultMediatorInputConnector_3157,
					EsbPackage.eINSTANCE.getFaultMediatorInputConnector());

			elements.put(FaultMediatorOutputConnector_3158,
					EsbPackage.eINSTANCE.getFaultMediatorOutputConnector());

			elements.put(DBLookupMediator_3159,
					EsbPackage.eINSTANCE.getDBLookupMediator());

			elements.put(DBLookupMediatorInputConnector_3160,
					EsbPackage.eINSTANCE.getDBLookupMediatorInputConnector());

			elements.put(DBLookupMediatorOutputConnector_3161,
					EsbPackage.eINSTANCE.getDBLookupMediatorOutputConnector());

			elements.put(DBReportMediator_3162,
					EsbPackage.eINSTANCE.getDBReportMediator());

			elements.put(DBReportMediatorInputConnector_3163,
					EsbPackage.eINSTANCE.getDBReportMediatorInputConnector());

			elements.put(DBReportMediatorOutputConnector_3164,
					EsbPackage.eINSTANCE.getDBReportMediatorOutputConnector());

			elements.put(SendMediator_3165,
					EsbPackage.eINSTANCE.getSendMediator());

			elements.put(SendMediatorInputConnector_3166,
					EsbPackage.eINSTANCE.getSendMediatorInputConnector());

			elements.put(SendMediatorOutputConnector_3167,
					EsbPackage.eINSTANCE.getSendMediatorOutputConnector());

			elements.put(HeaderMediator_3168,
					EsbPackage.eINSTANCE.getHeaderMediator());

			elements.put(HeaderMediatorInputConnector_3169,
					EsbPackage.eINSTANCE.getHeaderMediatorInputConnector());

			elements.put(HeaderMediatorOutputConnector_3170,
					EsbPackage.eINSTANCE.getHeaderMediatorOutputConnector());

			elements.put(CloneMediator_3171,
					EsbPackage.eINSTANCE.getCloneMediator());

			elements.put(CloneMediatorInputConnector_3172,
					EsbPackage.eINSTANCE.getCloneMediatorInputConnector());

			elements.put(CloneMediatorOutputConnector_3173,
					EsbPackage.eINSTANCE.getCloneMediatorOutputConnector());

			elements.put(CloneMediatorTargetOutputConnector_3174,
					EsbPackage.eINSTANCE
							.getCloneMediatorTargetOutputConnector());

			elements.put(IterateMediator_3175,
					EsbPackage.eINSTANCE.getIterateMediator());

			elements.put(IterateMediatorInputConnector_3176,
					EsbPackage.eINSTANCE.getIterateMediatorInputConnector());

			elements.put(IterateMediatorOutputConnector_3177,
					EsbPackage.eINSTANCE.getIterateMediatorOutputConnector());

			elements.put(CalloutMediator_3178,
					EsbPackage.eINSTANCE.getCalloutMediator());

			elements.put(CalloutMediatorInputConnector_3181,
					EsbPackage.eINSTANCE.getCalloutMediatorInputConnector());

			elements.put(CalloutMediatorOutputConnector_3182,
					EsbPackage.eINSTANCE.getCalloutMediatorOutputConnector());

			elements.put(TransactionMediator_3179,
					EsbPackage.eINSTANCE.getTransactionMediator());

			elements.put(TransactionMediatorInputConnector_3183,
					EsbPackage.eINSTANCE.getTransactionMediatorInputConnector());

			elements.put(TransactionMediatorOutputConnector_3184,
					EsbPackage.eINSTANCE
							.getTransactionMediatorOutputConnector());

			elements.put(RMSequenceMediator_3180,
					EsbPackage.eINSTANCE.getRMSequenceMediator());

			elements.put(RMSequenceMediatorInputConnector_3185,
					EsbPackage.eINSTANCE.getRMSequenceMediatorInputConnector());

			elements.put(RMSequenceMediatorOutputConnector_3186,
					EsbPackage.eINSTANCE.getRMSequenceMediatorOutputConnector());

			elements.put(Sequence_3187, EsbPackage.eINSTANCE.getSequence());

			elements.put(SequenceInputConnector_3188,
					EsbPackage.eINSTANCE.getSequenceInputConnector());

			elements.put(SequenceOutputConnector_3189,
					EsbPackage.eINSTANCE.getSequenceOutputConnector());

			elements.put(ProxyServiceOutSequence_3198,
					EsbPackage.eINSTANCE.getProxyServiceOutSequence());

			elements.put(DropMediator_3194,
					EsbPackage.eINSTANCE.getDropMediator());

			elements.put(DropMediatorInputConnector_3192,
					EsbPackage.eINSTANCE.getDropMediatorInputConnector());

			elements.put(PropertyMediator_3200,
					EsbPackage.eINSTANCE.getPropertyMediator());

			elements.put(PropertyMediatorInputConnector_3201,
					EsbPackage.eINSTANCE.getPropertyMediatorInputConnector());

			elements.put(PropertyMediatorOutputConnector_3202,
					EsbPackage.eINSTANCE.getPropertyMediatorOutputConnector());

			elements.put(ThrottleMediator_3206,
					EsbPackage.eINSTANCE.getThrottleMediator());

			elements.put(ThrottleMediatorInputConnector_3207,
					EsbPackage.eINSTANCE.getThrottleMediatorInputConnector());

			elements.put(ThrottleMediatorOutputConnector_3208,
					EsbPackage.eINSTANCE.getThrottleMediatorOutputConnector());

			elements.put(FilterMediator_3237,
					EsbPackage.eINSTANCE.getFilterMediator());

			elements.put(FilterMediatorInputConnector_3238,
					EsbPackage.eINSTANCE.getFilterMediatorInputConnector());

			elements.put(FilterMediatorPassOutputConnector_3239,
					EsbPackage.eINSTANCE.getFilterMediatorPassOutputConnector());

			elements.put(FilterMediatorFailOutputConnector_3240,
					EsbPackage.eINSTANCE.getFilterMediatorFailOutputConnector());

			elements.put(LogMediator_3241,
					EsbPackage.eINSTANCE.getLogMediator());

			elements.put(LogMediatorInputConnector_3242,
					EsbPackage.eINSTANCE.getLogMediatorInputConnector());

			elements.put(LogMediatorOutputConnector_3243,
					EsbPackage.eINSTANCE.getLogMediatorOutputConnector());

			elements.put(EnrichMediator_3244,
					EsbPackage.eINSTANCE.getEnrichMediator());

			elements.put(EnrichMediatorInputConnector_3245,
					EsbPackage.eINSTANCE.getEnrichMediatorInputConnector());

			elements.put(EnrichMediatorOutputConnector_3246,
					EsbPackage.eINSTANCE.getEnrichMediatorOutputConnector());

			elements.put(XSLTMediator_3247,
					EsbPackage.eINSTANCE.getXSLTMediator());

			elements.put(XSLTMediatorInputConnector_3248,
					EsbPackage.eINSTANCE.getXSLTMediatorInputConnector());

			elements.put(XSLTMediatorOutputConnector_3249,
					EsbPackage.eINSTANCE.getXSLTMediatorOutputConnector());

			elements.put(SwitchMediator_3250,
					EsbPackage.eINSTANCE.getSwitchMediator());

			elements.put(SwitchMediatorInputConnector_3251,
					EsbPackage.eINSTANCE.getSwitchMediatorInputConnector());

			elements.put(SwitchCaseBranchOutputConnector_3252,
					EsbPackage.eINSTANCE.getSwitchCaseBranchOutputConnector());

			elements.put(SwitchDefaultBranchOutputConnector_3253,
					EsbPackage.eINSTANCE
							.getSwitchDefaultBranchOutputConnector());

			elements.put(Sequence_3254, EsbPackage.eINSTANCE.getSequence());

			elements.put(SequenceInputConnector_3255,
					EsbPackage.eINSTANCE.getSequenceInputConnector());

			elements.put(SequenceOutputConnector_3256,
					EsbPackage.eINSTANCE.getSequenceOutputConnector());

			elements.put(EventMediator_3257,
					EsbPackage.eINSTANCE.getEventMediator());

			elements.put(EventMediatorInputConnector_3258,
					EsbPackage.eINSTANCE.getEventMediatorInputConnector());

			elements.put(EventMediatorOutputConnector_3259,
					EsbPackage.eINSTANCE.getEventMediatorOutputConnector());

			elements.put(EntitlementMediator_3260,
					EsbPackage.eINSTANCE.getEntitlementMediator());

			elements.put(EntitlementMediatorInputConnector_3261,
					EsbPackage.eINSTANCE.getEntitlementMediatorInputConnector());

			elements.put(EntitlementMediatorOutputConnector_3262,
					EsbPackage.eINSTANCE
							.getEntitlementMediatorOutputConnector());

			elements.put(ClassMediator_3263,
					EsbPackage.eINSTANCE.getClassMediator());

			elements.put(ClassMediatorInputConnector_3264,
					EsbPackage.eINSTANCE.getClassMediatorInputConnector());

			elements.put(ClassMediatorOutputConnector_3265,
					EsbPackage.eINSTANCE.getClassMediatorOutputConnector());

			elements.put(SpringMediator_3266,
					EsbPackage.eINSTANCE.getSpringMediator());

			elements.put(SpringMediatorInputConnector_3267,
					EsbPackage.eINSTANCE.getSpringMediatorInputConnector());

			elements.put(SpringMediatorOutputConnector_3268,
					EsbPackage.eINSTANCE.getSpringMediatorOutputConnector());

			elements.put(ScriptMediator_3269,
					EsbPackage.eINSTANCE.getScriptMediator());

			elements.put(ScriptMediatorInputConnector_3270,
					EsbPackage.eINSTANCE.getScriptMediatorInputConnector());

			elements.put(ScriptMediatorOutputConnector_3271,
					EsbPackage.eINSTANCE.getScriptMediatorOutputConnector());

			elements.put(FaultMediator_3272,
					EsbPackage.eINSTANCE.getFaultMediator());

			elements.put(FaultMediatorInputConnector_3273,
					EsbPackage.eINSTANCE.getFaultMediatorInputConnector());

			elements.put(FaultMediatorOutputConnector_3274,
					EsbPackage.eINSTANCE.getFaultMediatorOutputConnector());

			elements.put(XQueryMediator_3275,
					EsbPackage.eINSTANCE.getXQueryMediator());

			elements.put(XQueryMediatorInputConnector_3276,
					EsbPackage.eINSTANCE.getXQueryMediatorInputConnector());

			elements.put(XQueryMediatorOutputConnector_3277,
					EsbPackage.eINSTANCE.getXQueryMediatorOutputConnector());

			elements.put(CommandMediator_3278,
					EsbPackage.eINSTANCE.getCommandMediator());

			elements.put(CommandMediatorInputConnector_3279,
					EsbPackage.eINSTANCE.getCommandMediatorInputConnector());

			elements.put(CommandMediatorOutputConnector_3280,
					EsbPackage.eINSTANCE.getCommandMediatorOutputConnector());

			elements.put(DBLookupMediator_3281,
					EsbPackage.eINSTANCE.getDBLookupMediator());

			elements.put(DBLookupMediatorInputConnector_3282,
					EsbPackage.eINSTANCE.getDBLookupMediatorInputConnector());

			elements.put(DBLookupMediatorOutputConnector_3283,
					EsbPackage.eINSTANCE.getDBLookupMediatorOutputConnector());

			elements.put(DBReportMediator_3284,
					EsbPackage.eINSTANCE.getDBReportMediator());

			elements.put(DBReportMediatorInputConnector_3285,
					EsbPackage.eINSTANCE.getDBReportMediatorInputConnector());

			elements.put(DBReportMediatorOutputConnector_3286,
					EsbPackage.eINSTANCE.getDBReportMediatorOutputConnector());

			elements.put(SmooksMediator_3287,
					EsbPackage.eINSTANCE.getSmooksMediator());

			elements.put(SmooksMediatorInputConnector_3288,
					EsbPackage.eINSTANCE.getSmooksMediatorInputConnector());

			elements.put(SmooksMediatorOutputConnector_3289,
					EsbPackage.eINSTANCE.getSmooksMediatorOutputConnector());

			elements.put(SendMediator_3290,
					EsbPackage.eINSTANCE.getSendMediator());

			elements.put(SendMediatorInputConnector_3291,
					EsbPackage.eINSTANCE.getSendMediatorInputConnector());

			elements.put(SendMediatorOutputConnector_3292,
					EsbPackage.eINSTANCE.getSendMediatorOutputConnector());

			elements.put(HeaderMediator_3293,
					EsbPackage.eINSTANCE.getHeaderMediator());

			elements.put(HeaderMediatorInputConnector_3294,
					EsbPackage.eINSTANCE.getHeaderMediatorInputConnector());

			elements.put(HeaderMediatorOutputConnector_3295,
					EsbPackage.eINSTANCE.getHeaderMediatorOutputConnector());

			elements.put(CloneMediator_3296,
					EsbPackage.eINSTANCE.getCloneMediator());

			elements.put(CloneMediatorInputConnector_3297,
					EsbPackage.eINSTANCE.getCloneMediatorInputConnector());

			elements.put(CloneMediatorOutputConnector_3298,
					EsbPackage.eINSTANCE.getCloneMediatorOutputConnector());

			elements.put(CloneMediatorTargetOutputConnector_3299,
					EsbPackage.eINSTANCE
							.getCloneMediatorTargetOutputConnector());

			elements.put(CacheMediator_3300,
					EsbPackage.eINSTANCE.getCacheMediator());

			elements.put(CacheMediatorInputConnector_3301,
					EsbPackage.eINSTANCE.getCacheMediatorInputConnector());

			elements.put(CacheMediatorOutputConnector_3302,
					EsbPackage.eINSTANCE.getCacheMediatorOutputConnector());

			elements.put(IterateMediator_3303,
					EsbPackage.eINSTANCE.getIterateMediator());

			elements.put(IterateMediatorInputConnector_3304,
					EsbPackage.eINSTANCE.getIterateMediatorInputConnector());

			elements.put(IterateMediatorOutputConnector_3305,
					EsbPackage.eINSTANCE.getIterateMediatorOutputConnector());

			elements.put(CalloutMediator_3306,
					EsbPackage.eINSTANCE.getCalloutMediator());

			elements.put(CalloutMediatorInputConnector_3307,
					EsbPackage.eINSTANCE.getCalloutMediatorInputConnector());

			elements.put(CalloutMediatorOutputConnector_3308,
					EsbPackage.eINSTANCE.getCalloutMediatorOutputConnector());

			elements.put(TransactionMediator_3309,
					EsbPackage.eINSTANCE.getTransactionMediator());

			elements.put(TransactionMediatorInputConnector_3310,
					EsbPackage.eINSTANCE.getTransactionMediatorInputConnector());

			elements.put(TransactionMediatorOutputConnector_3311,
					EsbPackage.eINSTANCE
							.getTransactionMediatorOutputConnector());

			elements.put(RMSequenceMediator_3312,
					EsbPackage.eINSTANCE.getRMSequenceMediator());

			elements.put(RMSequenceMediatorInputConnector_3313,
					EsbPackage.eINSTANCE.getRMSequenceMediatorInputConnector());

			elements.put(RMSequenceMediatorOutputConnector_3314,
					EsbPackage.eINSTANCE.getRMSequenceMediatorOutputConnector());

			elements.put(RuleMediator_3315,
					EsbPackage.eINSTANCE.getRuleMediator());

			elements.put(RuleMediatorInputConnector_3316,
					EsbPackage.eINSTANCE.getRuleMediatorInputConnector());

			elements.put(RuleMediatorOutputConnector_3317,
					EsbPackage.eINSTANCE.getRuleMediatorOutputConnector());

			elements.put(OAuthMediator_3318,
					EsbPackage.eINSTANCE.getOAuthMediator());

			elements.put(OAuthMediatorInputConnector_3319,
					EsbPackage.eINSTANCE.getOAuthMediatorInputConnector());

			elements.put(OAuthMediatorOutputConnector_3320,
					EsbPackage.eINSTANCE.getOAuthMediatorOutputConnector());

			elements.put(AggregateMediator_3321,
					EsbPackage.eINSTANCE.getAggregateMediator());

			elements.put(AggregateMediatorInputConnector_3322,
					EsbPackage.eINSTANCE.getAggregateMediatorInputConnector());

			elements.put(AggregateMediatorOutputConnector_3323,
					EsbPackage.eINSTANCE.getAggregateMediatorOutputConnector());

			elements.put(AggregateMediatorOnCompleteOutputConnector_3324,
					EsbPackage.eINSTANCE
							.getAggregateMediatorOnCompleteOutputConnector());

			elements.put(LogMediator_3325,
					EsbPackage.eINSTANCE.getLogMediator());

			elements.put(LogMediatorInputConnector_3326,
					EsbPackage.eINSTANCE.getLogMediatorInputConnector());

			elements.put(LogMediatorOutputConnector_3327,
					EsbPackage.eINSTANCE.getLogMediatorOutputConnector());

			elements.put(DropMediator_3328,
					EsbPackage.eINSTANCE.getDropMediator());

			elements.put(DropMediatorInputConnector_3195,
					EsbPackage.eINSTANCE.getDropMediatorInputConnector());

			elements.put(FilterMediator_3329,
					EsbPackage.eINSTANCE.getFilterMediator());

			elements.put(FilterMediatorInputConnector_3330,
					EsbPackage.eINSTANCE.getFilterMediatorInputConnector());

			elements.put(FilterMediatorPassOutputConnector_3331,
					EsbPackage.eINSTANCE.getFilterMediatorPassOutputConnector());

			elements.put(FilterMediatorFailOutputConnector_3332,
					EsbPackage.eINSTANCE.getFilterMediatorFailOutputConnector());

			elements.put(PropertyMediator_3333,
					EsbPackage.eINSTANCE.getPropertyMediator());

			elements.put(PropertyMediatorInputConnector_3203,
					EsbPackage.eINSTANCE.getPropertyMediatorInputConnector());

			elements.put(PropertyMediatorOutputConnector_3204,
					EsbPackage.eINSTANCE.getPropertyMediatorOutputConnector());

			elements.put(EnrichMediator_3334,
					EsbPackage.eINSTANCE.getEnrichMediator());

			elements.put(EnrichMediatorInputConnector_3388,
					EsbPackage.eINSTANCE.getEnrichMediatorInputConnector());

			elements.put(EnrichMediatorOutputConnector_3389,
					EsbPackage.eINSTANCE.getEnrichMediatorOutputConnector());

			elements.put(XSLTMediator_3337,
					EsbPackage.eINSTANCE.getXSLTMediator());

			elements.put(XSLTMediatorInputConnector_3338,
					EsbPackage.eINSTANCE.getXSLTMediatorInputConnector());

			elements.put(XSLTMediatorOutputConnector_3339,
					EsbPackage.eINSTANCE.getXSLTMediatorOutputConnector());

			elements.put(SwitchMediator_3340,
					EsbPackage.eINSTANCE.getSwitchMediator());

			elements.put(SwitchMediatorInputConnector_3341,
					EsbPackage.eINSTANCE.getSwitchMediatorInputConnector());

			elements.put(SwitchCaseBranchOutputConnector_3342,
					EsbPackage.eINSTANCE.getSwitchCaseBranchOutputConnector());

			elements.put(SwitchDefaultBranchOutputConnector_3343,
					EsbPackage.eINSTANCE
							.getSwitchDefaultBranchOutputConnector());

			elements.put(FaultMediator_3344,
					EsbPackage.eINSTANCE.getFaultMediator());

			elements.put(FaultMediatorInputConnector_3345,
					EsbPackage.eINSTANCE.getFaultMediatorInputConnector());

			elements.put(FaultMediatorOutputConnector_3346,
					EsbPackage.eINSTANCE.getFaultMediatorOutputConnector());

			elements.put(DBLookupMediator_3347,
					EsbPackage.eINSTANCE.getDBLookupMediator());

			elements.put(DBLookupMediatorInputConnector_3348,
					EsbPackage.eINSTANCE.getDBLookupMediatorInputConnector());

			elements.put(DBLookupMediatorOutputConnector_3349,
					EsbPackage.eINSTANCE.getDBLookupMediatorOutputConnector());

			elements.put(DBReportMediator_3350,
					EsbPackage.eINSTANCE.getDBReportMediator());

			elements.put(DBReportMediatorInputConnector_3351,
					EsbPackage.eINSTANCE.getDBReportMediatorInputConnector());

			elements.put(DBReportMediatorOutputConnector_3352,
					EsbPackage.eINSTANCE.getDBReportMediatorOutputConnector());

			elements.put(SendMediator_3353,
					EsbPackage.eINSTANCE.getSendMediator());

			elements.put(SendMediatorInputConnector_3354,
					EsbPackage.eINSTANCE.getSendMediatorInputConnector());

			elements.put(SendMediatorOutputConnector_3355,
					EsbPackage.eINSTANCE.getSendMediatorOutputConnector());

			elements.put(HeaderMediator_3356,
					EsbPackage.eINSTANCE.getHeaderMediator());

			elements.put(HeaderMediatorInputConnector_3357,
					EsbPackage.eINSTANCE.getHeaderMediatorInputConnector());

			elements.put(HeaderMediatorOutputConnector_3358,
					EsbPackage.eINSTANCE.getHeaderMediatorOutputConnector());

			elements.put(CloneMediator_3359,
					EsbPackage.eINSTANCE.getCloneMediator());

			elements.put(CloneMediatorInputConnector_3360,
					EsbPackage.eINSTANCE.getCloneMediatorInputConnector());

			elements.put(CloneMediatorOutputConnector_3361,
					EsbPackage.eINSTANCE.getCloneMediatorOutputConnector());

			elements.put(CloneMediatorTargetOutputConnector_3362,
					EsbPackage.eINSTANCE
							.getCloneMediatorTargetOutputConnector());

			elements.put(IterateMediator_3363,
					EsbPackage.eINSTANCE.getIterateMediator());

			elements.put(IterateMediatorInputConnector_3364,
					EsbPackage.eINSTANCE.getIterateMediatorInputConnector());

			elements.put(IterateMediatorOutputConnector_3365,
					EsbPackage.eINSTANCE.getIterateMediatorOutputConnector());

			elements.put(CalloutMediator_3366,
					EsbPackage.eINSTANCE.getCalloutMediator());

			elements.put(CalloutMediatorInputConnector_3367,
					EsbPackage.eINSTANCE.getCalloutMediatorInputConnector());

			elements.put(CalloutMediatorOutputConnector_3368,
					EsbPackage.eINSTANCE.getCalloutMediatorOutputConnector());

			elements.put(TransactionMediator_3369,
					EsbPackage.eINSTANCE.getTransactionMediator());

			elements.put(TransactionMediatorInputConnector_3370,
					EsbPackage.eINSTANCE.getTransactionMediatorInputConnector());

			elements.put(TransactionMediatorOutputConnector_3371,
					EsbPackage.eINSTANCE
							.getTransactionMediatorOutputConnector());

			elements.put(RMSequenceMediator_3372,
					EsbPackage.eINSTANCE.getRMSequenceMediator());

			elements.put(RMSequenceMediatorInputConnector_3373,
					EsbPackage.eINSTANCE.getRMSequenceMediatorInputConnector());

			elements.put(RMSequenceMediatorOutputConnector_3374,
					EsbPackage.eINSTANCE.getRMSequenceMediatorOutputConnector());

			elements.put(Sequence_3375, EsbPackage.eINSTANCE.getSequence());

			elements.put(SequenceInputConnector_3376,
					EsbPackage.eINSTANCE.getSequenceInputConnector());

			elements.put(SequenceOutputConnector_3377,
					EsbPackage.eINSTANCE.getSequenceOutputConnector());

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

			elements.put(DropMediator_3394,
					EsbPackage.eINSTANCE.getDropMediator());

			elements.put(DropMediatorInputConnector_3395,
					EsbPackage.eINSTANCE.getDropMediatorInputConnector());

			elements.put(PropertyMediator_3396,
					EsbPackage.eINSTANCE.getPropertyMediator());

			elements.put(PropertyMediatorInputConnector_3397,
					EsbPackage.eINSTANCE.getPropertyMediatorInputConnector());

			elements.put(PropertyMediatorOutputConnector_3398,
					EsbPackage.eINSTANCE.getPropertyMediatorOutputConnector());

			elements.put(ThrottleMediator_3399,
					EsbPackage.eINSTANCE.getThrottleMediator());

			elements.put(ThrottleMediatorInputConnector_3400,
					EsbPackage.eINSTANCE.getThrottleMediatorInputConnector());

			elements.put(ThrottleMediatorOutputConnector_3401,
					EsbPackage.eINSTANCE.getThrottleMediatorOutputConnector());

			elements.put(FilterMediator_3402,
					EsbPackage.eINSTANCE.getFilterMediator());

			elements.put(FilterMediatorInputConnector_3403,
					EsbPackage.eINSTANCE.getFilterMediatorInputConnector());

			elements.put(FilterMediatorPassOutputConnector_3404,
					EsbPackage.eINSTANCE.getFilterMediatorPassOutputConnector());

			elements.put(FilterMediatorFailOutputConnector_3405,
					EsbPackage.eINSTANCE.getFilterMediatorFailOutputConnector());

			elements.put(LogMediator_3406,
					EsbPackage.eINSTANCE.getLogMediator());

			elements.put(LogMediatorInputConnector_3407,
					EsbPackage.eINSTANCE.getLogMediatorInputConnector());

			elements.put(LogMediatorOutputConnector_3408,
					EsbPackage.eINSTANCE.getLogMediatorOutputConnector());

			elements.put(EnrichMediator_3409,
					EsbPackage.eINSTANCE.getEnrichMediator());

			elements.put(EnrichMediatorInputConnector_3410,
					EsbPackage.eINSTANCE.getEnrichMediatorInputConnector());

			elements.put(EnrichMediatorOutputConnector_3411,
					EsbPackage.eINSTANCE.getEnrichMediatorOutputConnector());

			elements.put(XSLTMediator_3412,
					EsbPackage.eINSTANCE.getXSLTMediator());

			elements.put(XSLTMediatorInputConnector_3413,
					EsbPackage.eINSTANCE.getXSLTMediatorInputConnector());

			elements.put(XSLTMediatorOutputConnector_3414,
					EsbPackage.eINSTANCE.getXSLTMediatorOutputConnector());

			elements.put(SwitchMediator_3415,
					EsbPackage.eINSTANCE.getSwitchMediator());

			elements.put(SwitchMediatorInputConnector_3416,
					EsbPackage.eINSTANCE.getSwitchMediatorInputConnector());

			elements.put(SwitchCaseBranchOutputConnector_3417,
					EsbPackage.eINSTANCE.getSwitchCaseBranchOutputConnector());

			elements.put(SwitchDefaultBranchOutputConnector_3418,
					EsbPackage.eINSTANCE
							.getSwitchDefaultBranchOutputConnector());

			elements.put(Sequence_3419, EsbPackage.eINSTANCE.getSequence());

			elements.put(SequenceInputConnector_3420,
					EsbPackage.eINSTANCE.getSequenceInputConnector());

			elements.put(SequenceOutputConnector_3421,
					EsbPackage.eINSTANCE.getSequenceOutputConnector());

			elements.put(EventMediator_3422,
					EsbPackage.eINSTANCE.getEventMediator());

			elements.put(EventMediatorInputConnector_3423,
					EsbPackage.eINSTANCE.getEventMediatorInputConnector());

			elements.put(EventMediatorOutputConnector_3424,
					EsbPackage.eINSTANCE.getEventMediatorOutputConnector());

			elements.put(EntitlementMediator_3425,
					EsbPackage.eINSTANCE.getEntitlementMediator());

			elements.put(EntitlementMediatorInputConnector_3426,
					EsbPackage.eINSTANCE.getEntitlementMediatorInputConnector());

			elements.put(EntitlementMediatorOutputConnector_3427,
					EsbPackage.eINSTANCE
							.getEntitlementMediatorOutputConnector());

			elements.put(ClassMediator_3428,
					EsbPackage.eINSTANCE.getClassMediator());

			elements.put(ClassMediatorInputConnector_3429,
					EsbPackage.eINSTANCE.getClassMediatorInputConnector());

			elements.put(ClassMediatorOutputConnector_3430,
					EsbPackage.eINSTANCE.getClassMediatorOutputConnector());

			elements.put(SpringMediator_3431,
					EsbPackage.eINSTANCE.getSpringMediator());

			elements.put(SpringMediatorInputConnector_3432,
					EsbPackage.eINSTANCE.getSpringMediatorInputConnector());

			elements.put(SpringMediatorOutputConnector_3433,
					EsbPackage.eINSTANCE.getSpringMediatorOutputConnector());

			elements.put(ScriptMediator_3434,
					EsbPackage.eINSTANCE.getScriptMediator());

			elements.put(ScriptMediatorInputConnector_3435,
					EsbPackage.eINSTANCE.getScriptMediatorInputConnector());

			elements.put(ScriptMediatorOutputConnector_3436,
					EsbPackage.eINSTANCE.getScriptMediatorOutputConnector());

			elements.put(FaultMediator_3437,
					EsbPackage.eINSTANCE.getFaultMediator());

			elements.put(FaultMediatorInputConnector_3438,
					EsbPackage.eINSTANCE.getFaultMediatorInputConnector());

			elements.put(FaultMediatorOutputConnector_3439,
					EsbPackage.eINSTANCE.getFaultMediatorOutputConnector());

			elements.put(XQueryMediator_3440,
					EsbPackage.eINSTANCE.getXQueryMediator());

			elements.put(XQueryMediatorInputConnector_3441,
					EsbPackage.eINSTANCE.getXQueryMediatorInputConnector());

			elements.put(XQueryMediatorOutputConnector_3442,
					EsbPackage.eINSTANCE.getXQueryMediatorOutputConnector());

			elements.put(CommandMediator_3443,
					EsbPackage.eINSTANCE.getCommandMediator());

			elements.put(CommandMediatorInputConnector_3444,
					EsbPackage.eINSTANCE.getCommandMediatorInputConnector());

			elements.put(CommandMediatorOutputConnector_3445,
					EsbPackage.eINSTANCE.getCommandMediatorOutputConnector());

			elements.put(DBLookupMediator_3446,
					EsbPackage.eINSTANCE.getDBLookupMediator());

			elements.put(DBLookupMediatorInputConnector_3447,
					EsbPackage.eINSTANCE.getDBLookupMediatorInputConnector());

			elements.put(DBLookupMediatorOutputConnector_3448,
					EsbPackage.eINSTANCE.getDBLookupMediatorOutputConnector());

			elements.put(DBReportMediator_3449,
					EsbPackage.eINSTANCE.getDBReportMediator());

			elements.put(DBReportMediatorInputConnector_3450,
					EsbPackage.eINSTANCE.getDBReportMediatorInputConnector());

			elements.put(DBReportMediatorOutputConnector_3451,
					EsbPackage.eINSTANCE.getDBReportMediatorOutputConnector());

			elements.put(SmooksMediator_3452,
					EsbPackage.eINSTANCE.getSmooksMediator());

			elements.put(SmooksMediatorInputConnector_3453,
					EsbPackage.eINSTANCE.getSmooksMediatorInputConnector());

			elements.put(SmooksMediatorOutputConnector_3454,
					EsbPackage.eINSTANCE.getSmooksMediatorOutputConnector());

			elements.put(SendMediator_3455,
					EsbPackage.eINSTANCE.getSendMediator());

			elements.put(SendMediatorInputConnector_3456,
					EsbPackage.eINSTANCE.getSendMediatorInputConnector());

			elements.put(SendMediatorOutputConnector_3457,
					EsbPackage.eINSTANCE.getSendMediatorOutputConnector());

			elements.put(HeaderMediator_3458,
					EsbPackage.eINSTANCE.getHeaderMediator());

			elements.put(HeaderMediatorInputConnector_3459,
					EsbPackage.eINSTANCE.getHeaderMediatorInputConnector());

			elements.put(HeaderMediatorOutputConnector_3460,
					EsbPackage.eINSTANCE.getHeaderMediatorOutputConnector());

			elements.put(CloneMediator_3461,
					EsbPackage.eINSTANCE.getCloneMediator());

			elements.put(CloneMediatorInputConnector_3462,
					EsbPackage.eINSTANCE.getCloneMediatorInputConnector());

			elements.put(CloneMediatorOutputConnector_3463,
					EsbPackage.eINSTANCE.getCloneMediatorOutputConnector());

			elements.put(CloneMediatorTargetOutputConnector_3464,
					EsbPackage.eINSTANCE
							.getCloneMediatorTargetOutputConnector());

			elements.put(CacheMediator_3465,
					EsbPackage.eINSTANCE.getCacheMediator());

			elements.put(CacheMediatorInputConnector_3466,
					EsbPackage.eINSTANCE.getCacheMediatorInputConnector());

			elements.put(CacheMediatorOutputConnector_3467,
					EsbPackage.eINSTANCE.getCacheMediatorOutputConnector());

			elements.put(IterateMediator_3468,
					EsbPackage.eINSTANCE.getIterateMediator());

			elements.put(IterateMediatorInputConnector_3469,
					EsbPackage.eINSTANCE.getIterateMediatorInputConnector());

			elements.put(IterateMediatorOutputConnector_3470,
					EsbPackage.eINSTANCE.getIterateMediatorOutputConnector());

			elements.put(CalloutMediator_3471,
					EsbPackage.eINSTANCE.getCalloutMediator());

			elements.put(CalloutMediatorInputConnector_3472,
					EsbPackage.eINSTANCE.getCalloutMediatorInputConnector());

			elements.put(CalloutMediatorOutputConnector_3473,
					EsbPackage.eINSTANCE.getCalloutMediatorOutputConnector());

			elements.put(TransactionMediator_3474,
					EsbPackage.eINSTANCE.getTransactionMediator());

			elements.put(TransactionMediatorInputConnector_3475,
					EsbPackage.eINSTANCE.getTransactionMediatorInputConnector());

			elements.put(TransactionMediatorOutputConnector_3476,
					EsbPackage.eINSTANCE
							.getTransactionMediatorOutputConnector());

			elements.put(RMSequenceMediator_3477,
					EsbPackage.eINSTANCE.getRMSequenceMediator());

			elements.put(RMSequenceMediatorInputConnector_3478,
					EsbPackage.eINSTANCE.getRMSequenceMediatorInputConnector());

			elements.put(RMSequenceMediatorOutputConnector_3479,
					EsbPackage.eINSTANCE.getRMSequenceMediatorOutputConnector());

			elements.put(RuleMediator_3480,
					EsbPackage.eINSTANCE.getRuleMediator());

			elements.put(RuleMediatorInputConnector_3481,
					EsbPackage.eINSTANCE.getRuleMediatorInputConnector());

			elements.put(RuleMediatorOutputConnector_3482,
					EsbPackage.eINSTANCE.getRuleMediatorOutputConnector());

			elements.put(OAuthMediator_3483,
					EsbPackage.eINSTANCE.getOAuthMediator());

			elements.put(OAuthMediatorInputConnector_3484,
					EsbPackage.eINSTANCE.getOAuthMediatorInputConnector());

			elements.put(OAuthMediatorOutputConnector_3485,
					EsbPackage.eINSTANCE.getOAuthMediatorOutputConnector());

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
			KNOWN_ELEMENT_TYPES.add(DropMediator_3191);
			KNOWN_ELEMENT_TYPES.add(DropMediatorInputConnector_3008);
			KNOWN_ELEMENT_TYPES.add(PropertyMediator_3199);
			KNOWN_ELEMENT_TYPES.add(PropertyMediatorInputConnector_3033);
			KNOWN_ELEMENT_TYPES.add(PropertyMediatorOutputConnector_3034);
			KNOWN_ELEMENT_TYPES.add(ThrottleMediator_3205);
			KNOWN_ELEMENT_TYPES.add(ThrottleMediatorInputConnector_3121);
			KNOWN_ELEMENT_TYPES.add(ThrottleMediatorOutputConnector_3122);
			KNOWN_ELEMENT_TYPES.add(FilterMediator_3209);
			KNOWN_ELEMENT_TYPES.add(FilterMediatorInputConnector_3010);
			KNOWN_ELEMENT_TYPES.add(FilterMediatorPassOutputConnector_3011);
			KNOWN_ELEMENT_TYPES.add(FilterMediatorFailOutputConnector_3012);
			KNOWN_ELEMENT_TYPES.add(LogMediator_3210);
			KNOWN_ELEMENT_TYPES.add(LogMediatorInputConnector_3018);
			KNOWN_ELEMENT_TYPES.add(LogMediatorOutputConnector_3019);
			KNOWN_ELEMENT_TYPES.add(EnrichMediator_3387);
			KNOWN_ELEMENT_TYPES.add(EnrichMediatorInputConnector_3036);
			KNOWN_ELEMENT_TYPES.add(EnrichMediatorOutputConnector_3037);
			KNOWN_ELEMENT_TYPES.add(XSLTMediator_3212);
			KNOWN_ELEMENT_TYPES.add(XSLTMediatorInputConnector_3039);
			KNOWN_ELEMENT_TYPES.add(XSLTMediatorOutputConnector_3040);
			KNOWN_ELEMENT_TYPES.add(SwitchMediator_3213);
			KNOWN_ELEMENT_TYPES.add(SwitchMediatorInputConnector_3042);
			KNOWN_ELEMENT_TYPES.add(SwitchCaseBranchOutputConnector_3043);
			KNOWN_ELEMENT_TYPES.add(SwitchDefaultBranchOutputConnector_3044);
			KNOWN_ELEMENT_TYPES.add(Sequence_3214);
			KNOWN_ELEMENT_TYPES.add(SequenceInputConnector_3049);
			KNOWN_ELEMENT_TYPES.add(SequenceOutputConnector_3050);
			KNOWN_ELEMENT_TYPES.add(EventMediator_3215);
			KNOWN_ELEMENT_TYPES.add(EventMediatorInputConnector_3052);
			KNOWN_ELEMENT_TYPES.add(EventMediatorOutputConnector_3053);
			KNOWN_ELEMENT_TYPES.add(EntitlementMediator_3216);
			KNOWN_ELEMENT_TYPES.add(EntitlementMediatorInputConnector_3055);
			KNOWN_ELEMENT_TYPES.add(EntitlementMediatorOutputConnector_3056);
			KNOWN_ELEMENT_TYPES.add(ClassMediator_3217);
			KNOWN_ELEMENT_TYPES.add(ClassMediatorInputConnector_3058);
			KNOWN_ELEMENT_TYPES.add(ClassMediatorOutputConnector_3059);
			KNOWN_ELEMENT_TYPES.add(SpringMediator_3218);
			KNOWN_ELEMENT_TYPES.add(SpringMediatorInputConnector_3061);
			KNOWN_ELEMENT_TYPES.add(SpringMediatorOutputConnector_3062);
			KNOWN_ELEMENT_TYPES.add(ScriptMediator_3219);
			KNOWN_ELEMENT_TYPES.add(ScriptMediatorInputConnector_3064);
			KNOWN_ELEMENT_TYPES.add(ScriptMediatorOutputConnector_3065);
			KNOWN_ELEMENT_TYPES.add(FaultMediator_3220);
			KNOWN_ELEMENT_TYPES.add(FaultMediatorInputConnector_3067);
			KNOWN_ELEMENT_TYPES.add(FaultMediatorOutputConnector_3068);
			KNOWN_ELEMENT_TYPES.add(XQueryMediator_3221);
			KNOWN_ELEMENT_TYPES.add(XQueryMediatorInputConnector_3070);
			KNOWN_ELEMENT_TYPES.add(XQueryMediatorOutputConnector_3071);
			KNOWN_ELEMENT_TYPES.add(CommandMediator_3222);
			KNOWN_ELEMENT_TYPES.add(CommandMediatorInputConnector_3073);
			KNOWN_ELEMENT_TYPES.add(CommandMediatorOutputConnector_3074);
			KNOWN_ELEMENT_TYPES.add(DBLookupMediator_3223);
			KNOWN_ELEMENT_TYPES.add(DBLookupMediatorInputConnector_3076);
			KNOWN_ELEMENT_TYPES.add(DBLookupMediatorOutputConnector_3077);
			KNOWN_ELEMENT_TYPES.add(DBReportMediator_3224);
			KNOWN_ELEMENT_TYPES.add(DBReportMediatorInputConnector_3079);
			KNOWN_ELEMENT_TYPES.add(DBReportMediatorOutputConnector_3080);
			KNOWN_ELEMENT_TYPES.add(SmooksMediator_3225);
			KNOWN_ELEMENT_TYPES.add(SmooksMediatorInputConnector_3082);
			KNOWN_ELEMENT_TYPES.add(SmooksMediatorOutputConnector_3083);
			KNOWN_ELEMENT_TYPES.add(SendMediator_3226);
			KNOWN_ELEMENT_TYPES.add(SendMediatorInputConnector_3085);
			KNOWN_ELEMENT_TYPES.add(SendMediatorOutputConnector_3086);
			KNOWN_ELEMENT_TYPES.add(HeaderMediator_3227);
			KNOWN_ELEMENT_TYPES.add(HeaderMediatorInputConnector_3100);
			KNOWN_ELEMENT_TYPES.add(HeaderMediatorOutputConnector_3101);
			KNOWN_ELEMENT_TYPES.add(CloneMediator_3228);
			KNOWN_ELEMENT_TYPES.add(CloneMediatorInputConnector_3103);
			KNOWN_ELEMENT_TYPES.add(CloneMediatorOutputConnector_3104);
			KNOWN_ELEMENT_TYPES.add(CloneMediatorTargetOutputConnector_3133);
			KNOWN_ELEMENT_TYPES.add(CacheMediator_3229);
			KNOWN_ELEMENT_TYPES.add(CacheMediatorInputConnector_3106);
			KNOWN_ELEMENT_TYPES.add(CacheMediatorOutputConnector_3107);
			KNOWN_ELEMENT_TYPES.add(IterateMediator_3230);
			KNOWN_ELEMENT_TYPES.add(IterateMediatorInputConnector_3109);
			KNOWN_ELEMENT_TYPES.add(IterateMediatorOutputConnector_3110);
			KNOWN_ELEMENT_TYPES.add(CalloutMediator_3231);
			KNOWN_ELEMENT_TYPES.add(CalloutMediatorInputConnector_3115);
			KNOWN_ELEMENT_TYPES.add(CalloutMediatorOutputConnector_3116);
			KNOWN_ELEMENT_TYPES.add(TransactionMediator_3232);
			KNOWN_ELEMENT_TYPES.add(TransactionMediatorInputConnector_3118);
			KNOWN_ELEMENT_TYPES.add(TransactionMediatorOutputConnector_3119);
			KNOWN_ELEMENT_TYPES.add(RMSequenceMediator_3233);
			KNOWN_ELEMENT_TYPES.add(RMSequenceMediatorInputConnector_3124);
			KNOWN_ELEMENT_TYPES.add(RMSequenceMediatorOutputConnector_3125);
			KNOWN_ELEMENT_TYPES.add(RuleMediator_3234);
			KNOWN_ELEMENT_TYPES.add(RuleMediatorInputConnector_3127);
			KNOWN_ELEMENT_TYPES.add(RuleMediatorOutputConnector_3128);
			KNOWN_ELEMENT_TYPES.add(OAuthMediator_3235);
			KNOWN_ELEMENT_TYPES.add(OAuthMediatorInputConnector_3130);
			KNOWN_ELEMENT_TYPES.add(OAuthMediatorOutputConnector_3131);
			KNOWN_ELEMENT_TYPES.add(AggregateMediator_3236);
			KNOWN_ELEMENT_TYPES.add(AggregateMediatorInputConnector_3112);
			KNOWN_ELEMENT_TYPES.add(AggregateMediatorOutputConnector_3113);
			KNOWN_ELEMENT_TYPES
					.add(AggregateMediatorOnCompleteOutputConnector_3132);
			KNOWN_ELEMENT_TYPES.add(LogMediator_3134);
			KNOWN_ELEMENT_TYPES.add(LogMediatorInputConnector_3135);
			KNOWN_ELEMENT_TYPES.add(LogMediatorOutputConnector_3136);
			KNOWN_ELEMENT_TYPES.add(DropMediator_3137);
			KNOWN_ELEMENT_TYPES.add(DropMediatorInputConnector_3138);
			KNOWN_ELEMENT_TYPES.add(FilterMediator_3139);
			KNOWN_ELEMENT_TYPES.add(FilterMediatorInputConnector_3140);
			KNOWN_ELEMENT_TYPES.add(FilterMediatorPassOutputConnector_3141);
			KNOWN_ELEMENT_TYPES.add(FilterMediatorFailOutputConnector_3142);
			KNOWN_ELEMENT_TYPES.add(PropertyMediator_3143);
			KNOWN_ELEMENT_TYPES.add(PropertyMediatorInputConnector_3144);
			KNOWN_ELEMENT_TYPES.add(PropertyMediatorOutputConnector_3145);
			KNOWN_ELEMENT_TYPES.add(EnrichMediator_3146);
			KNOWN_ELEMENT_TYPES.add(EnrichMediatorInputConnector_3147);
			KNOWN_ELEMENT_TYPES.add(EnrichMediatorOutputConnector_3148);
			KNOWN_ELEMENT_TYPES.add(XSLTMediator_3149);
			KNOWN_ELEMENT_TYPES.add(XSLTMediatorInputConnector_3150);
			KNOWN_ELEMENT_TYPES.add(XSLTMediatorOutputConnector_3151);
			KNOWN_ELEMENT_TYPES.add(SwitchMediator_3152);
			KNOWN_ELEMENT_TYPES.add(SwitchMediatorInputConnector_3153);
			KNOWN_ELEMENT_TYPES.add(SwitchCaseBranchOutputConnector_3154);
			KNOWN_ELEMENT_TYPES.add(SwitchDefaultBranchOutputConnector_3155);
			KNOWN_ELEMENT_TYPES.add(FaultMediator_3156);
			KNOWN_ELEMENT_TYPES.add(FaultMediatorInputConnector_3157);
			KNOWN_ELEMENT_TYPES.add(FaultMediatorOutputConnector_3158);
			KNOWN_ELEMENT_TYPES.add(DBLookupMediator_3159);
			KNOWN_ELEMENT_TYPES.add(DBLookupMediatorInputConnector_3160);
			KNOWN_ELEMENT_TYPES.add(DBLookupMediatorOutputConnector_3161);
			KNOWN_ELEMENT_TYPES.add(DBReportMediator_3162);
			KNOWN_ELEMENT_TYPES.add(DBReportMediatorInputConnector_3163);
			KNOWN_ELEMENT_TYPES.add(DBReportMediatorOutputConnector_3164);
			KNOWN_ELEMENT_TYPES.add(SendMediator_3165);
			KNOWN_ELEMENT_TYPES.add(SendMediatorInputConnector_3166);
			KNOWN_ELEMENT_TYPES.add(SendMediatorOutputConnector_3167);
			KNOWN_ELEMENT_TYPES.add(HeaderMediator_3168);
			KNOWN_ELEMENT_TYPES.add(HeaderMediatorInputConnector_3169);
			KNOWN_ELEMENT_TYPES.add(HeaderMediatorOutputConnector_3170);
			KNOWN_ELEMENT_TYPES.add(CloneMediator_3171);
			KNOWN_ELEMENT_TYPES.add(CloneMediatorInputConnector_3172);
			KNOWN_ELEMENT_TYPES.add(CloneMediatorOutputConnector_3173);
			KNOWN_ELEMENT_TYPES.add(CloneMediatorTargetOutputConnector_3174);
			KNOWN_ELEMENT_TYPES.add(IterateMediator_3175);
			KNOWN_ELEMENT_TYPES.add(IterateMediatorInputConnector_3176);
			KNOWN_ELEMENT_TYPES.add(IterateMediatorOutputConnector_3177);
			KNOWN_ELEMENT_TYPES.add(CalloutMediator_3178);
			KNOWN_ELEMENT_TYPES.add(CalloutMediatorInputConnector_3181);
			KNOWN_ELEMENT_TYPES.add(CalloutMediatorOutputConnector_3182);
			KNOWN_ELEMENT_TYPES.add(TransactionMediator_3179);
			KNOWN_ELEMENT_TYPES.add(TransactionMediatorInputConnector_3183);
			KNOWN_ELEMENT_TYPES.add(TransactionMediatorOutputConnector_3184);
			KNOWN_ELEMENT_TYPES.add(RMSequenceMediator_3180);
			KNOWN_ELEMENT_TYPES.add(RMSequenceMediatorInputConnector_3185);
			KNOWN_ELEMENT_TYPES.add(RMSequenceMediatorOutputConnector_3186);
			KNOWN_ELEMENT_TYPES.add(Sequence_3187);
			KNOWN_ELEMENT_TYPES.add(SequenceInputConnector_3188);
			KNOWN_ELEMENT_TYPES.add(SequenceOutputConnector_3189);
			KNOWN_ELEMENT_TYPES.add(ProxyServiceOutSequence_3198);
			KNOWN_ELEMENT_TYPES.add(DropMediator_3194);
			KNOWN_ELEMENT_TYPES.add(DropMediatorInputConnector_3192);
			KNOWN_ELEMENT_TYPES.add(PropertyMediator_3200);
			KNOWN_ELEMENT_TYPES.add(PropertyMediatorInputConnector_3201);
			KNOWN_ELEMENT_TYPES.add(PropertyMediatorOutputConnector_3202);
			KNOWN_ELEMENT_TYPES.add(ThrottleMediator_3206);
			KNOWN_ELEMENT_TYPES.add(ThrottleMediatorInputConnector_3207);
			KNOWN_ELEMENT_TYPES.add(ThrottleMediatorOutputConnector_3208);
			KNOWN_ELEMENT_TYPES.add(FilterMediator_3237);
			KNOWN_ELEMENT_TYPES.add(FilterMediatorInputConnector_3238);
			KNOWN_ELEMENT_TYPES.add(FilterMediatorPassOutputConnector_3239);
			KNOWN_ELEMENT_TYPES.add(FilterMediatorFailOutputConnector_3240);
			KNOWN_ELEMENT_TYPES.add(LogMediator_3241);
			KNOWN_ELEMENT_TYPES.add(LogMediatorInputConnector_3242);
			KNOWN_ELEMENT_TYPES.add(LogMediatorOutputConnector_3243);
			KNOWN_ELEMENT_TYPES.add(EnrichMediator_3244);
			KNOWN_ELEMENT_TYPES.add(EnrichMediatorInputConnector_3245);
			KNOWN_ELEMENT_TYPES.add(EnrichMediatorOutputConnector_3246);
			KNOWN_ELEMENT_TYPES.add(XSLTMediator_3247);
			KNOWN_ELEMENT_TYPES.add(XSLTMediatorInputConnector_3248);
			KNOWN_ELEMENT_TYPES.add(XSLTMediatorOutputConnector_3249);
			KNOWN_ELEMENT_TYPES.add(SwitchMediator_3250);
			KNOWN_ELEMENT_TYPES.add(SwitchMediatorInputConnector_3251);
			KNOWN_ELEMENT_TYPES.add(SwitchCaseBranchOutputConnector_3252);
			KNOWN_ELEMENT_TYPES.add(SwitchDefaultBranchOutputConnector_3253);
			KNOWN_ELEMENT_TYPES.add(Sequence_3254);
			KNOWN_ELEMENT_TYPES.add(SequenceInputConnector_3255);
			KNOWN_ELEMENT_TYPES.add(SequenceOutputConnector_3256);
			KNOWN_ELEMENT_TYPES.add(EventMediator_3257);
			KNOWN_ELEMENT_TYPES.add(EventMediatorInputConnector_3258);
			KNOWN_ELEMENT_TYPES.add(EventMediatorOutputConnector_3259);
			KNOWN_ELEMENT_TYPES.add(EntitlementMediator_3260);
			KNOWN_ELEMENT_TYPES.add(EntitlementMediatorInputConnector_3261);
			KNOWN_ELEMENT_TYPES.add(EntitlementMediatorOutputConnector_3262);
			KNOWN_ELEMENT_TYPES.add(ClassMediator_3263);
			KNOWN_ELEMENT_TYPES.add(ClassMediatorInputConnector_3264);
			KNOWN_ELEMENT_TYPES.add(ClassMediatorOutputConnector_3265);
			KNOWN_ELEMENT_TYPES.add(SpringMediator_3266);
			KNOWN_ELEMENT_TYPES.add(SpringMediatorInputConnector_3267);
			KNOWN_ELEMENT_TYPES.add(SpringMediatorOutputConnector_3268);
			KNOWN_ELEMENT_TYPES.add(ScriptMediator_3269);
			KNOWN_ELEMENT_TYPES.add(ScriptMediatorInputConnector_3270);
			KNOWN_ELEMENT_TYPES.add(ScriptMediatorOutputConnector_3271);
			KNOWN_ELEMENT_TYPES.add(FaultMediator_3272);
			KNOWN_ELEMENT_TYPES.add(FaultMediatorInputConnector_3273);
			KNOWN_ELEMENT_TYPES.add(FaultMediatorOutputConnector_3274);
			KNOWN_ELEMENT_TYPES.add(XQueryMediator_3275);
			KNOWN_ELEMENT_TYPES.add(XQueryMediatorInputConnector_3276);
			KNOWN_ELEMENT_TYPES.add(XQueryMediatorOutputConnector_3277);
			KNOWN_ELEMENT_TYPES.add(CommandMediator_3278);
			KNOWN_ELEMENT_TYPES.add(CommandMediatorInputConnector_3279);
			KNOWN_ELEMENT_TYPES.add(CommandMediatorOutputConnector_3280);
			KNOWN_ELEMENT_TYPES.add(DBLookupMediator_3281);
			KNOWN_ELEMENT_TYPES.add(DBLookupMediatorInputConnector_3282);
			KNOWN_ELEMENT_TYPES.add(DBLookupMediatorOutputConnector_3283);
			KNOWN_ELEMENT_TYPES.add(DBReportMediator_3284);
			KNOWN_ELEMENT_TYPES.add(DBReportMediatorInputConnector_3285);
			KNOWN_ELEMENT_TYPES.add(DBReportMediatorOutputConnector_3286);
			KNOWN_ELEMENT_TYPES.add(SmooksMediator_3287);
			KNOWN_ELEMENT_TYPES.add(SmooksMediatorInputConnector_3288);
			KNOWN_ELEMENT_TYPES.add(SmooksMediatorOutputConnector_3289);
			KNOWN_ELEMENT_TYPES.add(SendMediator_3290);
			KNOWN_ELEMENT_TYPES.add(SendMediatorInputConnector_3291);
			KNOWN_ELEMENT_TYPES.add(SendMediatorOutputConnector_3292);
			KNOWN_ELEMENT_TYPES.add(HeaderMediator_3293);
			KNOWN_ELEMENT_TYPES.add(HeaderMediatorInputConnector_3294);
			KNOWN_ELEMENT_TYPES.add(HeaderMediatorOutputConnector_3295);
			KNOWN_ELEMENT_TYPES.add(CloneMediator_3296);
			KNOWN_ELEMENT_TYPES.add(CloneMediatorInputConnector_3297);
			KNOWN_ELEMENT_TYPES.add(CloneMediatorOutputConnector_3298);
			KNOWN_ELEMENT_TYPES.add(CloneMediatorTargetOutputConnector_3299);
			KNOWN_ELEMENT_TYPES.add(CacheMediator_3300);
			KNOWN_ELEMENT_TYPES.add(CacheMediatorInputConnector_3301);
			KNOWN_ELEMENT_TYPES.add(CacheMediatorOutputConnector_3302);
			KNOWN_ELEMENT_TYPES.add(IterateMediator_3303);
			KNOWN_ELEMENT_TYPES.add(IterateMediatorInputConnector_3304);
			KNOWN_ELEMENT_TYPES.add(IterateMediatorOutputConnector_3305);
			KNOWN_ELEMENT_TYPES.add(CalloutMediator_3306);
			KNOWN_ELEMENT_TYPES.add(CalloutMediatorInputConnector_3307);
			KNOWN_ELEMENT_TYPES.add(CalloutMediatorOutputConnector_3308);
			KNOWN_ELEMENT_TYPES.add(TransactionMediator_3309);
			KNOWN_ELEMENT_TYPES.add(TransactionMediatorInputConnector_3310);
			KNOWN_ELEMENT_TYPES.add(TransactionMediatorOutputConnector_3311);
			KNOWN_ELEMENT_TYPES.add(RMSequenceMediator_3312);
			KNOWN_ELEMENT_TYPES.add(RMSequenceMediatorInputConnector_3313);
			KNOWN_ELEMENT_TYPES.add(RMSequenceMediatorOutputConnector_3314);
			KNOWN_ELEMENT_TYPES.add(RuleMediator_3315);
			KNOWN_ELEMENT_TYPES.add(RuleMediatorInputConnector_3316);
			KNOWN_ELEMENT_TYPES.add(RuleMediatorOutputConnector_3317);
			KNOWN_ELEMENT_TYPES.add(OAuthMediator_3318);
			KNOWN_ELEMENT_TYPES.add(OAuthMediatorInputConnector_3319);
			KNOWN_ELEMENT_TYPES.add(OAuthMediatorOutputConnector_3320);
			KNOWN_ELEMENT_TYPES.add(AggregateMediator_3321);
			KNOWN_ELEMENT_TYPES.add(AggregateMediatorInputConnector_3322);
			KNOWN_ELEMENT_TYPES.add(AggregateMediatorOutputConnector_3323);
			KNOWN_ELEMENT_TYPES
					.add(AggregateMediatorOnCompleteOutputConnector_3324);
			KNOWN_ELEMENT_TYPES.add(LogMediator_3325);
			KNOWN_ELEMENT_TYPES.add(LogMediatorInputConnector_3326);
			KNOWN_ELEMENT_TYPES.add(LogMediatorOutputConnector_3327);
			KNOWN_ELEMENT_TYPES.add(DropMediator_3328);
			KNOWN_ELEMENT_TYPES.add(DropMediatorInputConnector_3195);
			KNOWN_ELEMENT_TYPES.add(FilterMediator_3329);
			KNOWN_ELEMENT_TYPES.add(FilterMediatorInputConnector_3330);
			KNOWN_ELEMENT_TYPES.add(FilterMediatorPassOutputConnector_3331);
			KNOWN_ELEMENT_TYPES.add(FilterMediatorFailOutputConnector_3332);
			KNOWN_ELEMENT_TYPES.add(PropertyMediator_3333);
			KNOWN_ELEMENT_TYPES.add(PropertyMediatorInputConnector_3203);
			KNOWN_ELEMENT_TYPES.add(PropertyMediatorOutputConnector_3204);
			KNOWN_ELEMENT_TYPES.add(EnrichMediator_3334);
			KNOWN_ELEMENT_TYPES.add(EnrichMediatorInputConnector_3388);
			KNOWN_ELEMENT_TYPES.add(EnrichMediatorOutputConnector_3389);
			KNOWN_ELEMENT_TYPES.add(XSLTMediator_3337);
			KNOWN_ELEMENT_TYPES.add(XSLTMediatorInputConnector_3338);
			KNOWN_ELEMENT_TYPES.add(XSLTMediatorOutputConnector_3339);
			KNOWN_ELEMENT_TYPES.add(SwitchMediator_3340);
			KNOWN_ELEMENT_TYPES.add(SwitchMediatorInputConnector_3341);
			KNOWN_ELEMENT_TYPES.add(SwitchCaseBranchOutputConnector_3342);
			KNOWN_ELEMENT_TYPES.add(SwitchDefaultBranchOutputConnector_3343);
			KNOWN_ELEMENT_TYPES.add(FaultMediator_3344);
			KNOWN_ELEMENT_TYPES.add(FaultMediatorInputConnector_3345);
			KNOWN_ELEMENT_TYPES.add(FaultMediatorOutputConnector_3346);
			KNOWN_ELEMENT_TYPES.add(DBLookupMediator_3347);
			KNOWN_ELEMENT_TYPES.add(DBLookupMediatorInputConnector_3348);
			KNOWN_ELEMENT_TYPES.add(DBLookupMediatorOutputConnector_3349);
			KNOWN_ELEMENT_TYPES.add(DBReportMediator_3350);
			KNOWN_ELEMENT_TYPES.add(DBReportMediatorInputConnector_3351);
			KNOWN_ELEMENT_TYPES.add(DBReportMediatorOutputConnector_3352);
			KNOWN_ELEMENT_TYPES.add(SendMediator_3353);
			KNOWN_ELEMENT_TYPES.add(SendMediatorInputConnector_3354);
			KNOWN_ELEMENT_TYPES.add(SendMediatorOutputConnector_3355);
			KNOWN_ELEMENT_TYPES.add(HeaderMediator_3356);
			KNOWN_ELEMENT_TYPES.add(HeaderMediatorInputConnector_3357);
			KNOWN_ELEMENT_TYPES.add(HeaderMediatorOutputConnector_3358);
			KNOWN_ELEMENT_TYPES.add(CloneMediator_3359);
			KNOWN_ELEMENT_TYPES.add(CloneMediatorInputConnector_3360);
			KNOWN_ELEMENT_TYPES.add(CloneMediatorOutputConnector_3361);
			KNOWN_ELEMENT_TYPES.add(CloneMediatorTargetOutputConnector_3362);
			KNOWN_ELEMENT_TYPES.add(IterateMediator_3363);
			KNOWN_ELEMENT_TYPES.add(IterateMediatorInputConnector_3364);
			KNOWN_ELEMENT_TYPES.add(IterateMediatorOutputConnector_3365);
			KNOWN_ELEMENT_TYPES.add(CalloutMediator_3366);
			KNOWN_ELEMENT_TYPES.add(CalloutMediatorInputConnector_3367);
			KNOWN_ELEMENT_TYPES.add(CalloutMediatorOutputConnector_3368);
			KNOWN_ELEMENT_TYPES.add(TransactionMediator_3369);
			KNOWN_ELEMENT_TYPES.add(TransactionMediatorInputConnector_3370);
			KNOWN_ELEMENT_TYPES.add(TransactionMediatorOutputConnector_3371);
			KNOWN_ELEMENT_TYPES.add(RMSequenceMediator_3372);
			KNOWN_ELEMENT_TYPES.add(RMSequenceMediatorInputConnector_3373);
			KNOWN_ELEMENT_TYPES.add(RMSequenceMediatorOutputConnector_3374);
			KNOWN_ELEMENT_TYPES.add(Sequence_3375);
			KNOWN_ELEMENT_TYPES.add(SequenceInputConnector_3376);
			KNOWN_ELEMENT_TYPES.add(SequenceOutputConnector_3377);
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
			KNOWN_ELEMENT_TYPES.add(DropMediator_3394);
			KNOWN_ELEMENT_TYPES.add(DropMediatorInputConnector_3395);
			KNOWN_ELEMENT_TYPES.add(PropertyMediator_3396);
			KNOWN_ELEMENT_TYPES.add(PropertyMediatorInputConnector_3397);
			KNOWN_ELEMENT_TYPES.add(PropertyMediatorOutputConnector_3398);
			KNOWN_ELEMENT_TYPES.add(ThrottleMediator_3399);
			KNOWN_ELEMENT_TYPES.add(ThrottleMediatorInputConnector_3400);
			KNOWN_ELEMENT_TYPES.add(ThrottleMediatorOutputConnector_3401);
			KNOWN_ELEMENT_TYPES.add(FilterMediator_3402);
			KNOWN_ELEMENT_TYPES.add(FilterMediatorInputConnector_3403);
			KNOWN_ELEMENT_TYPES.add(FilterMediatorPassOutputConnector_3404);
			KNOWN_ELEMENT_TYPES.add(FilterMediatorFailOutputConnector_3405);
			KNOWN_ELEMENT_TYPES.add(LogMediator_3406);
			KNOWN_ELEMENT_TYPES.add(LogMediatorInputConnector_3407);
			KNOWN_ELEMENT_TYPES.add(LogMediatorOutputConnector_3408);
			KNOWN_ELEMENT_TYPES.add(EnrichMediator_3409);
			KNOWN_ELEMENT_TYPES.add(EnrichMediatorInputConnector_3410);
			KNOWN_ELEMENT_TYPES.add(EnrichMediatorOutputConnector_3411);
			KNOWN_ELEMENT_TYPES.add(XSLTMediator_3412);
			KNOWN_ELEMENT_TYPES.add(XSLTMediatorInputConnector_3413);
			KNOWN_ELEMENT_TYPES.add(XSLTMediatorOutputConnector_3414);
			KNOWN_ELEMENT_TYPES.add(SwitchMediator_3415);
			KNOWN_ELEMENT_TYPES.add(SwitchMediatorInputConnector_3416);
			KNOWN_ELEMENT_TYPES.add(SwitchCaseBranchOutputConnector_3417);
			KNOWN_ELEMENT_TYPES.add(SwitchDefaultBranchOutputConnector_3418);
			KNOWN_ELEMENT_TYPES.add(Sequence_3419);
			KNOWN_ELEMENT_TYPES.add(SequenceInputConnector_3420);
			KNOWN_ELEMENT_TYPES.add(SequenceOutputConnector_3421);
			KNOWN_ELEMENT_TYPES.add(EventMediator_3422);
			KNOWN_ELEMENT_TYPES.add(EventMediatorInputConnector_3423);
			KNOWN_ELEMENT_TYPES.add(EventMediatorOutputConnector_3424);
			KNOWN_ELEMENT_TYPES.add(EntitlementMediator_3425);
			KNOWN_ELEMENT_TYPES.add(EntitlementMediatorInputConnector_3426);
			KNOWN_ELEMENT_TYPES.add(EntitlementMediatorOutputConnector_3427);
			KNOWN_ELEMENT_TYPES.add(ClassMediator_3428);
			KNOWN_ELEMENT_TYPES.add(ClassMediatorInputConnector_3429);
			KNOWN_ELEMENT_TYPES.add(ClassMediatorOutputConnector_3430);
			KNOWN_ELEMENT_TYPES.add(SpringMediator_3431);
			KNOWN_ELEMENT_TYPES.add(SpringMediatorInputConnector_3432);
			KNOWN_ELEMENT_TYPES.add(SpringMediatorOutputConnector_3433);
			KNOWN_ELEMENT_TYPES.add(ScriptMediator_3434);
			KNOWN_ELEMENT_TYPES.add(ScriptMediatorInputConnector_3435);
			KNOWN_ELEMENT_TYPES.add(ScriptMediatorOutputConnector_3436);
			KNOWN_ELEMENT_TYPES.add(FaultMediator_3437);
			KNOWN_ELEMENT_TYPES.add(FaultMediatorInputConnector_3438);
			KNOWN_ELEMENT_TYPES.add(FaultMediatorOutputConnector_3439);
			KNOWN_ELEMENT_TYPES.add(XQueryMediator_3440);
			KNOWN_ELEMENT_TYPES.add(XQueryMediatorInputConnector_3441);
			KNOWN_ELEMENT_TYPES.add(XQueryMediatorOutputConnector_3442);
			KNOWN_ELEMENT_TYPES.add(CommandMediator_3443);
			KNOWN_ELEMENT_TYPES.add(CommandMediatorInputConnector_3444);
			KNOWN_ELEMENT_TYPES.add(CommandMediatorOutputConnector_3445);
			KNOWN_ELEMENT_TYPES.add(DBLookupMediator_3446);
			KNOWN_ELEMENT_TYPES.add(DBLookupMediatorInputConnector_3447);
			KNOWN_ELEMENT_TYPES.add(DBLookupMediatorOutputConnector_3448);
			KNOWN_ELEMENT_TYPES.add(DBReportMediator_3449);
			KNOWN_ELEMENT_TYPES.add(DBReportMediatorInputConnector_3450);
			KNOWN_ELEMENT_TYPES.add(DBReportMediatorOutputConnector_3451);
			KNOWN_ELEMENT_TYPES.add(SmooksMediator_3452);
			KNOWN_ELEMENT_TYPES.add(SmooksMediatorInputConnector_3453);
			KNOWN_ELEMENT_TYPES.add(SmooksMediatorOutputConnector_3454);
			KNOWN_ELEMENT_TYPES.add(SendMediator_3455);
			KNOWN_ELEMENT_TYPES.add(SendMediatorInputConnector_3456);
			KNOWN_ELEMENT_TYPES.add(SendMediatorOutputConnector_3457);
			KNOWN_ELEMENT_TYPES.add(HeaderMediator_3458);
			KNOWN_ELEMENT_TYPES.add(HeaderMediatorInputConnector_3459);
			KNOWN_ELEMENT_TYPES.add(HeaderMediatorOutputConnector_3460);
			KNOWN_ELEMENT_TYPES.add(CloneMediator_3461);
			KNOWN_ELEMENT_TYPES.add(CloneMediatorInputConnector_3462);
			KNOWN_ELEMENT_TYPES.add(CloneMediatorOutputConnector_3463);
			KNOWN_ELEMENT_TYPES.add(CloneMediatorTargetOutputConnector_3464);
			KNOWN_ELEMENT_TYPES.add(CacheMediator_3465);
			KNOWN_ELEMENT_TYPES.add(CacheMediatorInputConnector_3466);
			KNOWN_ELEMENT_TYPES.add(CacheMediatorOutputConnector_3467);
			KNOWN_ELEMENT_TYPES.add(IterateMediator_3468);
			KNOWN_ELEMENT_TYPES.add(IterateMediatorInputConnector_3469);
			KNOWN_ELEMENT_TYPES.add(IterateMediatorOutputConnector_3470);
			KNOWN_ELEMENT_TYPES.add(CalloutMediator_3471);
			KNOWN_ELEMENT_TYPES.add(CalloutMediatorInputConnector_3472);
			KNOWN_ELEMENT_TYPES.add(CalloutMediatorOutputConnector_3473);
			KNOWN_ELEMENT_TYPES.add(TransactionMediator_3474);
			KNOWN_ELEMENT_TYPES.add(TransactionMediatorInputConnector_3475);
			KNOWN_ELEMENT_TYPES.add(TransactionMediatorOutputConnector_3476);
			KNOWN_ELEMENT_TYPES.add(RMSequenceMediator_3477);
			KNOWN_ELEMENT_TYPES.add(RMSequenceMediatorInputConnector_3478);
			KNOWN_ELEMENT_TYPES.add(RMSequenceMediatorOutputConnector_3479);
			KNOWN_ELEMENT_TYPES.add(RuleMediator_3480);
			KNOWN_ELEMENT_TYPES.add(RuleMediatorInputConnector_3481);
			KNOWN_ELEMENT_TYPES.add(RuleMediatorOutputConnector_3482);
			KNOWN_ELEMENT_TYPES.add(OAuthMediator_3483);
			KNOWN_ELEMENT_TYPES.add(OAuthMediatorInputConnector_3484);
			KNOWN_ELEMENT_TYPES.add(OAuthMediatorOutputConnector_3485);
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
		case DropMediator3EditPart.VISUAL_ID:
			return DropMediator_3191;
		case DropMediatorInputConnectorEditPart.VISUAL_ID:
			return DropMediatorInputConnector_3008;
		case PropertyMediator3EditPart.VISUAL_ID:
			return PropertyMediator_3199;
		case PropertyMediatorInputConnectorEditPart.VISUAL_ID:
			return PropertyMediatorInputConnector_3033;
		case PropertyMediatorOutputConnectorEditPart.VISUAL_ID:
			return PropertyMediatorOutputConnector_3034;
		case ThrottleMediatorEditPart.VISUAL_ID:
			return ThrottleMediator_3205;
		case ThrottleMediatorInputConnectorEditPart.VISUAL_ID:
			return ThrottleMediatorInputConnector_3121;
		case ThrottleMediatorOutputConnectorEditPart.VISUAL_ID:
			return ThrottleMediatorOutputConnector_3122;
		case FilterMediatorEditPart.VISUAL_ID:
			return FilterMediator_3209;
		case FilterMediatorInputConnectorEditPart.VISUAL_ID:
			return FilterMediatorInputConnector_3010;
		case FilterMediatorPassOutputConnectorEditPart.VISUAL_ID:
			return FilterMediatorPassOutputConnector_3011;
		case FilterMediatorFailOutputConnectorEditPart.VISUAL_ID:
			return FilterMediatorFailOutputConnector_3012;
		case LogMediatorEditPart.VISUAL_ID:
			return LogMediator_3210;
		case LogMediatorInputConnectorEditPart.VISUAL_ID:
			return LogMediatorInputConnector_3018;
		case LogMediatorOutputConnectorEditPart.VISUAL_ID:
			return LogMediatorOutputConnector_3019;
		case EnrichMediatorEditPart.VISUAL_ID:
			return EnrichMediator_3387;
		case EnrichMediatorInputConnectorEditPart.VISUAL_ID:
			return EnrichMediatorInputConnector_3036;
		case EnrichMediatorOutputConnectorEditPart.VISUAL_ID:
			return EnrichMediatorOutputConnector_3037;
		case XSLTMediatorEditPart.VISUAL_ID:
			return XSLTMediator_3212;
		case XSLTMediatorInputConnectorEditPart.VISUAL_ID:
			return XSLTMediatorInputConnector_3039;
		case XSLTMediatorOutputConnectorEditPart.VISUAL_ID:
			return XSLTMediatorOutputConnector_3040;
		case SwitchMediatorEditPart.VISUAL_ID:
			return SwitchMediator_3213;
		case SwitchMediatorInputConnectorEditPart.VISUAL_ID:
			return SwitchMediatorInputConnector_3042;
		case SwitchCaseBranchOutputConnectorEditPart.VISUAL_ID:
			return SwitchCaseBranchOutputConnector_3043;
		case SwitchDefaultBranchOutputConnectorEditPart.VISUAL_ID:
			return SwitchDefaultBranchOutputConnector_3044;
		case SequenceEditPart.VISUAL_ID:
			return Sequence_3214;
		case SequenceInputConnectorEditPart.VISUAL_ID:
			return SequenceInputConnector_3049;
		case SequenceOutputConnectorEditPart.VISUAL_ID:
			return SequenceOutputConnector_3050;
		case EventMediatorEditPart.VISUAL_ID:
			return EventMediator_3215;
		case EventMediatorInputConnectorEditPart.VISUAL_ID:
			return EventMediatorInputConnector_3052;
		case EventMediatorOutputConnectorEditPart.VISUAL_ID:
			return EventMediatorOutputConnector_3053;
		case EntitlementMediatorEditPart.VISUAL_ID:
			return EntitlementMediator_3216;
		case EntitlementMediatorInputConnectorEditPart.VISUAL_ID:
			return EntitlementMediatorInputConnector_3055;
		case EntitlementMediatorOutputConnectorEditPart.VISUAL_ID:
			return EntitlementMediatorOutputConnector_3056;
		case ClassMediatorEditPart.VISUAL_ID:
			return ClassMediator_3217;
		case ClassMediatorInputConnectorEditPart.VISUAL_ID:
			return ClassMediatorInputConnector_3058;
		case ClassMediatorOutputConnectorEditPart.VISUAL_ID:
			return ClassMediatorOutputConnector_3059;
		case SpringMediatorEditPart.VISUAL_ID:
			return SpringMediator_3218;
		case SpringMediatorInputConnectorEditPart.VISUAL_ID:
			return SpringMediatorInputConnector_3061;
		case SpringMediatorOutputConnectorEditPart.VISUAL_ID:
			return SpringMediatorOutputConnector_3062;
		case ScriptMediatorEditPart.VISUAL_ID:
			return ScriptMediator_3219;
		case ScriptMediatorInputConnectorEditPart.VISUAL_ID:
			return ScriptMediatorInputConnector_3064;
		case ScriptMediatorOutputConnectorEditPart.VISUAL_ID:
			return ScriptMediatorOutputConnector_3065;
		case FaultMediatorEditPart.VISUAL_ID:
			return FaultMediator_3220;
		case FaultMediatorInputConnectorEditPart.VISUAL_ID:
			return FaultMediatorInputConnector_3067;
		case FaultMediatorOutputConnectorEditPart.VISUAL_ID:
			return FaultMediatorOutputConnector_3068;
		case XQueryMediatorEditPart.VISUAL_ID:
			return XQueryMediator_3221;
		case XQueryMediatorInputConnectorEditPart.VISUAL_ID:
			return XQueryMediatorInputConnector_3070;
		case XQueryMediatorOutputConnectorEditPart.VISUAL_ID:
			return XQueryMediatorOutputConnector_3071;
		case CommandMediatorEditPart.VISUAL_ID:
			return CommandMediator_3222;
		case CommandMediatorInputConnectorEditPart.VISUAL_ID:
			return CommandMediatorInputConnector_3073;
		case CommandMediatorOutputConnectorEditPart.VISUAL_ID:
			return CommandMediatorOutputConnector_3074;
		case DBLookupMediatorEditPart.VISUAL_ID:
			return DBLookupMediator_3223;
		case DBLookupMediatorInputConnectorEditPart.VISUAL_ID:
			return DBLookupMediatorInputConnector_3076;
		case DBLookupMediatorOutputConnectorEditPart.VISUAL_ID:
			return DBLookupMediatorOutputConnector_3077;
		case DBReportMediatorEditPart.VISUAL_ID:
			return DBReportMediator_3224;
		case DBReportMediatorInputConnectorEditPart.VISUAL_ID:
			return DBReportMediatorInputConnector_3079;
		case DBReportMediatorOutputConnectorEditPart.VISUAL_ID:
			return DBReportMediatorOutputConnector_3080;
		case SmooksMediatorEditPart.VISUAL_ID:
			return SmooksMediator_3225;
		case SmooksMediatorInputConnectorEditPart.VISUAL_ID:
			return SmooksMediatorInputConnector_3082;
		case SmooksMediatorOutputConnectorEditPart.VISUAL_ID:
			return SmooksMediatorOutputConnector_3083;
		case SendMediatorEditPart.VISUAL_ID:
			return SendMediator_3226;
		case SendMediatorInputConnectorEditPart.VISUAL_ID:
			return SendMediatorInputConnector_3085;
		case SendMediatorOutputConnectorEditPart.VISUAL_ID:
			return SendMediatorOutputConnector_3086;
		case HeaderMediatorEditPart.VISUAL_ID:
			return HeaderMediator_3227;
		case HeaderMediatorInputConnectorEditPart.VISUAL_ID:
			return HeaderMediatorInputConnector_3100;
		case HeaderMediatorOutputConnectorEditPart.VISUAL_ID:
			return HeaderMediatorOutputConnector_3101;
		case CloneMediatorEditPart.VISUAL_ID:
			return CloneMediator_3228;
		case CloneMediatorInputConnectorEditPart.VISUAL_ID:
			return CloneMediatorInputConnector_3103;
		case CloneMediatorOutputConnectorEditPart.VISUAL_ID:
			return CloneMediatorOutputConnector_3104;
		case CloneMediatorTargetOutputConnectorEditPart.VISUAL_ID:
			return CloneMediatorTargetOutputConnector_3133;
		case CacheMediatorEditPart.VISUAL_ID:
			return CacheMediator_3229;
		case CacheMediatorInputConnectorEditPart.VISUAL_ID:
			return CacheMediatorInputConnector_3106;
		case CacheMediatorOutputConnectorEditPart.VISUAL_ID:
			return CacheMediatorOutputConnector_3107;
		case IterateMediatorEditPart.VISUAL_ID:
			return IterateMediator_3230;
		case IterateMediatorInputConnectorEditPart.VISUAL_ID:
			return IterateMediatorInputConnector_3109;
		case IterateMediatorOutputConnectorEditPart.VISUAL_ID:
			return IterateMediatorOutputConnector_3110;
		case CalloutMediatorEditPart.VISUAL_ID:
			return CalloutMediator_3231;
		case CalloutMediatorInputConnectorEditPart.VISUAL_ID:
			return CalloutMediatorInputConnector_3115;
		case CalloutMediatorOutputConnectorEditPart.VISUAL_ID:
			return CalloutMediatorOutputConnector_3116;
		case TransactionMediatorEditPart.VISUAL_ID:
			return TransactionMediator_3232;
		case TransactionMediatorInputConnectorEditPart.VISUAL_ID:
			return TransactionMediatorInputConnector_3118;
		case TransactionMediatorOutputConnectorEditPart.VISUAL_ID:
			return TransactionMediatorOutputConnector_3119;
		case RMSequenceMediatorEditPart.VISUAL_ID:
			return RMSequenceMediator_3233;
		case RMSequenceMediatorInputConnectorEditPart.VISUAL_ID:
			return RMSequenceMediatorInputConnector_3124;
		case RMSequenceMediatorOutputConnectorEditPart.VISUAL_ID:
			return RMSequenceMediatorOutputConnector_3125;
		case RuleMediatorEditPart.VISUAL_ID:
			return RuleMediator_3234;
		case RuleMediatorInputConnectorEditPart.VISUAL_ID:
			return RuleMediatorInputConnector_3127;
		case RuleMediatorOutputConnectorEditPart.VISUAL_ID:
			return RuleMediatorOutputConnector_3128;
		case OAuthMediatorEditPart.VISUAL_ID:
			return OAuthMediator_3235;
		case OAuthMediatorInputConnectorEditPart.VISUAL_ID:
			return OAuthMediatorInputConnector_3130;
		case OAuthMediatorOutputConnectorEditPart.VISUAL_ID:
			return OAuthMediatorOutputConnector_3131;
		case AggregateMediatorEditPart.VISUAL_ID:
			return AggregateMediator_3236;
		case AggregateMediatorInputConnectorEditPart.VISUAL_ID:
			return AggregateMediatorInputConnector_3112;
		case AggregateMediatorOutputConnectorEditPart.VISUAL_ID:
			return AggregateMediatorOutputConnector_3113;
		case AggregateMediatorOnCompleteOutputConnectorEditPart.VISUAL_ID:
			return AggregateMediatorOnCompleteOutputConnector_3132;
		case LogMediator2EditPart.VISUAL_ID:
			return LogMediator_3134;
		case LogMediatorInputConnector2EditPart.VISUAL_ID:
			return LogMediatorInputConnector_3135;
		case LogMediatorOutputConnector2EditPart.VISUAL_ID:
			return LogMediatorOutputConnector_3136;
		case DropMediator2EditPart.VISUAL_ID:
			return DropMediator_3137;
		case DropMediatorInputConnector2EditPart.VISUAL_ID:
			return DropMediatorInputConnector_3138;
		case FilterMediator2EditPart.VISUAL_ID:
			return FilterMediator_3139;
		case FilterMediatorInputConnector2EditPart.VISUAL_ID:
			return FilterMediatorInputConnector_3140;
		case FilterMediatorPassOutputConnector2EditPart.VISUAL_ID:
			return FilterMediatorPassOutputConnector_3141;
		case FilterMediatorFailOutputConnector2EditPart.VISUAL_ID:
			return FilterMediatorFailOutputConnector_3142;
		case PropertyMediator2EditPart.VISUAL_ID:
			return PropertyMediator_3143;
		case PropertyMediatorInputConnector2EditPart.VISUAL_ID:
			return PropertyMediatorInputConnector_3144;
		case PropertyMediatorOutputConnector2EditPart.VISUAL_ID:
			return PropertyMediatorOutputConnector_3145;
		case EnrichMediator2EditPart.VISUAL_ID:
			return EnrichMediator_3146;
		case EnrichMediatorInputConnector2EditPart.VISUAL_ID:
			return EnrichMediatorInputConnector_3147;
		case EnrichMediatorOutputConnector2EditPart.VISUAL_ID:
			return EnrichMediatorOutputConnector_3148;
		case XSLTMediator2EditPart.VISUAL_ID:
			return XSLTMediator_3149;
		case XSLTMediatorInputConnector2EditPart.VISUAL_ID:
			return XSLTMediatorInputConnector_3150;
		case XSLTMediatorOutputConnector2EditPart.VISUAL_ID:
			return XSLTMediatorOutputConnector_3151;
		case SwitchMediator2EditPart.VISUAL_ID:
			return SwitchMediator_3152;
		case SwitchMediatorInputConnector2EditPart.VISUAL_ID:
			return SwitchMediatorInputConnector_3153;
		case SwitchCaseBranchOutputConnector2EditPart.VISUAL_ID:
			return SwitchCaseBranchOutputConnector_3154;
		case SwitchDefaultBranchOutputConnector2EditPart.VISUAL_ID:
			return SwitchDefaultBranchOutputConnector_3155;
		case FaultMediator2EditPart.VISUAL_ID:
			return FaultMediator_3156;
		case FaultMediatorInputConnector2EditPart.VISUAL_ID:
			return FaultMediatorInputConnector_3157;
		case FaultMediatorOutputConnector2EditPart.VISUAL_ID:
			return FaultMediatorOutputConnector_3158;
		case DBLookupMediator2EditPart.VISUAL_ID:
			return DBLookupMediator_3159;
		case DBLookupMediatorInputConnector2EditPart.VISUAL_ID:
			return DBLookupMediatorInputConnector_3160;
		case DBLookupMediatorOutputConnector2EditPart.VISUAL_ID:
			return DBLookupMediatorOutputConnector_3161;
		case DBReportMediator2EditPart.VISUAL_ID:
			return DBReportMediator_3162;
		case DBReportMediatorInputConnector2EditPart.VISUAL_ID:
			return DBReportMediatorInputConnector_3163;
		case DBReportMediatorOutputConnector2EditPart.VISUAL_ID:
			return DBReportMediatorOutputConnector_3164;
		case SendMediator2EditPart.VISUAL_ID:
			return SendMediator_3165;
		case SendMediatorInputConnector2EditPart.VISUAL_ID:
			return SendMediatorInputConnector_3166;
		case SendMediatorOutputConnector2EditPart.VISUAL_ID:
			return SendMediatorOutputConnector_3167;
		case HeaderMediator2EditPart.VISUAL_ID:
			return HeaderMediator_3168;
		case HeaderMediatorInputConnector2EditPart.VISUAL_ID:
			return HeaderMediatorInputConnector_3169;
		case HeaderMediatorOutputConnector2EditPart.VISUAL_ID:
			return HeaderMediatorOutputConnector_3170;
		case CloneMediator2EditPart.VISUAL_ID:
			return CloneMediator_3171;
		case CloneMediatorInputConnector2EditPart.VISUAL_ID:
			return CloneMediatorInputConnector_3172;
		case CloneMediatorOutputConnector2EditPart.VISUAL_ID:
			return CloneMediatorOutputConnector_3173;
		case CloneMediatorTargetOutputConnector2EditPart.VISUAL_ID:
			return CloneMediatorTargetOutputConnector_3174;
		case IterateMediator2EditPart.VISUAL_ID:
			return IterateMediator_3175;
		case IterateMediatorInputConnector2EditPart.VISUAL_ID:
			return IterateMediatorInputConnector_3176;
		case IterateMediatorOutputConnector2EditPart.VISUAL_ID:
			return IterateMediatorOutputConnector_3177;
		case CalloutMediator2EditPart.VISUAL_ID:
			return CalloutMediator_3178;
		case CalloutMediatorInputConnector2EditPart.VISUAL_ID:
			return CalloutMediatorInputConnector_3181;
		case CalloutMediatorOutputConnector2EditPart.VISUAL_ID:
			return CalloutMediatorOutputConnector_3182;
		case TransactionMediator2EditPart.VISUAL_ID:
			return TransactionMediator_3179;
		case TransactionMediatorInputConnector2EditPart.VISUAL_ID:
			return TransactionMediatorInputConnector_3183;
		case TransactionMediatorOutputConnector2EditPart.VISUAL_ID:
			return TransactionMediatorOutputConnector_3184;
		case RMSequenceMediator2EditPart.VISUAL_ID:
			return RMSequenceMediator_3180;
		case RMSequenceMediatorInputConnector2EditPart.VISUAL_ID:
			return RMSequenceMediatorInputConnector_3185;
		case RMSequenceMediatorOutputConnector2EditPart.VISUAL_ID:
			return RMSequenceMediatorOutputConnector_3186;
		case Sequence2EditPart.VISUAL_ID:
			return Sequence_3187;
		case SequenceInputConnector2EditPart.VISUAL_ID:
			return SequenceInputConnector_3188;
		case SequenceOutputConnector2EditPart.VISUAL_ID:
			return SequenceOutputConnector_3189;
		case ProxyServiceOutSequenceEditPart.VISUAL_ID:
			return ProxyServiceOutSequence_3198;
		case DropMediator4EditPart.VISUAL_ID:
			return DropMediator_3194;
		case DropMediatorInputConnector3EditPart.VISUAL_ID:
			return DropMediatorInputConnector_3192;
		case PropertyMediator4EditPart.VISUAL_ID:
			return PropertyMediator_3200;
		case PropertyMediatorInputConnector3EditPart.VISUAL_ID:
			return PropertyMediatorInputConnector_3201;
		case PropertyMediatorOutputConnector3EditPart.VISUAL_ID:
			return PropertyMediatorOutputConnector_3202;
		case ThrottleMediator2EditPart.VISUAL_ID:
			return ThrottleMediator_3206;
		case ThrottleMediatorInputConnector2EditPart.VISUAL_ID:
			return ThrottleMediatorInputConnector_3207;
		case ThrottleMediatorOutputConnector2EditPart.VISUAL_ID:
			return ThrottleMediatorOutputConnector_3208;
		case FilterMediator3EditPart.VISUAL_ID:
			return FilterMediator_3237;
		case FilterMediatorInputConnector3EditPart.VISUAL_ID:
			return FilterMediatorInputConnector_3238;
		case FilterMediatorPassOutputConnector3EditPart.VISUAL_ID:
			return FilterMediatorPassOutputConnector_3239;
		case FilterMediatorFailOutputConnector3EditPart.VISUAL_ID:
			return FilterMediatorFailOutputConnector_3240;
		case LogMediator3EditPart.VISUAL_ID:
			return LogMediator_3241;
		case LogMediatorInputConnector3EditPart.VISUAL_ID:
			return LogMediatorInputConnector_3242;
		case LogMediatorOutputConnector3EditPart.VISUAL_ID:
			return LogMediatorOutputConnector_3243;
		case EnrichMediator3EditPart.VISUAL_ID:
			return EnrichMediator_3244;
		case EnrichMediatorInputConnector3EditPart.VISUAL_ID:
			return EnrichMediatorInputConnector_3245;
		case EnrichMediatorOutputConnector3EditPart.VISUAL_ID:
			return EnrichMediatorOutputConnector_3246;
		case XSLTMediator3EditPart.VISUAL_ID:
			return XSLTMediator_3247;
		case XSLTMediatorInputConnector3EditPart.VISUAL_ID:
			return XSLTMediatorInputConnector_3248;
		case XSLTMediatorOutputConnector3EditPart.VISUAL_ID:
			return XSLTMediatorOutputConnector_3249;
		case SwitchMediator3EditPart.VISUAL_ID:
			return SwitchMediator_3250;
		case SwitchMediatorInputConnector3EditPart.VISUAL_ID:
			return SwitchMediatorInputConnector_3251;
		case SwitchCaseBranchOutputConnector3EditPart.VISUAL_ID:
			return SwitchCaseBranchOutputConnector_3252;
		case SwitchDefaultBranchOutputConnector3EditPart.VISUAL_ID:
			return SwitchDefaultBranchOutputConnector_3253;
		case Sequence3EditPart.VISUAL_ID:
			return Sequence_3254;
		case SequenceInputConnector3EditPart.VISUAL_ID:
			return SequenceInputConnector_3255;
		case SequenceOutputConnector3EditPart.VISUAL_ID:
			return SequenceOutputConnector_3256;
		case EventMediator2EditPart.VISUAL_ID:
			return EventMediator_3257;
		case EventMediatorInputConnector2EditPart.VISUAL_ID:
			return EventMediatorInputConnector_3258;
		case EventMediatorOutputConnector2EditPart.VISUAL_ID:
			return EventMediatorOutputConnector_3259;
		case EntitlementMediator2EditPart.VISUAL_ID:
			return EntitlementMediator_3260;
		case EntitlementMediatorInputConnector2EditPart.VISUAL_ID:
			return EntitlementMediatorInputConnector_3261;
		case EntitlementMediatorOutputConnector2EditPart.VISUAL_ID:
			return EntitlementMediatorOutputConnector_3262;
		case ClassMediator2EditPart.VISUAL_ID:
			return ClassMediator_3263;
		case ClassMediatorInputConnector2EditPart.VISUAL_ID:
			return ClassMediatorInputConnector_3264;
		case ClassMediatorOutputConnector2EditPart.VISUAL_ID:
			return ClassMediatorOutputConnector_3265;
		case SpringMediator2EditPart.VISUAL_ID:
			return SpringMediator_3266;
		case SpringMediatorInputConnector2EditPart.VISUAL_ID:
			return SpringMediatorInputConnector_3267;
		case SpringMediatorOutputConnector2EditPart.VISUAL_ID:
			return SpringMediatorOutputConnector_3268;
		case ScriptMediator2EditPart.VISUAL_ID:
			return ScriptMediator_3269;
		case ScriptMediatorInputConnector2EditPart.VISUAL_ID:
			return ScriptMediatorInputConnector_3270;
		case ScriptMediatorOutputConnector2EditPart.VISUAL_ID:
			return ScriptMediatorOutputConnector_3271;
		case FaultMediator3EditPart.VISUAL_ID:
			return FaultMediator_3272;
		case FaultMediatorInputConnector3EditPart.VISUAL_ID:
			return FaultMediatorInputConnector_3273;
		case FaultMediatorOutputConnector3EditPart.VISUAL_ID:
			return FaultMediatorOutputConnector_3274;
		case XQueryMediator2EditPart.VISUAL_ID:
			return XQueryMediator_3275;
		case XQueryMediatorInputConnector2EditPart.VISUAL_ID:
			return XQueryMediatorInputConnector_3276;
		case XQueryMediatorOutputConnector2EditPart.VISUAL_ID:
			return XQueryMediatorOutputConnector_3277;
		case CommandMediator2EditPart.VISUAL_ID:
			return CommandMediator_3278;
		case CommandMediatorInputConnector2EditPart.VISUAL_ID:
			return CommandMediatorInputConnector_3279;
		case CommandMediatorOutputConnector2EditPart.VISUAL_ID:
			return CommandMediatorOutputConnector_3280;
		case DBLookupMediator3EditPart.VISUAL_ID:
			return DBLookupMediator_3281;
		case DBLookupMediatorInputConnector3EditPart.VISUAL_ID:
			return DBLookupMediatorInputConnector_3282;
		case DBLookupMediatorOutputConnector3EditPart.VISUAL_ID:
			return DBLookupMediatorOutputConnector_3283;
		case DBReportMediator3EditPart.VISUAL_ID:
			return DBReportMediator_3284;
		case DBReportMediatorInputConnector3EditPart.VISUAL_ID:
			return DBReportMediatorInputConnector_3285;
		case DBReportMediatorOutputConnector3EditPart.VISUAL_ID:
			return DBReportMediatorOutputConnector_3286;
		case SmooksMediator2EditPart.VISUAL_ID:
			return SmooksMediator_3287;
		case SmooksMediatorInputConnector2EditPart.VISUAL_ID:
			return SmooksMediatorInputConnector_3288;
		case SmooksMediatorOutputConnector2EditPart.VISUAL_ID:
			return SmooksMediatorOutputConnector_3289;
		case SendMediator3EditPart.VISUAL_ID:
			return SendMediator_3290;
		case SendMediatorInputConnector3EditPart.VISUAL_ID:
			return SendMediatorInputConnector_3291;
		case SendMediatorOutputConnector3EditPart.VISUAL_ID:
			return SendMediatorOutputConnector_3292;
		case HeaderMediator3EditPart.VISUAL_ID:
			return HeaderMediator_3293;
		case HeaderMediatorInputConnector3EditPart.VISUAL_ID:
			return HeaderMediatorInputConnector_3294;
		case HeaderMediatorOutputConnector3EditPart.VISUAL_ID:
			return HeaderMediatorOutputConnector_3295;
		case CloneMediator3EditPart.VISUAL_ID:
			return CloneMediator_3296;
		case CloneMediatorInputConnector3EditPart.VISUAL_ID:
			return CloneMediatorInputConnector_3297;
		case CloneMediatorOutputConnector3EditPart.VISUAL_ID:
			return CloneMediatorOutputConnector_3298;
		case CloneMediatorTargetOutputConnector3EditPart.VISUAL_ID:
			return CloneMediatorTargetOutputConnector_3299;
		case CacheMediator2EditPart.VISUAL_ID:
			return CacheMediator_3300;
		case CacheMediatorInputConnector2EditPart.VISUAL_ID:
			return CacheMediatorInputConnector_3301;
		case CacheMediatorOutputConnector2EditPart.VISUAL_ID:
			return CacheMediatorOutputConnector_3302;
		case IterateMediator3EditPart.VISUAL_ID:
			return IterateMediator_3303;
		case IterateMediatorInputConnector3EditPart.VISUAL_ID:
			return IterateMediatorInputConnector_3304;
		case IterateMediatorOutputConnector3EditPart.VISUAL_ID:
			return IterateMediatorOutputConnector_3305;
		case CalloutMediator3EditPart.VISUAL_ID:
			return CalloutMediator_3306;
		case CalloutMediatorInputConnector3EditPart.VISUAL_ID:
			return CalloutMediatorInputConnector_3307;
		case CalloutMediatorOutputConnector3EditPart.VISUAL_ID:
			return CalloutMediatorOutputConnector_3308;
		case TransactionMediator3EditPart.VISUAL_ID:
			return TransactionMediator_3309;
		case TransactionMediatorInputConnector3EditPart.VISUAL_ID:
			return TransactionMediatorInputConnector_3310;
		case TransactionMediatorOutputConnector3EditPart.VISUAL_ID:
			return TransactionMediatorOutputConnector_3311;
		case RMSequenceMediator3EditPart.VISUAL_ID:
			return RMSequenceMediator_3312;
		case RMSequenceMediatorInputConnector3EditPart.VISUAL_ID:
			return RMSequenceMediatorInputConnector_3313;
		case RMSequenceMediatorOutputConnector3EditPart.VISUAL_ID:
			return RMSequenceMediatorOutputConnector_3314;
		case RuleMediator2EditPart.VISUAL_ID:
			return RuleMediator_3315;
		case RuleMediatorInputConnector2EditPart.VISUAL_ID:
			return RuleMediatorInputConnector_3316;
		case RuleMediatorOutputConnector2EditPart.VISUAL_ID:
			return RuleMediatorOutputConnector_3317;
		case OAuthMediator2EditPart.VISUAL_ID:
			return OAuthMediator_3318;
		case OAuthMediatorInputConnector2EditPart.VISUAL_ID:
			return OAuthMediatorInputConnector_3319;
		case OAuthMediatorOutputConnector2EditPart.VISUAL_ID:
			return OAuthMediatorOutputConnector_3320;
		case AggregateMediator2EditPart.VISUAL_ID:
			return AggregateMediator_3321;
		case AggregateMediatorInputConnector2EditPart.VISUAL_ID:
			return AggregateMediatorInputConnector_3322;
		case AggregateMediatorOutputConnector2EditPart.VISUAL_ID:
			return AggregateMediatorOutputConnector_3323;
		case AggregateMediatorOnCompleteOutputConnector2EditPart.VISUAL_ID:
			return AggregateMediatorOnCompleteOutputConnector_3324;
		case LogMediator4EditPart.VISUAL_ID:
			return LogMediator_3325;
		case LogMediatorInputConnector4EditPart.VISUAL_ID:
			return LogMediatorInputConnector_3326;
		case LogMediatorOutputConnector4EditPart.VISUAL_ID:
			return LogMediatorOutputConnector_3327;
		case DropMediator5EditPart.VISUAL_ID:
			return DropMediator_3328;
		case DropMediatorInputConnector4EditPart.VISUAL_ID:
			return DropMediatorInputConnector_3195;
		case FilterMediator4EditPart.VISUAL_ID:
			return FilterMediator_3329;
		case FilterMediatorInputConnector4EditPart.VISUAL_ID:
			return FilterMediatorInputConnector_3330;
		case FilterMediatorPassOutputConnector4EditPart.VISUAL_ID:
			return FilterMediatorPassOutputConnector_3331;
		case FilterMediatorFailOutputConnector4EditPart.VISUAL_ID:
			return FilterMediatorFailOutputConnector_3332;
		case PropertyMediator5EditPart.VISUAL_ID:
			return PropertyMediator_3333;
		case PropertyMediatorInputConnector4EditPart.VISUAL_ID:
			return PropertyMediatorInputConnector_3203;
		case PropertyMediatorOutputConnector4EditPart.VISUAL_ID:
			return PropertyMediatorOutputConnector_3204;
		case EnrichMediator4EditPart.VISUAL_ID:
			return EnrichMediator_3334;
		case EnrichMediatorInputConnector4EditPart.VISUAL_ID:
			return EnrichMediatorInputConnector_3388;
		case EnrichMediatorOutputConnector4EditPart.VISUAL_ID:
			return EnrichMediatorOutputConnector_3389;
		case XSLTMediator4EditPart.VISUAL_ID:
			return XSLTMediator_3337;
		case XSLTMediatorInputConnector4EditPart.VISUAL_ID:
			return XSLTMediatorInputConnector_3338;
		case XSLTMediatorOutputConnector4EditPart.VISUAL_ID:
			return XSLTMediatorOutputConnector_3339;
		case SwitchMediator4EditPart.VISUAL_ID:
			return SwitchMediator_3340;
		case SwitchMediatorInputConnector4EditPart.VISUAL_ID:
			return SwitchMediatorInputConnector_3341;
		case SwitchCaseBranchOutputConnector4EditPart.VISUAL_ID:
			return SwitchCaseBranchOutputConnector_3342;
		case SwitchDefaultBranchOutputConnector4EditPart.VISUAL_ID:
			return SwitchDefaultBranchOutputConnector_3343;
		case FaultMediator4EditPart.VISUAL_ID:
			return FaultMediator_3344;
		case FaultMediatorInputConnector4EditPart.VISUAL_ID:
			return FaultMediatorInputConnector_3345;
		case FaultMediatorOutputConnector4EditPart.VISUAL_ID:
			return FaultMediatorOutputConnector_3346;
		case DBLookupMediator4EditPart.VISUAL_ID:
			return DBLookupMediator_3347;
		case DBLookupMediatorInputConnector4EditPart.VISUAL_ID:
			return DBLookupMediatorInputConnector_3348;
		case DBLookupMediatorOutputConnector4EditPart.VISUAL_ID:
			return DBLookupMediatorOutputConnector_3349;
		case DBReportMediator4EditPart.VISUAL_ID:
			return DBReportMediator_3350;
		case DBReportMediatorInputConnector4EditPart.VISUAL_ID:
			return DBReportMediatorInputConnector_3351;
		case DBReportMediatorOutputConnector4EditPart.VISUAL_ID:
			return DBReportMediatorOutputConnector_3352;
		case SendMediator4EditPart.VISUAL_ID:
			return SendMediator_3353;
		case SendMediatorInputConnector4EditPart.VISUAL_ID:
			return SendMediatorInputConnector_3354;
		case SendMediatorOutputConnector4EditPart.VISUAL_ID:
			return SendMediatorOutputConnector_3355;
		case HeaderMediator4EditPart.VISUAL_ID:
			return HeaderMediator_3356;
		case HeaderMediatorInputConnector4EditPart.VISUAL_ID:
			return HeaderMediatorInputConnector_3357;
		case HeaderMediatorOutputConnector4EditPart.VISUAL_ID:
			return HeaderMediatorOutputConnector_3358;
		case CloneMediator4EditPart.VISUAL_ID:
			return CloneMediator_3359;
		case CloneMediatorInputConnector4EditPart.VISUAL_ID:
			return CloneMediatorInputConnector_3360;
		case CloneMediatorOutputConnector4EditPart.VISUAL_ID:
			return CloneMediatorOutputConnector_3361;
		case CloneMediatorTargetOutputConnector4EditPart.VISUAL_ID:
			return CloneMediatorTargetOutputConnector_3362;
		case IterateMediator4EditPart.VISUAL_ID:
			return IterateMediator_3363;
		case IterateMediatorInputConnector4EditPart.VISUAL_ID:
			return IterateMediatorInputConnector_3364;
		case IterateMediatorOutputConnector4EditPart.VISUAL_ID:
			return IterateMediatorOutputConnector_3365;
		case CalloutMediator4EditPart.VISUAL_ID:
			return CalloutMediator_3366;
		case CalloutMediatorInputConnector4EditPart.VISUAL_ID:
			return CalloutMediatorInputConnector_3367;
		case CalloutMediatorOutputConnector4EditPart.VISUAL_ID:
			return CalloutMediatorOutputConnector_3368;
		case TransactionMediator4EditPart.VISUAL_ID:
			return TransactionMediator_3369;
		case TransactionMediatorInputConnector4EditPart.VISUAL_ID:
			return TransactionMediatorInputConnector_3370;
		case TransactionMediatorOutputConnector4EditPart.VISUAL_ID:
			return TransactionMediatorOutputConnector_3371;
		case RMSequenceMediator4EditPart.VISUAL_ID:
			return RMSequenceMediator_3372;
		case RMSequenceMediatorInputConnector4EditPart.VISUAL_ID:
			return RMSequenceMediatorInputConnector_3373;
		case RMSequenceMediatorOutputConnector4EditPart.VISUAL_ID:
			return RMSequenceMediatorOutputConnector_3374;
		case Sequence4EditPart.VISUAL_ID:
			return Sequence_3375;
		case SequenceInputConnector4EditPart.VISUAL_ID:
			return SequenceInputConnector_3376;
		case SequenceOutputConnector4EditPart.VISUAL_ID:
			return SequenceOutputConnector_3377;
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
		case DropMediatorEditPart.VISUAL_ID:
			return DropMediator_3394;
		case DropMediatorInputConnector5EditPart.VISUAL_ID:
			return DropMediatorInputConnector_3395;
		case PropertyMediatorEditPart.VISUAL_ID:
			return PropertyMediator_3396;
		case PropertyMediatorInputConnector5EditPart.VISUAL_ID:
			return PropertyMediatorInputConnector_3397;
		case PropertyMediatorOutputConnector5EditPart.VISUAL_ID:
			return PropertyMediatorOutputConnector_3398;
		case ThrottleMediator3EditPart.VISUAL_ID:
			return ThrottleMediator_3399;
		case ThrottleMediatorInputConnector3EditPart.VISUAL_ID:
			return ThrottleMediatorInputConnector_3400;
		case ThrottleMediatorOutputConnector3EditPart.VISUAL_ID:
			return ThrottleMediatorOutputConnector_3401;
		case FilterMediator5EditPart.VISUAL_ID:
			return FilterMediator_3402;
		case FilterMediatorInputConnector5EditPart.VISUAL_ID:
			return FilterMediatorInputConnector_3403;
		case FilterMediatorPassOutputConnector5EditPart.VISUAL_ID:
			return FilterMediatorPassOutputConnector_3404;
		case FilterMediatorFailOutputConnector5EditPart.VISUAL_ID:
			return FilterMediatorFailOutputConnector_3405;
		case LogMediator5EditPart.VISUAL_ID:
			return LogMediator_3406;
		case LogMediatorInputConnector5EditPart.VISUAL_ID:
			return LogMediatorInputConnector_3407;
		case LogMediatorOutputConnector5EditPart.VISUAL_ID:
			return LogMediatorOutputConnector_3408;
		case EnrichMediator5EditPart.VISUAL_ID:
			return EnrichMediator_3409;
		case EnrichMediatorInputConnector5EditPart.VISUAL_ID:
			return EnrichMediatorInputConnector_3410;
		case EnrichMediatorOutputConnector5EditPart.VISUAL_ID:
			return EnrichMediatorOutputConnector_3411;
		case XSLTMediator5EditPart.VISUAL_ID:
			return XSLTMediator_3412;
		case XSLTMediatorInputConnector5EditPart.VISUAL_ID:
			return XSLTMediatorInputConnector_3413;
		case XSLTMediatorOutputConnector5EditPart.VISUAL_ID:
			return XSLTMediatorOutputConnector_3414;
		case SwitchMediator5EditPart.VISUAL_ID:
			return SwitchMediator_3415;
		case SwitchMediatorInputConnector5EditPart.VISUAL_ID:
			return SwitchMediatorInputConnector_3416;
		case SwitchCaseBranchOutputConnector5EditPart.VISUAL_ID:
			return SwitchCaseBranchOutputConnector_3417;
		case SwitchDefaultBranchOutputConnector5EditPart.VISUAL_ID:
			return SwitchDefaultBranchOutputConnector_3418;
		case Sequence5EditPart.VISUAL_ID:
			return Sequence_3419;
		case SequenceInputConnector5EditPart.VISUAL_ID:
			return SequenceInputConnector_3420;
		case SequenceOutputConnector5EditPart.VISUAL_ID:
			return SequenceOutputConnector_3421;
		case EventMediator3EditPart.VISUAL_ID:
			return EventMediator_3422;
		case EventMediatorInputConnector3EditPart.VISUAL_ID:
			return EventMediatorInputConnector_3423;
		case EventMediatorOutputConnector3EditPart.VISUAL_ID:
			return EventMediatorOutputConnector_3424;
		case EntitlementMediator3EditPart.VISUAL_ID:
			return EntitlementMediator_3425;
		case EntitlementMediatorInputConnector3EditPart.VISUAL_ID:
			return EntitlementMediatorInputConnector_3426;
		case EntitlementMediatorOutputConnector3EditPart.VISUAL_ID:
			return EntitlementMediatorOutputConnector_3427;
		case ClassMediator3EditPart.VISUAL_ID:
			return ClassMediator_3428;
		case ClassMediatorInputConnector3EditPart.VISUAL_ID:
			return ClassMediatorInputConnector_3429;
		case ClassMediatorOutputConnector3EditPart.VISUAL_ID:
			return ClassMediatorOutputConnector_3430;
		case SpringMediator3EditPart.VISUAL_ID:
			return SpringMediator_3431;
		case SpringMediatorInputConnector3EditPart.VISUAL_ID:
			return SpringMediatorInputConnector_3432;
		case SpringMediatorOutputConnector3EditPart.VISUAL_ID:
			return SpringMediatorOutputConnector_3433;
		case ScriptMediator3EditPart.VISUAL_ID:
			return ScriptMediator_3434;
		case ScriptMediatorInputConnector3EditPart.VISUAL_ID:
			return ScriptMediatorInputConnector_3435;
		case ScriptMediatorOutputConnector3EditPart.VISUAL_ID:
			return ScriptMediatorOutputConnector_3436;
		case FaultMediator5EditPart.VISUAL_ID:
			return FaultMediator_3437;
		case FaultMediatorInputConnector5EditPart.VISUAL_ID:
			return FaultMediatorInputConnector_3438;
		case FaultMediatorOutputConnector5EditPart.VISUAL_ID:
			return FaultMediatorOutputConnector_3439;
		case XQueryMediator3EditPart.VISUAL_ID:
			return XQueryMediator_3440;
		case XQueryMediatorInputConnector3EditPart.VISUAL_ID:
			return XQueryMediatorInputConnector_3441;
		case XQueryMediatorOutputConnector3EditPart.VISUAL_ID:
			return XQueryMediatorOutputConnector_3442;
		case CommandMediator3EditPart.VISUAL_ID:
			return CommandMediator_3443;
		case CommandMediatorInputConnector3EditPart.VISUAL_ID:
			return CommandMediatorInputConnector_3444;
		case CommandMediatorOutputConnector3EditPart.VISUAL_ID:
			return CommandMediatorOutputConnector_3445;
		case DBLookupMediator5EditPart.VISUAL_ID:
			return DBLookupMediator_3446;
		case DBLookupMediatorInputConnector5EditPart.VISUAL_ID:
			return DBLookupMediatorInputConnector_3447;
		case DBLookupMediatorOutputConnector5EditPart.VISUAL_ID:
			return DBLookupMediatorOutputConnector_3448;
		case DBReportMediator5EditPart.VISUAL_ID:
			return DBReportMediator_3449;
		case DBReportMediatorInputConnector5EditPart.VISUAL_ID:
			return DBReportMediatorInputConnector_3450;
		case DBReportMediatorOutputConnector5EditPart.VISUAL_ID:
			return DBReportMediatorOutputConnector_3451;
		case SmooksMediator3EditPart.VISUAL_ID:
			return SmooksMediator_3452;
		case SmooksMediatorInputConnector3EditPart.VISUAL_ID:
			return SmooksMediatorInputConnector_3453;
		case SmooksMediatorOutputConnector3EditPart.VISUAL_ID:
			return SmooksMediatorOutputConnector_3454;
		case SendMediator5EditPart.VISUAL_ID:
			return SendMediator_3455;
		case SendMediatorInputConnector5EditPart.VISUAL_ID:
			return SendMediatorInputConnector_3456;
		case SendMediatorOutputConnector5EditPart.VISUAL_ID:
			return SendMediatorOutputConnector_3457;
		case HeaderMediator5EditPart.VISUAL_ID:
			return HeaderMediator_3458;
		case HeaderMediatorInputConnector5EditPart.VISUAL_ID:
			return HeaderMediatorInputConnector_3459;
		case HeaderMediatorOutputConnector5EditPart.VISUAL_ID:
			return HeaderMediatorOutputConnector_3460;
		case CloneMediator5EditPart.VISUAL_ID:
			return CloneMediator_3461;
		case CloneMediatorInputConnector5EditPart.VISUAL_ID:
			return CloneMediatorInputConnector_3462;
		case CloneMediatorOutputConnector5EditPart.VISUAL_ID:
			return CloneMediatorOutputConnector_3463;
		case CloneMediatorTargetOutputConnector5EditPart.VISUAL_ID:
			return CloneMediatorTargetOutputConnector_3464;
		case CacheMediator3EditPart.VISUAL_ID:
			return CacheMediator_3465;
		case CacheMediatorInputConnector3EditPart.VISUAL_ID:
			return CacheMediatorInputConnector_3466;
		case CacheMediatorOutputConnector3EditPart.VISUAL_ID:
			return CacheMediatorOutputConnector_3467;
		case IterateMediator5EditPart.VISUAL_ID:
			return IterateMediator_3468;
		case IterateMediatorInputConnector5EditPart.VISUAL_ID:
			return IterateMediatorInputConnector_3469;
		case IterateMediatorOutputConnector5EditPart.VISUAL_ID:
			return IterateMediatorOutputConnector_3470;
		case CalloutMediator5EditPart.VISUAL_ID:
			return CalloutMediator_3471;
		case CalloutMediatorInputConnector5EditPart.VISUAL_ID:
			return CalloutMediatorInputConnector_3472;
		case CalloutMediatorOutputConnector5EditPart.VISUAL_ID:
			return CalloutMediatorOutputConnector_3473;
		case TransactionMediator5EditPart.VISUAL_ID:
			return TransactionMediator_3474;
		case TransactionMediatorInputConnector5EditPart.VISUAL_ID:
			return TransactionMediatorInputConnector_3475;
		case TransactionMediatorOutputConnector5EditPart.VISUAL_ID:
			return TransactionMediatorOutputConnector_3476;
		case RMSequenceMediator5EditPart.VISUAL_ID:
			return RMSequenceMediator_3477;
		case RMSequenceMediatorInputConnector5EditPart.VISUAL_ID:
			return RMSequenceMediatorInputConnector_3478;
		case RMSequenceMediatorOutputConnector5EditPart.VISUAL_ID:
			return RMSequenceMediatorOutputConnector_3479;
		case RuleMediator3EditPart.VISUAL_ID:
			return RuleMediator_3480;
		case RuleMediatorInputConnector3EditPart.VISUAL_ID:
			return RuleMediatorInputConnector_3481;
		case RuleMediatorOutputConnector3EditPart.VISUAL_ID:
			return RuleMediatorOutputConnector_3482;
		case OAuthMediator3EditPart.VISUAL_ID:
			return OAuthMediator_3483;
		case OAuthMediatorInputConnector3EditPart.VISUAL_ID:
			return OAuthMediatorInputConnector_3484;
		case OAuthMediatorOutputConnector3EditPart.VISUAL_ID:
			return OAuthMediatorOutputConnector_3485;
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
