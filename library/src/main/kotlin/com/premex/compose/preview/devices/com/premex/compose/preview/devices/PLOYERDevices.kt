package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * PLOYER device specifications for Android Compose previews.
 *
 * This extension provides PLOYER device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.PLOYER.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.PLOYER: Any
  get() = object {
      /** DeviceSpec(manufacturer=PLOYER, code=A1190, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PLOYER, code=A1190, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val A1190 = "spec:width=800,height=1280,unit=px,dpi=213"

  }
