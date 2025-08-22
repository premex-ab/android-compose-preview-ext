package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * VORAGO device specifications for Android Compose previews.
 *
 * This extension provides VORAGO device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.VORAGO.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.VORAGO: Any
  get() = object {
      /** VORAGO PAD-7-KIDS */
      val PAD_7_KIDS = "spec:width=600,height=1024,unit=px,dpi=160"

      /** VORAGO PAD-7-V5 */
      val PAD_7_V5 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** VORAGO PAD-7-V6 */
      val PAD_7_V6 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** VORAGO PAD-8 */
      val PAD_8 = "spec:width=800,height=1280,unit=px,dpi=213"

  }
