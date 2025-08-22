package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * OX_TAB device specifications for Android Compose previews.
 *
 * This extension provides OX_TAB device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.OXTAB.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.OXTAB: Any
  get() = object {
      /** DeviceSpec(manufacturer=OX_TAB, code=OX_TAB_10, width=800, height=1280, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OX_TAB, code=OX_TAB_10, width=800,
      height=1280, dpi=200, isGoogleDevice=false).code */
      val OX_TAB_10 = "spec:width=800,height=1280,unit=px,dpi=200"

  }
