package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * INNOCN device specifications for Android Compose previews.
 *
 * This extension provides INNOCN device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.INNOCN.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.INNOCN: Any
  get() = object {
      /** DeviceSpec(manufacturer=INNOCN, code=32S1U_Pro, width=2160, height=3840, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=INNOCN, code=32S1U_Pro, width=2160,
      height=3840, dpi=480, isGoogleDevice=false).code */
      val _32S1U_PRO = "spec:width=2160,height=3840,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=INNOCN, code=32S2U_Pro, width=2160, height=3840, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=INNOCN, code=32S2U_Pro, width=2160,
      height=3840, dpi=320, isGoogleDevice=false).code */
      val _32S2U_PRO = "spec:width=2160,height=3840,unit=px,dpi=320"

  }
