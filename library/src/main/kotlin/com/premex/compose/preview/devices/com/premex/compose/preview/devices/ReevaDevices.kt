package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Reeva device specifications for Android Compose previews.
 *
 * This extension provides Reeva device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Reeva.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Reeva: Any
  get() = object {
      /** DeviceSpec(manufacturer=Reeva, code=Reeva_Plus, width=1200, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Reeva, code=Reeva_Plus, width=1200,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val REEVA_PLUS = "spec:width=1200,height=1920,unit=px,dpi=320"

  }
