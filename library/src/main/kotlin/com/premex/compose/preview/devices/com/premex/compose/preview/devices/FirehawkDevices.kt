package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Firehawk device specifications for Android Compose previews.
 *
 * This extension provides Firehawk device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Firehawk.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Firehawk: Any
  get() = object {
      /** DeviceSpec(manufacturer=Firehawk, code=FP-600, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Firehawk, code=FP-600, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val FP_600 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Firehawk, code=ToughDroid, width=800, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Firehawk, code=ToughDroid,
      width=800, height=1280, dpi=240, isGoogleDevice=false).code */
      val TOUGHDROID = "spec:width=800,height=1280,unit=px,dpi=240"

  }
