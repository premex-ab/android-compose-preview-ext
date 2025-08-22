package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Sun_King device specifications for Android Compose previews.
 *
 * This extension provides Sun_King device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.SunKing.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.SunKing: Any
  get() = object {
      /** Sun_King EZ1_go */
      val EZ1_GO = "spec:width=720,height=1612,unit=px,dpi=280"

      /** Sun_King EZ_1 */
      val EZ_1 = "spec:width=720,height=1612,unit=px,dpi=280"

  }
