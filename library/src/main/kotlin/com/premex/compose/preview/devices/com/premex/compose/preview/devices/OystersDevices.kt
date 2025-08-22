package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Oysters device specifications for Android Compose previews.
 *
 * This extension provides Oysters device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Oysters.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Oysters: Any
  get() = object {
      /** DeviceSpec(manufacturer=Oysters, code=T72HM3G, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Oysters, code=T72HM3G, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val T72HM3G = "spec:width=600,height=1024,unit=px,dpi=160"

  }
