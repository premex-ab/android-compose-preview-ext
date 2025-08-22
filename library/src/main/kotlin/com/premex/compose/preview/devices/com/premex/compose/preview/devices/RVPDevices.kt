package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * RVP device specifications for Android Compose previews.
 *
 * This extension provides RVP device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.RVP.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.RVP: Any
  get() = object {
      /** DeviceSpec(manufacturer=RVP, code=RVPVK808, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=RVP, code=RVPVK808, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val RVPVK808 = "spec:width=800,height=1280,unit=px,dpi=160"

  }
