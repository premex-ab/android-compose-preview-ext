package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Nextgear device specifications for Android Compose previews.
 *
 * This extension provides Nextgear device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Nextgear.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Nextgear: Any
  get() = object {
      /** DeviceSpec(manufacturer=Nextgear, code=Nextgear_n1, width=1080, height=2340, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Nextgear, code=Nextgear_n1,
      width=1080, height=2340, dpi=480, isGoogleDevice=false).code */
      val NEXTGEAR_N1 = "spec:width=1080,height=2340,unit=px,dpi=480"

  }
