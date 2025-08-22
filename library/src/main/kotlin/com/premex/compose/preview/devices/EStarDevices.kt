package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * eStar device specifications for Android Compose previews.
 *
 * This extension provides eStar device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.EStar.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.EStar: Any
  get() = object {
      /** eStar 1021W_URBAN */
      val _1021W_URBAN = "spec:width=800,height=1280,unit=px,dpi=160"

  }
