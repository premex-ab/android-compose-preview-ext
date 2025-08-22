package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Nautilus device specifications for Android Compose previews.
 *
 * This extension provides Nautilus device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Nautilus.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Nautilus: Any
  get() = object {
      /** Nautilus nftm_lar */
      val NFTM_LAR = "spec:width=1080,height=1920,unit=px,dpi=160"

      /** Nautilus nftm_med */
      val NFTM_MED = "spec:width=1080,height=1920,unit=px,dpi=160"

      /** Nautilus nftm_sma */
      val NFTM_SMA = "spec:width=800,height=1280,unit=px,dpi=160"

  }
