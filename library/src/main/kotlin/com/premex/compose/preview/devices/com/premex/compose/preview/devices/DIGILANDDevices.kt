package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * DIGILAND device specifications for Android Compose previews.
 *
 * This extension provides DIGILAND device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.DIGILAND.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.DIGILAND: Any
  get() = object {
      /** DeviceSpec(manufacturer=DIGILAND, code=mid1032_mr, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DIGILAND, code=mid1032_mr,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val MID1032_MR = "spec:width=800,height=1280,unit=px,dpi=160"

  }
