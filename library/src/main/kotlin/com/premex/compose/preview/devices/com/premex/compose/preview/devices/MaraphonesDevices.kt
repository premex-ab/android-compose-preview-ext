package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Maraphones device specifications for Android Compose previews.
 *
 * This extension provides Maraphones device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Maraphones.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Maraphones: Any
  get() = object {
      /** DeviceSpec(manufacturer=Maraphones, code=Mara_S, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Maraphones, code=Mara_S, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val MARA_S = "spec:width=480,height=960,unit=px,dpi=240"

  }
