/*
 * Copyright (C) 2013-2015 RoboVM AB
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.robovm.apple.avfoundation;

/*<imports>*/
import java.io.*;
import java.nio.*;
import java.util.*;
import org.robovm.objc.*;
import org.robovm.objc.annotation.*;
import org.robovm.objc.block.*;
import org.robovm.rt.*;
import org.robovm.rt.annotation.*;
import org.robovm.rt.bro.*;
import org.robovm.rt.bro.annotation.*;
import org.robovm.rt.bro.ptr.*;
import org.robovm.apple.foundation.*;
import org.robovm.apple.corefoundation.*;
import org.robovm.apple.dispatch.*;
import org.robovm.apple.coreanimation.*;
import org.robovm.apple.coreimage.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.coreaudio.*;
import org.robovm.apple.coremedia.*;
import org.robovm.apple.corevideo.*;
import org.robovm.apple.mediatoolbox.*;
import org.robovm.apple.audiotoolbox.*;
import org.robovm.apple.coremidi.*;
import org.robovm.apple.uikit.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library("AVFoundation") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/AVAssetExportSession/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class AVAssetExportSessionPtr extends Ptr<AVAssetExportSession, AVAssetExportSessionPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(AVAssetExportSession.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected AVAssetExportSession() {}
    protected AVAssetExportSession(Handle h, long handle) { super(h, handle); }
    protected AVAssetExportSession(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithAsset:presetName:")
    public AVAssetExportSession(AVAsset asset, AVAssetExportPreset presetName) { super((SkipInit) null); initObject(init(asset, presetName)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "presetName")
    public native AVAssetExportPreset getPresetName();
    @Property(selector = "asset")
    public native AVAsset getAsset();
    @Property(selector = "outputFileType")
    public native String getOutputFileType();
    @Property(selector = "setOutputFileType:")
    public native void setOutputFileType(String v);
    @Property(selector = "outputURL")
    public native NSURL getOutputURL();
    @Property(selector = "setOutputURL:")
    public native void setOutputURL(NSURL v);
    @Property(selector = "shouldOptimizeForNetworkUse")
    public native boolean shouldOptimizeForNetworkUse();
    @Property(selector = "setShouldOptimizeForNetworkUse:")
    public native void setShouldOptimizeForNetworkUse(boolean v);
    @Property(selector = "status")
    public native AVAssetExportSessionStatus getStatus();
    @Property(selector = "error")
    public native NSError getError();
    @Property(selector = "progress")
    public native float getProgress();
    @Property(selector = "supportedFileTypes")
    public native @org.robovm.rt.bro.annotation.Marshaler(NSArray.AsStringListMarshaler.class) List<String> getSupportedFileTypes();
    @Property(selector = "timeRange")
    public native @ByVal CMTimeRange getTimeRange();
    @Property(selector = "setTimeRange:")
    public native void setTimeRange(@ByVal CMTimeRange v);
    /**
     * @deprecated Use estimateMaximumDurationWithCompletionHandler
     */
    @Deprecated
    @Property(selector = "maxDuration")
    public native @ByVal CMTime getMaxDuration();
    /**
     * @deprecated Use estimateOutputFileLengthWithCompletionHandler
     */
    @Deprecated
    @Property(selector = "estimatedOutputFileLength")
    public native long getEstimatedOutputFileLength();
    @Property(selector = "fileLengthLimit")
    public native long getFileLengthLimit();
    @Property(selector = "setFileLengthLimit:")
    public native void setFileLengthLimit(long v);
    @Property(selector = "metadata")
    public native NSArray<AVMetadataItem> getMetadata();
    @Property(selector = "setMetadata:")
    public native void setMetadata(NSArray<AVMetadataItem> v);
    @Property(selector = "metadataItemFilter")
    public native AVMetadataItemFilter getMetadataItemFilter();
    @Property(selector = "setMetadataItemFilter:")
    public native void setMetadataItemFilter(AVMetadataItemFilter v);
    @Property(selector = "audioTimePitchAlgorithm")
    public native AVAudioTimePitchAlgorithm getAudioTimePitchAlgorithm();
    @Property(selector = "setAudioTimePitchAlgorithm:")
    public native void setAudioTimePitchAlgorithm(AVAudioTimePitchAlgorithm v);
    @Property(selector = "audioMix")
    public native AVAudioMix getAudioMix();
    @Property(selector = "setAudioMix:")
    public native void setAudioMix(AVAudioMix v);
    @Property(selector = "videoComposition")
    public native AVVideoComposition getVideoComposition();
    @Property(selector = "setVideoComposition:")
    public native void setVideoComposition(AVVideoComposition v);
    @Property(selector = "customVideoCompositor")
    public native AVVideoCompositing getCustomVideoCompositor();
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Property(selector = "audioTrackGroupHandling")
    public native AVAssetTrackGroupOutputHandling getAudioTrackGroupHandling();
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Property(selector = "setAudioTrackGroupHandling:")
    public native void setAudioTrackGroupHandling(AVAssetTrackGroupOutputHandling v);
    @Property(selector = "canPerformMultiplePassesOverSourceMediaData")
    public native boolean canPerformMultiplePassesOverSourceMediaData();
    @Property(selector = "setCanPerformMultiplePassesOverSourceMediaData:")
    public native void setCanPerformMultiplePassesOverSourceMediaData(boolean v);
    @Property(selector = "directoryForTemporaryFiles")
    public native NSURL getDirectoryForTemporaryFiles();
    @Property(selector = "setDirectoryForTemporaryFiles:")
    public native void setDirectoryForTemporaryFiles(NSURL v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithAsset:presetName:")
    protected native @Pointer long init(AVAsset asset, AVAssetExportPreset presetName);
    @Method(selector = "exportAsynchronouslyWithCompletionHandler:")
    public native void exportAsynchronously(@Block Runnable handler);
    @Method(selector = "cancelExport")
    public native void cancelExport();
    @Method(selector = "allExportPresets")
    public static native @org.robovm.rt.bro.annotation.Marshaler(AVAssetExportPreset.AsListMarshaler.class) List<AVAssetExportPreset> getAllExportPresets();
    /**
     * @deprecated Deprecated in iOS 16.0. Use determineCompatibilityOfExportPreset:withAsset:outputFileType:completionHandler:
     */
    @Deprecated
    @Method(selector = "exportPresetsCompatibleWithAsset:")
    public static native @org.robovm.rt.bro.annotation.Marshaler(AVAssetExportPreset.AsListMarshaler.class) List<AVAssetExportPreset> getCompatibleExportPresets(AVAsset asset);
    @Method(selector = "determineCompatibilityOfExportPreset:withAsset:outputFileType:completionHandler:")
    public static native void determineCompatibilityOfExportPreset(AVAssetExportPreset presetName, AVAsset asset, String outputFileType, @Block VoidBooleanBlock handler);
    @Method(selector = "determineCompatibleFileTypesWithCompletionHandler:")
    public native void determineCompatibleFileTypes(@Block VoidBlock1<NSArray<NSString>> handler);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "estimateMaximumDurationWithCompletionHandler:")
    public native void estimateMaximumDuration(@Block("(@ByVal,)") VoidBlock2<CMTime, NSError> handler);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "estimateOutputFileLengthWithCompletionHandler:")
    public native void estimateOutputFileLength(@Block VoidBlock2<Long, NSError> handler);
    /*</methods>*/
}
