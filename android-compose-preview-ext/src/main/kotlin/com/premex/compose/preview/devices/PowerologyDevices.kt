package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * POWEROLOGY device specifications for Android Compose previews.
 *
 * This extension provides POWEROLOGY device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Powerology.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Powerology: Any
  get() = object {
      /** POWEROLOGY hongkong */
      val HONGKONG = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
