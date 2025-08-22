package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Mint_Mobile device specifications for Android Compose previews.
 *
 * This extension provides Mint_Mobile device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.MintMobile.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.MintMobile: Any
  get() = object {
      /** Mint_Mobile Emerald */
      val EMERALD = "spec:width=480,height=854,unit=px,dpi=240"

  }
