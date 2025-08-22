package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * KANSELIR device specifications for Android Compose previews.
 *
 * This extension provides KANSELIR device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.KANSELIR.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.KANSELIR: Any
  get() = object {
      /** DeviceSpec(manufacturer=KANSELIR, code=KTB-168, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KANSELIR, code=KTB-168, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val KTB_168 = "spec:width=800,height=1280,unit=px,dpi=213"

  }
