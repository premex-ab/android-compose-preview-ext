package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Mint device specifications for Android Compose previews.
 *
 * This extension provides Mint device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Mint.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Mint: Any
  get() = object {
      /** Mint Mint_Triton */
      val MINT_TRITON = "spec:width=1080,height=2220,unit=px,dpi=440"

  }
