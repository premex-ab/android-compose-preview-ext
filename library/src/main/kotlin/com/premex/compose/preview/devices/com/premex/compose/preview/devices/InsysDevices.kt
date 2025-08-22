package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Insys device specifications for Android Compose previews.
 *
 * This extension provides Insys device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Insys.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Insys: Any
  get() = object {
      /** DeviceSpec(manufacturer=Insys, code=HK9-4010, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Insys, code=HK9-4010, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val HK9_4010 = "spec:width=480,height=800,unit=px,dpi=240"

  }
