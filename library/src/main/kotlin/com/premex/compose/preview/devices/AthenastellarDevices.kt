package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * AthenaStellar device specifications for Android Compose previews.
 *
 * This extension provides AthenaStellar device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Athenastellar.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Athenastellar: Any
  get() = object {
      /** AthenaStellar MAT80211 */
      val MAT80211 = "spec:width=800,height=1280,unit=px,dpi=213"

  }
