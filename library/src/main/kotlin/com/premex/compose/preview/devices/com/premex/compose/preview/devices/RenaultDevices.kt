package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * renault device specifications for Android Compose previews.
 *
 * This extension provides renault device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Renault.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Renault: Any
  get() = object {
      /** DeviceSpec(manufacturer=renault, code=aivi2_full, width=1250, height=1562, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=renault, code=aivi2_full,
      width=1250, height=1562, dpi=160, isGoogleDevice=false).code */
      val AIVI2_FULL = "spec:width=1250,height=1562,unit=px,dpi=160"

  }
