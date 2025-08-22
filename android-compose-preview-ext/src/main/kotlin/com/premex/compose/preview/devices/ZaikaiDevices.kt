package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * ZAIKAI device specifications for Android Compose previews.
 *
 * This extension provides ZAIKAI device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Zaikai.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Zaikai: Any
  get() = object {
      /** ZAIKAI mensa_an64 */
      val MENSA_AN64 = "spec:width=2160,height=3840,unit=px,dpi=480"

      /** ZAIKAI t7_an400 */
      val T7_AN400 = "spec:width=2160,height=3840,unit=px,dpi=480"

  }
