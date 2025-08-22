package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * LUSH_MINT device specifications for Android Compose previews.
 *
 * This extension provides LUSH_MINT device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.LushMint.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.LushMint: Any
  get() = object {
      /** LUSH_MINT LM5314G */
      val LM5314G = "spec:width=480,height=960,unit=px,dpi=240"

      /** LUSH_MINT LM5514G */
      val LM5514G = "spec:width=480,height=960,unit=px,dpi=213"

  }
