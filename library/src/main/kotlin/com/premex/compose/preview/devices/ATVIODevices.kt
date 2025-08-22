package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * ATVIO device specifications for Android Compose previews.
 *
 * This extension provides ATVIO device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.ATVIO.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.ATVIO: Any
  get() = object {
      /** ATVIO mid1032_mr_32 */
      val MID1032_MR_32 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** ATVIO mid7015_mk_32 */
      val MID7015_MK_32 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** ATVIO 100011886BK */
      val _100011886BK = "spec:width=800,height=1280,unit=px,dpi=213"

  }
