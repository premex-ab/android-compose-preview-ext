package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * TECNOMASTER device specifications for Android Compose previews.
 *
 * This extension provides TECNOMASTER device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.TECNOMASTER.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.TECNOMASTER: Any
  get() = object {
      /** TECNOMASTER TEC-M1310 */
      val TEC_M1310 = "spec:width=1440,height=2160,unit=px,dpi=240"

  }
