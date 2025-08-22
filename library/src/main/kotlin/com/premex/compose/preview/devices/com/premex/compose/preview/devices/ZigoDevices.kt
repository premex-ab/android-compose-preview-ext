package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Zigo device specifications for Android Compose previews.
 *
 * This extension provides Zigo device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Zigo.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Zigo: Any
  get() = object {
      /** DeviceSpec(manufacturer=Zigo, code=Zigo_Nebula_10_1, width=800, height=1280, dpi=214,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Zigo, code=Zigo_Nebula_10_1,
      width=800, height=1280, dpi=214, isGoogleDevice=false).code */
      val ZIGO_NEBULA_10_1 = "spec:width=800,height=1280,unit=px,dpi=214"

  }
