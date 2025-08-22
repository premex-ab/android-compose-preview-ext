package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Excotek device specifications for Android Compose previews.
 *
 * This extension provides Excotek device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Excotek.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Excotek: Any
  get() = object {
      /** DeviceSpec(manufacturer=Excotek, code=X20-T616, width=1200, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Excotek, code=X20-T616, width=1200,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val X20_T616 = "spec:width=1200,height=1920,unit=px,dpi=320"

  }
