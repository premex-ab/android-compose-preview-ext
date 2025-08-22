package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * LEXA device specifications for Android Compose previews.
 *
 * This extension provides LEXA device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.LEXA.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.LEXA: Any
  get() = object {
      /** LEXA nagata */
      val NAGATA = "spec:width=720,height=1280,unit=px,dpi=213"

  }
