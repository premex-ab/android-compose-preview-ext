package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * AXEL device specifications for Android Compose previews.
 *
 * This extension provides AXEL device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.AXEL.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.AXEL: Any
  get() = object {
      /** DeviceSpec(manufacturer=AXEL, code=AX_PRO, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=AXEL, code=AX_PRO, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val AX_PRO = "spec:width=800,height=1280,unit=px,dpi=160"

  }
