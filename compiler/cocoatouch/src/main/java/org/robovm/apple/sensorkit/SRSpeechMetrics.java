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
package org.robovm.apple.sensorkit;

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
import org.robovm.apple.coremedia.*;
import org.robovm.apple.arkit.*;
import org.robovm.apple.speech.*;
import org.robovm.apple.soundanalysis.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 17.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("SensorKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/SRSpeechMetrics/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class SRSpeechMetricsPtr extends Ptr<SRSpeechMetrics, SRSpeechMetricsPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(SRSpeechMetrics.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected SRSpeechMetrics() {}
    protected SRSpeechMetrics(Handle h, long handle) { super(h, handle); }
    protected SRSpeechMetrics(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithCoder:")
    public SRSpeechMetrics(NSCoder coder) { super((SkipInit) null); initObject(init(coder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "sessionIdentifier")
    public native String getSessionIdentifier();
    @Property(selector = "sessionFlags")
    public native SRSpeechMetricsSessionFlags getSessionFlags();
    @Property(selector = "timestamp")
    public native NSDate getTimestamp();
    @Property(selector = "audioLevel")
    public native SRAudioLevel getAudioLevel();
    @Property(selector = "speechRecognition")
    public native SFSpeechRecognitionResult getSpeechRecognition();
    @Property(selector = "soundClassification")
    public native SNClassificationResult getSoundClassification();
    @Property(selector = "speechExpression")
    public native SRSpeechExpression getSpeechExpression();
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder coder);
    /*</methods>*/
}
