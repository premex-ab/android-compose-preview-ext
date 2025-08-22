package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * MTN device specifications for Android Compose previews.
 *
 * This extension provides MTN device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Mtn.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Mtn: Any
  get() = object {
      /** MTN Alola_Max */
      val ALOLA_MAX = "spec:width=576,height=1152,unit=px,dpi=220"

      /** MTN G56 */
      val G56 = "spec:width=720,height=1560,unit=px,dpi=320"

  }
