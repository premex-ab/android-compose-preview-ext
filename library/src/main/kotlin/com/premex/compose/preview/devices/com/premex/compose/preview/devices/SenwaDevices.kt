package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Senwa device specifications for Android Compose previews.
 *
 * This extension provides Senwa device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Senwa.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Senwa: Any
  get() = object {
      /** DeviceSpec(manufacturer=Senwa, code=LS5018FP, width=480, height=960, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Senwa, code=LS5018FP, width=480,
      height=960, dpi=213, isGoogleDevice=false).code */
      val LS5018FP = "spec:width=480,height=960,unit=px,dpi=213"

  }
