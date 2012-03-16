package org.wso2.developerstudio.eclipse.gmf.esb.diagram.part;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.gef.EditPartViewer;
import org.eclipse.gef.Tool;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteEntry;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.PaletteSeparator;
import org.eclipse.gef.palette.PaletteStack;
import org.eclipse.gef.palette.PaletteToolbar;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gef.tools.ConnectionBendpointTracker;
import org.eclipse.gef.tools.ConnectionDragCreationTool;
import org.eclipse.gef.tools.ConnectionEndpointTracker;
import org.eclipse.gef.tools.MarqueeDragTracker;
import org.eclipse.gef.tools.MarqueeSelectionTool;
import org.eclipse.gef.tools.SimpleDragTracker;
import org.eclipse.gef.tools.TargetingTool;
import org.eclipse.gef.ui.palette.PaletteContextMenuProvider;
import org.eclipse.gmf.runtime.diagram.ui.internal.services.palette.PaletteToolEntry;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditDomain;
import org.eclipse.gmf.runtime.diagram.ui.tools.ConnectionCreationTool;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeConnectionTool;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeCreationTool;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.jface.action.Separator;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IFileEditorInput;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.custom.ToolPalleteDetails;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.edit.parts.SequenceEditPart;
import org.wso2.developerstudio.eclipse.gmf.esb.diagram.providers.EsbElementTypes;

/**
 * @generated
 */
