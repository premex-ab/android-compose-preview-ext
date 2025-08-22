package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * ONN device specifications for Android Compose previews.
 *
 * This extension provides ONN device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.ONN.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.ONN: Any
  get() = object {
      /** ONN mid7015_mk_32 */
      val MID7015_MK_32 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** ONN mid8016_mk_32 */
      val MID8016_MK_32 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** ONN W723 */
      val W723 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** ONN 100015685-A */
      val _100015685_A = "spec:width=600,height=1024,unit=px,dpi=160"

      /** ONN 100015685-E */
      val _100015685_E = "spec:width=600,height=1024,unit=px,dpi=160"

  }
