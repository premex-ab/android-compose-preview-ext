package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Exertis device specifications for Android Compose previews.
 *
 * This extension provides Exertis device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Exertis.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Exertis: Any
  get() = object {
      /** DeviceSpec(manufacturer=Exertis, code=SMB-H8009, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Exertis, code=SMB-H8009,
      width=1200, height=1920, dpi=240, isGoogleDevice=false).code */
      val SMB_H8009 = "spec:width=1200,height=1920,unit=px,dpi=240"

  }
