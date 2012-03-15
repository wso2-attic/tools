package org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.providers;

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
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.AggregateMediatorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.AggregateMediatorInputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.AggregateMediatorOnCompleteOutputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.AggregateMediatorOutputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.CacheMediatorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.CacheMediatorInputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.CacheMediatorOutputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.CalloutMediatorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.CalloutMediatorInputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.CalloutMediatorOutputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.ClassMediatorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.ClassMediatorInputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.ClassMediatorOutputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.CloneMediatorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.CloneMediatorInputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.CloneMediatorOutputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.CommandMediatorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.CommandMediatorInputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.CommandMediatorOutputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.DBLookupMediatorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.DBLookupMediatorInputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.DBLookupMediatorOutputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.DBReportMediatorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.DBReportMediatorInputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.DBReportMediatorOutputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.DropMediatorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.DropMediatorInputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.EnrichMediatorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.EnrichMediatorInputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.EnrichMediatorOutputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.EntitlementMediatorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.EntitlementMediatorInputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.EntitlementMediatorOutputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.EsbLinkEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.EsbSequenceEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.EsbSequenceInputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.EsbSequenceOutputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.EventMediatorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.EventMediatorInputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.EventMediatorOutputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.FaultMediatorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.FaultMediatorInputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.FaultMediatorOutputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.FilterMediatorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.FilterMediatorFailOutputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.FilterMediatorInputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.FilterMediatorPassOutputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.HeaderMediatorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.HeaderMediatorInputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.HeaderMediatorOutputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.IterateMediatorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.IterateMediatorInputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.IterateMediatorOutputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.LogMediatorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.LogMediatorInputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.LogMediatorOutputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.OAuthMediatorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.OAuthMediatorInputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.OAuthMediatorOutputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.PropertyMediatorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.PropertyMediatorInputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.PropertyMediatorOutputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.RMSequenceMediatorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.RMSequenceMediatorInputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.RMSequenceMediatorOutputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.RuleMediatorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.RuleMediatorInputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.RuleMediatorOutputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.ScriptMediatorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.ScriptMediatorInputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.ScriptMediatorOutputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.SendMediatorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.SendMediatorInputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.SendMediatorOutputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.SequenceDiagramEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.SmooksMediatorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.SmooksMediatorInputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.SmooksMediatorOutputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.SpringMediatorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.SpringMediatorInputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.SpringMediatorOutputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.SwitchCaseBranchOutputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.SwitchDefaultBranchOutputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.SwitchMediatorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.SwitchMediatorInputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.ThrottleMediatorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.ThrottleMediatorInputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.ThrottleMediatorOutputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.TransactionMediatorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.TransactionMediatorInputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.TransactionMediatorOutputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.XQueryMediatorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.XQueryMediatorInputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.XQueryMediatorOutputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.XSLTMediatorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.XSLTMediatorInputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.edit.parts.XSLTMediatorOutputConnectorEditPart;
import org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.part.EsbDiagramEditorPlugin;

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
	public static final IElementType SequenceDiagram_1000 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.SequenceDiagram_1000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType EsbSequence_2501 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.EsbSequence_2501"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType LogMediator_3501 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.LogMediator_3501"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType LogMediatorInputConnector_3502 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.LogMediatorInputConnector_3502"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType LogMediatorOutputConnector_3503 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.LogMediatorOutputConnector_3503"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType PropertyMediator_3512 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.PropertyMediator_3512"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType PropertyMediatorInputConnector_3513 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.PropertyMediatorInputConnector_3513"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType PropertyMediatorOutputConnector_3514 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.PropertyMediatorOutputConnector_3514"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType EsbSequenceInputConnector_3517 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.EsbSequenceInputConnector_3517"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType EsbSequenceOutputConnector_3518 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.EsbSequenceOutputConnector_3518"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType DropMediator_3519 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.DropMediator_3519"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType DropMediatorInputConnector_3520 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.DropMediatorInputConnector_3520"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType EnrichMediator_3521 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.EnrichMediator_3521"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType EnrichMediatorInputConnector_3522 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.EnrichMediatorInputConnector_3522"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType EnrichMediatorOutputConnector_3523 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.EnrichMediatorOutputConnector_3523"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType FilterMediator_3524 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.FilterMediator_3524"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType FilterMediatorInputConnector_3525 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.FilterMediatorInputConnector_3525"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType FilterMediatorPassOutputConnector_3526 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.FilterMediatorPassOutputConnector_3526"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType FilterMediatorFailOutputConnector_3527 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.FilterMediatorFailOutputConnector_3527"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType XSLTMediator_3528 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.XSLTMediator_3528"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType XSLTMediatorInputConnector_3529 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.XSLTMediatorInputConnector_3529"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType XSLTMediatorOutputConnector_3530 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.XSLTMediatorOutputConnector_3530"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType EventMediator_3531 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.EventMediator_3531"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType EventMediatorInputConnector_3532 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.EventMediatorInputConnector_3532"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType EventMediatorOutputConnector_3533 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.EventMediatorOutputConnector_3533"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType EntitlementMediator_3534 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.EntitlementMediator_3534"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType EntitlementMediatorInputConnector_3535 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.EntitlementMediatorInputConnector_3535"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType EntitlementMediatorOutputConnector_3536 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.EntitlementMediatorOutputConnector_3536"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType SwitchMediator_3537 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.SwitchMediator_3537"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType SwitchMediatorInputConnector_3538 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.SwitchMediatorInputConnector_3538"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType SwitchCaseBranchOutputConnector_3539 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.SwitchCaseBranchOutputConnector_3539"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType SwitchDefaultBranchOutputConnector_3540 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.SwitchDefaultBranchOutputConnector_3540"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType ClassMediator_3541 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.ClassMediator_3541"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType ClassMediatorInputConnector_3542 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.ClassMediatorInputConnector_3542"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType ClassMediatorOutputConnector_3543 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.ClassMediatorOutputConnector_3543"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType SpringMediator_3544 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.SpringMediator_3544"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType SpringMediatorInputConnector_3545 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.SpringMediatorInputConnector_3545"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType SpringMediatorOutputConnector_3546 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.SpringMediatorOutputConnector_3546"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType ScriptMediator_3547 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.ScriptMediator_3547"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType ScriptMediatorInputConnector_3548 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.ScriptMediatorInputConnector_3548"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType ScriptMediatorOutputConnector_3549 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.ScriptMediatorOutputConnector_3549"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType FaultMediator_3550 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.FaultMediator_3550"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType FaultMediatorInputConnector_3551 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.FaultMediatorInputConnector_3551"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType FaultMediatorOutputConnector_3552 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.FaultMediatorOutputConnector_3552"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType XQueryMediator_3553 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.XQueryMediator_3553"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType XQueryMediatorInputConnector_3554 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.XQueryMediatorInputConnector_3554"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType XQueryMediatorOutputConnector_3555 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.XQueryMediatorOutputConnector_3555"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType CommandMediator_3556 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.CommandMediator_3556"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType CommandMediatorInputConnector_3557 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.CommandMediatorInputConnector_3557"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType CommandMediatorOutputConnector_3558 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.CommandMediatorOutputConnector_3558"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType DBLookupMediator_3559 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.DBLookupMediator_3559"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType DBLookupMediatorInputConnector_3560 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.DBLookupMediatorInputConnector_3560"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType DBLookupMediatorOutputConnector_3561 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.DBLookupMediatorOutputConnector_3561"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType DBReportMediator_3562 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.DBReportMediator_3562"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType DBReportMediatorInputConnector_3563 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.DBReportMediatorInputConnector_3563"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType DBReportMediatorOutputConnector_3564 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.DBReportMediatorOutputConnector_3564"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType SmooksMediator_3565 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.SmooksMediator_3565"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType SmooksMediatorInputConnector_3566 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.SmooksMediatorInputConnector_3566"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType SmooksMediatorOutputConnector_3567 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.SmooksMediatorOutputConnector_3567"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType SendMediator_3568 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.SendMediator_3568"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType SendMediatorInputConnector_3569 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.SendMediatorInputConnector_3569"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType SendMediatorOutputConnector_3570 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.SendMediatorOutputConnector_3570"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType HeaderMediator_3571 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.HeaderMediator_3571"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType HeaderMediatorInputConnector_3572 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.HeaderMediatorInputConnector_3572"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType HeaderMediatorOutputConnector_3573 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.HeaderMediatorOutputConnector_3573"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType CloneMediator_3574 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.CloneMediator_3574"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType CloneMediatorInputConnector_3575 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.CloneMediatorInputConnector_3575"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType CloneMediatorOutputConnector_3576 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.CloneMediatorOutputConnector_3576"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType CacheMediator_3577 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.CacheMediator_3577"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType CacheMediatorInputConnector_3578 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.CacheMediatorInputConnector_3578"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType CacheMediatorOutputConnector_3579 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.CacheMediatorOutputConnector_3579"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType IterateMediator_3580 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.IterateMediator_3580"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType IterateMediatorInputConnector_3581 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.IterateMediatorInputConnector_3581"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType IterateMediatorOutputConnector_3582 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.IterateMediatorOutputConnector_3582"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType AggregateMediator_3583 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.AggregateMediator_3583"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType AggregateMediatorInputConnector_3584 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.AggregateMediatorInputConnector_3584"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType AggregateMediatorOutputConnector_3585 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.AggregateMediatorOutputConnector_3585"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType AggregateMediatorOnCompleteOutputConnector_3604 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.AggregateMediatorOnCompleteOutputConnector_3604"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType CalloutMediator_3586 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.CalloutMediator_3586"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType CalloutMediatorInputConnector_3587 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.CalloutMediatorInputConnector_3587"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType CalloutMediatorOutputConnector_3588 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.CalloutMediatorOutputConnector_3588"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType TransactionMediator_3589 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.TransactionMediator_3589"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType TransactionMediatorInputConnector_3590 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.TransactionMediatorInputConnector_3590"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType TransactionMediatorOutputConnector_3591 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.TransactionMediatorOutputConnector_3591"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType ThrottleMediator_3592 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.ThrottleMediator_3592"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType ThrottleMediatorInputConnector_3593 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.ThrottleMediatorInputConnector_3593"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType ThrottleMediatorOutputConnector_3594 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.ThrottleMediatorOutputConnector_3594"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType RMSequenceMediator_3595 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.RMSequenceMediator_3595"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType RMSequenceMediatorInputConnector_3596 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.RMSequenceMediatorInputConnector_3596"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType RMSequenceMediatorOutputConnector_3597 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.RMSequenceMediatorOutputConnector_3597"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType RuleMediator_3598 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.RuleMediator_3598"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType RuleMediatorInputConnector_3599 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.RuleMediatorInputConnector_3599"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType RuleMediatorOutputConnector_3600 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.RuleMediatorOutputConnector_3600"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType OAuthMediator_3601 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.OAuthMediator_3601"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType OAuthMediatorInputConnector_3602 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.OAuthMediatorInputConnector_3602"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType OAuthMediatorOutputConnector_3603 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.OAuthMediatorOutputConnector_3603"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType EsbLink_4001 = getElementType("org.wso2.carbonstudio.eclipse.gmf.esb.sequence.diagram.EsbLink_4001"); //$NON-NLS-1$

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

			elements.put(SequenceDiagram_1000,
					EsbPackage.eINSTANCE.getSequenceDiagram());

			elements.put(EsbSequence_2501,
					EsbPackage.eINSTANCE.getEsbSequence());

			elements.put(LogMediator_3501,
					EsbPackage.eINSTANCE.getLogMediator());

			elements.put(LogMediatorInputConnector_3502,
					EsbPackage.eINSTANCE.getLogMediatorInputConnector());

			elements.put(LogMediatorOutputConnector_3503,
					EsbPackage.eINSTANCE.getLogMediatorOutputConnector());

			elements.put(PropertyMediator_3512,
					EsbPackage.eINSTANCE.getPropertyMediator());

			elements.put(PropertyMediatorInputConnector_3513,
					EsbPackage.eINSTANCE.getPropertyMediatorInputConnector());

			elements.put(PropertyMediatorOutputConnector_3514,
					EsbPackage.eINSTANCE.getPropertyMediatorOutputConnector());

			elements.put(EsbSequenceInputConnector_3517,
					EsbPackage.eINSTANCE.getEsbSequenceInputConnector());

			elements.put(EsbSequenceOutputConnector_3518,
					EsbPackage.eINSTANCE.getEsbSequenceOutputConnector());

			elements.put(DropMediator_3519,
					EsbPackage.eINSTANCE.getDropMediator());

			elements.put(DropMediatorInputConnector_3520,
					EsbPackage.eINSTANCE.getDropMediatorInputConnector());

			elements.put(EnrichMediator_3521,
					EsbPackage.eINSTANCE.getEnrichMediator());

			elements.put(EnrichMediatorInputConnector_3522,
					EsbPackage.eINSTANCE.getEnrichMediatorInputConnector());

			elements.put(EnrichMediatorOutputConnector_3523,
					EsbPackage.eINSTANCE.getEnrichMediatorOutputConnector());

			elements.put(FilterMediator_3524,
					EsbPackage.eINSTANCE.getFilterMediator());

			elements.put(FilterMediatorInputConnector_3525,
					EsbPackage.eINSTANCE.getFilterMediatorInputConnector());

			elements.put(FilterMediatorPassOutputConnector_3526,
					EsbPackage.eINSTANCE.getFilterMediatorPassOutputConnector());

			elements.put(FilterMediatorFailOutputConnector_3527,
					EsbPackage.eINSTANCE.getFilterMediatorFailOutputConnector());

			elements.put(XSLTMediator_3528,
					EsbPackage.eINSTANCE.getXSLTMediator());

			elements.put(XSLTMediatorInputConnector_3529,
					EsbPackage.eINSTANCE.getXSLTMediatorInputConnector());

			elements.put(XSLTMediatorOutputConnector_3530,
					EsbPackage.eINSTANCE.getXSLTMediatorOutputConnector());

			elements.put(EventMediator_3531,
					EsbPackage.eINSTANCE.getEventMediator());

			elements.put(EventMediatorInputConnector_3532,
					EsbPackage.eINSTANCE.getEventMediatorInputConnector());

			elements.put(EventMediatorOutputConnector_3533,
					EsbPackage.eINSTANCE.getEventMediatorOutputConnector());

			elements.put(EntitlementMediator_3534,
					EsbPackage.eINSTANCE.getEntitlementMediator());

			elements.put(EntitlementMediatorInputConnector_3535,
					EsbPackage.eINSTANCE.getEntitlementMediatorInputConnector());

			elements.put(EntitlementMediatorOutputConnector_3536,
					EsbPackage.eINSTANCE
							.getEntitlementMediatorOutputConnector());

			elements.put(SwitchMediator_3537,
					EsbPackage.eINSTANCE.getSwitchMediator());

			elements.put(SwitchMediatorInputConnector_3538,
					EsbPackage.eINSTANCE.getSwitchMediatorInputConnector());

			elements.put(SwitchCaseBranchOutputConnector_3539,
					EsbPackage.eINSTANCE.getSwitchCaseBranchOutputConnector());

			elements.put(SwitchDefaultBranchOutputConnector_3540,
					EsbPackage.eINSTANCE
							.getSwitchDefaultBranchOutputConnector());

			elements.put(ClassMediator_3541,
					EsbPackage.eINSTANCE.getClassMediator());

			elements.put(ClassMediatorInputConnector_3542,
					EsbPackage.eINSTANCE.getClassMediatorInputConnector());

			elements.put(ClassMediatorOutputConnector_3543,
					EsbPackage.eINSTANCE.getClassMediatorOutputConnector());

			elements.put(SpringMediator_3544,
					EsbPackage.eINSTANCE.getSpringMediator());

			elements.put(SpringMediatorInputConnector_3545,
					EsbPackage.eINSTANCE.getSpringMediatorInputConnector());

			elements.put(SpringMediatorOutputConnector_3546,
					EsbPackage.eINSTANCE.getSpringMediatorOutputConnector());

			elements.put(ScriptMediator_3547,
					EsbPackage.eINSTANCE.getScriptMediator());

			elements.put(ScriptMediatorInputConnector_3548,
					EsbPackage.eINSTANCE.getScriptMediatorInputConnector());

			elements.put(ScriptMediatorOutputConnector_3549,
					EsbPackage.eINSTANCE.getScriptMediatorOutputConnector());

			elements.put(FaultMediator_3550,
					EsbPackage.eINSTANCE.getFaultMediator());

			elements.put(FaultMediatorInputConnector_3551,
					EsbPackage.eINSTANCE.getFaultMediatorInputConnector());

			elements.put(FaultMediatorOutputConnector_3552,
					EsbPackage.eINSTANCE.getFaultMediatorOutputConnector());

			elements.put(XQueryMediator_3553,
					EsbPackage.eINSTANCE.getXQueryMediator());

			elements.put(XQueryMediatorInputConnector_3554,
					EsbPackage.eINSTANCE.getXQueryMediatorInputConnector());

			elements.put(XQueryMediatorOutputConnector_3555,
					EsbPackage.eINSTANCE.getXQueryMediatorOutputConnector());

			elements.put(CommandMediator_3556,
					EsbPackage.eINSTANCE.getCommandMediator());

			elements.put(CommandMediatorInputConnector_3557,
					EsbPackage.eINSTANCE.getCommandMediatorInputConnector());

			elements.put(CommandMediatorOutputConnector_3558,
					EsbPackage.eINSTANCE.getCommandMediatorOutputConnector());

			elements.put(DBLookupMediator_3559,
					EsbPackage.eINSTANCE.getDBLookupMediator());

			elements.put(DBLookupMediatorInputConnector_3560,
					EsbPackage.eINSTANCE.getDBLookupMediatorInputConnector());

			elements.put(DBLookupMediatorOutputConnector_3561,
					EsbPackage.eINSTANCE.getDBLookupMediatorOutputConnector());

			elements.put(DBReportMediator_3562,
					EsbPackage.eINSTANCE.getDBReportMediator());

			elements.put(DBReportMediatorInputConnector_3563,
					EsbPackage.eINSTANCE.getDBReportMediatorInputConnector());

			elements.put(DBReportMediatorOutputConnector_3564,
					EsbPackage.eINSTANCE.getDBReportMediatorOutputConnector());

			elements.put(SmooksMediator_3565,
					EsbPackage.eINSTANCE.getSmooksMediator());

			elements.put(SmooksMediatorInputConnector_3566,
					EsbPackage.eINSTANCE.getSmooksMediatorInputConnector());

			elements.put(SmooksMediatorOutputConnector_3567,
					EsbPackage.eINSTANCE.getSmooksMediatorOutputConnector());

			elements.put(SendMediator_3568,
					EsbPackage.eINSTANCE.getSendMediator());

			elements.put(SendMediatorInputConnector_3569,
					EsbPackage.eINSTANCE.getSendMediatorInputConnector());

			elements.put(SendMediatorOutputConnector_3570,
					EsbPackage.eINSTANCE.getSendMediatorOutputConnector());

			elements.put(HeaderMediator_3571,
					EsbPackage.eINSTANCE.getHeaderMediator());

			elements.put(HeaderMediatorInputConnector_3572,
					EsbPackage.eINSTANCE.getHeaderMediatorInputConnector());

			elements.put(HeaderMediatorOutputConnector_3573,
					EsbPackage.eINSTANCE.getHeaderMediatorOutputConnector());

			elements.put(CloneMediator_3574,
					EsbPackage.eINSTANCE.getCloneMediator());

			elements.put(CloneMediatorInputConnector_3575,
					EsbPackage.eINSTANCE.getCloneMediatorInputConnector());

			elements.put(CloneMediatorOutputConnector_3576,
					EsbPackage.eINSTANCE.getCloneMediatorOutputConnector());

			elements.put(CacheMediator_3577,
					EsbPackage.eINSTANCE.getCacheMediator());

			elements.put(CacheMediatorInputConnector_3578,
					EsbPackage.eINSTANCE.getCacheMediatorInputConnector());

			elements.put(CacheMediatorOutputConnector_3579,
					EsbPackage.eINSTANCE.getCacheMediatorOutputConnector());

			elements.put(IterateMediator_3580,
					EsbPackage.eINSTANCE.getIterateMediator());

			elements.put(IterateMediatorInputConnector_3581,
					EsbPackage.eINSTANCE.getIterateMediatorInputConnector());

			elements.put(IterateMediatorOutputConnector_3582,
					EsbPackage.eINSTANCE.getIterateMediatorOutputConnector());

			elements.put(AggregateMediator_3583,
					EsbPackage.eINSTANCE.getAggregateMediator());

			elements.put(AggregateMediatorInputConnector_3584,
					EsbPackage.eINSTANCE.getAggregateMediatorInputConnector());

			elements.put(AggregateMediatorOutputConnector_3585,
					EsbPackage.eINSTANCE.getAggregateMediatorOutputConnector());

			elements.put(AggregateMediatorOnCompleteOutputConnector_3604,
					EsbPackage.eINSTANCE
							.getAggregateMediatorOnCompleteOutputConnector());

			elements.put(CalloutMediator_3586,
					EsbPackage.eINSTANCE.getCalloutMediator());

			elements.put(CalloutMediatorInputConnector_3587,
					EsbPackage.eINSTANCE.getCalloutMediatorInputConnector());

			elements.put(CalloutMediatorOutputConnector_3588,
					EsbPackage.eINSTANCE.getCalloutMediatorOutputConnector());

			elements.put(TransactionMediator_3589,
					EsbPackage.eINSTANCE.getTransactionMediator());

			elements.put(TransactionMediatorInputConnector_3590,
					EsbPackage.eINSTANCE.getTransactionMediatorInputConnector());

			elements.put(TransactionMediatorOutputConnector_3591,
					EsbPackage.eINSTANCE
							.getTransactionMediatorOutputConnector());

			elements.put(ThrottleMediator_3592,
					EsbPackage.eINSTANCE.getThrottleMediator());

			elements.put(ThrottleMediatorInputConnector_3593,
					EsbPackage.eINSTANCE.getThrottleMediatorInputConnector());

			elements.put(ThrottleMediatorOutputConnector_3594,
					EsbPackage.eINSTANCE.getThrottleMediatorOutputConnector());

			elements.put(RMSequenceMediator_3595,
					EsbPackage.eINSTANCE.getRMSequenceMediator());

			elements.put(RMSequenceMediatorInputConnector_3596,
					EsbPackage.eINSTANCE.getRMSequenceMediatorInputConnector());

			elements.put(RMSequenceMediatorOutputConnector_3597,
					EsbPackage.eINSTANCE.getRMSequenceMediatorOutputConnector());

			elements.put(RuleMediator_3598,
					EsbPackage.eINSTANCE.getRuleMediator());

			elements.put(RuleMediatorInputConnector_3599,
					EsbPackage.eINSTANCE.getRuleMediatorInputConnector());

			elements.put(RuleMediatorOutputConnector_3600,
					EsbPackage.eINSTANCE.getRuleMediatorOutputConnector());

			elements.put(OAuthMediator_3601,
					EsbPackage.eINSTANCE.getOAuthMediator());

			elements.put(OAuthMediatorInputConnector_3602,
					EsbPackage.eINSTANCE.getOAuthMediatorInputConnector());

			elements.put(OAuthMediatorOutputConnector_3603,
					EsbPackage.eINSTANCE.getOAuthMediatorOutputConnector());

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
			KNOWN_ELEMENT_TYPES.add(SequenceDiagram_1000);
			KNOWN_ELEMENT_TYPES.add(EsbSequence_2501);
			KNOWN_ELEMENT_TYPES.add(LogMediator_3501);
			KNOWN_ELEMENT_TYPES.add(LogMediatorInputConnector_3502);
			KNOWN_ELEMENT_TYPES.add(LogMediatorOutputConnector_3503);
			KNOWN_ELEMENT_TYPES.add(PropertyMediator_3512);
			KNOWN_ELEMENT_TYPES.add(PropertyMediatorInputConnector_3513);
			KNOWN_ELEMENT_TYPES.add(PropertyMediatorOutputConnector_3514);
			KNOWN_ELEMENT_TYPES.add(EsbSequenceInputConnector_3517);
			KNOWN_ELEMENT_TYPES.add(EsbSequenceOutputConnector_3518);
			KNOWN_ELEMENT_TYPES.add(DropMediator_3519);
			KNOWN_ELEMENT_TYPES.add(DropMediatorInputConnector_3520);
			KNOWN_ELEMENT_TYPES.add(EnrichMediator_3521);
			KNOWN_ELEMENT_TYPES.add(EnrichMediatorInputConnector_3522);
			KNOWN_ELEMENT_TYPES.add(EnrichMediatorOutputConnector_3523);
			KNOWN_ELEMENT_TYPES.add(FilterMediator_3524);
			KNOWN_ELEMENT_TYPES.add(FilterMediatorInputConnector_3525);
			KNOWN_ELEMENT_TYPES.add(FilterMediatorPassOutputConnector_3526);
			KNOWN_ELEMENT_TYPES.add(FilterMediatorFailOutputConnector_3527);
			KNOWN_ELEMENT_TYPES.add(XSLTMediator_3528);
			KNOWN_ELEMENT_TYPES.add(XSLTMediatorInputConnector_3529);
			KNOWN_ELEMENT_TYPES.add(XSLTMediatorOutputConnector_3530);
			KNOWN_ELEMENT_TYPES.add(EventMediator_3531);
			KNOWN_ELEMENT_TYPES.add(EventMediatorInputConnector_3532);
			KNOWN_ELEMENT_TYPES.add(EventMediatorOutputConnector_3533);
			KNOWN_ELEMENT_TYPES.add(EntitlementMediator_3534);
			KNOWN_ELEMENT_TYPES.add(EntitlementMediatorInputConnector_3535);
			KNOWN_ELEMENT_TYPES.add(EntitlementMediatorOutputConnector_3536);
			KNOWN_ELEMENT_TYPES.add(SwitchMediator_3537);
			KNOWN_ELEMENT_TYPES.add(SwitchMediatorInputConnector_3538);
			KNOWN_ELEMENT_TYPES.add(SwitchCaseBranchOutputConnector_3539);
			KNOWN_ELEMENT_TYPES.add(SwitchDefaultBranchOutputConnector_3540);
			KNOWN_ELEMENT_TYPES.add(ClassMediator_3541);
			KNOWN_ELEMENT_TYPES.add(ClassMediatorInputConnector_3542);
			KNOWN_ELEMENT_TYPES.add(ClassMediatorOutputConnector_3543);
			KNOWN_ELEMENT_TYPES.add(SpringMediator_3544);
			KNOWN_ELEMENT_TYPES.add(SpringMediatorInputConnector_3545);
			KNOWN_ELEMENT_TYPES.add(SpringMediatorOutputConnector_3546);
			KNOWN_ELEMENT_TYPES.add(ScriptMediator_3547);
			KNOWN_ELEMENT_TYPES.add(ScriptMediatorInputConnector_3548);
			KNOWN_ELEMENT_TYPES.add(ScriptMediatorOutputConnector_3549);
			KNOWN_ELEMENT_TYPES.add(FaultMediator_3550);
			KNOWN_ELEMENT_TYPES.add(FaultMediatorInputConnector_3551);
			KNOWN_ELEMENT_TYPES.add(FaultMediatorOutputConnector_3552);
			KNOWN_ELEMENT_TYPES.add(XQueryMediator_3553);
			KNOWN_ELEMENT_TYPES.add(XQueryMediatorInputConnector_3554);
			KNOWN_ELEMENT_TYPES.add(XQueryMediatorOutputConnector_3555);
			KNOWN_ELEMENT_TYPES.add(CommandMediator_3556);
			KNOWN_ELEMENT_TYPES.add(CommandMediatorInputConnector_3557);
			KNOWN_ELEMENT_TYPES.add(CommandMediatorOutputConnector_3558);
			KNOWN_ELEMENT_TYPES.add(DBLookupMediator_3559);
			KNOWN_ELEMENT_TYPES.add(DBLookupMediatorInputConnector_3560);
			KNOWN_ELEMENT_TYPES.add(DBLookupMediatorOutputConnector_3561);
			KNOWN_ELEMENT_TYPES.add(DBReportMediator_3562);
			KNOWN_ELEMENT_TYPES.add(DBReportMediatorInputConnector_3563);
			KNOWN_ELEMENT_TYPES.add(DBReportMediatorOutputConnector_3564);
			KNOWN_ELEMENT_TYPES.add(SmooksMediator_3565);
			KNOWN_ELEMENT_TYPES.add(SmooksMediatorInputConnector_3566);
			KNOWN_ELEMENT_TYPES.add(SmooksMediatorOutputConnector_3567);
			KNOWN_ELEMENT_TYPES.add(SendMediator_3568);
			KNOWN_ELEMENT_TYPES.add(SendMediatorInputConnector_3569);
			KNOWN_ELEMENT_TYPES.add(SendMediatorOutputConnector_3570);
			KNOWN_ELEMENT_TYPES.add(HeaderMediator_3571);
			KNOWN_ELEMENT_TYPES.add(HeaderMediatorInputConnector_3572);
			KNOWN_ELEMENT_TYPES.add(HeaderMediatorOutputConnector_3573);
			KNOWN_ELEMENT_TYPES.add(CloneMediator_3574);
			KNOWN_ELEMENT_TYPES.add(CloneMediatorInputConnector_3575);
			KNOWN_ELEMENT_TYPES.add(CloneMediatorOutputConnector_3576);
			KNOWN_ELEMENT_TYPES.add(CacheMediator_3577);
			KNOWN_ELEMENT_TYPES.add(CacheMediatorInputConnector_3578);
			KNOWN_ELEMENT_TYPES.add(CacheMediatorOutputConnector_3579);
			KNOWN_ELEMENT_TYPES.add(IterateMediator_3580);
			KNOWN_ELEMENT_TYPES.add(IterateMediatorInputConnector_3581);
			KNOWN_ELEMENT_TYPES.add(IterateMediatorOutputConnector_3582);
			KNOWN_ELEMENT_TYPES.add(AggregateMediator_3583);
			KNOWN_ELEMENT_TYPES.add(AggregateMediatorInputConnector_3584);
			KNOWN_ELEMENT_TYPES.add(AggregateMediatorOutputConnector_3585);
			KNOWN_ELEMENT_TYPES
					.add(AggregateMediatorOnCompleteOutputConnector_3604);
			KNOWN_ELEMENT_TYPES.add(CalloutMediator_3586);
			KNOWN_ELEMENT_TYPES.add(CalloutMediatorInputConnector_3587);
			KNOWN_ELEMENT_TYPES.add(CalloutMediatorOutputConnector_3588);
			KNOWN_ELEMENT_TYPES.add(TransactionMediator_3589);
			KNOWN_ELEMENT_TYPES.add(TransactionMediatorInputConnector_3590);
			KNOWN_ELEMENT_TYPES.add(TransactionMediatorOutputConnector_3591);
			KNOWN_ELEMENT_TYPES.add(ThrottleMediator_3592);
			KNOWN_ELEMENT_TYPES.add(ThrottleMediatorInputConnector_3593);
			KNOWN_ELEMENT_TYPES.add(ThrottleMediatorOutputConnector_3594);
			KNOWN_ELEMENT_TYPES.add(RMSequenceMediator_3595);
			KNOWN_ELEMENT_TYPES.add(RMSequenceMediatorInputConnector_3596);
			KNOWN_ELEMENT_TYPES.add(RMSequenceMediatorOutputConnector_3597);
			KNOWN_ELEMENT_TYPES.add(RuleMediator_3598);
			KNOWN_ELEMENT_TYPES.add(RuleMediatorInputConnector_3599);
			KNOWN_ELEMENT_TYPES.add(RuleMediatorOutputConnector_3600);
			KNOWN_ELEMENT_TYPES.add(OAuthMediator_3601);
			KNOWN_ELEMENT_TYPES.add(OAuthMediatorInputConnector_3602);
			KNOWN_ELEMENT_TYPES.add(OAuthMediatorOutputConnector_3603);
			KNOWN_ELEMENT_TYPES.add(EsbLink_4001);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case SequenceDiagramEditPart.VISUAL_ID:
			return SequenceDiagram_1000;
		case EsbSequenceEditPart.VISUAL_ID:
			return EsbSequence_2501;
		case LogMediatorEditPart.VISUAL_ID:
			return LogMediator_3501;
		case LogMediatorInputConnectorEditPart.VISUAL_ID:
			return LogMediatorInputConnector_3502;
		case LogMediatorOutputConnectorEditPart.VISUAL_ID:
			return LogMediatorOutputConnector_3503;
		case PropertyMediatorEditPart.VISUAL_ID:
			return PropertyMediator_3512;
		case PropertyMediatorInputConnectorEditPart.VISUAL_ID:
			return PropertyMediatorInputConnector_3513;
		case PropertyMediatorOutputConnectorEditPart.VISUAL_ID:
			return PropertyMediatorOutputConnector_3514;
		case EsbSequenceInputConnectorEditPart.VISUAL_ID:
			return EsbSequenceInputConnector_3517;
		case EsbSequenceOutputConnectorEditPart.VISUAL_ID:
			return EsbSequenceOutputConnector_3518;
		case DropMediatorEditPart.VISUAL_ID:
			return DropMediator_3519;
		case DropMediatorInputConnectorEditPart.VISUAL_ID:
			return DropMediatorInputConnector_3520;
		case EnrichMediatorEditPart.VISUAL_ID:
			return EnrichMediator_3521;
		case EnrichMediatorInputConnectorEditPart.VISUAL_ID:
			return EnrichMediatorInputConnector_3522;
		case EnrichMediatorOutputConnectorEditPart.VISUAL_ID:
			return EnrichMediatorOutputConnector_3523;
		case FilterMediatorEditPart.VISUAL_ID:
			return FilterMediator_3524;
		case FilterMediatorInputConnectorEditPart.VISUAL_ID:
			return FilterMediatorInputConnector_3525;
		case FilterMediatorPassOutputConnectorEditPart.VISUAL_ID:
			return FilterMediatorPassOutputConnector_3526;
		case FilterMediatorFailOutputConnectorEditPart.VISUAL_ID:
			return FilterMediatorFailOutputConnector_3527;
		case XSLTMediatorEditPart.VISUAL_ID:
			return XSLTMediator_3528;
		case XSLTMediatorInputConnectorEditPart.VISUAL_ID:
			return XSLTMediatorInputConnector_3529;
		case XSLTMediatorOutputConnectorEditPart.VISUAL_ID:
			return XSLTMediatorOutputConnector_3530;
		case EventMediatorEditPart.VISUAL_ID:
			return EventMediator_3531;
		case EventMediatorInputConnectorEditPart.VISUAL_ID:
			return EventMediatorInputConnector_3532;
		case EventMediatorOutputConnectorEditPart.VISUAL_ID:
			return EventMediatorOutputConnector_3533;
		case EntitlementMediatorEditPart.VISUAL_ID:
			return EntitlementMediator_3534;
		case EntitlementMediatorInputConnectorEditPart.VISUAL_ID:
			return EntitlementMediatorInputConnector_3535;
		case EntitlementMediatorOutputConnectorEditPart.VISUAL_ID:
			return EntitlementMediatorOutputConnector_3536;
		case SwitchMediatorEditPart.VISUAL_ID:
			return SwitchMediator_3537;
		case SwitchMediatorInputConnectorEditPart.VISUAL_ID:
			return SwitchMediatorInputConnector_3538;
		case SwitchCaseBranchOutputConnectorEditPart.VISUAL_ID:
			return SwitchCaseBranchOutputConnector_3539;
		case SwitchDefaultBranchOutputConnectorEditPart.VISUAL_ID:
			return SwitchDefaultBranchOutputConnector_3540;
		case ClassMediatorEditPart.VISUAL_ID:
			return ClassMediator_3541;
		case ClassMediatorInputConnectorEditPart.VISUAL_ID:
			return ClassMediatorInputConnector_3542;
		case ClassMediatorOutputConnectorEditPart.VISUAL_ID:
			return ClassMediatorOutputConnector_3543;
		case SpringMediatorEditPart.VISUAL_ID:
			return SpringMediator_3544;
		case SpringMediatorInputConnectorEditPart.VISUAL_ID:
			return SpringMediatorInputConnector_3545;
		case SpringMediatorOutputConnectorEditPart.VISUAL_ID:
			return SpringMediatorOutputConnector_3546;
		case ScriptMediatorEditPart.VISUAL_ID:
			return ScriptMediator_3547;
		case ScriptMediatorInputConnectorEditPart.VISUAL_ID:
			return ScriptMediatorInputConnector_3548;
		case ScriptMediatorOutputConnectorEditPart.VISUAL_ID:
			return ScriptMediatorOutputConnector_3549;
		case FaultMediatorEditPart.VISUAL_ID:
			return FaultMediator_3550;
		case FaultMediatorInputConnectorEditPart.VISUAL_ID:
			return FaultMediatorInputConnector_3551;
		case FaultMediatorOutputConnectorEditPart.VISUAL_ID:
			return FaultMediatorOutputConnector_3552;
		case XQueryMediatorEditPart.VISUAL_ID:
			return XQueryMediator_3553;
		case XQueryMediatorInputConnectorEditPart.VISUAL_ID:
			return XQueryMediatorInputConnector_3554;
		case XQueryMediatorOutputConnectorEditPart.VISUAL_ID:
			return XQueryMediatorOutputConnector_3555;
		case CommandMediatorEditPart.VISUAL_ID:
			return CommandMediator_3556;
		case CommandMediatorInputConnectorEditPart.VISUAL_ID:
			return CommandMediatorInputConnector_3557;
		case CommandMediatorOutputConnectorEditPart.VISUAL_ID:
			return CommandMediatorOutputConnector_3558;
		case DBLookupMediatorEditPart.VISUAL_ID:
			return DBLookupMediator_3559;
		case DBLookupMediatorInputConnectorEditPart.VISUAL_ID:
			return DBLookupMediatorInputConnector_3560;
		case DBLookupMediatorOutputConnectorEditPart.VISUAL_ID:
			return DBLookupMediatorOutputConnector_3561;
		case DBReportMediatorEditPart.VISUAL_ID:
			return DBReportMediator_3562;
		case DBReportMediatorInputConnectorEditPart.VISUAL_ID:
			return DBReportMediatorInputConnector_3563;
		case DBReportMediatorOutputConnectorEditPart.VISUAL_ID:
			return DBReportMediatorOutputConnector_3564;
		case SmooksMediatorEditPart.VISUAL_ID:
			return SmooksMediator_3565;
		case SmooksMediatorInputConnectorEditPart.VISUAL_ID:
			return SmooksMediatorInputConnector_3566;
		case SmooksMediatorOutputConnectorEditPart.VISUAL_ID:
			return SmooksMediatorOutputConnector_3567;
		case SendMediatorEditPart.VISUAL_ID:
			return SendMediator_3568;
		case SendMediatorInputConnectorEditPart.VISUAL_ID:
			return SendMediatorInputConnector_3569;
		case SendMediatorOutputConnectorEditPart.VISUAL_ID:
			return SendMediatorOutputConnector_3570;
		case HeaderMediatorEditPart.VISUAL_ID:
			return HeaderMediator_3571;
		case HeaderMediatorInputConnectorEditPart.VISUAL_ID:
			return HeaderMediatorInputConnector_3572;
		case HeaderMediatorOutputConnectorEditPart.VISUAL_ID:
			return HeaderMediatorOutputConnector_3573;
		case CloneMediatorEditPart.VISUAL_ID:
			return CloneMediator_3574;
		case CloneMediatorInputConnectorEditPart.VISUAL_ID:
			return CloneMediatorInputConnector_3575;
		case CloneMediatorOutputConnectorEditPart.VISUAL_ID:
			return CloneMediatorOutputConnector_3576;
		case CacheMediatorEditPart.VISUAL_ID:
			return CacheMediator_3577;
		case CacheMediatorInputConnectorEditPart.VISUAL_ID:
			return CacheMediatorInputConnector_3578;
		case CacheMediatorOutputConnectorEditPart.VISUAL_ID:
			return CacheMediatorOutputConnector_3579;
		case IterateMediatorEditPart.VISUAL_ID:
			return IterateMediator_3580;
		case IterateMediatorInputConnectorEditPart.VISUAL_ID:
			return IterateMediatorInputConnector_3581;
		case IterateMediatorOutputConnectorEditPart.VISUAL_ID:
			return IterateMediatorOutputConnector_3582;
		case AggregateMediatorEditPart.VISUAL_ID:
			return AggregateMediator_3583;
		case AggregateMediatorInputConnectorEditPart.VISUAL_ID:
			return AggregateMediatorInputConnector_3584;
		case AggregateMediatorOutputConnectorEditPart.VISUAL_ID:
			return AggregateMediatorOutputConnector_3585;
		case AggregateMediatorOnCompleteOutputConnectorEditPart.VISUAL_ID:
			return AggregateMediatorOnCompleteOutputConnector_3604;
		case CalloutMediatorEditPart.VISUAL_ID:
			return CalloutMediator_3586;
		case CalloutMediatorInputConnectorEditPart.VISUAL_ID:
			return CalloutMediatorInputConnector_3587;
		case CalloutMediatorOutputConnectorEditPart.VISUAL_ID:
			return CalloutMediatorOutputConnector_3588;
		case TransactionMediatorEditPart.VISUAL_ID:
			return TransactionMediator_3589;
		case TransactionMediatorInputConnectorEditPart.VISUAL_ID:
			return TransactionMediatorInputConnector_3590;
		case TransactionMediatorOutputConnectorEditPart.VISUAL_ID:
			return TransactionMediatorOutputConnector_3591;
		case ThrottleMediatorEditPart.VISUAL_ID:
			return ThrottleMediator_3592;
		case ThrottleMediatorInputConnectorEditPart.VISUAL_ID:
			return ThrottleMediatorInputConnector_3593;
		case ThrottleMediatorOutputConnectorEditPart.VISUAL_ID:
			return ThrottleMediatorOutputConnector_3594;
		case RMSequenceMediatorEditPart.VISUAL_ID:
			return RMSequenceMediator_3595;
		case RMSequenceMediatorInputConnectorEditPart.VISUAL_ID:
			return RMSequenceMediatorInputConnector_3596;
		case RMSequenceMediatorOutputConnectorEditPart.VISUAL_ID:
			return RMSequenceMediatorOutputConnector_3597;
		case RuleMediatorEditPart.VISUAL_ID:
			return RuleMediator_3598;
		case RuleMediatorInputConnectorEditPart.VISUAL_ID:
			return RuleMediatorInputConnector_3599;
		case RuleMediatorOutputConnectorEditPart.VISUAL_ID:
			return RuleMediatorOutputConnector_3600;
		case OAuthMediatorEditPart.VISUAL_ID:
			return OAuthMediator_3601;
		case OAuthMediatorInputConnectorEditPart.VISUAL_ID:
			return OAuthMediatorInputConnector_3602;
		case OAuthMediatorOutputConnectorEditPart.VISUAL_ID:
			return OAuthMediatorOutputConnector_3603;
		case EsbLinkEditPart.VISUAL_ID:
			return EsbLink_4001;
		}
		return null;
	}

}
