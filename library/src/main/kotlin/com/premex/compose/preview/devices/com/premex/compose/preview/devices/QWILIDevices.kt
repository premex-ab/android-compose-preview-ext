package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * QWILI device specifications for Android Compose previews.
 *
 * This extension provides QWILI device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.QWILI.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.QWILI: Any
  get() = object {
      /** DeviceSpec(manufacturer=QWILI, code=Pula, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=QWILI, code=Pula, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val PULA = "spec:width=480,height=960,unit=px,dpi=240"

  }
