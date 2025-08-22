package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * iFit device specifications for Android Compose previews.
 *
 * This extension provides iFit device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.IFit.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.IFit: Any
  get() = object {
      /** DeviceSpec(manufacturer=iFit, code=IFT1018, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=iFit, code=IFT1018, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val IFT1018 = "spec:width=800,height=1280,unit=px,dpi=160"

  }
