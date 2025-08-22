package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * DEYI device specifications for Android Compose previews.
 *
 * This extension provides DEYI device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.DEYI.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.DEYI: Any
  get() = object {
      /** DeviceSpec(manufacturer=DEYI, code=DEYI10M18A53, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DEYI, code=DEYI10M18A53, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val DEYI10M18A53 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=DEYI, code=DEYI-10M18, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DEYI, code=DEYI-10M18, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val DEYI_10M18 = "spec:width=800,height=1280,unit=px,dpi=213"

  }
