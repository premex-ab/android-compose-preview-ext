package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Cyrus device specifications for Android Compose previews.
 *
 * This extension provides Cyrus device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Cyrus.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Cyrus: Any
  get() = object {
      /** DeviceSpec(manufacturer=Cyrus, code=CM17, width=320, height=480, dpi=132,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Cyrus, code=CM17, width=320,
      height=480, dpi=132, isGoogleDevice=false).code */
      val CM17 = "spec:width=320,height=480,unit=px,dpi=132"

      /** DeviceSpec(manufacturer=Cyrus, code=CM17XA, width=320, height=480, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Cyrus, code=CM17XA, width=320,
      height=480, dpi=160, isGoogleDevice=false).code */
      val CM17XA = "spec:width=320,height=480,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Cyrus, code=CS22, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Cyrus, code=CS22, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val CS22 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Cyrus, code=CS22XA, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Cyrus, code=CS22XA, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val CS22XA = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Cyrus, code=CS22XA_EEA, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Cyrus, code=CS22XA_EEA, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val CS22XA_EEA = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Cyrus, code=CS40, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Cyrus, code=CS40, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val CS40 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Cyrus, code=CS45XA, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Cyrus, code=CS45XA, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val CS45XA = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Cyrus, code=CS45XA_EEA, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Cyrus, code=CS45XA_EEA, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val CS45XA_EEA = "spec:width=1080,height=1920,unit=px,dpi=480"

  }
