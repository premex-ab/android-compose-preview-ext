package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * W_O device specifications for Android Compose previews.
 *
 * This extension provides W_O device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.WO.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.WO: Any
  get() = object {
      /** DeviceSpec(manufacturer=W_O, code=X6, width=540, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=W_O, code=X6, width=540,
      height=960, dpi=240, isGoogleDevice=false).code */
      val X6 = "spec:width=540,height=960,unit=px,dpi=240"

  }
