package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * IVA device specifications for Android Compose previews.
 *
 * This extension provides IVA device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.IVA.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.IVA: Any
  get() = object {
      /** DeviceSpec(manufacturer=IVA, code=LAMCY_L400, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=IVA, code=LAMCY_L400, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val LAMCY_L400 = "spec:width=480,height=960,unit=px,dpi=240"

  }
