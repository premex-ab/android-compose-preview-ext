package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * MTT device specifications for Android Compose previews.
 *
 * This extension provides MTT device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.MTT.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.MTT: Any
  get() = object {
      /** DeviceSpec(manufacturer=MTT, code=L506, width=368, height=448, dpi=180,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MTT, code=L506, width=368,
      height=448, dpi=180, isGoogleDevice=false).code */
      val L506 = "spec:width=368,height=448,unit=px,dpi=180"

  }
