package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * ASUS device specifications for Android Compose previews.
 *
 * This extension provides ASUS device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.ASUS.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.ASUS: Any
  get() = object {
      /** DeviceSpec(manufacturer=ASUS, code=dahu, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ASUS, code=dahu, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val DAHU = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
