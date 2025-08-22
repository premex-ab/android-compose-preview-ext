package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * AXS device specifications for Android Compose previews.
 *
 * This extension provides AXS device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Axs.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Axs: Any
  get() = object {
      /** AXS B866V2FA_AXS */
      val B866V2FA_AXS = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
