package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * OxygenId device specifications for Android Compose previews.
 *
 * This extension provides OxygenId device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.OxygenId.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.OxygenId: Any
  get() = object {
      /** OxygenId B866V2FA */
      val B866V2FA = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
