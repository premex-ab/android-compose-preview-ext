package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * VERTU device specifications for Android Compose previews.
 *
 * This extension provides VERTU device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Vertu.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Vertu: Any
  get() = object {
      /** VERTU ASTER_P */
      val ASTER_P = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** VERTU VTL-202101 */
      val VTL_202101 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** VERTU VTL-202201 */
      val VTL_202201 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** VERTU VTL-202301 */
      val VTL_202301 = "spec:width=1260,height=2800,unit=px,dpi=560"

      /** VERTU VTL-202302 */
      val VTL_202302 = "spec:width=1188,height=2790,unit=px,dpi=520"

  }
