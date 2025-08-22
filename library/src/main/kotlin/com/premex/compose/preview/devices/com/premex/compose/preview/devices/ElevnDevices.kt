package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * elevn device specifications for Android Compose previews.
 *
 * This extension provides elevn device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Elevn.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Elevn: Any
  get() = object {
      /** DeviceSpec(manufacturer=elevn, code=elevn_eTab, width=1200, height=1920, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=elevn, code=elevn_eTab, width=1200,
      height=1920, dpi=280, isGoogleDevice=false).code */
      val ELEVN_ETAB = "spec:width=1200,height=1920,unit=px,dpi=280"

  }
