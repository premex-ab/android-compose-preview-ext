package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Porodo device specifications for Android Compose previews.
 *
 * This extension provides Porodo device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Porodo.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Porodo: Any
  get() = object {
      /** DeviceSpec(manufacturer=Porodo, code=Ultra_Max_10_1, width=1200, height=1920, dpi=300,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Porodo, code=Ultra_Max_10_1,
      width=1200, height=1920, dpi=300, isGoogleDevice=false).code */
      val ULTRA_MAX_10_1 = "spec:width=1200,height=1920,unit=px,dpi=300"

  }
