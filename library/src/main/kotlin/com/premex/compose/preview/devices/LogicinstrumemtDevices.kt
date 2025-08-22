package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * logic_instrumemt device specifications for Android Compose previews.
 *
 * This extension provides logic_instrumemt device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Logicinstrumemt.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Logicinstrumemt: Any
  get() = object {
      /** logic_instrumemt lifbn101 */
      val LIFBN101 = "spec:width=1200,height=1920,unit=px,dpi=240"

  }
