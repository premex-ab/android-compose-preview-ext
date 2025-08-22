package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * ORBYS device specifications for Android Compose previews.
 *
 * This extension provides ORBYS device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.ORBYS.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.ORBYS: Any
  get() = object {
      /** DeviceSpec(manufacturer=ORBYS, code=F21, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ORBYS, code=F21, width=1200,
      height=1920, dpi=240, isGoogleDevice=false).code */
      val F21 = "spec:width=1200,height=1920,unit=px,dpi=240"

  }
