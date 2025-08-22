package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * NIKAI-PRO device specifications for Android Compose previews.
 *
 * This extension provides NIKAI-PRO device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.NIKAIPRO.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.NIKAIPRO: Any
  get() = object {
      /** NIKAI-PRO hongkong */
      val HONGKONG = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
