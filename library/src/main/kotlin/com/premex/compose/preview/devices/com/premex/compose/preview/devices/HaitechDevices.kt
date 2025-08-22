package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Haitech device specifications for Android Compose previews.
 *
 * This extension provides Haitech device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Haitech.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Haitech: Any
  get() = object {
      /** DeviceSpec(manufacturer=Haitech, code=A81G, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Haitech, code=A81G, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val A81G = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Haitech, code=HIP-T66, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Haitech, code=HIP-T66, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val HIP_T66 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Haitech, code=HPAD_IP8045, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Haitech, code=HPAD_IP8045,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val HPAD_IP8045 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Haitech, code=HPAD_IP8045_1, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Haitech, code=HPAD_IP8045_1,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val HPAD_IP8045_1 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Haitech, code=HPAD-M2, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Haitech, code=HPAD-M2, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val HPAD_M2 = "spec:width=800,height=1280,unit=px,dpi=213"

  }