public class EsbPaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createNodes1Group());
		paletteRoot.add(createMediators2Group());
		paletteRoot.add(createEndPoints3Group());
		paletteRoot.add(createLinks4Group());
		paletteRoot.add(createHelpers5Group());
	}

	/**
	 * Creates "Nodes" palette tool group
	 * @generated NOT
	 */
	private PaletteContainer createNodes1Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				Messages.Nodes1Group_title);
		paletteContainer.setId("createNodes1Group"); //$NON-NLS-1$
		//paletteContainer.add(createEsbServer1CreationTool());
		paletteContainer.add(createProxyService2CreationTool());
		paletteContainer.add(createMessageMediator3CreationTool());
		//paletteContainer.add(createSequence4CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Mediators" palette tool group
	 * @generated NOT
	 */
	private PaletteContainer createMediators2Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				Messages.Mediators2Group_title);
		paletteContainer.setId("createMediators2Group"); //$NON-NLS-1$	

		paletteContainer.add(createLogMediator3CreationTool());
		paletteContainer.add(createDropMediator1CreationTool());
		paletteContainer.add(createPropertyMediator4CreationTool());
		paletteContainer.add(createEnrichMediator5CreationTool());
		paletteContainer.add(createEventMediator8CreationTool());
		paletteContainer.add(createSendMediator19CreationTool());

		paletteContainer.add(new PaletteSeparator());
		paletteContainer.add(createFilterMediator2CreationTool());
		paletteContainer.add(createSwitchMediator7CreationTool());

		paletteContainer.add(new PaletteSeparator());
		paletteContainer.add(createXSLTMediator6CreationTool());
		paletteContainer.add(createXQueryMediator14CreationTool());
		paletteContainer.add(createFaultMediator13CreationTool());
		paletteContainer.add(createHeaderMediator20CreationTool());

		paletteContainer.add(new PaletteSeparator());
		paletteContainer.add(createDBLookupMediator16CreationTool());
		paletteContainer.add(createDBReportMediator17CreationTool());
		paletteContainer.add(createEntitlementMediator9CreationTool());
		paletteContainer.add(createCloneMediator21CreationTool());
		paletteContainer.add(createIterateMediator22CreationTool());
		paletteContainer.add(createCacheMediator23CreationTool());
		paletteContainer.add(createAggregateMediator24CreationTool());
		paletteContainer.add(createCalloutMediator25CreationTool());
		paletteContainer.add(createTransactionMediator26CreationTool());
		paletteContainer.add(createThrottleMediator27CreationTool());
		paletteContainer.add(createRMSequenceMediator28CreationTool());
		paletteContainer.add(createOAuthMediator29CreationTool());
		paletteContainer.add(createRuleMediator30CreationTool());

		paletteContainer.add(new PaletteSeparator());
		paletteContainer.add(createClassMediator10CreationTool());
		paletteContainer.add(createSpringMediator11CreationTool());
		paletteContainer.add(createScriptMediator12CreationTool());
		paletteContainer.add(createSmooksMediator18CreationTool());
		paletteContainer.add(createCommandMediator15CreationTool());

		return paletteContainer;
	}

	/**
	 * Creates "EndPoints" palette tool group
	 * @generated
	 */
	private PaletteContainer createEndPoints3Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				Messages.EndPoints3Group_title);
		paletteContainer.setId("createEndPoints3Group"); //$NON-NLS-1$
		paletteContainer.add(createDefaultEndPoint1CreationTool());
		paletteContainer.add(createAddressEndPoint2CreationTool());
		paletteContainer.add(createFailoverEndPoint3CreationTool());
		paletteContainer.add(createWSDLEndPoint4CreationTool());
		paletteContainer.add(createLoadBalanceEndPoint5CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Links" palette tool group
	 * @generated
	 */
	private PaletteContainer createLinks4Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				Messages.Links4Group_title);
		paletteContainer.setId("createLinks4Group"); //$NON-NLS-1$
		paletteContainer.add(createEsbLink1CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Helpers" palette tool group
	 * @generated
	 */
	private PaletteContainer createHelpers5Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				Messages.Helpers5Group_title);
		paletteContainer.setId("createHelpers5Group"); //$NON-NLS-1$
		paletteContainer.add(createMergeNode1CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createEsbServer1CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.EsbServer1CreationTool_title,
				Messages.EsbServer1CreationTool_desc,
				Collections.singletonList(EsbElementTypes.EsbServer_2001));
		entry.setId("createEsbServer1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EsbElementTypes
				.getImageDescriptor(EsbElementTypes.EsbServer_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createProxyService2CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.ProxyService2CreationTool_title,
				Messages.ProxyService2CreationTool_desc,
				Collections.singletonList(EsbElementTypes.ProxyService_3001));
		entry.setId("createProxyService2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EsbElementTypes
				.getImageDescriptor(EsbElementTypes.ProxyService_3001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createMessageMediator3CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.MessageMediator3CreationTool_title,
				Messages.MessageMediator3CreationTool_desc,
				Collections.singletonList(EsbElementTypes.MessageMediator_3045));
		entry.setId("createMessageMediator3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EsbElementTypes
				.getImageDescriptor(EsbElementTypes.MessageMediator_3045));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSequence4CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(4);
		types.add(EsbElementTypes.Sequence_3214);
		types.add(EsbElementTypes.Sequence_3187);
		types.add(EsbElementTypes.Sequence_3254);
		types.add(EsbElementTypes.Sequence_3375);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Sequence4CreationTool_title,
				Messages.Sequence4CreationTool_desc, types);
		entry.setId("createSequence4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EsbElementTypes
				.getImageDescriptor(EsbElementTypes.Sequence_3214));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDropMediator1CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(4);
		types.add(EsbElementTypes.DropMediator_3191);
		types.add(EsbElementTypes.DropMediator_3137);
		types.add(EsbElementTypes.DropMediator_3194);
		types.add(EsbElementTypes.DropMediator_3328);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.DropMediator1CreationTool_title,
				Messages.DropMediator1CreationTool_desc, types);
		entry.setId("createDropMediator1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EsbElementTypes
				.getImageDescriptor(EsbElementTypes.DropMediator_3191));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createFilterMediator2CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(4);
		types.add(EsbElementTypes.FilterMediator_3209);
		types.add(EsbElementTypes.FilterMediator_3139);
		types.add(EsbElementTypes.FilterMediator_3237);
		types.add(EsbElementTypes.FilterMediator_3329);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.FilterMediator2CreationTool_title,
				Messages.FilterMediator2CreationTool_desc, types);
		entry.setId("createFilterMediator2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EsbElementTypes
				.getImageDescriptor(EsbElementTypes.FilterMediator_3209));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createLogMediator3CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(4);
		types.add(EsbElementTypes.LogMediator_3210);
		types.add(EsbElementTypes.LogMediator_3134);
		types.add(EsbElementTypes.LogMediator_3241);
		types.add(EsbElementTypes.LogMediator_3325);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.LogMediator3CreationTool_title,
				Messages.LogMediator3CreationTool_desc, types);
		entry.setId("createLogMediator3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EsbElementTypes
				.getImageDescriptor(EsbElementTypes.LogMediator_3210));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createPropertyMediator4CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(4);
		types.add(EsbElementTypes.PropertyMediator_3199);
		types.add(EsbElementTypes.PropertyMediator_3143);
		types.add(EsbElementTypes.PropertyMediator_3200);
		types.add(EsbElementTypes.PropertyMediator_3333);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.PropertyMediator4CreationTool_title,
				Messages.PropertyMediator4CreationTool_desc, types);
		entry.setId("createPropertyMediator4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EsbElementTypes
				.getImageDescriptor(EsbElementTypes.PropertyMediator_3199));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createEnrichMediator5CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(4);
		types.add(EsbElementTypes.EnrichMediator_3387);
		types.add(EsbElementTypes.EnrichMediator_3146);
		types.add(EsbElementTypes.EnrichMediator_3244);
		types.add(EsbElementTypes.EnrichMediator_3334);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.EnrichMediator5CreationTool_title,
				Messages.EnrichMediator5CreationTool_desc, types);
		entry.setId("createEnrichMediator5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EsbElementTypes
				.getImageDescriptor(EsbElementTypes.EnrichMediator_3387));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createXSLTMediator6CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(4);
		types.add(EsbElementTypes.XSLTMediator_3212);
		types.add(EsbElementTypes.XSLTMediator_3149);
		types.add(EsbElementTypes.XSLTMediator_3247);
		types.add(EsbElementTypes.XSLTMediator_3337);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.XSLTMediator6CreationTool_title,
				Messages.XSLTMediator6CreationTool_desc, types);
		entry.setId("createXSLTMediator6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EsbElementTypes
				.getImageDescriptor(EsbElementTypes.XSLTMediator_3212));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSwitchMediator7CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(4);
		types.add(EsbElementTypes.SwitchMediator_3213);
		types.add(EsbElementTypes.SwitchMediator_3152);
		types.add(EsbElementTypes.SwitchMediator_3250);
		types.add(EsbElementTypes.SwitchMediator_3340);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.SwitchMediator7CreationTool_title,
				Messages.SwitchMediator7CreationTool_desc, types);
		entry.setId("createSwitchMediator7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EsbElementTypes
				.getImageDescriptor(EsbElementTypes.SwitchMediator_3213));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createEventMediator8CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(EsbElementTypes.EventMediator_3215);
		types.add(EsbElementTypes.EventMediator_3257);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.EventMediator8CreationTool_title,
				Messages.EventMediator8CreationTool_desc, types);
		entry.setId("createEventMediator8CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EsbElementTypes
				.getImageDescriptor(EsbElementTypes.EventMediator_3215));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createEntitlementMediator9CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(EsbElementTypes.EntitlementMediator_3216);
		types.add(EsbElementTypes.EntitlementMediator_3260);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.EntitlementMediator9CreationTool_title,
				Messages.EntitlementMediator9CreationTool_desc, types);
		entry.setId("createEntitlementMediator9CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EsbElementTypes
				.getImageDescriptor(EsbElementTypes.EntitlementMediator_3216));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createClassMediator10CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(EsbElementTypes.ClassMediator_3217);
		types.add(EsbElementTypes.ClassMediator_3263);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.ClassMediator10CreationTool_title,
				Messages.ClassMediator10CreationTool_desc, types);
		entry.setId("createClassMediator10CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EsbElementTypes
				.getImageDescriptor(EsbElementTypes.ClassMediator_3217));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSpringMediator11CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(EsbElementTypes.SpringMediator_3218);
		types.add(EsbElementTypes.SpringMediator_3266);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.SpringMediator11CreationTool_title,
				Messages.SpringMediator11CreationTool_desc, types);
		entry.setId("createSpringMediator11CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EsbElementTypes
				.getImageDescriptor(EsbElementTypes.SpringMediator_3218));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createScriptMediator12CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(EsbElementTypes.ScriptMediator_3219);
		types.add(EsbElementTypes.ScriptMediator_3269);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.ScriptMediator12CreationTool_title,
				Messages.ScriptMediator12CreationTool_desc, types);
		entry.setId("createScriptMediator12CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EsbElementTypes
				.getImageDescriptor(EsbElementTypes.ScriptMediator_3219));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createFaultMediator13CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(4);
		types.add(EsbElementTypes.FaultMediator_3220);
		types.add(EsbElementTypes.FaultMediator_3156);
		types.add(EsbElementTypes.FaultMediator_3272);
		types.add(EsbElementTypes.FaultMediator_3344);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.FaultMediator13CreationTool_title,
				Messages.FaultMediator13CreationTool_desc, types);
		entry.setId("createFaultMediator13CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EsbElementTypes
				.getImageDescriptor(EsbElementTypes.FaultMediator_3220));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createXQueryMediator14CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(EsbElementTypes.XQueryMediator_3221);
		types.add(EsbElementTypes.XQueryMediator_3275);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.XQueryMediator14CreationTool_title,
				Messages.XQueryMediator14CreationTool_desc, types);
		entry.setId("createXQueryMediator14CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EsbElementTypes
				.getImageDescriptor(EsbElementTypes.XQueryMediator_3221));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCommandMediator15CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(EsbElementTypes.CommandMediator_3222);
		types.add(EsbElementTypes.CommandMediator_3278);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.CommandMediator15CreationTool_title,
				Messages.CommandMediator15CreationTool_desc, types);
		entry.setId("createCommandMediator15CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EsbElementTypes
				.getImageDescriptor(EsbElementTypes.CommandMediator_3222));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDBLookupMediator16CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(4);
		types.add(EsbElementTypes.DBLookupMediator_3223);
		types.add(EsbElementTypes.DBLookupMediator_3159);
		types.add(EsbElementTypes.DBLookupMediator_3281);
		types.add(EsbElementTypes.DBLookupMediator_3347);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.DBLookupMediator16CreationTool_title,
				Messages.DBLookupMediator16CreationTool_desc, types);
		entry.setId("createDBLookupMediator16CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EsbElementTypes
				.getImageDescriptor(EsbElementTypes.DBLookupMediator_3223));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDBReportMediator17CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(4);
		types.add(EsbElementTypes.DBReportMediator_3224);
		types.add(EsbElementTypes.DBReportMediator_3162);
		types.add(EsbElementTypes.DBReportMediator_3284);
		types.add(EsbElementTypes.DBReportMediator_3350);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.DBReportMediator17CreationTool_title,
				Messages.DBReportMediator17CreationTool_desc, types);
		entry.setId("createDBReportMediator17CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EsbElementTypes
				.getImageDescriptor(EsbElementTypes.DBReportMediator_3224));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSmooksMediator18CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(EsbElementTypes.SmooksMediator_3225);
		types.add(EsbElementTypes.SmooksMediator_3287);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.SmooksMediator18CreationTool_title,
				Messages.SmooksMediator18CreationTool_desc, types);
		entry.setId("createSmooksMediator18CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EsbElementTypes
				.getImageDescriptor(EsbElementTypes.SmooksMediator_3225));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSendMediator19CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(4);
		types.add(EsbElementTypes.SendMediator_3226);
		types.add(EsbElementTypes.SendMediator_3165);
		types.add(EsbElementTypes.SendMediator_3290);
		types.add(EsbElementTypes.SendMediator_3353);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.SendMediator19CreationTool_title,
				Messages.SendMediator19CreationTool_desc, types);
		entry.setId("createSendMediator19CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EsbElementTypes
				.getImageDescriptor(EsbElementTypes.SendMediator_3226));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createHeaderMediator20CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(4);
		types.add(EsbElementTypes.HeaderMediator_3227);
		types.add(EsbElementTypes.HeaderMediator_3168);
		types.add(EsbElementTypes.HeaderMediator_3293);
		types.add(EsbElementTypes.HeaderMediator_3356);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.HeaderMediator20CreationTool_title,
				Messages.HeaderMediator20CreationTool_desc, types);
		entry.setId("createHeaderMediator20CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EsbElementTypes
				.getImageDescriptor(EsbElementTypes.HeaderMediator_3227));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCloneMediator21CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(4);
		types.add(EsbElementTypes.CloneMediator_3228);
		types.add(EsbElementTypes.CloneMediator_3171);
		types.add(EsbElementTypes.CloneMediator_3296);
		types.add(EsbElementTypes.CloneMediator_3359);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.CloneMediator21CreationTool_title,
				Messages.CloneMediator21CreationTool_desc, types);
		entry.setId("createCloneMediator21CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EsbElementTypes
				.getImageDescriptor(EsbElementTypes.CloneMediator_3228));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createIterateMediator22CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(4);
		types.add(EsbElementTypes.IterateMediator_3230);
		types.add(EsbElementTypes.IterateMediator_3175);
		types.add(EsbElementTypes.IterateMediator_3303);
		types.add(EsbElementTypes.IterateMediator_3363);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.IterateMediator22CreationTool_title,
				Messages.IterateMediator22CreationTool_desc, types);
		entry.setId("createIterateMediator22CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EsbElementTypes
				.getImageDescriptor(EsbElementTypes.IterateMediator_3230));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCacheMediator23CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(EsbElementTypes.CacheMediator_3229);
		types.add(EsbElementTypes.CacheMediator_3300);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.CacheMediator23CreationTool_title,
				Messages.CacheMediator23CreationTool_desc, types);
		entry.setId("createCacheMediator23CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EsbElementTypes
				.getImageDescriptor(EsbElementTypes.CacheMediator_3229));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAggregateMediator24CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(EsbElementTypes.AggregateMediator_3236);
		types.add(EsbElementTypes.AggregateMediator_3321);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.AggregateMediator24CreationTool_title,
				Messages.AggregateMediator24CreationTool_desc, types);
		entry.setId("createAggregateMediator24CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EsbElementTypes
				.getImageDescriptor(EsbElementTypes.AggregateMediator_3236));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCalloutMediator25CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(4);
		types.add(EsbElementTypes.CalloutMediator_3231);
		types.add(EsbElementTypes.CalloutMediator_3178);
		types.add(EsbElementTypes.CalloutMediator_3306);
		types.add(EsbElementTypes.CalloutMediator_3366);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.CalloutMediator25CreationTool_title,
				Messages.CalloutMediator25CreationTool_desc, types);
		entry.setId("createCalloutMediator25CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EsbElementTypes
				.getImageDescriptor(EsbElementTypes.CalloutMediator_3231));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTransactionMediator26CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(4);
		types.add(EsbElementTypes.TransactionMediator_3232);
		types.add(EsbElementTypes.TransactionMediator_3179);
		types.add(EsbElementTypes.TransactionMediator_3309);
		types.add(EsbElementTypes.TransactionMediator_3369);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.TransactionMediator26CreationTool_title,
				Messages.TransactionMediator26CreationTool_desc, types);
		entry.setId("createTransactionMediator26CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EsbElementTypes
				.getImageDescriptor(EsbElementTypes.TransactionMediator_3232));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createThrottleMediator27CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(EsbElementTypes.ThrottleMediator_3205);
		types.add(EsbElementTypes.ThrottleMediator_3206);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.ThrottleMediator27CreationTool_title,
				Messages.ThrottleMediator27CreationTool_desc, types);
		entry.setId("createThrottleMediator27CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EsbElementTypes
				.getImageDescriptor(EsbElementTypes.ThrottleMediator_3205));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRMSequenceMediator28CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(4);
		types.add(EsbElementTypes.RMSequenceMediator_3233);
		types.add(EsbElementTypes.RMSequenceMediator_3180);
		types.add(EsbElementTypes.RMSequenceMediator_3312);
		types.add(EsbElementTypes.RMSequenceMediator_3372);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.RMSequenceMediator28CreationTool_title,
				Messages.RMSequenceMediator28CreationTool_desc, types);
		entry.setId("createRMSequenceMediator28CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EsbElementTypes
				.getImageDescriptor(EsbElementTypes.RMSequenceMediator_3233));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createOAuthMediator29CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(EsbElementTypes.OAuthMediator_3235);
		types.add(EsbElementTypes.OAuthMediator_3318);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.OAuthMediator29CreationTool_title,
				Messages.OAuthMediator29CreationTool_desc, types);
		entry.setId("createOAuthMediator29CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EsbElementTypes
				.getImageDescriptor(EsbElementTypes.OAuthMediator_3235));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRuleMediator30CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(EsbElementTypes.RuleMediator_3234);
		types.add(EsbElementTypes.RuleMediator_3315);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.RuleMediator30CreationTool_title,
				Messages.RuleMediator30CreationTool_desc, types);
		entry.setId("createRuleMediator30CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EsbElementTypes
				.getImageDescriptor(EsbElementTypes.RuleMediator_3234));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDefaultEndPoint1CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.DefaultEndPoint1CreationTool_title,
				Messages.DefaultEndPoint1CreationTool_desc,
				Collections.singletonList(EsbElementTypes.DefaultEndPoint_3382));
		entry.setId("createDefaultEndPoint1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EsbElementTypes
				.getImageDescriptor(EsbElementTypes.DefaultEndPoint_3382));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAddressEndPoint2CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.AddressEndPoint2CreationTool_title,
				Messages.AddressEndPoint2CreationTool_desc,
				Collections.singletonList(EsbElementTypes.AddressEndPoint_3383));
		entry.setId("createAddressEndPoint2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EsbElementTypes
				.getImageDescriptor(EsbElementTypes.AddressEndPoint_3383));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createFailoverEndPoint3CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.FailoverEndPoint3CreationTool_title,
				Messages.FailoverEndPoint3CreationTool_desc,
				Collections
						.singletonList(EsbElementTypes.FailoverEndPoint_3384));
		entry.setId("createFailoverEndPoint3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EsbElementTypes
				.getImageDescriptor(EsbElementTypes.FailoverEndPoint_3384));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createWSDLEndPoint4CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.WSDLEndPoint4CreationTool_title,
				Messages.WSDLEndPoint4CreationTool_desc,
				Collections.singletonList(EsbElementTypes.WSDLEndPoint_3385));
		entry.setId("createWSDLEndPoint4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EsbElementTypes
				.getImageDescriptor(EsbElementTypes.WSDLEndPoint_3385));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createLoadBalanceEndPoint5CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.LoadBalanceEndPoint5CreationTool_title,
				Messages.LoadBalanceEndPoint5CreationTool_desc,
				Collections
						.singletonList(EsbElementTypes.LoadBalanceEndPoint_3386));
		entry.setId("createLoadBalanceEndPoint5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EsbElementTypes
				.getImageDescriptor(EsbElementTypes.LoadBalanceEndPoint_3386));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createEsbLink1CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.EsbLink1CreationTool_title,
				Messages.EsbLink1CreationTool_desc,
				Collections.singletonList(EsbElementTypes.EsbLink_4001));
		entry.setId("createEsbLink1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EsbElementTypes
				.getImageDescriptor(EsbElementTypes.EsbLink_4001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createMergeNode1CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.MergeNode1CreationTool_title,
				Messages.MergeNode1CreationTool_desc,
				Collections.singletonList(EsbElementTypes.MergeNode_3013));
		entry.setId("createMergeNode1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EsbElementTypes
				.getImageDescriptor(EsbElementTypes.MergeNode_3013));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	public void addDefinedSequences(IEditorPart editor) {
		ArrayList<String> definedSequences = new ArrayList<String>();
		if (editor != null) {
			IFileEditorInput input = (IFileEditorInput) editor.getEditorInput();
			IFile file = input.getFile();
			IProject activeProject = file.getProject();
			try {
				for (int j = 0; j < activeProject.members().length; ++j) {

					Pattern p = Pattern.compile(".sequence_diagram");
					Matcher m = p.matcher(activeProject.members()[j].getName());
					StringBuffer sb = new StringBuffer();
					boolean result = m.find();

					if (result) {
						String[] splittedFilename = activeProject.members()[j]
								.getName().split(".sequence_diagram");
						if (splittedFilename[0] != null) {
							String[] tempName = splittedFilename[0]
									.split("sequence_");
							definedSequences.add(tempName[1].trim());
						}
					}
				}
			} catch (CoreException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		if ((((DiagramEditDomain) ((EsbDiagramEditor) editor)
				.getDiagramEditDomain()).getPaletteViewer().getPaletteRoot()
				.getChildren().size() - 1) != ToolPalleteDetails.SEQUENCE) {
			((DiagramEditDomain) ((EsbDiagramEditor) editor)
					.getDiagramEditDomain()).getPaletteViewer()
					.getPaletteRoot().add(createSequenceGroup());
		}

		for (int k = 0; k < definedSequences.size(); ++k) {
			((PaletteContainer) ((DiagramEditDomain) ((EsbDiagramEditor) editor)
					.getDiagramEditDomain()).getPaletteViewer()
					.getPaletteRoot().getChildren()
					.get(ToolPalleteDetails.SEQUENCE))
					.add(createDefinedSequenceCreationTool(definedSequences
							.get(k)));
			SequenceEditPart.definedSequenceNames.add(definedSequences.get(k));
		}

	}

	private PaletteContainer createSequenceGroup() {
		PaletteDrawer paletteContainer = new PaletteDrawer("Sequences");
		paletteContainer.setId("Sequences"); //$NON-NLS-1$

		return paletteContainer;
	}

	private ToolEntry createDefinedSequenceCreationTool(String name) {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(EsbElementTypes.Sequence_3214);
		types.add(EsbElementTypes.Sequence_3187);
		types.add(EsbElementTypes.Sequence_3254);
		types.add(EsbElementTypes.Sequence_3375);
		NodeToolEntry entry = new NodeToolEntry(name,
				Messages.Sequence4CreationTool_desc, types);
		entry.setId("createSequence4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EsbElementTypes
				.getImageDescriptor(EsbElementTypes.Sequence_3187));
		entry.setLargeIcon(entry.getSmallIcon());

		return entry;
	}

	/**
	 * @generated NOT
	 */
	private static class NodeToolEntry extends PaletteToolEntry {

		/**
		 * @generated
		 */
		private final List<IElementType> elementTypes;

		/**
		 * @generated NOT
		 */
		private NodeToolEntry(String title, String description,
				List<IElementType> elementTypes) {
			//super(title, description, null, null);
			super(null, title, null);
			this.setDescription(description);
			this.elementTypes = elementTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeCreationTool(elementTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}

	/**
	 * @generated
	 */
	private static class LinkToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List<IElementType> relationshipTypes;

		/**
		 * @generated
		 */
		private LinkToolEntry(String title, String description,
				List<IElementType> relationshipTypes) {
			super(title, description, null, null);
			this.relationshipTypes = relationshipTypes;
		}

		/**
		 * @generated NOT
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeConnectionTool(relationshipTypes) {

				public void mouseDown(MouseEvent me, EditPartViewer viewer) {
					//System.out.println("mouse down link tool");				
					super.mouseDown(me, viewer);

				}

				public void mouseUp(MouseEvent me, EditPartViewer viewer) {
					//System.out.println("mouse up link tool");
					super.mouseUp(me, viewer);
				}

				public void mouseDrag(MouseEvent me, EditPartViewer viewer) {
					//System.out.println("mouse drag link tool");
					super.mouseDrag(me, viewer);
				}

				public void mouseHover(MouseEvent me, EditPartViewer viewer) {
					//System.out.println("mouse hover link tool");
					super.mouseHover(me, viewer);
				}

				public void mouseMove(MouseEvent me, EditPartViewer viewer) {
					//System.out.println("mouse move link tool");
					super.mouseMove(me, viewer);
				}
			};
			tool.setProperties(getToolProperties());
			return tool;
		}
	}
}