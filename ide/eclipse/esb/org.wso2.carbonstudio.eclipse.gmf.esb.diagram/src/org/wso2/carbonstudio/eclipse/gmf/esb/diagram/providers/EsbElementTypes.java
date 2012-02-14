package org.wso2.carbonstudio.eclipse.gmf.esb.diagram.providers;

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
import org.wso2.carbonstudio.eclipse.gmf.esb.EsbPackage;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.*;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.AddressEndPointEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.AddressEndPointInputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.AddressEndPointOutputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.ClassMediatorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.ClassMediatorInputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.ClassMediatorOutputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.CloneMediatorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.CloneMediatorInputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.CloneMediatorOutputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.CommandMediatorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.CommandMediatorInputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.CommandMediatorOutputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.DBLookupMediatorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.DBLookupMediatorInputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.DBLookupMediatorOutputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.DBReportMediatorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.DBReportMediatorInputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.DBReportMediatorOutputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.DefaultEndPointEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.DefaultEndPointInputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.DefaultEndPointOutputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.DropMediatorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.DropMediatorInputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.EnrichMediatorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.EnrichMediatorInputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.EnrichMediatorOutputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.EntitlementMediatorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.EntitlementMediatorInputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.EntitlementMediatorOutputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.EsbDiagramEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.EsbLinkEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.EsbServerEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.EventMediatorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.EventMediatorInputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.EventMediatorOutputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.FailoverEndPointEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.FailoverEndPointInputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.FailoverEndPointOutputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.FailoverEndPointWestOutputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.FaultMediatorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.FaultMediatorInputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.FaultMediatorOutputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.FilterMediatorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.FilterMediatorFailOutputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.FilterMediatorInputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.FilterMediatorPassOutputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.HeaderMediatorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.HeaderMediatorInputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.HeaderMediatorOutputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.LoadBalanceEndPointEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.LoadBalanceEndPointInputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.LoadBalanceEndPointOutputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.LoadBalanceEndPointWestOutputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.LogMediatorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.LogMediatorInputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.LogMediatorOutputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.MergeNodeEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.MergeNodeFirstInputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.MergeNodeOutputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.MergeNodeSecondInputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.MessageInputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.MessageMediatorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.MessageOutputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.PropertyMediatorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.PropertyMediatorInputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.PropertyMediatorOutputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.ProxyInputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.ProxyOutputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.ProxyServiceEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.ScriptMediatorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.ScriptMediatorInputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.ScriptMediatorOutputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.SendMediatorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.SendMediatorInputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.SendMediatorOutputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.SequenceEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.SequenceInputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.SequenceOutputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.SmooksMediatorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.SmooksMediatorInputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.SmooksMediatorOutputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.SpringMediatorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.SpringMediatorInputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.SpringMediatorOutputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.SwitchCaseBranchOutputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.SwitchDefaultBranchOutputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.SwitchMediatorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.SwitchMediatorInputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.WSDLEndPointEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.WSDLEndPointInputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.WSDLEndPointOutputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.XQueryMediatorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.XQueryMediatorInputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.XQueryMediatorOutputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.XSLTMediatorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.XSLTMediatorInputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.edit.parts.XSLTMediatorOutputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.diagram.part.EsbDiagramEditorPlugin;

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
	public static final IElementType EsbDiagram_1000 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.diagram.EsbDiagram_1000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType EsbServer_2001 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.diagram.EsbServer_2001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ProxyService_3001 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.diagram.ProxyService_3001"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType ProxyOutputConnector_3002 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.diagram.ProxyOutputConnector_3002"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType ProxyInputConnector_3003 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.diagram.ProxyInputConnector_3003"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType MessageMediator_3045 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.diagram.MessageMediator_3045"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType MessageInputConnector_3046 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.diagram.MessageInputConnector_3046"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType MessageOutputConnector_3047 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.diagram.MessageOutputConnector_3047"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType DropMediator_3007 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.diagram.DropMediator_3007"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType DropMediatorInputConnector_3008 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.diagram.DropMediatorInputConnector_3008"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType FilterMediator_3009 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.diagram.FilterMediator_3009"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType FilterMediatorInputConnector_3010 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.diagram.FilterMediatorInputConnector_3010"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType FilterMediatorPassOutputConnector_3011 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.diagram.FilterMediatorPassOutputConnector_3011"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType FilterMediatorFailOutputConnector_3012 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.diagram.FilterMediatorFailOutputConnector_3012"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType MergeNode_3013 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.diagram.MergeNode_3013"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType MergeNodeFirstInputConnector_3014 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.diagram.MergeNodeFirstInputConnector_3014"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType MergeNodeSecondInputConnector_3015 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.diagram.MergeNodeSecondInputConnector_3015"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType MergeNodeOutputConnector_3016 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.diagram.MergeNodeOutputConnector_3016"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType LogMediator_3017 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.diagram.LogMediator_3017"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType LogMediatorInputConnector_3018 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.diagram.LogMediatorInputConnector_3018"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType LogMediatorOutputConnector_3019 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.diagram.LogMediatorOutputConnector_3019"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType PropertyMediator_3032 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.diagram.PropertyMediator_3032"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType PropertyMediatorInputConnector_3033 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.diagram.PropertyMediatorInputConnector_3033"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType PropertyMediatorOutputConnector_3034 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.diagram.PropertyMediatorOutputConnector_3034"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType EnrichMediator_3035 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.diagram.EnrichMediator_3035"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType EnrichMediatorInputConnector_3036 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.diagram.EnrichMediatorInputConnector_3036"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType EnrichMediatorOutputConnector_3037 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.diagram.EnrichMediatorOutputConnector_3037"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType XSLTMediator_3038 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.diagram.XSLTMediator_3038"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType XSLTMediatorInputConnector_3039 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.diagram.XSLTMediatorInputConnector_3039"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType XSLTMediatorOutputConnector_3040 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.diagram.XSLTMediatorOutputConnector_3040"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType SwitchMediator_3041 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.diagram.SwitchMediator_3041"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType SwitchMediatorInputConnector_3042 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.diagram.SwitchMediatorInputConnector_3042"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType SwitchCaseBranchOutputConnector_3043 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.diagram.SwitchCaseBranchOutputConnector_3043"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType SwitchDefaultBranchOutputConnector_3044 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.diagram.SwitchDefaultBranchOutputConnector_3044"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Sequence_3048 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.diagram.Sequence_3048"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType SequenceInputConnector_3049 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.diagram.SequenceInputConnector_3049"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType SequenceOutputConnector_3050 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.diagram.SequenceOutputConnector_3050"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType EventMediator_3051 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.diagram.EventMediator_3051"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType EventMediatorInputConnector_3052 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.diagram.EventMediatorInputConnector_3052"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType EventMediatorOutputConnector_3053 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.diagram.EventMediatorOutputConnector_3053"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType EntitlementMediator_3054 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.diagram.EntitlementMediator_3054"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType EntitlementMediatorInputConnector_3055 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.diagram.EntitlementMediatorInputConnector_3055"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType EntitlementMediatorOutputConnector_3056 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.diagram.EntitlementMediatorOutputConnector_3056"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType ClassMediator_3057 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.diagram.ClassMediator_3057"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType ClassMediatorInputConnector_3058 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.diagram.ClassMediatorInputConnector_3058"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType ClassMediatorOutputConnector_3059 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.diagram.ClassMediatorOutputConnector_3059"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType SpringMediator_3060 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.diagram.SpringMediator_3060"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType SpringMediatorInputConnector_3061 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.diagram.SpringMediatorInputConnector_3061"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType SpringMediatorOutputConnector_3062 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.diagram.SpringMediatorOutputConnector_3062"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType ScriptMediator_3063 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.diagram.ScriptMediator_3063"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType ScriptMediatorInputConnector_3064 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.diagram.ScriptMediatorInputConnector_3064"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType ScriptMediatorOutputConnector_3065 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.diagram.ScriptMediatorOutputConnector_3065"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType FaultMediator_3066 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.diagram.FaultMediator_3066"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType FaultMediatorInputConnector_3067 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.diagram.FaultMediatorInputConnector_3067"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType FaultMediatorOutputConnector_3068 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.diagram.FaultMediatorOutputConnector_3068"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType XQueryMediator_3069 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.diagram.XQueryMediator_3069"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType XQueryMediatorInputConnector_3070 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.diagram.XQueryMediatorInputConnector_3070"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType XQueryMediatorOutputConnector_3071 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.diagram.XQueryMediatorOutputConnector_3071"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType CommandMediator_3072 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.diagram.CommandMediator_3072"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType CommandMediatorInputConnector_3073 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.diagram.CommandMediatorInputConnector_3073"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType CommandMediatorOutputConnector_3074 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.diagram.CommandMediatorOutputConnector_3074"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType DBLookupMediator_3075 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.diagram.DBLookupMediator_3075"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType DBLookupMediatorInputConnector_3076 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.diagram.DBLookupMediatorInputConnector_3076"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType DBLookupMediatorOutputConnector_3077 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.diagram.DBLookupMediatorOutputConnector_3077"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType DBReportMediator_3078 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.diagram.DBReportMediator_3078"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType DBReportMediatorInputConnector_3079 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.diagram.DBReportMediatorInputConnector_3079"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType DBReportMediatorOutputConnector_3080 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.diagram.DBReportMediatorOutputConnector_3080"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType SmooksMediator_3081 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.diagram.SmooksMediator_3081"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType SmooksMediatorInputConnector_3082 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.diagram.SmooksMediatorInputConnector_3082"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType SmooksMediatorOutputConnector_3083 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.diagram.SmooksMediatorOutputConnector_3083"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType SendMediator_3084 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.diagram.SendMediator_3084"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType SendMediatorInputConnector_3085 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.diagram.SendMediatorInputConnector_3085"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType SendMediatorOutputConnector_3086 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.diagram.SendMediatorOutputConnector_3086"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType FailoverEndPoint_3087 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.diagram.FailoverEndPoint_3087"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType FailoverEndPointInputConnector_3088 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.diagram.FailoverEndPointInputConnector_3088"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType FailoverEndPointOutputConnector_3090 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.diagram.FailoverEndPointOutputConnector_3090"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType FailoverEndPointWestOutputConnector_3097 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.diagram.FailoverEndPointWestOutputConnector_3097"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType WSDLEndPoint_3091 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.diagram.WSDLEndPoint_3091"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType WSDLEndPointInputConnector_3092 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.diagram.WSDLEndPointInputConnector_3092"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType WSDLEndPointOutputConnector_3093 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.diagram.WSDLEndPointOutputConnector_3093"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType LoadBalanceEndPoint_3094 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.diagram.LoadBalanceEndPoint_3094"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType LoadBalanceEndPointInputConnector_3095 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.diagram.LoadBalanceEndPointInputConnector_3095"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType LoadBalanceEndPointOutputConnector_3096 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.diagram.LoadBalanceEndPointOutputConnector_3096"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType LoadBalanceEndPointWestOutputConnector_3098 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.diagram.LoadBalanceEndPointWestOutputConnector_3098"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType HeaderMediator_3099 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.diagram.HeaderMediator_3099"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType HeaderMediatorInputConnector_3100 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.diagram.HeaderMediatorInputConnector_3100"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType HeaderMediatorOutputConnector_3101 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.diagram.HeaderMediatorOutputConnector_3101"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType CloneMediator_3102 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.diagram.CloneMediator_3102"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType CloneMediatorInputConnector_3103 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.diagram.CloneMediatorInputConnector_3103"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType CloneMediatorOutputConnector_3104 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.diagram.CloneMediatorOutputConnector_3104"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType CloneMediatorTargetOutputConnector_3133 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.diagram.CloneMediatorTargetOutputConnector_3133"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType CacheMediator_3105 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.diagram.CacheMediator_3105"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType CacheMediatorInputConnector_3106 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.diagram.CacheMediatorInputConnector_3106"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType CacheMediatorOutputConnector_3107 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.diagram.CacheMediatorOutputConnector_3107"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType IterateMediator_3108 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.diagram.IterateMediator_3108"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType IterateMediatorInputConnector_3109 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.diagram.IterateMediatorInputConnector_3109"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType IterateMediatorOutputConnector_3110 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.diagram.IterateMediatorOutputConnector_3110"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType AggregateMediator_3111 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.diagram.AggregateMediator_3111"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType AggregateMediatorInputConnector_3112 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.diagram.AggregateMediatorInputConnector_3112"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType AggregateMediatorOutputConnector_3113 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.diagram.AggregateMediatorOutputConnector_3113"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType AggregateMediatorOnCompleteOutputConnector_3132 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.diagram.AggregateMediatorOnCompleteOutputConnector_3132"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType LogMediator_3134 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.diagram.LogMediator_3134"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType LogMediatorInputConnector_3135 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.diagram.LogMediatorInputConnector_3135"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType LogMediatorOutputConnector_3136 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.diagram.LogMediatorOutputConnector_3136"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType DropMediator_3137 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.diagram.DropMediator_3137"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType DropMediatorInputConnector_3138 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.diagram.DropMediatorInputConnector_3138"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType FilterMediator_3139 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.diagram.FilterMediator_3139"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType FilterMediatorInputConnector_3140 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.diagram.FilterMediatorInputConnector_3140"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType FilterMediatorPassOutputConnector_3141 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.diagram.FilterMediatorPassOutputConnector_3141"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType FilterMediatorFailOutputConnector_3142 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.diagram.FilterMediatorFailOutputConnector_3142"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType PropertyMediator_3143 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.diagram.PropertyMediator_3143"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType PropertyMediatorInputConnector_3144 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.diagram.PropertyMediatorInputConnector_3144"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType PropertyMediatorOutputConnector_3145 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.diagram.PropertyMediatorOutputConnector_3145"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType EnrichMediator_3146 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.diagram.EnrichMediator_3146"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType EnrichMediatorInputConnector_3147 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.diagram.EnrichMediatorInputConnector_3147"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType EnrichMediatorOutputConnector_3148 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.diagram.EnrichMediatorOutputConnector_3148"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType XSLTMediator_3149 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.diagram.XSLTMediator_3149"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType XSLTMediatorInputConnector_3150 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.diagram.XSLTMediatorInputConnector_3150"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType XSLTMediatorOutputConnector_3151 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.diagram.XSLTMediatorOutputConnector_3151"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType SwitchMediator_3152 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.diagram.SwitchMediator_3152"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType SwitchMediatorInputConnector_3153 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.diagram.SwitchMediatorInputConnector_3153"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType SwitchCaseBranchOutputConnector_3154 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.diagram.SwitchCaseBranchOutputConnector_3154"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType SwitchDefaultBranchOutputConnector_3155 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.diagram.SwitchDefaultBranchOutputConnector_3155"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType FaultMediator_3156 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.diagram.FaultMediator_3156"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType FaultMediatorInputConnector_3157 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.diagram.FaultMediatorInputConnector_3157"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType FaultMediatorOutputConnector_3158 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.diagram.FaultMediatorOutputConnector_3158"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType DBLookupMediator_3159 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.diagram.DBLookupMediator_3159"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType DBLookupMediatorInputConnector_3160 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.diagram.DBLookupMediatorInputConnector_3160"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType DBLookupMediatorOutputConnector_3161 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.diagram.DBLookupMediatorOutputConnector_3161"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType DBReportMediator_3162 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.diagram.DBReportMediator_3162"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType DBReportMediatorInputConnector_3163 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.diagram.DBReportMediatorInputConnector_3163"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType DBReportMediatorOutputConnector_3164 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.diagram.DBReportMediatorOutputConnector_3164"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType SendMediator_3165 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.diagram.SendMediator_3165"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType SendMediatorInputConnector_3166 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.diagram.SendMediatorInputConnector_3166"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType SendMediatorOutputConnector_3167 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.diagram.SendMediatorOutputConnector_3167"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType HeaderMediator_3168 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.diagram.HeaderMediator_3168"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType HeaderMediatorInputConnector_3169 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.diagram.HeaderMediatorInputConnector_3169"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType HeaderMediatorOutputConnector_3170 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.diagram.HeaderMediatorOutputConnector_3170"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType CloneMediator_3171 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.diagram.CloneMediator_3171"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType CloneMediatorInputConnector_3172 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.diagram.CloneMediatorInputConnector_3172"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType CloneMediatorOutputConnector_3173 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.diagram.CloneMediatorOutputConnector_3173"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType CloneMediatorTargetOutputConnector_3174 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.diagram.CloneMediatorTargetOutputConnector_3174"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType IterateMediator_3175 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.diagram.IterateMediator_3175"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType IterateMediatorInputConnector_3176 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.diagram.IterateMediatorInputConnector_3176"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType IterateMediatorOutputConnector_3177 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.diagram.IterateMediatorOutputConnector_3177"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType CalloutMediator_3178 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.diagram.CalloutMediator_3178"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType CalloutMediator_3114 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.diagram.CalloutMediator_3114"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType CalloutMediatorInputConnector_3181 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.diagram.CalloutMediatorInputConnector_3181"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType CalloutMediatorOutputConnector_3182 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.diagram.CalloutMediatorOutputConnector_3182"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType CalloutMediatorInputConnector_3115 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.diagram.CalloutMediatorInputConnector_3115"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType CalloutMediatorOutputConnector_3116 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.diagram.CalloutMediatorOutputConnector_3116"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType TransactionMediator_3179 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.diagram.TransactionMediator_3179"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType TransactionMediator_3117 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.diagram.TransactionMediator_3117"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType TransactionMediatorInputConnector_3183 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.diagram.TransactionMediatorInputConnector_3183"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType TransactionMediatorOutputConnector_3184 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.diagram.TransactionMediatorOutputConnector_3184"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType TransactionMediatorInputConnector_3118 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.diagram.TransactionMediatorInputConnector_3118"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType TransactionMediatorOutputConnector_3119 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.diagram.TransactionMediatorOutputConnector_3119"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType RMSequenceMediator_3180 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.diagram.RMSequenceMediator_3180"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType ThrottleMediator_3120 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.diagram.ThrottleMediator_3120"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType ThrottleMediatorInputConnector_3121 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.diagram.ThrottleMediatorInputConnector_3121"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType ThrottleMediatorOutputConnector_3122 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.diagram.ThrottleMediatorOutputConnector_3122"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType RMSequenceMediator_3123 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.diagram.RMSequenceMediator_3123"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType RMSequenceMediatorInputConnector_3185 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.diagram.RMSequenceMediatorInputConnector_3185"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType RMSequenceMediatorOutputConnector_3186 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.diagram.RMSequenceMediatorOutputConnector_3186"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType RMSequenceMediatorInputConnector_3124 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.diagram.RMSequenceMediatorInputConnector_3124"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType RMSequenceMediatorOutputConnector_3125 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.diagram.RMSequenceMediatorOutputConnector_3125"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Sequence_3187 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.diagram.Sequence_3187"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType SequenceInputConnector_3188 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.diagram.SequenceInputConnector_3188"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType SequenceOutputConnector_3189 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.diagram.SequenceOutputConnector_3189"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType RuleMediator_3126 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.diagram.RuleMediator_3126"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType RuleMediatorInputConnector_3127 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.diagram.RuleMediatorInputConnector_3127"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType RuleMediatorOutputConnector_3128 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.diagram.RuleMediatorOutputConnector_3128"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType OAuthMediator_3129 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.diagram.OAuthMediator_3129"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType OAuthMediatorInputConnector_3130 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.diagram.OAuthMediatorInputConnector_3130"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType OAuthMediatorOutputConnector_3131 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.diagram.OAuthMediatorOutputConnector_3131"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType DefaultEndPoint_3020 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.diagram.DefaultEndPoint_3020"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType DefaultEndPointInputConnector_3021 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.diagram.DefaultEndPointInputConnector_3021"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType DefaultEndPointOutputConnector_3022 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.diagram.DefaultEndPointOutputConnector_3022"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType AddressEndPoint_3029 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.diagram.AddressEndPoint_3029"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType AddressEndPointInputConnector_3030 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.diagram.AddressEndPointInputConnector_3030"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType AddressEndPointOutputConnector_3031 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.diagram.AddressEndPointOutputConnector_3031"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType EsbLink_4001 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.diagram.EsbLink_4001"); //$NON-NLS-1$

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

			elements.put(MessageMediator_3045,
					EsbPackage.eINSTANCE.getMessageMediator());

			elements.put(MessageInputConnector_3046,
					EsbPackage.eINSTANCE.getMessageInputConnector());

			elements.put(MessageOutputConnector_3047,
					EsbPackage.eINSTANCE.getMessageOutputConnector());

			elements.put(DefaultEndPoint_3020,
					EsbPackage.eINSTANCE.getDefaultEndPoint());

			elements.put(DefaultEndPointInputConnector_3021,
					EsbPackage.eINSTANCE.getDefaultEndPointInputConnector());

			elements.put(DefaultEndPointOutputConnector_3022,
					EsbPackage.eINSTANCE.getDefaultEndPointOutputConnector());

			elements.put(AddressEndPoint_3029,
					EsbPackage.eINSTANCE.getAddressEndPoint());

			elements.put(AddressEndPointInputConnector_3030,
					EsbPackage.eINSTANCE.getAddressEndPointInputConnector());

			elements.put(AddressEndPointOutputConnector_3031,
					EsbPackage.eINSTANCE.getAddressEndPointOutputConnector());

			elements.put(DropMediator_3007,
					EsbPackage.eINSTANCE.getDropMediator());

			elements.put(DropMediatorInputConnector_3008,
					EsbPackage.eINSTANCE.getDropMediatorInputConnector());

			elements.put(FilterMediator_3009,
					EsbPackage.eINSTANCE.getFilterMediator());

			elements.put(FilterMediatorInputConnector_3010,
					EsbPackage.eINSTANCE.getFilterMediatorInputConnector());

			elements.put(FilterMediatorPassOutputConnector_3011,
					EsbPackage.eINSTANCE.getFilterMediatorPassOutputConnector());

			elements.put(FilterMediatorFailOutputConnector_3012,
					EsbPackage.eINSTANCE.getFilterMediatorFailOutputConnector());

			elements.put(MergeNode_3013, EsbPackage.eINSTANCE.getMergeNode());

			elements.put(MergeNodeFirstInputConnector_3014,
					EsbPackage.eINSTANCE.getMergeNodeFirstInputConnector());

			elements.put(MergeNodeSecondInputConnector_3015,
					EsbPackage.eINSTANCE.getMergeNodeSecondInputConnector());

			elements.put(MergeNodeOutputConnector_3016,
					EsbPackage.eINSTANCE.getMergeNodeOutputConnector());

			elements.put(LogMediator_3017,
					EsbPackage.eINSTANCE.getLogMediator());

			elements.put(LogMediatorInputConnector_3018,
					EsbPackage.eINSTANCE.getLogMediatorInputConnector());

			elements.put(LogMediatorOutputConnector_3019,
					EsbPackage.eINSTANCE.getLogMediatorOutputConnector());

			elements.put(PropertyMediator_3032,
					EsbPackage.eINSTANCE.getPropertyMediator());

			elements.put(PropertyMediatorInputConnector_3033,
					EsbPackage.eINSTANCE.getPropertyMediatorInputConnector());

			elements.put(PropertyMediatorOutputConnector_3034,
					EsbPackage.eINSTANCE.getPropertyMediatorOutputConnector());

			elements.put(EnrichMediator_3035,
					EsbPackage.eINSTANCE.getEnrichMediator());

			elements.put(EnrichMediatorInputConnector_3036,
					EsbPackage.eINSTANCE.getEnrichMediatorInputConnector());

			elements.put(EnrichMediatorOutputConnector_3037,
					EsbPackage.eINSTANCE.getEnrichMediatorOutputConnector());

			elements.put(XSLTMediator_3038,
					EsbPackage.eINSTANCE.getXSLTMediator());

			elements.put(XSLTMediatorInputConnector_3039,
					EsbPackage.eINSTANCE.getXSLTMediatorInputConnector());

			elements.put(XSLTMediatorOutputConnector_3040,
					EsbPackage.eINSTANCE.getXSLTMediatorOutputConnector());

			elements.put(SwitchMediator_3041,
					EsbPackage.eINSTANCE.getSwitchMediator());

			elements.put(SwitchMediatorInputConnector_3042,
					EsbPackage.eINSTANCE.getSwitchMediatorInputConnector());

			elements.put(SwitchCaseBranchOutputConnector_3043,
					EsbPackage.eINSTANCE.getSwitchCaseBranchOutputConnector());

			elements.put(SwitchDefaultBranchOutputConnector_3044,
					EsbPackage.eINSTANCE
							.getSwitchDefaultBranchOutputConnector());

			elements.put(Sequence_3048, EsbPackage.eINSTANCE.getSequence());

			elements.put(SequenceInputConnector_3049,
					EsbPackage.eINSTANCE.getSequenceInputConnector());

			elements.put(SequenceOutputConnector_3050,
					EsbPackage.eINSTANCE.getSequenceOutputConnector());

			elements.put(EventMediator_3051,
					EsbPackage.eINSTANCE.getEventMediator());

			elements.put(EventMediatorInputConnector_3052,
					EsbPackage.eINSTANCE.getEventMediatorInputConnector());

			elements.put(EventMediatorOutputConnector_3053,
					EsbPackage.eINSTANCE.getEventMediatorOutputConnector());

			elements.put(EntitlementMediator_3054,
					EsbPackage.eINSTANCE.getEntitlementMediator());

			elements.put(EntitlementMediatorInputConnector_3055,
					EsbPackage.eINSTANCE.getEntitlementMediatorInputConnector());

			elements.put(EntitlementMediatorOutputConnector_3056,
					EsbPackage.eINSTANCE
							.getEntitlementMediatorOutputConnector());

			elements.put(ClassMediator_3057,
					EsbPackage.eINSTANCE.getClassMediator());

			elements.put(ClassMediatorInputConnector_3058,
					EsbPackage.eINSTANCE.getClassMediatorInputConnector());

			elements.put(ClassMediatorOutputConnector_3059,
					EsbPackage.eINSTANCE.getClassMediatorOutputConnector());

			elements.put(SpringMediator_3060,
					EsbPackage.eINSTANCE.getSpringMediator());

			elements.put(SpringMediatorInputConnector_3061,
					EsbPackage.eINSTANCE.getSpringMediatorInputConnector());

			elements.put(SpringMediatorOutputConnector_3062,
					EsbPackage.eINSTANCE.getSpringMediatorOutputConnector());

			elements.put(ScriptMediator_3063,
					EsbPackage.eINSTANCE.getScriptMediator());

			elements.put(ScriptMediatorInputConnector_3064,
					EsbPackage.eINSTANCE.getScriptMediatorInputConnector());

			elements.put(ScriptMediatorOutputConnector_3065,
					EsbPackage.eINSTANCE.getScriptMediatorOutputConnector());

			elements.put(FaultMediator_3066,
					EsbPackage.eINSTANCE.getFaultMediator());

			elements.put(FaultMediatorInputConnector_3067,
					EsbPackage.eINSTANCE.getFaultMediatorInputConnector());

			elements.put(FaultMediatorOutputConnector_3068,
					EsbPackage.eINSTANCE.getFaultMediatorOutputConnector());

			elements.put(XQueryMediator_3069,
					EsbPackage.eINSTANCE.getXQueryMediator());

			elements.put(XQueryMediatorInputConnector_3070,
					EsbPackage.eINSTANCE.getXQueryMediatorInputConnector());

			elements.put(XQueryMediatorOutputConnector_3071,
					EsbPackage.eINSTANCE.getXQueryMediatorOutputConnector());

			elements.put(CommandMediator_3072,
					EsbPackage.eINSTANCE.getCommandMediator());

			elements.put(CommandMediatorInputConnector_3073,
					EsbPackage.eINSTANCE.getCommandMediatorInputConnector());

			elements.put(CommandMediatorOutputConnector_3074,
					EsbPackage.eINSTANCE.getCommandMediatorOutputConnector());

			elements.put(DBLookupMediator_3075,
					EsbPackage.eINSTANCE.getDBLookupMediator());

			elements.put(DBLookupMediatorInputConnector_3076,
					EsbPackage.eINSTANCE.getDBLookupMediatorInputConnector());

			elements.put(DBLookupMediatorOutputConnector_3077,
					EsbPackage.eINSTANCE.getDBLookupMediatorOutputConnector());

			elements.put(DBReportMediator_3078,
					EsbPackage.eINSTANCE.getDBReportMediator());

			elements.put(DBReportMediatorInputConnector_3079,
					EsbPackage.eINSTANCE.getDBReportMediatorInputConnector());

			elements.put(DBReportMediatorOutputConnector_3080,
					EsbPackage.eINSTANCE.getDBReportMediatorOutputConnector());

			elements.put(SmooksMediator_3081,
					EsbPackage.eINSTANCE.getSmooksMediator());

			elements.put(SmooksMediatorInputConnector_3082,
					EsbPackage.eINSTANCE.getSmooksMediatorInputConnector());

			elements.put(SmooksMediatorOutputConnector_3083,
					EsbPackage.eINSTANCE.getSmooksMediatorOutputConnector());

			elements.put(SendMediator_3084,
					EsbPackage.eINSTANCE.getSendMediator());

			elements.put(SendMediatorInputConnector_3085,
					EsbPackage.eINSTANCE.getSendMediatorInputConnector());

			elements.put(SendMediatorOutputConnector_3086,
					EsbPackage.eINSTANCE.getSendMediatorOutputConnector());

			elements.put(FailoverEndPoint_3087,
					EsbPackage.eINSTANCE.getFailoverEndPoint());

			elements.put(FailoverEndPointInputConnector_3088,
					EsbPackage.eINSTANCE.getFailoverEndPointInputConnector());

			elements.put(FailoverEndPointOutputConnector_3090,
					EsbPackage.eINSTANCE.getFailoverEndPointOutputConnector());

			elements.put(FailoverEndPointWestOutputConnector_3097,
					EsbPackage.eINSTANCE
							.getFailoverEndPointWestOutputConnector());

			elements.put(WSDLEndPoint_3091,
					EsbPackage.eINSTANCE.getWSDLEndPoint());

			elements.put(WSDLEndPointInputConnector_3092,
					EsbPackage.eINSTANCE.getWSDLEndPointInputConnector());

			elements.put(WSDLEndPointOutputConnector_3093,
					EsbPackage.eINSTANCE.getWSDLEndPointOutputConnector());

			elements.put(LoadBalanceEndPoint_3094,
					EsbPackage.eINSTANCE.getLoadBalanceEndPoint());

			elements.put(LoadBalanceEndPointInputConnector_3095,
					EsbPackage.eINSTANCE.getLoadBalanceEndPointInputConnector());

			elements.put(LoadBalanceEndPointOutputConnector_3096,
					EsbPackage.eINSTANCE
							.getLoadBalanceEndPointOutputConnector());

			elements.put(LoadBalanceEndPointWestOutputConnector_3098,
					EsbPackage.eINSTANCE
							.getLoadBalanceEndPointWestOutputConnector());

			elements.put(HeaderMediator_3099,
					EsbPackage.eINSTANCE.getHeaderMediator());

			elements.put(HeaderMediatorInputConnector_3100,
					EsbPackage.eINSTANCE.getHeaderMediatorInputConnector());

			elements.put(HeaderMediatorOutputConnector_3101,
					EsbPackage.eINSTANCE.getHeaderMediatorOutputConnector());

			elements.put(CloneMediator_3102,
					EsbPackage.eINSTANCE.getCloneMediator());

			elements.put(CloneMediatorInputConnector_3103,
					EsbPackage.eINSTANCE.getCloneMediatorInputConnector());

			elements.put(CloneMediatorOutputConnector_3104,
					EsbPackage.eINSTANCE.getCloneMediatorOutputConnector());

			elements.put(CloneMediatorTargetOutputConnector_3133,
					EsbPackage.eINSTANCE
							.getCloneMediatorTargetOutputConnector());

			elements.put(CacheMediator_3105,
					EsbPackage.eINSTANCE.getCacheMediator());

			elements.put(CacheMediatorInputConnector_3106,
					EsbPackage.eINSTANCE.getCacheMediatorInputConnector());

			elements.put(CacheMediatorOutputConnector_3107,
					EsbPackage.eINSTANCE.getCacheMediatorOutputConnector());

			elements.put(IterateMediator_3108,
					EsbPackage.eINSTANCE.getIterateMediator());

			elements.put(IterateMediatorInputConnector_3109,
					EsbPackage.eINSTANCE.getIterateMediatorInputConnector());

			elements.put(IterateMediatorOutputConnector_3110,
					EsbPackage.eINSTANCE.getIterateMediatorOutputConnector());

			elements.put(CalloutMediator_3114,
					EsbPackage.eINSTANCE.getCalloutMediator());

			elements.put(CalloutMediatorInputConnector_3115,
					EsbPackage.eINSTANCE.getCalloutMediatorInputConnector());

			elements.put(CalloutMediatorOutputConnector_3116,
					EsbPackage.eINSTANCE.getCalloutMediatorOutputConnector());

			elements.put(TransactionMediator_3117,
					EsbPackage.eINSTANCE.getTransactionMediator());

			elements.put(TransactionMediatorInputConnector_3118,
					EsbPackage.eINSTANCE.getTransactionMediatorInputConnector());

			elements.put(TransactionMediatorOutputConnector_3119,
					EsbPackage.eINSTANCE
							.getTransactionMediatorOutputConnector());

			elements.put(ThrottleMediator_3120,
					EsbPackage.eINSTANCE.getThrottleMediator());

			elements.put(ThrottleMediatorInputConnector_3121,
					EsbPackage.eINSTANCE.getThrottleMediatorInputConnector());

			elements.put(ThrottleMediatorOutputConnector_3122,
					EsbPackage.eINSTANCE.getThrottleMediatorOutputConnector());

			elements.put(RMSequenceMediator_3123,
					EsbPackage.eINSTANCE.getRMSequenceMediator());

			elements.put(RMSequenceMediatorInputConnector_3124,
					EsbPackage.eINSTANCE.getRMSequenceMediatorInputConnector());

			elements.put(RMSequenceMediatorOutputConnector_3125,
					EsbPackage.eINSTANCE.getRMSequenceMediatorOutputConnector());

			elements.put(RuleMediator_3126,
					EsbPackage.eINSTANCE.getRuleMediator());

			elements.put(RuleMediatorInputConnector_3127,
					EsbPackage.eINSTANCE.getRuleMediatorInputConnector());

			elements.put(RuleMediatorOutputConnector_3128,
					EsbPackage.eINSTANCE.getRuleMediatorOutputConnector());

			elements.put(OAuthMediator_3129,
					EsbPackage.eINSTANCE.getOAuthMediator());

			elements.put(OAuthMediatorInputConnector_3130,
					EsbPackage.eINSTANCE.getOAuthMediatorInputConnector());

			elements.put(OAuthMediatorOutputConnector_3131,
					EsbPackage.eINSTANCE.getOAuthMediatorOutputConnector());

			elements.put(AggregateMediator_3111,
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
			KNOWN_ELEMENT_TYPES.add(MessageMediator_3045);
			KNOWN_ELEMENT_TYPES.add(MessageInputConnector_3046);
			KNOWN_ELEMENT_TYPES.add(MessageOutputConnector_3047);
			KNOWN_ELEMENT_TYPES.add(DefaultEndPoint_3020);
			KNOWN_ELEMENT_TYPES.add(DefaultEndPointInputConnector_3021);
			KNOWN_ELEMENT_TYPES.add(DefaultEndPointOutputConnector_3022);
			KNOWN_ELEMENT_TYPES.add(AddressEndPoint_3029);
			KNOWN_ELEMENT_TYPES.add(AddressEndPointInputConnector_3030);
			KNOWN_ELEMENT_TYPES.add(AddressEndPointOutputConnector_3031);
			KNOWN_ELEMENT_TYPES.add(DropMediator_3007);
			KNOWN_ELEMENT_TYPES.add(DropMediatorInputConnector_3008);
			KNOWN_ELEMENT_TYPES.add(FilterMediator_3009);
			KNOWN_ELEMENT_TYPES.add(FilterMediatorInputConnector_3010);
			KNOWN_ELEMENT_TYPES.add(FilterMediatorPassOutputConnector_3011);
			KNOWN_ELEMENT_TYPES.add(FilterMediatorFailOutputConnector_3012);
			KNOWN_ELEMENT_TYPES.add(MergeNode_3013);
			KNOWN_ELEMENT_TYPES.add(MergeNodeFirstInputConnector_3014);
			KNOWN_ELEMENT_TYPES.add(MergeNodeSecondInputConnector_3015);
			KNOWN_ELEMENT_TYPES.add(MergeNodeOutputConnector_3016);
			KNOWN_ELEMENT_TYPES.add(LogMediator_3017);
			KNOWN_ELEMENT_TYPES.add(LogMediatorInputConnector_3018);
			KNOWN_ELEMENT_TYPES.add(LogMediatorOutputConnector_3019);
			KNOWN_ELEMENT_TYPES.add(PropertyMediator_3032);
			KNOWN_ELEMENT_TYPES.add(PropertyMediatorInputConnector_3033);
			KNOWN_ELEMENT_TYPES.add(PropertyMediatorOutputConnector_3034);
			KNOWN_ELEMENT_TYPES.add(EnrichMediator_3035);
			KNOWN_ELEMENT_TYPES.add(EnrichMediatorInputConnector_3036);
			KNOWN_ELEMENT_TYPES.add(EnrichMediatorOutputConnector_3037);
			KNOWN_ELEMENT_TYPES.add(XSLTMediator_3038);
			KNOWN_ELEMENT_TYPES.add(XSLTMediatorInputConnector_3039);
			KNOWN_ELEMENT_TYPES.add(XSLTMediatorOutputConnector_3040);
			KNOWN_ELEMENT_TYPES.add(SwitchMediator_3041);
			KNOWN_ELEMENT_TYPES.add(SwitchMediatorInputConnector_3042);
			KNOWN_ELEMENT_TYPES.add(SwitchCaseBranchOutputConnector_3043);
			KNOWN_ELEMENT_TYPES.add(SwitchDefaultBranchOutputConnector_3044);
			KNOWN_ELEMENT_TYPES.add(Sequence_3048);
			KNOWN_ELEMENT_TYPES.add(SequenceInputConnector_3049);
			KNOWN_ELEMENT_TYPES.add(SequenceOutputConnector_3050);
			KNOWN_ELEMENT_TYPES.add(EventMediator_3051);
			KNOWN_ELEMENT_TYPES.add(EventMediatorInputConnector_3052);
			KNOWN_ELEMENT_TYPES.add(EventMediatorOutputConnector_3053);
			KNOWN_ELEMENT_TYPES.add(EntitlementMediator_3054);
			KNOWN_ELEMENT_TYPES.add(EntitlementMediatorInputConnector_3055);
			KNOWN_ELEMENT_TYPES.add(EntitlementMediatorOutputConnector_3056);
			KNOWN_ELEMENT_TYPES.add(ClassMediator_3057);
			KNOWN_ELEMENT_TYPES.add(ClassMediatorInputConnector_3058);
			KNOWN_ELEMENT_TYPES.add(ClassMediatorOutputConnector_3059);
			KNOWN_ELEMENT_TYPES.add(SpringMediator_3060);
			KNOWN_ELEMENT_TYPES.add(SpringMediatorInputConnector_3061);
			KNOWN_ELEMENT_TYPES.add(SpringMediatorOutputConnector_3062);
			KNOWN_ELEMENT_TYPES.add(ScriptMediator_3063);
			KNOWN_ELEMENT_TYPES.add(ScriptMediatorInputConnector_3064);
			KNOWN_ELEMENT_TYPES.add(ScriptMediatorOutputConnector_3065);
			KNOWN_ELEMENT_TYPES.add(FaultMediator_3066);
			KNOWN_ELEMENT_TYPES.add(FaultMediatorInputConnector_3067);
			KNOWN_ELEMENT_TYPES.add(FaultMediatorOutputConnector_3068);
			KNOWN_ELEMENT_TYPES.add(XQueryMediator_3069);
			KNOWN_ELEMENT_TYPES.add(XQueryMediatorInputConnector_3070);
			KNOWN_ELEMENT_TYPES.add(XQueryMediatorOutputConnector_3071);
			KNOWN_ELEMENT_TYPES.add(CommandMediator_3072);
			KNOWN_ELEMENT_TYPES.add(CommandMediatorInputConnector_3073);
			KNOWN_ELEMENT_TYPES.add(CommandMediatorOutputConnector_3074);
			KNOWN_ELEMENT_TYPES.add(DBLookupMediator_3075);
			KNOWN_ELEMENT_TYPES.add(DBLookupMediatorInputConnector_3076);
			KNOWN_ELEMENT_TYPES.add(DBLookupMediatorOutputConnector_3077);
			KNOWN_ELEMENT_TYPES.add(DBReportMediator_3078);
			KNOWN_ELEMENT_TYPES.add(DBReportMediatorInputConnector_3079);
			KNOWN_ELEMENT_TYPES.add(DBReportMediatorOutputConnector_3080);
			KNOWN_ELEMENT_TYPES.add(SmooksMediator_3081);
			KNOWN_ELEMENT_TYPES.add(SmooksMediatorInputConnector_3082);
			KNOWN_ELEMENT_TYPES.add(SmooksMediatorOutputConnector_3083);
			KNOWN_ELEMENT_TYPES.add(SendMediator_3084);
			KNOWN_ELEMENT_TYPES.add(SendMediatorInputConnector_3085);
			KNOWN_ELEMENT_TYPES.add(SendMediatorOutputConnector_3086);
			KNOWN_ELEMENT_TYPES.add(FailoverEndPoint_3087);
			KNOWN_ELEMENT_TYPES.add(FailoverEndPointInputConnector_3088);
			KNOWN_ELEMENT_TYPES.add(FailoverEndPointOutputConnector_3090);
			KNOWN_ELEMENT_TYPES.add(FailoverEndPointWestOutputConnector_3097);
			KNOWN_ELEMENT_TYPES.add(WSDLEndPoint_3091);
			KNOWN_ELEMENT_TYPES.add(WSDLEndPointInputConnector_3092);
			KNOWN_ELEMENT_TYPES.add(WSDLEndPointOutputConnector_3093);
			KNOWN_ELEMENT_TYPES.add(LoadBalanceEndPoint_3094);
			KNOWN_ELEMENT_TYPES.add(LoadBalanceEndPointInputConnector_3095);
			KNOWN_ELEMENT_TYPES.add(LoadBalanceEndPointOutputConnector_3096);
			KNOWN_ELEMENT_TYPES
					.add(LoadBalanceEndPointWestOutputConnector_3098);
			KNOWN_ELEMENT_TYPES.add(HeaderMediator_3099);
			KNOWN_ELEMENT_TYPES.add(HeaderMediatorInputConnector_3100);
			KNOWN_ELEMENT_TYPES.add(HeaderMediatorOutputConnector_3101);
			KNOWN_ELEMENT_TYPES.add(CloneMediator_3102);
			KNOWN_ELEMENT_TYPES.add(CloneMediatorInputConnector_3103);
			KNOWN_ELEMENT_TYPES.add(CloneMediatorOutputConnector_3104);
			KNOWN_ELEMENT_TYPES.add(CloneMediatorTargetOutputConnector_3133);
			KNOWN_ELEMENT_TYPES.add(CacheMediator_3105);
			KNOWN_ELEMENT_TYPES.add(CacheMediatorInputConnector_3106);
			KNOWN_ELEMENT_TYPES.add(CacheMediatorOutputConnector_3107);
			KNOWN_ELEMENT_TYPES.add(IterateMediator_3108);
			KNOWN_ELEMENT_TYPES.add(IterateMediatorInputConnector_3109);
			KNOWN_ELEMENT_TYPES.add(IterateMediatorOutputConnector_3110);
			KNOWN_ELEMENT_TYPES.add(CalloutMediator_3114);
			KNOWN_ELEMENT_TYPES.add(CalloutMediatorInputConnector_3115);
			KNOWN_ELEMENT_TYPES.add(CalloutMediatorOutputConnector_3116);
			KNOWN_ELEMENT_TYPES.add(TransactionMediator_3117);
			KNOWN_ELEMENT_TYPES.add(TransactionMediatorInputConnector_3118);
			KNOWN_ELEMENT_TYPES.add(TransactionMediatorOutputConnector_3119);
			KNOWN_ELEMENT_TYPES.add(ThrottleMediator_3120);
			KNOWN_ELEMENT_TYPES.add(ThrottleMediatorInputConnector_3121);
			KNOWN_ELEMENT_TYPES.add(ThrottleMediatorOutputConnector_3122);
			KNOWN_ELEMENT_TYPES.add(RMSequenceMediator_3123);
			KNOWN_ELEMENT_TYPES.add(RMSequenceMediatorInputConnector_3124);
			KNOWN_ELEMENT_TYPES.add(RMSequenceMediatorOutputConnector_3125);
			KNOWN_ELEMENT_TYPES.add(RuleMediator_3126);
			KNOWN_ELEMENT_TYPES.add(RuleMediatorInputConnector_3127);
			KNOWN_ELEMENT_TYPES.add(RuleMediatorOutputConnector_3128);
			KNOWN_ELEMENT_TYPES.add(OAuthMediator_3129);
			KNOWN_ELEMENT_TYPES.add(OAuthMediatorInputConnector_3130);
			KNOWN_ELEMENT_TYPES.add(OAuthMediatorOutputConnector_3131);
			KNOWN_ELEMENT_TYPES.add(AggregateMediator_3111);
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
		case MessageMediatorEditPart.VISUAL_ID:
			return MessageMediator_3045;
		case MessageInputConnectorEditPart.VISUAL_ID:
			return MessageInputConnector_3046;
		case MessageOutputConnectorEditPart.VISUAL_ID:
			return MessageOutputConnector_3047;
		case DefaultEndPointEditPart.VISUAL_ID:
			return DefaultEndPoint_3020;
		case DefaultEndPointInputConnectorEditPart.VISUAL_ID:
			return DefaultEndPointInputConnector_3021;
		case DefaultEndPointOutputConnectorEditPart.VISUAL_ID:
			return DefaultEndPointOutputConnector_3022;
		case AddressEndPointEditPart.VISUAL_ID:
			return AddressEndPoint_3029;
		case AddressEndPointInputConnectorEditPart.VISUAL_ID:
			return AddressEndPointInputConnector_3030;
		case AddressEndPointOutputConnectorEditPart.VISUAL_ID:
			return AddressEndPointOutputConnector_3031;
		case DropMediatorEditPart.VISUAL_ID:
			return DropMediator_3007;
		case DropMediatorInputConnectorEditPart.VISUAL_ID:
			return DropMediatorInputConnector_3008;
		case FilterMediatorEditPart.VISUAL_ID:
			return FilterMediator_3009;
		case FilterMediatorInputConnectorEditPart.VISUAL_ID:
			return FilterMediatorInputConnector_3010;
		case FilterMediatorPassOutputConnectorEditPart.VISUAL_ID:
			return FilterMediatorPassOutputConnector_3011;
		case FilterMediatorFailOutputConnectorEditPart.VISUAL_ID:
			return FilterMediatorFailOutputConnector_3012;
		case MergeNodeEditPart.VISUAL_ID:
			return MergeNode_3013;
		case MergeNodeFirstInputConnectorEditPart.VISUAL_ID:
			return MergeNodeFirstInputConnector_3014;
		case MergeNodeSecondInputConnectorEditPart.VISUAL_ID:
			return MergeNodeSecondInputConnector_3015;
		case MergeNodeOutputConnectorEditPart.VISUAL_ID:
			return MergeNodeOutputConnector_3016;
		case LogMediatorEditPart.VISUAL_ID:
			return LogMediator_3017;
		case LogMediatorInputConnectorEditPart.VISUAL_ID:
			return LogMediatorInputConnector_3018;
		case LogMediatorOutputConnectorEditPart.VISUAL_ID:
			return LogMediatorOutputConnector_3019;
		case PropertyMediatorEditPart.VISUAL_ID:
			return PropertyMediator_3032;
		case PropertyMediatorInputConnectorEditPart.VISUAL_ID:
			return PropertyMediatorInputConnector_3033;
		case PropertyMediatorOutputConnectorEditPart.VISUAL_ID:
			return PropertyMediatorOutputConnector_3034;
		case EnrichMediatorEditPart.VISUAL_ID:
			return EnrichMediator_3035;
		case EnrichMediatorInputConnectorEditPart.VISUAL_ID:
			return EnrichMediatorInputConnector_3036;
		case EnrichMediatorOutputConnectorEditPart.VISUAL_ID:
			return EnrichMediatorOutputConnector_3037;
		case XSLTMediatorEditPart.VISUAL_ID:
			return XSLTMediator_3038;
		case XSLTMediatorInputConnectorEditPart.VISUAL_ID:
			return XSLTMediatorInputConnector_3039;
		case XSLTMediatorOutputConnectorEditPart.VISUAL_ID:
			return XSLTMediatorOutputConnector_3040;
		case SwitchMediatorEditPart.VISUAL_ID:
			return SwitchMediator_3041;
		case SwitchMediatorInputConnectorEditPart.VISUAL_ID:
			return SwitchMediatorInputConnector_3042;
		case SwitchCaseBranchOutputConnectorEditPart.VISUAL_ID:
			return SwitchCaseBranchOutputConnector_3043;
		case SwitchDefaultBranchOutputConnectorEditPart.VISUAL_ID:
			return SwitchDefaultBranchOutputConnector_3044;
		case SequenceEditPart.VISUAL_ID:
			return Sequence_3048;
		case SequenceInputConnectorEditPart.VISUAL_ID:
			return SequenceInputConnector_3049;
		case SequenceOutputConnectorEditPart.VISUAL_ID:
			return SequenceOutputConnector_3050;
		case EventMediatorEditPart.VISUAL_ID:
			return EventMediator_3051;
		case EventMediatorInputConnectorEditPart.VISUAL_ID:
			return EventMediatorInputConnector_3052;
		case EventMediatorOutputConnectorEditPart.VISUAL_ID:
			return EventMediatorOutputConnector_3053;
		case EntitlementMediatorEditPart.VISUAL_ID:
			return EntitlementMediator_3054;
		case EntitlementMediatorInputConnectorEditPart.VISUAL_ID:
			return EntitlementMediatorInputConnector_3055;
		case EntitlementMediatorOutputConnectorEditPart.VISUAL_ID:
			return EntitlementMediatorOutputConnector_3056;
		case ClassMediatorEditPart.VISUAL_ID:
			return ClassMediator_3057;
		case ClassMediatorInputConnectorEditPart.VISUAL_ID:
			return ClassMediatorInputConnector_3058;
		case ClassMediatorOutputConnectorEditPart.VISUAL_ID:
			return ClassMediatorOutputConnector_3059;
		case SpringMediatorEditPart.VISUAL_ID:
			return SpringMediator_3060;
		case SpringMediatorInputConnectorEditPart.VISUAL_ID:
			return SpringMediatorInputConnector_3061;
		case SpringMediatorOutputConnectorEditPart.VISUAL_ID:
			return SpringMediatorOutputConnector_3062;
		case ScriptMediatorEditPart.VISUAL_ID:
			return ScriptMediator_3063;
		case ScriptMediatorInputConnectorEditPart.VISUAL_ID:
			return ScriptMediatorInputConnector_3064;
		case ScriptMediatorOutputConnectorEditPart.VISUAL_ID:
			return ScriptMediatorOutputConnector_3065;
		case FaultMediatorEditPart.VISUAL_ID:
			return FaultMediator_3066;
		case FaultMediatorInputConnectorEditPart.VISUAL_ID:
			return FaultMediatorInputConnector_3067;
		case FaultMediatorOutputConnectorEditPart.VISUAL_ID:
			return FaultMediatorOutputConnector_3068;
		case XQueryMediatorEditPart.VISUAL_ID:
			return XQueryMediator_3069;
		case XQueryMediatorInputConnectorEditPart.VISUAL_ID:
			return XQueryMediatorInputConnector_3070;
		case XQueryMediatorOutputConnectorEditPart.VISUAL_ID:
			return XQueryMediatorOutputConnector_3071;
		case CommandMediatorEditPart.VISUAL_ID:
			return CommandMediator_3072;
		case CommandMediatorInputConnectorEditPart.VISUAL_ID:
			return CommandMediatorInputConnector_3073;
		case CommandMediatorOutputConnectorEditPart.VISUAL_ID:
			return CommandMediatorOutputConnector_3074;
		case DBLookupMediatorEditPart.VISUAL_ID:
			return DBLookupMediator_3075;
		case DBLookupMediatorInputConnectorEditPart.VISUAL_ID:
			return DBLookupMediatorInputConnector_3076;
		case DBLookupMediatorOutputConnectorEditPart.VISUAL_ID:
			return DBLookupMediatorOutputConnector_3077;
		case DBReportMediatorEditPart.VISUAL_ID:
			return DBReportMediator_3078;
		case DBReportMediatorInputConnectorEditPart.VISUAL_ID:
			return DBReportMediatorInputConnector_3079;
		case DBReportMediatorOutputConnectorEditPart.VISUAL_ID:
			return DBReportMediatorOutputConnector_3080;
		case SmooksMediatorEditPart.VISUAL_ID:
			return SmooksMediator_3081;
		case SmooksMediatorInputConnectorEditPart.VISUAL_ID:
			return SmooksMediatorInputConnector_3082;
		case SmooksMediatorOutputConnectorEditPart.VISUAL_ID:
			return SmooksMediatorOutputConnector_3083;
		case SendMediatorEditPart.VISUAL_ID:
			return SendMediator_3084;
		case SendMediatorInputConnectorEditPart.VISUAL_ID:
			return SendMediatorInputConnector_3085;
		case SendMediatorOutputConnectorEditPart.VISUAL_ID:
			return SendMediatorOutputConnector_3086;
		case FailoverEndPointEditPart.VISUAL_ID:
			return FailoverEndPoint_3087;
		case FailoverEndPointInputConnectorEditPart.VISUAL_ID:
			return FailoverEndPointInputConnector_3088;
		case FailoverEndPointOutputConnectorEditPart.VISUAL_ID:
			return FailoverEndPointOutputConnector_3090;
		case FailoverEndPointWestOutputConnectorEditPart.VISUAL_ID:
			return FailoverEndPointWestOutputConnector_3097;
		case WSDLEndPointEditPart.VISUAL_ID:
			return WSDLEndPoint_3091;
		case WSDLEndPointInputConnectorEditPart.VISUAL_ID:
			return WSDLEndPointInputConnector_3092;
		case WSDLEndPointOutputConnectorEditPart.VISUAL_ID:
			return WSDLEndPointOutputConnector_3093;
		case LoadBalanceEndPointEditPart.VISUAL_ID:
			return LoadBalanceEndPoint_3094;
		case LoadBalanceEndPointInputConnectorEditPart.VISUAL_ID:
			return LoadBalanceEndPointInputConnector_3095;
		case LoadBalanceEndPointOutputConnectorEditPart.VISUAL_ID:
			return LoadBalanceEndPointOutputConnector_3096;
		case LoadBalanceEndPointWestOutputConnectorEditPart.VISUAL_ID:
			return LoadBalanceEndPointWestOutputConnector_3098;
		case HeaderMediatorEditPart.VISUAL_ID:
			return HeaderMediator_3099;
		case HeaderMediatorInputConnectorEditPart.VISUAL_ID:
			return HeaderMediatorInputConnector_3100;
		case HeaderMediatorOutputConnectorEditPart.VISUAL_ID:
			return HeaderMediatorOutputConnector_3101;
		case CloneMediatorEditPart.VISUAL_ID:
			return CloneMediator_3102;
		case CloneMediatorInputConnectorEditPart.VISUAL_ID:
			return CloneMediatorInputConnector_3103;
		case CloneMediatorOutputConnectorEditPart.VISUAL_ID:
			return CloneMediatorOutputConnector_3104;
		case CloneMediatorTargetOutputConnectorEditPart.VISUAL_ID:
			return CloneMediatorTargetOutputConnector_3133;
		case CacheMediatorEditPart.VISUAL_ID:
			return CacheMediator_3105;
		case CacheMediatorInputConnectorEditPart.VISUAL_ID:
			return CacheMediatorInputConnector_3106;
		case CacheMediatorOutputConnectorEditPart.VISUAL_ID:
			return CacheMediatorOutputConnector_3107;
		case IterateMediatorEditPart.VISUAL_ID:
			return IterateMediator_3108;
		case IterateMediatorInputConnectorEditPart.VISUAL_ID:
			return IterateMediatorInputConnector_3109;
		case IterateMediatorOutputConnectorEditPart.VISUAL_ID:
			return IterateMediatorOutputConnector_3110;
		case CalloutMediatorEditPart.VISUAL_ID:
			return CalloutMediator_3114;
		case CalloutMediatorInputConnectorEditPart.VISUAL_ID:
			return CalloutMediatorInputConnector_3115;
		case CalloutMediatorOutputConnectorEditPart.VISUAL_ID:
			return CalloutMediatorOutputConnector_3116;
		case TransactionMediatorEditPart.VISUAL_ID:
			return TransactionMediator_3117;
		case TransactionMediatorInputConnectorEditPart.VISUAL_ID:
			return TransactionMediatorInputConnector_3118;
		case TransactionMediatorOutputConnectorEditPart.VISUAL_ID:
			return TransactionMediatorOutputConnector_3119;
		case ThrottleMediatorEditPart.VISUAL_ID:
			return ThrottleMediator_3120;
		case ThrottleMediatorInputConnectorEditPart.VISUAL_ID:
			return ThrottleMediatorInputConnector_3121;
		case ThrottleMediatorOutputConnectorEditPart.VISUAL_ID:
			return ThrottleMediatorOutputConnector_3122;
		case RMSequenceMediatorEditPart.VISUAL_ID:
			return RMSequenceMediator_3123;
		case RMSequenceMediatorInputConnectorEditPart.VISUAL_ID:
			return RMSequenceMediatorInputConnector_3124;
		case RMSequenceMediatorOutputConnectorEditPart.VISUAL_ID:
			return RMSequenceMediatorOutputConnector_3125;
		case RuleMediatorEditPart.VISUAL_ID:
			return RuleMediator_3126;
		case RuleMediatorInputConnectorEditPart.VISUAL_ID:
			return RuleMediatorInputConnector_3127;
		case RuleMediatorOutputConnectorEditPart.VISUAL_ID:
			return RuleMediatorOutputConnector_3128;
		case OAuthMediatorEditPart.VISUAL_ID:
			return OAuthMediator_3129;
		case OAuthMediatorInputConnectorEditPart.VISUAL_ID:
			return OAuthMediatorInputConnector_3130;
		case OAuthMediatorOutputConnectorEditPart.VISUAL_ID:
			return OAuthMediatorOutputConnector_3131;
		case AggregateMediatorEditPart.VISUAL_ID:
			return AggregateMediator_3111;
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
		case EsbLinkEditPart.VISUAL_ID:
			return EsbLink_4001;
		}
		return null;
	}

}
