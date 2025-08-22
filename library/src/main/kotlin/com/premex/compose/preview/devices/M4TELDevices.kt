package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * M4TEL device specifications for Android Compose previews.
 *
 * This extension provides M4TEL device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.M4TEL.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.M4TEL: Any
  get() = object {
      /** M4TEL DREAMPLUS02A-S10A */
      val DREAMPLUS02A_S10A = "spec:width=480,height=854,unit=px,dpi=240"

      /** M4TEL DREAMPLUS03A-S14A */
      val DREAMPLUS03A_S14A = "spec:width=720,height=1280,unit=px,dpi=320"

      /** M4TEL NOVA03A_S22A */
      val NOVA03A_S22A = "spec:width=720,height=1280,unit=px,dpi=320"

      /** M4TEL R2 */
      val R2 = "spec:width=480,height=960,unit=px,dpi=240"

      /** M4TEL R2_Plus */
      val R2_PLUS = "spec:width=480,height=960,unit=px,dpi=240"

  }
